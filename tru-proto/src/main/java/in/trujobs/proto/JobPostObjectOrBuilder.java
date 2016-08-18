// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface JobPostObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.JobPostObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 jobPostId = 1;</code>
   */
  long getJobPostId();

  /**
   * <code>optional string jobPostTitle = 2;</code>
   */
  java.lang.String getJobPostTitle();
  /**
   * <code>optional string jobPostTitle = 2;</code>
   */
  com.google.protobuf.ByteString
      getJobPostTitleBytes();

  /**
   * <code>optional string jobPostCompanyName = 3;</code>
   */
  java.lang.String getJobPostCompanyName();
  /**
   * <code>optional string jobPostCompanyName = 3;</code>
   */
  com.google.protobuf.ByteString
      getJobPostCompanyNameBytes();

  /**
   * <code>optional int64 jobPostMinSalary = 4;</code>
   */
  long getJobPostMinSalary();

  /**
   * <code>optional int64 jobPostMaxSalary = 5;</code>
   */
  long getJobPostMaxSalary();

  /**
   * <code>repeated .in.trujobs.proto.LocalityObject jobPostLocality = 6;</code>
   */
  java.util.List<in.trujobs.proto.LocalityObject> 
      getJobPostLocalityList();
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject jobPostLocality = 6;</code>
   */
  in.trujobs.proto.LocalityObject getJobPostLocality(int index);
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject jobPostLocality = 6;</code>
   */
  int getJobPostLocalityCount();
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject jobPostLocality = 6;</code>
   */
  java.util.List<? extends in.trujobs.proto.LocalityObjectOrBuilder> 
      getJobPostLocalityOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.LocalityObject jobPostLocality = 6;</code>
   */
  in.trujobs.proto.LocalityObjectOrBuilder getJobPostLocalityOrBuilder(
      int index);

  /**
   * <code>optional string jobPostCompanyLogo = 7;</code>
   */
  java.lang.String getJobPostCompanyLogo();
  /**
   * <code>optional string jobPostCompanyLogo = 7;</code>
   */
  com.google.protobuf.ByteString
      getJobPostCompanyLogoBytes();

  /**
   * <code>optional .in.trujobs.proto.ExperienceObject jobPostExperience = 8;</code>
   */
  boolean hasJobPostExperience();
  /**
   * <code>optional .in.trujobs.proto.ExperienceObject jobPostExperience = 8;</code>
   */
  in.trujobs.proto.ExperienceObject getJobPostExperience();
  /**
   * <code>optional .in.trujobs.proto.ExperienceObject jobPostExperience = 8;</code>
   */
  in.trujobs.proto.ExperienceObjectOrBuilder getJobPostExperienceOrBuilder();

  /**
   * <code>optional .in.trujobs.proto.TimeShiftObject jobPostShift = 9;</code>
   */
  boolean hasJobPostShift();
  /**
   * <code>optional .in.trujobs.proto.TimeShiftObject jobPostShift = 9;</code>
   */
  in.trujobs.proto.TimeShiftObject getJobPostShift();
  /**
   * <code>optional .in.trujobs.proto.TimeShiftObject jobPostShift = 9;</code>
   */
  in.trujobs.proto.TimeShiftObjectOrBuilder getJobPostShiftOrBuilder();

  /**
   * <code>optional int32 vacancies = 10;</code>
   */
  int getVacancies();

  /**
   * <code>optional string jobPostDescription = 11;</code>
   */
  java.lang.String getJobPostDescription();
  /**
   * <code>optional string jobPostDescription = 11;</code>
   */
  com.google.protobuf.ByteString
      getJobPostDescriptionBytes();

  /**
   * <code>optional string jobPostIncentives = 12;</code>
   */
  java.lang.String getJobPostIncentives();
  /**
   * <code>optional string jobPostIncentives = 12;</code>
   */
  com.google.protobuf.ByteString
      getJobPostIncentivesBytes();

  /**
   * <code>optional string jobPostMinRequirements = 13;</code>
   */
  java.lang.String getJobPostMinRequirements();
  /**
   * <code>optional string jobPostMinRequirements = 13;</code>
   */
  com.google.protobuf.ByteString
      getJobPostMinRequirementsBytes();

  /**
   * <code>optional string jobPostAddress = 14;</code>
   */
  java.lang.String getJobPostAddress();
  /**
   * <code>optional string jobPostAddress = 14;</code>
   */
  com.google.protobuf.ByteString
      getJobPostAddressBytes();

  /**
   * <code>optional int32 jobPostWorkFromHome = 15;</code>
   */
  int getJobPostWorkFromHome();

  /**
   * <code>optional string jobPostWorkingDays = 16;</code>
   */
  java.lang.String getJobPostWorkingDays();
  /**
   * <code>optional string jobPostWorkingDays = 16;</code>
   */
  com.google.protobuf.ByteString
      getJobPostWorkingDaysBytes();

  /**
   * <code>optional .in.trujobs.proto.EducationObject education = 17;</code>
   */
  boolean hasEducation();
  /**
   * <code>optional .in.trujobs.proto.EducationObject education = 17;</code>
   */
  in.trujobs.proto.EducationObject getEducation();
  /**
   * <code>optional .in.trujobs.proto.EducationObject education = 17;</code>
   */
  in.trujobs.proto.EducationObjectOrBuilder getEducationOrBuilder();

  /**
   * <code>optional string jobRole = 18;</code>
   */
  java.lang.String getJobRole();
  /**
   * <code>optional string jobRole = 18;</code>
   */
  com.google.protobuf.ByteString
      getJobRoleBytes();

  /**
   * <code>optional int64 jobPostCreationMillis = 19;</code>
   */
  long getJobPostCreationMillis();

  /**
   * <code>optional int32 jobPostStartTime = 20;</code>
   */
  int getJobPostStartTime();

  /**
   * <code>optional int32 jobPostEndTime = 21;</code>
   */
  int getJobPostEndTime();

  /**
   * <code>optional int32 isApplied = 22;</code>
   */
  int getIsApplied();
}
