// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface CandidateObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.CandidateObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 candidateId = 1;</code>
   */
  long getCandidateId();

  /**
   * <code>optional string candidateFirstName = 2;</code>
   */
  java.lang.String getCandidateFirstName();
  /**
   * <code>optional string candidateFirstName = 2;</code>
   */
  com.google.protobuf.ByteString
      getCandidateFirstNameBytes();

  /**
   * <code>optional string candidateLastName = 3;</code>
   */
  java.lang.String getCandidateLastName();
  /**
   * <code>optional string candidateLastName = 3;</code>
   */
  com.google.protobuf.ByteString
      getCandidateLastNameBytes();

  /**
   * <code>optional int32 candidateIsAssessed = 4;</code>
   */
  int getCandidateIsAssessed();

  /**
   * <code>optional int32 candidateMinProfileComplete = 5;</code>
   */
  int getCandidateMinProfileComplete();

  /**
   * <code>optional int32 candidateGender = 6;</code>
   */
  int getCandidateGender();

  /**
   * <code>optional string candidateMobile = 7;</code>
   */
  java.lang.String getCandidateMobile();
  /**
   * <code>optional string candidateMobile = 7;</code>
   */
  com.google.protobuf.ByteString
      getCandidateMobileBytes();

  /**
   * <code>optional int32 candidateAge = 8;</code>
   */
  int getCandidateAge();

  /**
   * <code>optional .in.trujobs.proto.LocalityObject candidateHomelocality = 9;</code>
   */
  boolean hasCandidateHomelocality();
  /**
   * <code>optional .in.trujobs.proto.LocalityObject candidateHomelocality = 9;</code>
   */
  in.trujobs.proto.LocalityObject getCandidateHomelocality();
  /**
   * <code>optional .in.trujobs.proto.LocalityObject candidateHomelocality = 9;</code>
   */
  in.trujobs.proto.LocalityObjectOrBuilder getCandidateHomelocalityOrBuilder();

  /**
   * <code>repeated .in.trujobs.proto.LocalityObject candidateLocationPref = 10;</code>
   */
  java.util.List<in.trujobs.proto.LocalityObject> 
      getCandidateLocationPrefList();
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject candidateLocationPref = 10;</code>
   */
  in.trujobs.proto.LocalityObject getCandidateLocationPref(int index);
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject candidateLocationPref = 10;</code>
   */
  int getCandidateLocationPrefCount();
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject candidateLocationPref = 10;</code>
   */
  java.util.List<? extends in.trujobs.proto.LocalityObjectOrBuilder> 
      getCandidateLocationPrefOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject candidateLocationPref = 10;</code>
   */
  in.trujobs.proto.LocalityObjectOrBuilder getCandidateLocationPrefOrBuilder(
      int index);

  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject candidateJobRolePref = 11;</code>
   */
  java.util.List<in.trujobs.proto.JobRoleObject> 
      getCandidateJobRolePrefList();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject candidateJobRolePref = 11;</code>
   */
  in.trujobs.proto.JobRoleObject getCandidateJobRolePref(int index);
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject candidateJobRolePref = 11;</code>
   */
  int getCandidateJobRolePrefCount();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject candidateJobRolePref = 11;</code>
   */
  java.util.List<? extends in.trujobs.proto.JobRoleObjectOrBuilder> 
      getCandidateJobRolePrefOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.JobRoleObject candidateJobRolePref = 11;</code>
   */
  in.trujobs.proto.JobRoleObjectOrBuilder getCandidateJobRolePrefOrBuilder(
      int index);

  /**
   * <code>optional .in.trujobs.proto.TimeShiftObject candidateTimeShiftPref = 12;</code>
   */
  boolean hasCandidateTimeShiftPref();
  /**
   * <code>optional .in.trujobs.proto.TimeShiftObject candidateTimeShiftPref = 12;</code>
   */
  in.trujobs.proto.TimeShiftObject getCandidateTimeShiftPref();
  /**
   * <code>optional .in.trujobs.proto.TimeShiftObject candidateTimeShiftPref = 12;</code>
   */
  in.trujobs.proto.TimeShiftObjectOrBuilder getCandidateTimeShiftPrefOrBuilder();

  /**
   * <code>optional int32 candidateTotalExperience = 13;</code>
   */
  int getCandidateTotalExperience();
}
