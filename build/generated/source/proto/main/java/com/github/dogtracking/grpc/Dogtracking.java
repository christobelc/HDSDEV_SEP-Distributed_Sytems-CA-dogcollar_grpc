// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dogtracking/dogtracking.proto

package com.github.dogtracking.grpc;

public final class Dogtracking {
  private Dogtracking() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_CurrentStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_CurrentStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_WearingCollarRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_WearingCollarRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_WearingCollarResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_WearingCollarResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_SafeZoneCoordinates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_SafeZoneCoordinates_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_UpdateLocationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_UpdateLocationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_SafetyZoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_SafetyZoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_DogLocationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_DogLocationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dogtracking_OwnerLocationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dogtracking_OwnerLocationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035dogtracking/dogtracking.proto\022\013dogtrac" +
      "king\"Y\n\rCurrentStatus\022\017\n\007wearing\030\001 \001(\010\022\032" +
      "\n\022heartBeatSensorBPM\030\002 \001(\005\022\033\n\023thermomete" +
      "rBodyTemp\030\003 \001(\001\"I\n\024WearingCollarRequest\022" +
      "1\n\rcurrentStatus\030\001 \001(\0132\032.dogtracking.Cur" +
      "rentStatus\"\'\n\025WearingCollarResponse\022\016\n\006r" +
      "esult\030\001 \001(\t\":\n\023SafeZoneCoordinates\022\020\n\010la" +
      "titude\030\001 \001(\001\022\021\n\tlongitude\030\002 \001(\001\"(\n\026Updat" +
      "eLocationResponse\022\016\n\006result\030\001 \001(\t\"\223\002\n\021Sa" +
      "fetyZoneRequest\022>\n\024safeZoneCoordinates1\030" +
      "\001 \001(\0132 .dogtracking.SafeZoneCoordinates\022" +
      ">\n\024safeZoneCoordinates2\030\002 \001(\0132 .dogtrack" +
      "ing.SafeZoneCoordinates\022>\n\024safeZoneCoord" +
      "inates3\030\003 \001(\0132 .dogtracking.SafeZoneCoor" +
      "dinates\022>\n\024safeZoneCoordinates4\030\004 \001(\0132 ." +
      "dogtracking.SafeZoneCoordinates\"-\n\023DogLo" +
      "cationResponse\022\026\n\016dogCoordinates\030\001 \001(\t\"0" +
      "\n\024OwnerLocationRequest\022\030\n\020ownerCoordinat" +
      "es\030\001 \001(\t2\240\002\n\013DogTracking\022X\n\rWearingColla" +
      "r\022!.dogtracking.WearingCollarRequest\032\".d" +
      "ogtracking.WearingCollarResponse\"\000\022^\n\023Ou" +
      "tOfBoundsLocation\022\036.dogtracking.SafetyZo" +
      "neRequest\032#.dogtracking.UpdateLocationRe" +
      "sponse\"\0000\001\022W\n\nFindTheDog\022!.dogtracking.O" +
      "wnerLocationRequest\032 .dogtracking.DogLoc" +
      "ationResponse\"\000(\0010\001B\037\n\033com.github.dogtra" +
      "cking.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_dogtracking_CurrentStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dogtracking_CurrentStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_CurrentStatus_descriptor,
        new java.lang.String[] { "Wearing", "HeartBeatSensorBPM", "ThermometerBodyTemp", });
    internal_static_dogtracking_WearingCollarRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dogtracking_WearingCollarRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_WearingCollarRequest_descriptor,
        new java.lang.String[] { "CurrentStatus", });
    internal_static_dogtracking_WearingCollarResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dogtracking_WearingCollarResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_WearingCollarResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dogtracking_SafeZoneCoordinates_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dogtracking_SafeZoneCoordinates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_SafeZoneCoordinates_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_dogtracking_UpdateLocationResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dogtracking_UpdateLocationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_UpdateLocationResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_dogtracking_SafetyZoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dogtracking_SafetyZoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_SafetyZoneRequest_descriptor,
        new java.lang.String[] { "SafeZoneCoordinates1", "SafeZoneCoordinates2", "SafeZoneCoordinates3", "SafeZoneCoordinates4", });
    internal_static_dogtracking_DogLocationResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dogtracking_DogLocationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_DogLocationResponse_descriptor,
        new java.lang.String[] { "DogCoordinates", });
    internal_static_dogtracking_OwnerLocationRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_dogtracking_OwnerLocationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dogtracking_OwnerLocationRequest_descriptor,
        new java.lang.String[] { "OwnerCoordinates", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
