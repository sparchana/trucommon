// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface SignUpResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.SignUpResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.SignUpResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.SignUpResponse.Status status = 1;</code>
   */
  in.trujobs.proto.SignUpResponse.Status getStatus();

  /**
   * <code>optional int32 generatedOtp = 2;</code>
   */
  int getGeneratedOtp();
}
