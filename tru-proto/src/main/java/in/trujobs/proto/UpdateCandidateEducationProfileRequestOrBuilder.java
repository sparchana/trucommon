// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface UpdateCandidateEducationProfileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.UpdateCandidateEducationProfileRequest)
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
   * <code>optional int64 candidate_education_level = 2;</code>
   */
  long getCandidateEducationLevel();

  /**
   * <code>optional int64 candidate_degree = 3;</code>
   */
  long getCandidateDegree();

  /**
   * <code>optional string candidate_education_institute = 4;</code>
   */
  java.lang.String getCandidateEducationInstitute();
  /**
   * <code>optional string candidate_education_institute = 4;</code>
   */
  com.google.protobuf.ByteString
      getCandidateEducationInstituteBytes();

  /**
   * <code>optional int32 candidate_education_completion_status = 5;</code>
   */
  int getCandidateEducationCompletionStatus();

  /**
   * <code>optional int64 jobPostId = 6;</code>
   */
  long getJobPostId();

  /**
   * <code>optional bool isFinalFragment = 7;</code>
   */
  boolean getIsFinalFragment();
}
