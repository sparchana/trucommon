// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface CandidateAppliedJobPostWorkFlowResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
   */
  in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status getStatus();

  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  java.util.List<in.trujobs.proto.JobPostWorkFlowObject> 
      getJobPostWorkFlowObjectList();
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  in.trujobs.proto.JobPostWorkFlowObject getJobPostWorkFlowObject(int index);
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  int getJobPostWorkFlowObjectCount();
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  java.util.List<? extends in.trujobs.proto.JobPostWorkFlowObjectOrBuilder> 
      getJobPostWorkFlowObjectOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  in.trujobs.proto.JobPostWorkFlowObjectOrBuilder getJobPostWorkFlowObjectOrBuilder(
      int index);
}
