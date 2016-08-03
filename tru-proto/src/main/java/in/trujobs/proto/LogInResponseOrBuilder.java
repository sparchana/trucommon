// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface LogInResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.LogInResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
   */
  in.trujobs.proto.LogInResponse.Status getStatus();

  /**
   * <code>optional int64 leadId = 2;</code>
   */
  long getLeadId();

  /**
   * <code>optional int64 candidateId = 3;</code>
   */
  long getCandidateId();

  /**
   * <code>optional int32 candidateGender = 4;</code>
   */
  int getCandidateGender();

  /**
   * <code>optional string candidateFirstName = 5;</code>
   */
  java.lang.String getCandidateFirstName();
  /**
   * <code>optional string candidateFirstName = 5;</code>
   */
  com.google.protobuf.ByteString
      getCandidateFirstNameBytes();

  /**
   * <code>optional string candidateLastName = 6;</code>
   */
  java.lang.String getCandidateLastName();
  /**
   * <code>optional string candidateLastName = 6;</code>
   */
  com.google.protobuf.ByteString
      getCandidateLastNameBytes();

  /**
   * <code>optional int32 candidateIsAssessed = 7;</code>
   */
  int getCandidateIsAssessed();

  /**
   * <code>optional string session_id = 8;</code>
   */
  java.lang.String getSessionId();
  /**
   * <code>optional string session_id = 8;</code>
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>optional int64 session_expiry_millis = 9;</code>
   */
  long getSessionExpiryMillis();

  /**
   * <code>optional int32 minProfile = 10;</code>
   */
  int getMinProfile();
}
