// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface GetCandidateInformationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.GetCandidateInformationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
   */
  in.trujobs.proto.GetCandidateInformationResponse.Status getStatus();

  /**
   * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
   */
  boolean hasCandidate();
  /**
   * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
   */
  in.trujobs.proto.CandidateObject getCandidate();
  /**
   * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
   */
  in.trujobs.proto.CandidateObjectOrBuilder getCandidateOrBuilder();

  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRoles = 3;</code>
   */
  java.util.List<in.trujobs.proto.JobRoleObject> 
      getJobRolesList();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRoles = 3;</code>
   */
  in.trujobs.proto.JobRoleObject getJobRoles(int index);
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRoles = 3;</code>
   */
  int getJobRolesCount();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRoles = 3;</code>
   */
  java.util.List<? extends in.trujobs.proto.JobRoleObjectOrBuilder> 
      getJobRolesOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRoles = 3;</code>
   */
  in.trujobs.proto.JobRoleObjectOrBuilder getJobRolesOrBuilder(
      int index);
}
