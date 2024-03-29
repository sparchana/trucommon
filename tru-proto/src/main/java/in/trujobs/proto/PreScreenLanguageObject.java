// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.PreScreenLanguageObject}
 */
public  final class PreScreenLanguageObject extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.PreScreenLanguageObject)
    PreScreenLanguageObjectOrBuilder {
  // Use PreScreenLanguageObject.newBuilder() to construct.
  private PreScreenLanguageObject(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PreScreenLanguageObject() {
    jobPostLanguage_ = java.util.Collections.emptyList();
    isMatching_ = false;
    propertyId_ = 0;
    propertyTitle_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PreScreenLanguageObject(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              jobPostLanguage_ = new java.util.ArrayList<in.trujobs.proto.LanguageObject>();
              mutable_bitField0_ |= 0x00000001;
            }
            jobPostLanguage_.add(input.readMessage(in.trujobs.proto.LanguageObject.parser(), extensionRegistry));
            break;
          }
          case 16: {

            isMatching_ = input.readBool();
            break;
          }
          case 24: {

            propertyId_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            propertyTitle_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        jobPostLanguage_ = java.util.Collections.unmodifiableList(jobPostLanguage_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_PreScreenLanguageObject_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_PreScreenLanguageObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.PreScreenLanguageObject.class, in.trujobs.proto.PreScreenLanguageObject.Builder.class);
  }

  private int bitField0_;
  public static final int JOBPOSTLANGUAGE_FIELD_NUMBER = 1;
  private java.util.List<in.trujobs.proto.LanguageObject> jobPostLanguage_;
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  public java.util.List<in.trujobs.proto.LanguageObject> getJobPostLanguageList() {
    return jobPostLanguage_;
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  public java.util.List<? extends in.trujobs.proto.LanguageObjectOrBuilder> 
      getJobPostLanguageOrBuilderList() {
    return jobPostLanguage_;
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  public int getJobPostLanguageCount() {
    return jobPostLanguage_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  public in.trujobs.proto.LanguageObject getJobPostLanguage(int index) {
    return jobPostLanguage_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  public in.trujobs.proto.LanguageObjectOrBuilder getJobPostLanguageOrBuilder(
      int index) {
    return jobPostLanguage_.get(index);
  }

  public static final int ISMATCHING_FIELD_NUMBER = 2;
  private boolean isMatching_;
  /**
   * <code>optional bool isMatching = 2;</code>
   */
  public boolean getIsMatching() {
    return isMatching_;
  }

  public static final int PROPERTYID_FIELD_NUMBER = 3;
  private int propertyId_;
  /**
   * <code>optional int32 propertyId = 3;</code>
   */
  public int getPropertyId() {
    return propertyId_;
  }

  public static final int PROPERTYTITLE_FIELD_NUMBER = 4;
  private volatile java.lang.Object propertyTitle_;
  /**
   * <code>optional string propertyTitle = 4;</code>
   */
  public java.lang.String getPropertyTitle() {
    java.lang.Object ref = propertyTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      propertyTitle_ = s;
      return s;
    }
  }
  /**
   * <code>optional string propertyTitle = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPropertyTitleBytes() {
    java.lang.Object ref = propertyTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      propertyTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < jobPostLanguage_.size(); i++) {
      output.writeMessage(1, jobPostLanguage_.get(i));
    }
    if (isMatching_ != false) {
      output.writeBool(2, isMatching_);
    }
    if (propertyId_ != 0) {
      output.writeInt32(3, propertyId_);
    }
    if (!getPropertyTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, propertyTitle_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < jobPostLanguage_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, jobPostLanguage_.get(i));
    }
    if (isMatching_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isMatching_);
    }
    if (propertyId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, propertyId_);
    }
    if (!getPropertyTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, propertyTitle_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.PreScreenLanguageObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.PreScreenLanguageObject prototype) {
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
   * Protobuf type {@code in.trujobs.proto.PreScreenLanguageObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.PreScreenLanguageObject)
      in.trujobs.proto.PreScreenLanguageObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_PreScreenLanguageObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_PreScreenLanguageObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.PreScreenLanguageObject.class, in.trujobs.proto.PreScreenLanguageObject.Builder.class);
    }

    // Construct using in.trujobs.proto.PreScreenLanguageObject.newBuilder()
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
        getJobPostLanguageFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (jobPostLanguageBuilder_ == null) {
        jobPostLanguage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jobPostLanguageBuilder_.clear();
      }
      isMatching_ = false;

      propertyId_ = 0;

      propertyTitle_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_PreScreenLanguageObject_descriptor;
    }

    public in.trujobs.proto.PreScreenLanguageObject getDefaultInstanceForType() {
      return in.trujobs.proto.PreScreenLanguageObject.getDefaultInstance();
    }

    public in.trujobs.proto.PreScreenLanguageObject build() {
      in.trujobs.proto.PreScreenLanguageObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.PreScreenLanguageObject buildPartial() {
      in.trujobs.proto.PreScreenLanguageObject result = new in.trujobs.proto.PreScreenLanguageObject(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (jobPostLanguageBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          jobPostLanguage_ = java.util.Collections.unmodifiableList(jobPostLanguage_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jobPostLanguage_ = jobPostLanguage_;
      } else {
        result.jobPostLanguage_ = jobPostLanguageBuilder_.build();
      }
      result.isMatching_ = isMatching_;
      result.propertyId_ = propertyId_;
      result.propertyTitle_ = propertyTitle_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.PreScreenLanguageObject) {
        return mergeFrom((in.trujobs.proto.PreScreenLanguageObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.PreScreenLanguageObject other) {
      if (other == in.trujobs.proto.PreScreenLanguageObject.getDefaultInstance()) return this;
      if (jobPostLanguageBuilder_ == null) {
        if (!other.jobPostLanguage_.isEmpty()) {
          if (jobPostLanguage_.isEmpty()) {
            jobPostLanguage_ = other.jobPostLanguage_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJobPostLanguageIsMutable();
            jobPostLanguage_.addAll(other.jobPostLanguage_);
          }
          onChanged();
        }
      } else {
        if (!other.jobPostLanguage_.isEmpty()) {
          if (jobPostLanguageBuilder_.isEmpty()) {
            jobPostLanguageBuilder_.dispose();
            jobPostLanguageBuilder_ = null;
            jobPostLanguage_ = other.jobPostLanguage_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jobPostLanguageBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getJobPostLanguageFieldBuilder() : null;
          } else {
            jobPostLanguageBuilder_.addAllMessages(other.jobPostLanguage_);
          }
        }
      }
      if (other.getIsMatching() != false) {
        setIsMatching(other.getIsMatching());
      }
      if (other.getPropertyId() != 0) {
        setPropertyId(other.getPropertyId());
      }
      if (!other.getPropertyTitle().isEmpty()) {
        propertyTitle_ = other.propertyTitle_;
        onChanged();
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
      in.trujobs.proto.PreScreenLanguageObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.PreScreenLanguageObject) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<in.trujobs.proto.LanguageObject> jobPostLanguage_ =
      java.util.Collections.emptyList();
    private void ensureJobPostLanguageIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        jobPostLanguage_ = new java.util.ArrayList<in.trujobs.proto.LanguageObject>(jobPostLanguage_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.LanguageObject, in.trujobs.proto.LanguageObject.Builder, in.trujobs.proto.LanguageObjectOrBuilder> jobPostLanguageBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public java.util.List<in.trujobs.proto.LanguageObject> getJobPostLanguageList() {
      if (jobPostLanguageBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobPostLanguage_);
      } else {
        return jobPostLanguageBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public int getJobPostLanguageCount() {
      if (jobPostLanguageBuilder_ == null) {
        return jobPostLanguage_.size();
      } else {
        return jobPostLanguageBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public in.trujobs.proto.LanguageObject getJobPostLanguage(int index) {
      if (jobPostLanguageBuilder_ == null) {
        return jobPostLanguage_.get(index);
      } else {
        return jobPostLanguageBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder setJobPostLanguage(
        int index, in.trujobs.proto.LanguageObject value) {
      if (jobPostLanguageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.set(index, value);
        onChanged();
      } else {
        jobPostLanguageBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder setJobPostLanguage(
        int index, in.trujobs.proto.LanguageObject.Builder builderForValue) {
      if (jobPostLanguageBuilder_ == null) {
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobPostLanguageBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder addJobPostLanguage(in.trujobs.proto.LanguageObject value) {
      if (jobPostLanguageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.add(value);
        onChanged();
      } else {
        jobPostLanguageBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder addJobPostLanguage(
        int index, in.trujobs.proto.LanguageObject value) {
      if (jobPostLanguageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.add(index, value);
        onChanged();
      } else {
        jobPostLanguageBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder addJobPostLanguage(
        in.trujobs.proto.LanguageObject.Builder builderForValue) {
      if (jobPostLanguageBuilder_ == null) {
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.add(builderForValue.build());
        onChanged();
      } else {
        jobPostLanguageBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder addJobPostLanguage(
        int index, in.trujobs.proto.LanguageObject.Builder builderForValue) {
      if (jobPostLanguageBuilder_ == null) {
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobPostLanguageBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder addAllJobPostLanguage(
        java.lang.Iterable<? extends in.trujobs.proto.LanguageObject> values) {
      if (jobPostLanguageBuilder_ == null) {
        ensureJobPostLanguageIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jobPostLanguage_);
        onChanged();
      } else {
        jobPostLanguageBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder clearJobPostLanguage() {
      if (jobPostLanguageBuilder_ == null) {
        jobPostLanguage_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jobPostLanguageBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public Builder removeJobPostLanguage(int index) {
      if (jobPostLanguageBuilder_ == null) {
        ensureJobPostLanguageIsMutable();
        jobPostLanguage_.remove(index);
        onChanged();
      } else {
        jobPostLanguageBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public in.trujobs.proto.LanguageObject.Builder getJobPostLanguageBuilder(
        int index) {
      return getJobPostLanguageFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public in.trujobs.proto.LanguageObjectOrBuilder getJobPostLanguageOrBuilder(
        int index) {
      if (jobPostLanguageBuilder_ == null) {
        return jobPostLanguage_.get(index);  } else {
        return jobPostLanguageBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public java.util.List<? extends in.trujobs.proto.LanguageObjectOrBuilder> 
         getJobPostLanguageOrBuilderList() {
      if (jobPostLanguageBuilder_ != null) {
        return jobPostLanguageBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobPostLanguage_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public in.trujobs.proto.LanguageObject.Builder addJobPostLanguageBuilder() {
      return getJobPostLanguageFieldBuilder().addBuilder(
          in.trujobs.proto.LanguageObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public in.trujobs.proto.LanguageObject.Builder addJobPostLanguageBuilder(
        int index) {
      return getJobPostLanguageFieldBuilder().addBuilder(
          index, in.trujobs.proto.LanguageObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
     */
    public java.util.List<in.trujobs.proto.LanguageObject.Builder> 
         getJobPostLanguageBuilderList() {
      return getJobPostLanguageFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.LanguageObject, in.trujobs.proto.LanguageObject.Builder, in.trujobs.proto.LanguageObjectOrBuilder> 
        getJobPostLanguageFieldBuilder() {
      if (jobPostLanguageBuilder_ == null) {
        jobPostLanguageBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.LanguageObject, in.trujobs.proto.LanguageObject.Builder, in.trujobs.proto.LanguageObjectOrBuilder>(
                jobPostLanguage_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        jobPostLanguage_ = null;
      }
      return jobPostLanguageBuilder_;
    }

    private boolean isMatching_ ;
    /**
     * <code>optional bool isMatching = 2;</code>
     */
    public boolean getIsMatching() {
      return isMatching_;
    }
    /**
     * <code>optional bool isMatching = 2;</code>
     */
    public Builder setIsMatching(boolean value) {
      
      isMatching_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isMatching = 2;</code>
     */
    public Builder clearIsMatching() {
      
      isMatching_ = false;
      onChanged();
      return this;
    }

    private int propertyId_ ;
    /**
     * <code>optional int32 propertyId = 3;</code>
     */
    public int getPropertyId() {
      return propertyId_;
    }
    /**
     * <code>optional int32 propertyId = 3;</code>
     */
    public Builder setPropertyId(int value) {
      
      propertyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 propertyId = 3;</code>
     */
    public Builder clearPropertyId() {
      
      propertyId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object propertyTitle_ = "";
    /**
     * <code>optional string propertyTitle = 4;</code>
     */
    public java.lang.String getPropertyTitle() {
      java.lang.Object ref = propertyTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        propertyTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string propertyTitle = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPropertyTitleBytes() {
      java.lang.Object ref = propertyTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        propertyTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string propertyTitle = 4;</code>
     */
    public Builder setPropertyTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      propertyTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string propertyTitle = 4;</code>
     */
    public Builder clearPropertyTitle() {
      
      propertyTitle_ = getDefaultInstance().getPropertyTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string propertyTitle = 4;</code>
     */
    public Builder setPropertyTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      propertyTitle_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.PreScreenLanguageObject)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.PreScreenLanguageObject)
  private static final in.trujobs.proto.PreScreenLanguageObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.PreScreenLanguageObject();
  }

  public static in.trujobs.proto.PreScreenLanguageObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreScreenLanguageObject>
      PARSER = new com.google.protobuf.AbstractParser<PreScreenLanguageObject>() {
    public PreScreenLanguageObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new PreScreenLanguageObject(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<PreScreenLanguageObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreScreenLanguageObject> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.PreScreenLanguageObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

