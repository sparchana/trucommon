// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface GetJobPostDetailsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.GetJobPostDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.GetJobPostDetailsResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.GetJobPostDetailsResponse.Status status = 1;</code>
   */
  in.trujobs.proto.GetJobPostDetailsResponse.Status getStatus();

  /**
   * <code>optional .in.trujobs.proto.JobPostObject jobPost = 2;</code>
   */
  boolean hasJobPost();
  /**
   * <code>optional .in.trujobs.proto.JobPostObject jobPost = 2;</code>
   */
  in.trujobs.proto.JobPostObject getJobPost();
  /**
   * <code>optional .in.trujobs.proto.JobPostObject jobPost = 2;</code>
   */
  in.trujobs.proto.JobPostObjectOrBuilder getJobPostOrBuilder();

  /**
   * <code>optional .in.trujobs.proto.CompanyObject company = 3;</code>
   */
  boolean hasCompany();
  /**
   * <code>optional .in.trujobs.proto.CompanyObject company = 3;</code>
   */
  in.trujobs.proto.CompanyObject getCompany();
  /**
   * <code>optional .in.trujobs.proto.CompanyObject company = 3;</code>
   */
  in.trujobs.proto.CompanyObjectOrBuilder getCompanyOrBuilder();

  /**
   * <code>optional bool alreadyApplied = 4;</code>
   */
  boolean getAlreadyApplied();
}
