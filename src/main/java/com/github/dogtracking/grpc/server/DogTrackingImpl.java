package com.github.dogtracking.grpc.server;

import com.github.dogtracking.grpc.*;
import io.grpc.stub.StreamObserver;

import java.lang.reflect.Array;

public class DogTrackingImpl extends DogTrackingGrpc.DogTrackingImplBase {
    @Override
    public void wearingCollar(WearingCollarRequest request, StreamObserver<WearingCollarResponse> responseObserver) {

        //Get the data from the fields specified from the proto file
        CurrentStatus currentStatus = request.getCurrentStatus();
        boolean wearing = currentStatus.getWearing();
        int heartBeatSensorBPM = currentStatus.getHeartBeatSensorBPM();
        double thermometerBodyTemp = currentStatus.getThermometerBodyTemp();

        //collar checks if dog is wearing correctly

        // heartbeat sensor checks the current BPM of the dog
//        heartBeatSensorBPM = 40;
        //thermometer sensor checks the current body temperature of the dog
//        thermometerBodyTemp = 36.5;

        String result =  "Dog is wearing the collar: " + wearing +
                " | Beats Per Minute: " + heartBeatSensorBPM + " | " +
                "Body Temperature: " + thermometerBodyTemp + " | ";

        // create a response
        WearingCollarResponse response = WearingCollarResponse.newBuilder()
                .setResult(result)
                .build();

        // send the response back to the responseObserver obj
        responseObserver.onNext(response);

        //complete the grpc call
        responseObserver.onCompleted();
    }

    @Override
    public void outOfBoundsLocation(SafetyZoneRequest request, StreamObserver<UpdateLocationResponse> responseObserver) {
        //Array of safety zone coordinates
        double [][] safteyZone = new double[4][2];
        safteyZone[0][0] = request.getSafeZoneCoordinates1().getLatitude();
        safteyZone[0][1] = request.getSafeZoneCoordinates1().getLongitude();

        safteyZone[1][0] = request.getSafeZoneCoordinates2().getLatitude();
        safteyZone[1][1] = request.getSafeZoneCoordinates2().getLongitude();

        safteyZone[2][0] = request.getSafeZoneCoordinates3().getLatitude();
        safteyZone[2][1] = request.getSafeZoneCoordinates3().getLongitude();

        safteyZone[3][0] = request.getSafeZoneCoordinates4().getLatitude();
        safteyZone[3][1] = request.getSafeZoneCoordinates4().getLongitude();

        //if the dog is outside of this grid of safety zone coordinates stream back the coordinates of the dog
        /* Lets just create a fake response for demoing purposes*/

        double [] dogLocation = {54.7287678, 52.4566476};

                //check if one of the coordinates if outside the safe zone, not accurate but for demo its ok
                if (dogLocation[0] > safteyZone[0][0]) {
                    try{
                        for (int i =0; i< 5; i++){
                            //fake movement data
                            dogLocation[0] -= 0.1;
                            dogLocation[1] += 0.1;
                            String result = ("Dog's current location: " + dogLocation[0]
                                    + "N  " + dogLocation[1] + "W  ");
                            //pass to the response the fake data!
                            UpdateLocationResponse response = UpdateLocationResponse.newBuilder()
                                    .setResult(result)
                                    .build();

                            // pass the next response
                            responseObserver.onNext(response);
                            Thread.sleep(1000L);
                        }
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    //if the dog is outside the safety Zone
                    String result = "Dog is within bounds";
                    UpdateLocationResponse response = UpdateLocationResponse.newBuilder()
                            .setResult(result)
                            .build();

                    //pass response
                    responseObserver.onNext(response);
                }
                //close off communications/gRPC call
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<OwnerLocationRequest> findTheDog(StreamObserver<DogLocationResponse> responseObserver) {
        StreamObserver<OwnerLocationRequest> requestObserver = new StreamObserver<OwnerLocationRequest>() {
            @Override
            //Now we can stream the Owners location
            public void onNext(OwnerLocationRequest value) {
                String OwnersCoordinates = "This is the current Owners Coordinates: " + value.getOwnerCoordinates();
                //build response
                DogLocationResponse response = DogLocationResponse.newBuilder()
                        .setDogCoordinates(OwnersCoordinates)
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                //do nothing
            }

            @Override
            public void onCompleted() {
                //completed
                responseObserver.onCompleted();
            }
        };
        return requestObserver ;
    }

}