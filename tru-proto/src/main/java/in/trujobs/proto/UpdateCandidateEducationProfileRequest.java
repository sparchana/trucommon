// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.UpdateCandidateEducationProfileRequest}
 */
public  final class UpdateCandidateEducationProfileRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.UpdateCandidateEducationProfileRequest)
    UpdateCandidateEducationProfileRequestOrBuilder {
  // Use UpdateCandidateEducationProfileRequest.newBuilder() to construct.
  private UpdateCandidateEducationProfileRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateCandidateEducationProfileRequest() {
    candidateMobile_ = "";
    candidateEducationLevel_ = 0L;
    candidateDegree_ = 0L;
    candidateEducationInstitute_ = "";
    candidateEducationCompletionStatus_ = 0;
    jobPostId_ = 0L;
    isFinalFragment_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateCandidateEducationProfileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            candidateMobile_ = s;
            break;
          }
          case 16: {

            candidateEducationLevel_ = input.readInt64();
            break;
          }
          case 24: {

            candidateDegree_ = input.readInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            candidateEducationInstitute_ = s;
            break;
          }
          case 40: {

            candidateEducationCompletionStatus_ = input.readInt32();
            break;
          }
          case 48: {

            jobPostId_ = input.readInt64();
            break;
          }
          case 56: {

            isFinalFragment_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateEducationProfileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateEducationProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.UpdateCandidateEducationProfileRequest.class, in.trujobs.proto.UpdateCandidateEducationProfileRequest.Builder.class);
  }

  public static final int CANDIDATE_MOBILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object candidateMobile_;
  /**
   * <code>optional string candidate_mobile = 1;</code>
   */
  public java.lang.String getCandidateMobile() {
    java.lang.Object ref = candidateMobile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateMobile_ = s;
      return s;
    }
  }
  /**
   * <code>optional string candidate_mobile = 1;</code>
   */
  public com.google.protobuf.ByteString
      getCandidateMobileBytes() {
    java.lang.Object ref = candidateMobile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateMobile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CANDIDATE_EDUCATION_LEVEL_FIELD_NUMBER = 2;
  private long candidateEducationLevel_;
  /**
   * <code>optional int64 candidate_education_level = 2;</code>
   */
  public long getCandidateEducationLevel() {
    return candidateEducationLevel_;
  }

  public static final int CANDIDATE_DEGREE_FIELD_NUMBER = 3;
  private long candidateDegree_;
  /**
   * <code>optional int64 candidate_degree = 3;</code>
   */
  public long getCandidateDegree() {
    return candidateDegree_;
  }

  public static final int CANDIDATE_EDUCATION_INSTITUTE_FIELD_NUMBER = 4;
  private volatile java.lang.Object candidateEducationInstitute_;
  /**
   * <code>optional string candidate_education_institute = 4;</code>
   */
  public java.lang.String getCandidateEducationInstitute() {
    java.lang.Object ref = candidateEducationInstitute_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateEducationInstitute_ = s;
      return s;
    }
  }
  /**
   * <code>optional string candidate_education_institute = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCandidateEducationInstituteBytes() {
    java.lang.Object ref = candidateEducationInstitute_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateEducationInstitute_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CANDIDATE_EDUCATION_COMPLETION_STATUS_FIELD_NUMBER = 5;
  private int candidateEducationCompletionStatus_;
  /**
   * <code>optional int32 candidate_education_completion_status = 5;</code>
   */
  public int getCandidateEducationCompletionStatus() {
    return candidateEducationCompletionStatus_;
  }

  public static final int JOBPOSTID_FIELD_NUMBER = 6;
  private long jobPostId_;
  /**
   * <code>optional int64 jobPostId = 6;</code>
   */
  public long getJobPostId() {
    return jobPostId_;
  }

  public static final int ISFINALFRAGMENT_FIELD_NUMBER = 7;
  private boolean isFinalFragment_;
  /**
   * <code>optional bool isFinalFragment = 7;</code>
   */
  public boolean getIsFinalFragment() {
    return isFinalFragment_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getCandidateMobileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, candidateMobile_);
    }
    if (candidateEducationLevel_ != 0L) {
      output.writeInt64(2, candidateEducationLevel_);
    }
    if (candidateDegree_ != 0L) {
      output.writeInt64(3, candidateDegree_);
    }
    if (!getCandidateEducationInstituteBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, candidateEducationInstitute_);
    }
    if (candidateEducationCompletionStatus_ != 0) {
      output.writeInt32(5, candidateEducationCompletionStatus_);
    }
    if (jobPostId_ != 0L) {
      output.writeInt64(6, jobPostId_);
    }
    if (isFinalFragment_ != false) {
      output.writeBool(7, isFinalFragment_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCandidateMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, candidateMobile_);
    }
    if (candidateEducationLevel_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, candidateEducationLevel_);
    }
    if (candidateDegree_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, candidateDegree_);
    }
    if (!getCandidateEducationInstituteBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, candidateEducationInstitute_);
    }
    if (candidateEducationCompletionStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, candidateEducationCompletionStatus_);
    }
    if (jobPostId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, jobPostId_);
    }
    if (isFinalFragment_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(7, isFinalFragment_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.UpdateCandidateEducationProfileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code in.trujobs.proto.UpdateCandidateEducationProfileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.UpdateCandidateEducationProfileRequest)
      in.trujobs.proto.UpdateCandidateEducationProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateEducationProfileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateEducationProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.UpdateCandidateEducationProfileRequest.class, in.trujobs.proto.UpdateCandidateEducationProfileRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.UpdateCandidateEducationProfileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      candidateMobile_ = "";

      candidateEducationLevel_ = 0L;

      candidateDegree_ = 0L;

      candidateEducationInstitute_ = "";

      candidateEducationCompletionStatus_ = 0;

      jobPostId_ = 0L;

      isFinalFragment_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateEducationProfileRequest_descriptor;
    }

    public in.trujobs.proto.UpdateCandidateEducationProfileRequest getDefaultInstanceForType() {
      return in.trujobs.proto.UpdateCandidateEducationProfileRequest.getDefaultInstance();
    }

    public in.trujobs.proto.UpdateCandidateEducationProfileRequest build() {
      in.trujobs.proto.UpdateCandidateEducationProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.UpdateCandidateEducationProfileRequest buildPartial() {
      in.trujobs.proto.UpdateCandidateEducationProfileRequest result = new in.trujobs.proto.UpdateCandidateEducationProfileRequest(this);
      result.candidateMobile_ = candidateMobile_;
      result.candidateEducationLevel_ = candidateEducationLevel_;
      result.candidateDegree_ = candidateDegree_;
      result.candidateEducationInstitute_ = candidateEducationInstitute_;
      result.candidateEducationCompletionStatus_ = candidateEducationCompletionStatus_;
      result.jobPostId_ = jobPostId_;
      result.isFinalFragment_ = isFinalFragment_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.UpdateCandidateEducationProfileRequest) {
        return mergeFrom((in.trujobs.proto.UpdateCandidateEducationProfileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.UpdateCandidateEducationProfileRequest other) {
      if (other == in.trujobs.proto.UpdateCandidateEducationProfileRequest.getDefaultInstance()) return this;
      if (!other.getCandidateMobile().isEmpty()) {
        candidateMobile_ = other.candidateMobile_;
        onChanged();
      }
      if (other.getCandidateEducationLevel() != 0L) {
        setCandidateEducationLevel(other.getCandidateEducationLevel());
      }
      if (other.getCandidateDegree() != 0L) {
        setCandidateDegree(other.getCandidateDegree());
      }
      if (!other.getCandidateEducationInstitute().isEmpty()) {
        candidateEducationInstitute_ = other.candidateEducationInstitute_;
        onChanged();
      }
      if (other.getCandidateEducationCompletionStatus() != 0) {
        setCandidateEducationCompletionStatus(other.getCandidateEducationCompletionStatus());
      }
      if (other.getJobPostId() != 0L) {
        setJobPostId(other.getJobPostId());
      }
      if (other.getIsFinalFragment() != false) {
        setIsFinalFragment(other.getIsFinalFragment());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      in.trujobs.proto.UpdateCandidateEducationProfileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.UpdateCandidateEducationProfileRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object candidateMobile_ = "";
    /**
     * <code>optional string candidate_mobile = 1;</code>
     */
    public java.lang.String getCandidateMobile() {
      java.lang.Object ref = candidateMobile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateMobile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string candidate_mobile = 1;</code>
     */
    public com.google.protobuf.ByteString
        getCandidateMobileBytes() {
      java.lang.Object ref = candidateMobile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateMobile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string candidate_mobile = 1;</code>
     */
    public Builder setCandidateMobile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidateMobile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidate_mobile = 1;</code>
     */
    public Builder clearCandidateMobile() {
      
      candidateMobile_ = getDefaultInstance().getCandidateMobile();
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidate_mobile = 1;</code>
     */
    public Builder setCandidateMobileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidateMobile_ = value;
      onChanged();
      return this;
    }

    private long candidateEducationLevel_ ;
    /**
     * <code>optional int64 candidate_education_level = 2;</code>
     */
    public long getCandidateEducationLevel() {
      return candidateEducationLevel_;
    }
    /**
     * <code>optional int64 candidate_education_level = 2;</code>
     */
    public Builder setCandidateEducationLevel(long value) {
      
      candidateEducationLevel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 candidate_education_level = 2;</code>
     */
    public Builder clearCandidateEducationLevel() {
      
      candidateEducationLevel_ = 0L;
      onChanged();
      return this;
    }

    private long candidateDegree_ ;
    /**
     * <code>optional int64 candidate_degree = 3;</code>
     */
    public long getCandidateDegree() {
      return candidateDegree_;
    }
    /**
     * <code>optional int64 candidate_degree = 3;</code>
     */
    public Builder setCandidateDegree(long value) {
      
      candidateDegree_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 candidate_degree = 3;</code>
     */
    public Builder clearCandidateDegree() {
      
      candidateDegree_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object candidateEducationInstitute_ = "";
    /**
     * <code>optional string candidate_education_institute = 4;</code>
     */
    public java.lang.String getCandidateEducationInstitute() {
      java.lang.Object ref = candidateEducationInstitute_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateEducationInstitute_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string candidate_education_institute = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCandidateEducationInstituteBytes() {
      java.lang.Object ref = candidateEducationInstitute_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateEducationInstitute_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string candidate_education_institute = 4;</code>
     */
    public Builder setCandidateEducationInstitute(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidateEducationInstitute_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidate_education_institute = 4;</code>
     */
    public Builder clearCandidateEducationInstitute() {
      
      candidateEducationInstitute_ = getDefaultInstance().getCandidateEducationInstitute();
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidate_education_institute = 4;</code>
     */
    public Builder setCandidateEducationInstituteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidateEducationInstitute_ = value;
      onChanged();
      return this;
    }

    private int candidateEducationCompletionStatus_ ;
    /**
     * <code>optional int32 candidate_education_completion_status = 5;</code>
     */
    public int getCandidateEducationCompletionStatus() {
      return candidateEducationCompletionStatus_;
    }
    /**
     * <code>optional int32 candidate_education_completion_status = 5;</code>
     */
    public Builder setCandidateEducationCompletionStatus(int value) {
      
      candidateEducationCompletionStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 candidate_education_completion_status = 5;</code>
     */
    public Builder clearCandidateEducationCompletionStatus() {
      
      candidateEducationCompletionStatus_ = 0;
      onChanged();
      return this;
    }

    private long jobPostId_ ;
    /**
     * <code>optional int64 jobPostId = 6;</code>
     */
    public long getJobPostId() {
      return jobPostId_;
    }
    /**
     * <code>optional int64 jobPostId = 6;</code>
     */
    public Builder setJobPostId(long value) {
      
      jobPostId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 jobPostId = 6;</code>
     */
    public Builder clearJobPostId() {
      
      jobPostId_ = 0L;
      onChanged();
      return this;
    }

    private boolean isFinalFragment_ ;
    /**
     * <code>optional bool isFinalFragment = 7;</code>
     */
    public boolean getIsFinalFragment() {
      return isFinalFragment_;
    }
    /**
     * <code>optional bool isFinalFragment = 7;</code>
     */
    public Builder setIsFinalFragment(boolean value) {
      
      isFinalFragment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isFinalFragment = 7;</code>
     */
    public Builder clearIsFinalFragment() {
      
      isFinalFragment_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.UpdateCandidateEducationProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.UpdateCandidateEducationProfileRequest)
  private static final in.trujobs.proto.UpdateCandidateEducationProfileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.UpdateCandidateEducationProfileRequest();
  }

  public static in.trujobs.proto.UpdateCandidateEducationProfileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCandidateEducationProfileRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCandidateEducationProfileRequest>() {
    public UpdateCandidateEducationProfileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateCandidateEducationProfileRequest(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<UpdateCandidateEducationProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCandidateEducationProfileRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.UpdateCandidateEducationProfileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

