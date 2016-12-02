// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse}
 */
public  final class CandidateAppliedJobPostWorkFlowResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse)
    CandidateAppliedJobPostWorkFlowResponseOrBuilder {
  // Use CandidateAppliedJobPostWorkFlowResponse.newBuilder() to construct.
  private CandidateAppliedJobPostWorkFlowResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CandidateAppliedJobPostWorkFlowResponse() {
    status_ = 0;
    jobPostWorkFlowObject_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CandidateAppliedJobPostWorkFlowResponse(
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
              jobPostWorkFlowObject_ = new java.util.ArrayList<in.trujobs.proto.JobPostWorkFlowObject>();
              mutable_bitField0_ |= 0x00000002;
            }
            jobPostWorkFlowObject_.add(input.readMessage(in.trujobs.proto.JobPostWorkFlowObject.parser(), extensionRegistry));
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
        jobPostWorkFlowObject_ = java.util.Collections.unmodifiableList(jobPostWorkFlowObject_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobPostWorkFlowResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobPostWorkFlowResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.class, in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status}
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
      return in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status)
  }

  private int bitField0_;
  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status getStatus() {
    in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status result = in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status.UNRECOGNIZED : result;
  }

  public static final int JOBPOSTWORKFLOWOBJECT_FIELD_NUMBER = 2;
  private java.util.List<in.trujobs.proto.JobPostWorkFlowObject> jobPostWorkFlowObject_;
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  public java.util.List<in.trujobs.proto.JobPostWorkFlowObject> getJobPostWorkFlowObjectList() {
    return jobPostWorkFlowObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  public java.util.List<? extends in.trujobs.proto.JobPostWorkFlowObjectOrBuilder> 
      getJobPostWorkFlowObjectOrBuilderList() {
    return jobPostWorkFlowObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  public int getJobPostWorkFlowObjectCount() {
    return jobPostWorkFlowObject_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  public in.trujobs.proto.JobPostWorkFlowObject getJobPostWorkFlowObject(int index) {
    return jobPostWorkFlowObject_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
   */
  public in.trujobs.proto.JobPostWorkFlowObjectOrBuilder getJobPostWorkFlowObjectOrBuilder(
      int index) {
    return jobPostWorkFlowObject_.get(index);
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
    if (status_ != in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    for (int i = 0; i < jobPostWorkFlowObject_.size(); i++) {
      output.writeMessage(2, jobPostWorkFlowObject_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    for (int i = 0; i < jobPostWorkFlowObject_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, jobPostWorkFlowObject_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse)
      in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobPostWorkFlowResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobPostWorkFlowResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.class, in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.newBuilder()
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
        getJobPostWorkFlowObjectFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      status_ = 0;

      if (jobPostWorkFlowObjectBuilder_ == null) {
        jobPostWorkFlowObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        jobPostWorkFlowObjectBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobPostWorkFlowResponse_descriptor;
    }

    public in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse getDefaultInstanceForType() {
      return in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.getDefaultInstance();
    }

    public in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse build() {
      in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse buildPartial() {
      in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse result = new in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.status_ = status_;
      if (jobPostWorkFlowObjectBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          jobPostWorkFlowObject_ = java.util.Collections.unmodifiableList(jobPostWorkFlowObject_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.jobPostWorkFlowObject_ = jobPostWorkFlowObject_;
      } else {
        result.jobPostWorkFlowObject_ = jobPostWorkFlowObjectBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse) {
        return mergeFrom((in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse other) {
      if (other == in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (jobPostWorkFlowObjectBuilder_ == null) {
        if (!other.jobPostWorkFlowObject_.isEmpty()) {
          if (jobPostWorkFlowObject_.isEmpty()) {
            jobPostWorkFlowObject_ = other.jobPostWorkFlowObject_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureJobPostWorkFlowObjectIsMutable();
            jobPostWorkFlowObject_.addAll(other.jobPostWorkFlowObject_);
          }
          onChanged();
        }
      } else {
        if (!other.jobPostWorkFlowObject_.isEmpty()) {
          if (jobPostWorkFlowObjectBuilder_.isEmpty()) {
            jobPostWorkFlowObjectBuilder_.dispose();
            jobPostWorkFlowObjectBuilder_ = null;
            jobPostWorkFlowObject_ = other.jobPostWorkFlowObject_;
            bitField0_ = (bitField0_ & ~0x00000002);
            jobPostWorkFlowObjectBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getJobPostWorkFlowObjectFieldBuilder() : null;
          } else {
            jobPostWorkFlowObjectBuilder_.addAllMessages(other.jobPostWorkFlowObject_);
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
      in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse) e.getUnfinishedMessage();
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
     * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status getStatus() {
      in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status result = in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<in.trujobs.proto.JobPostWorkFlowObject> jobPostWorkFlowObject_ =
      java.util.Collections.emptyList();
    private void ensureJobPostWorkFlowObjectIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        jobPostWorkFlowObject_ = new java.util.ArrayList<in.trujobs.proto.JobPostWorkFlowObject>(jobPostWorkFlowObject_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.JobPostWorkFlowObject, in.trujobs.proto.JobPostWorkFlowObject.Builder, in.trujobs.proto.JobPostWorkFlowObjectOrBuilder> jobPostWorkFlowObjectBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public java.util.List<in.trujobs.proto.JobPostWorkFlowObject> getJobPostWorkFlowObjectList() {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobPostWorkFlowObject_);
      } else {
        return jobPostWorkFlowObjectBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public int getJobPostWorkFlowObjectCount() {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        return jobPostWorkFlowObject_.size();
      } else {
        return jobPostWorkFlowObjectBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public in.trujobs.proto.JobPostWorkFlowObject getJobPostWorkFlowObject(int index) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        return jobPostWorkFlowObject_.get(index);
      } else {
        return jobPostWorkFlowObjectBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder setJobPostWorkFlowObject(
        int index, in.trujobs.proto.JobPostWorkFlowObject value) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.set(index, value);
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder setJobPostWorkFlowObject(
        int index, in.trujobs.proto.JobPostWorkFlowObject.Builder builderForValue) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder addJobPostWorkFlowObject(in.trujobs.proto.JobPostWorkFlowObject value) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.add(value);
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder addJobPostWorkFlowObject(
        int index, in.trujobs.proto.JobPostWorkFlowObject value) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.add(index, value);
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder addJobPostWorkFlowObject(
        in.trujobs.proto.JobPostWorkFlowObject.Builder builderForValue) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.add(builderForValue.build());
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder addJobPostWorkFlowObject(
        int index, in.trujobs.proto.JobPostWorkFlowObject.Builder builderForValue) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder addAllJobPostWorkFlowObject(
        java.lang.Iterable<? extends in.trujobs.proto.JobPostWorkFlowObject> values) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        ensureJobPostWorkFlowObjectIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobPostWorkFlowObject_);
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder clearJobPostWorkFlowObject() {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        jobPostWorkFlowObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public Builder removeJobPostWorkFlowObject(int index) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        ensureJobPostWorkFlowObjectIsMutable();
        jobPostWorkFlowObject_.remove(index);
        onChanged();
      } else {
        jobPostWorkFlowObjectBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public in.trujobs.proto.JobPostWorkFlowObject.Builder getJobPostWorkFlowObjectBuilder(
        int index) {
      return getJobPostWorkFlowObjectFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public in.trujobs.proto.JobPostWorkFlowObjectOrBuilder getJobPostWorkFlowObjectOrBuilder(
        int index) {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        return jobPostWorkFlowObject_.get(index);  } else {
        return jobPostWorkFlowObjectBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public java.util.List<? extends in.trujobs.proto.JobPostWorkFlowObjectOrBuilder> 
         getJobPostWorkFlowObjectOrBuilderList() {
      if (jobPostWorkFlowObjectBuilder_ != null) {
        return jobPostWorkFlowObjectBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobPostWorkFlowObject_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public in.trujobs.proto.JobPostWorkFlowObject.Builder addJobPostWorkFlowObjectBuilder() {
      return getJobPostWorkFlowObjectFieldBuilder().addBuilder(
          in.trujobs.proto.JobPostWorkFlowObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public in.trujobs.proto.JobPostWorkFlowObject.Builder addJobPostWorkFlowObjectBuilder(
        int index) {
      return getJobPostWorkFlowObjectFieldBuilder().addBuilder(
          index, in.trujobs.proto.JobPostWorkFlowObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.JobPostWorkFlowObject jobPostWorkFlowObject = 2;</code>
     */
    public java.util.List<in.trujobs.proto.JobPostWorkFlowObject.Builder> 
         getJobPostWorkFlowObjectBuilderList() {
      return getJobPostWorkFlowObjectFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.JobPostWorkFlowObject, in.trujobs.proto.JobPostWorkFlowObject.Builder, in.trujobs.proto.JobPostWorkFlowObjectOrBuilder> 
        getJobPostWorkFlowObjectFieldBuilder() {
      if (jobPostWorkFlowObjectBuilder_ == null) {
        jobPostWorkFlowObjectBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.JobPostWorkFlowObject, in.trujobs.proto.JobPostWorkFlowObject.Builder, in.trujobs.proto.JobPostWorkFlowObjectOrBuilder>(
                jobPostWorkFlowObject_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        jobPostWorkFlowObject_ = null;
      }
      return jobPostWorkFlowObjectBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse)
  private static final in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse();
  }

  public static in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidateAppliedJobPostWorkFlowResponse>
      PARSER = new com.google.protobuf.AbstractParser<CandidateAppliedJobPostWorkFlowResponse>() {
    public CandidateAppliedJobPostWorkFlowResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new CandidateAppliedJobPostWorkFlowResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<CandidateAppliedJobPostWorkFlowResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidateAppliedJobPostWorkFlowResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.CandidateAppliedJobPostWorkFlowResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
