// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface UpdateCandidateInterviewDetailRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.UpdateCandidateInterviewDetailRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string candidate_mobile = 1;</code>
   */
  java.lang.String getCandidateMobile();
  /**
   * <code>optional string candidate_mobile = 1;</code>
   */
  com.google.protobuf.ByteString
      getCandidateMobileBytes();

  /**
   * <code>optional int32 timeSlotId = 2;</code>
   */
  int getTimeSlotId();

  /**
   * <code>optional int64 jobPostId = 4;</code>
   */
  long getJobPostId();

  /**
   * <code>optional int64 scheduledInterviewDateInMills = 5;</code>
   */
  long getScheduledInterviewDateInMills();

  /**
   * <code>optional bool isFinalFragment = 6;</code>
   */
  boolean getIsFinalFragment();
}
