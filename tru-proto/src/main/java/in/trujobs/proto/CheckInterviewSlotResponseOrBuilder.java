// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface CheckInterviewSlotResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.CheckInterviewSlotResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool shouldShowInterview = 1;</code>
   */
  boolean getShouldShowInterview();

  /**
   * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
   */
  in.trujobs.proto.CheckInterviewSlotResponse.Status getStatus();
}