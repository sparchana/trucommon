// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface LocalityObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.LocalityObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 localityId = 1;</code>
   */
  long getLocalityId();

  /**
   * <code>optional string localityName = 2;</code>
   */
  java.lang.String getLocalityName();
  /**
   * <code>optional string localityName = 2;</code>
   */
  com.google.protobuf.ByteString
      getLocalityNameBytes();

  /**
   * <code>optional double lat = 3;</code>
   */
  double getLat();

  /**
   * <code>optional double lng = 4;</code>
   */
  double getLng();
}
