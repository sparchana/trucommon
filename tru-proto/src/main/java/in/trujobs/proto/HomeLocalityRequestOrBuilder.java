// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface HomeLocalityRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.HomeLocalityRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional double lat = 1;</code>
   */
  double getLat();

  /**
   * <code>optional double lng = 2;</code>
   */
  double getLng();

  /**
   * <code>optional string name = 3;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string address = 4;</code>
   */
  java.lang.String getAddress();
  /**
   * <code>optional string address = 4;</code>
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>optional string candidate_mobile = 5;</code>
   */
  java.lang.String getCandidateMobile();
  /**
   * <code>optional string candidate_mobile = 5;</code>
   */
  com.google.protobuf.ByteString
      getCandidateMobileBytes();

  /**
   * <code>optional int64 candidate_id = 6;</code>
   */
  long getCandidateId();
}
