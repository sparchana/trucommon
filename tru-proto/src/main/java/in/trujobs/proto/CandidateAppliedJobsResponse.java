// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.CandidateAppliedJobsResponse}
 */
public  final class CandidateAppliedJobsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.CandidateAppliedJobsResponse)
    CandidateAppliedJobsResponseOrBuilder {
  // Use CandidateAppliedJobsResponse.newBuilder() to construct.
  private CandidateAppliedJobsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CandidateAppliedJobsResponse() {
    status_ = 0;
    jobApplication_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CandidateAppliedJobsResponse(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              jobApplication_ = new java.util.ArrayList<in.trujobs.proto.JobApplicationObject>();
              mutable_bitField0_ |= 0x00000002;
            }
            jobApplication_.add(input.readMessage(in.trujobs.proto.JobApplicationObject.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        jobApplication_ = java.util.Collections.unmodifiableList(jobApplication_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.CandidateAppliedJobsResponse.class, in.trujobs.proto.CandidateAppliedJobsResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.CandidateAppliedJobsResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0, 0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1, 1),
    /**
     * <code>FAILURE = 2;</code>
     */
    FAILURE(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>FAILURE = 2;</code>
     */
    public static final int FAILURE_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static Status valueOf(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SUCCESS;
        case 2: return FAILURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return in.trujobs.proto.CandidateAppliedJobsResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Status(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.CandidateAppliedJobsResponse.Status)
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.CandidateAppliedJobsResponse.Status getStatus() {
    in.trujobs.proto.CandidateAppliedJobsResponse.Status result = in.trujobs.proto.CandidateAppliedJobsResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.CandidateAppliedJobsResponse.Status.UNRECOGNIZED : result;
  }

  public static final int JOBAPPLICATION_FIELD_NUMBER = 2;
  private java.util.List<in.trujobs.proto.JobApplicationObject> jobApplication_;
  /**
   * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
   */
  public java.util.List<in.trujobs.proto.JobApplicationObject> getJobApplicationList() {
    return jobApplication_;
  }
  /**
   * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
   */
  public java.util.List<? extends in.trujobs.proto.JobApplicationObjectOrBuilder> 
      getJobApplicationOrBuilderList() {
    return jobApplication_;
  }
  /**
   * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
   */
  public int getJobApplicationCount() {
    return jobApplication_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
   */
  public in.trujobs.proto.JobApplicationObject getJobApplication(int index) {
    return jobApplication_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
   */
  public in.trujobs.proto.JobApplicationObjectOrBuilder getJobApplicationOrBuilder(
      int index) {
    return jobApplication_.get(index);
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
    if (status_ != in.trujobs.proto.CandidateAppliedJobsResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < jobApplication_.size(); i++) {
      output.writeMessage(2, jobApplication_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.CandidateAppliedJobsResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < jobApplication_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, jobApplication_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.CandidateAppliedJobsResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.CandidateAppliedJobsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.CandidateAppliedJobsResponse)
      in.trujobs.proto.CandidateAppliedJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.CandidateAppliedJobsResponse.class, in.trujobs.proto.CandidateAppliedJobsResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.CandidateAppliedJobsResponse.newBuilder()
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
        getJobApplicationFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (jobApplicationBuilder_ == null) {
        jobApplication_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        jobApplicationBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsResponse_descriptor;
    }

    public in.trujobs.proto.CandidateAppliedJobsResponse getDefaultInstanceForType() {
      return in.trujobs.proto.CandidateAppliedJobsResponse.getDefaultInstance();
    }

    public in.trujobs.proto.CandidateAppliedJobsResponse build() {
      in.trujobs.proto.CandidateAppliedJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.CandidateAppliedJobsResponse buildPartial() {
      in.trujobs.proto.CandidateAppliedJobsResponse result = new in.trujobs.proto.CandidateAppliedJobsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      if (jobApplicationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          jobApplication_ = java.util.Collections.unmodifiableList(jobApplication_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.jobApplication_ = jobApplication_;
      } else {
        result.jobApplication_ = jobApplicationBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.CandidateAppliedJobsResponse) {
        return mergeFrom((in.trujobs.proto.CandidateAppliedJobsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.CandidateAppliedJobsResponse other) {
      if (other == in.trujobs.proto.CandidateAppliedJobsResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (jobApplicationBuilder_ == null) {
        if (!other.jobApplication_.isEmpty()) {
          if (jobApplication_.isEmpty()) {
            jobApplication_ = other.jobApplication_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureJobApplicationIsMutable();
            jobApplication_.addAll(other.jobApplication_);
          }
          onChanged();
        }
      } else {
        if (!other.jobApplication_.isEmpty()) {
          if (jobApplicationBuilder_.isEmpty()) {
            jobApplicationBuilder_.dispose();
            jobApplicationBuilder_ = null;
            jobApplication_ = other.jobApplication_;
            bitField0_ = (bitField0_ & ~0x00000002);
            jobApplicationBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getJobApplicationFieldBuilder() : null;
          } else {
            jobApplicationBuilder_.addAllMessages(other.jobApplication_);
          }
        }
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
      in.trujobs.proto.CandidateAppliedJobsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.CandidateAppliedJobsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int status_ = 0;
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.CandidateAppliedJobsResponse.Status getStatus() {
      in.trujobs.proto.CandidateAppliedJobsResponse.Status result = in.trujobs.proto.CandidateAppliedJobsResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.CandidateAppliedJobsResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.CandidateAppliedJobsResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobsResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<in.trujobs.proto.JobApplicationObject> jobApplication_ =
      java.util.Collections.emptyList();
    private void ensureJobApplicationIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        jobApplication_ = new java.util.ArrayList<in.trujobs.proto.JobApplicationObject>(jobApplication_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.JobApplicationObject, in.trujobs.proto.JobApplicationObject.Builder, in.trujobs.proto.JobApplicationObjectOrBuilder> jobApplicationBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public java.util.List<in.trujobs.proto.JobApplicationObject> getJobApplicationList() {
      if (jobApplicationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobApplication_);
      } else {
        return jobApplicationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public int getJobApplicationCount() {
      if (jobApplicationBuilder_ == null) {
        return jobApplication_.size();
      } else {
        return jobApplicationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public in.trujobs.proto.JobApplicationObject getJobApplication(int index) {
      if (jobApplicationBuilder_ == null) {
        return jobApplication_.get(index);
      } else {
        return jobApplicationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder setJobApplication(
        int index, in.trujobs.proto.JobApplicationObject value) {
      if (jobApplicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobApplicationIsMutable();
        jobApplication_.set(index, value);
        onChanged();
      } else {
        jobApplicationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder setJobApplication(
        int index, in.trujobs.proto.JobApplicationObject.Builder builderForValue) {
      if (jobApplicationBuilder_ == null) {
        ensureJobApplicationIsMutable();
        jobApplication_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobApplicationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder addJobApplication(in.trujobs.proto.JobApplicationObject value) {
      if (jobApplicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobApplicationIsMutable();
        jobApplication_.add(value);
        onChanged();
      } else {
        jobApplicationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder addJobApplication(
        int index, in.trujobs.proto.JobApplicationObject value) {
      if (jobApplicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobApplicationIsMutable();
        jobApplication_.add(index, value);
        onChanged();
      } else {
        jobApplicationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder addJobApplication(
        in.trujobs.proto.JobApplicationObject.Builder builderForValue) {
      if (jobApplicationBuilder_ == null) {
        ensureJobApplicationIsMutable();
        jobApplication_.add(builderForValue.build());
        onChanged();
      } else {
        jobApplicationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder addJobApplication(
        int index, in.trujobs.proto.JobApplicationObject.Builder builderForValue) {
      if (jobApplicationBuilder_ == null) {
        ensureJobApplicationIsMutable();
        jobApplication_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobApplicationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder addAllJobApplication(
        java.lang.Iterable<? extends in.trujobs.proto.JobApplicationObject> values) {
      if (jobApplicationBuilder_ == null) {
        ensureJobApplicationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobApplication_);
        onChanged();
      } else {
        jobApplicationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder clearJobApplication() {
      if (jobApplicationBuilder_ == null) {
        jobApplication_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        jobApplicationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public Builder removeJobApplication(int index) {
      if (jobApplicationBuilder_ == null) {
        ensureJobApplicationIsMutable();
        jobApplication_.remove(index);
        onChanged();
      } else {
        jobApplicationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public in.trujobs.proto.JobApplicationObject.Builder getJobApplicationBuilder(
        int index) {
      return getJobApplicationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public in.trujobs.proto.JobApplicationObjectOrBuilder getJobApplicationOrBuilder(
        int index) {
      if (jobApplicationBuilder_ == null) {
        return jobApplication_.get(index);  } else {
        return jobApplicationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public java.util.List<? extends in.trujobs.proto.JobApplicationObjectOrBuilder> 
         getJobApplicationOrBuilderList() {
      if (jobApplicationBuilder_ != null) {
        return jobApplicationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobApplication_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public in.trujobs.proto.JobApplicationObject.Builder addJobApplicationBuilder() {
      return getJobApplicationFieldBuilder().addBuilder(
          in.trujobs.proto.JobApplicationObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public in.trujobs.proto.JobApplicationObject.Builder addJobApplicationBuilder(
        int index) {
      return getJobApplicationFieldBuilder().addBuilder(
          index, in.trujobs.proto.JobApplicationObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.JobApplicationObject jobApplication = 2;</code>
     */
    public java.util.List<in.trujobs.proto.JobApplicationObject.Builder> 
         getJobApplicationBuilderList() {
      return getJobApplicationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.JobApplicationObject, in.trujobs.proto.JobApplicationObject.Builder, in.trujobs.proto.JobApplicationObjectOrBuilder> 
        getJobApplicationFieldBuilder() {
      if (jobApplicationBuilder_ == null) {
        jobApplicationBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.JobApplicationObject, in.trujobs.proto.JobApplicationObject.Builder, in.trujobs.proto.JobApplicationObjectOrBuilder>(
                jobApplication_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        jobApplication_ = null;
      }
      return jobApplicationBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.CandidateAppliedJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.CandidateAppliedJobsResponse)
  private static final in.trujobs.proto.CandidateAppliedJobsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.CandidateAppliedJobsResponse();
  }

  public static in.trujobs.proto.CandidateAppliedJobsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidateAppliedJobsResponse>
      PARSER = new com.google.protobuf.AbstractParser<CandidateAppliedJobsResponse>() {
    public CandidateAppliedJobsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new CandidateAppliedJobsResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<CandidateAppliedJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidateAppliedJobsResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.CandidateAppliedJobsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
