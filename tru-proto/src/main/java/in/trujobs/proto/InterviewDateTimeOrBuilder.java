// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface InterviewDateTimeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.InterviewDateTime)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 interviewDateMillis = 1;</code>
   */
  long getInterviewDateMillis();

  /**
   * <code>optional .in.trujobs.proto.InterviewTimeSlotObject interviewTimeSlot = 2;</code>
   */
  boolean hasInterviewTimeSlot();
  /**
   * <code>optional .in.trujobs.proto.InterviewTimeSlotObject interviewTimeSlot = 2;</code>
   */
  in.trujobs.proto.InterviewTimeSlotObject getInterviewTimeSlot();
  /**
   * <code>optional .in.trujobs.proto.InterviewTimeSlotObject interviewTimeSlot = 2;</code>
   */
  in.trujobs.proto.InterviewTimeSlotObjectOrBuilder getInterviewTimeSlotOrBuilder();
}