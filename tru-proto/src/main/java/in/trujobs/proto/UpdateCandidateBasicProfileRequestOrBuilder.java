// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface UpdateCandidateBasicProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.UpdateCandidateBasicProfileRequest)
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
   * <code>optional string candidate_first_name = 2;</code>
   */
  java.lang.String getCandidateFirstName();
  /**
   * <code>optional string candidate_first_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getCandidateFirstNameBytes();

  /**
   * <code>optional string candidate_last_name = 3;</code>
   */
  java.lang.String getCandidateLastName();
  /**
   * <code>optional string candidate_last_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getCandidateLastNameBytes();

  /**
   * <code>optional int64 candidate_timeshift_pref = 4;</code>
   */
  long getCandidateTimeshiftPref();

  /**
   * <code>optional int32 candidate_gender = 5;</code>
   */
  int getCandidateGender();

  /**
   * <code>optional string candidateDOB = 6;</code>
   */
  java.lang.String getCandidateDOB();
  /**
   * <code>optional string candidateDOB = 6;</code>
   */
  com.google.protobuf.ByteString
      getCandidateDOBBytes();

  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRolePref = 7;</code>
   */
  java.util.List<in.trujobs.proto.JobRoleObject> 
      getJobRolePrefList();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRolePref = 7;</code>
   */
  in.trujobs.proto.JobRoleObject getJobRolePref(int index);
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRolePref = 7;</code>
   */
  int getJobRolePrefCount();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRolePref = 7;</code>
   */
  java.util.List<? extends in.trujobs.proto.JobRoleObjectOrBuilder> 
      getJobRolePrefOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject jobRolePref = 7;</code>
   */
  in.trujobs.proto.JobRoleObjectOrBuilder getJobRolePrefOrBuilder(
      int index);
}
