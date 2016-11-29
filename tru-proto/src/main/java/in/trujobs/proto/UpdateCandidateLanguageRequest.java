// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.UpdateCandidateLanguageRequest}
 */
public  final class UpdateCandidateLanguageRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.UpdateCandidateLanguageRequest)
    UpdateCandidateLanguageRequestOrBuilder {
  // Use UpdateCandidateLanguageRequest.newBuilder() to construct.
  private UpdateCandidateLanguageRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateCandidateLanguageRequest() {
    candidateMobile_ = "";
    languageKnownObject_ = java.util.Collections.emptyList();
    jobPostId_ = 0L;
    isFinalFragment_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateCandidateLanguageRequest(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              languageKnownObject_ = new java.util.ArrayList<in.trujobs.proto.LanguageKnownObject>();
              mutable_bitField0_ |= 0x00000002;
            }
            languageKnownObject_.add(input.readMessage(in.trujobs.proto.LanguageKnownObject.parser(), extensionRegistry));
            break;
          }
          case 24: {

            jobPostId_ = input.readInt64();
            break;
          }
          case 32: {

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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        languageKnownObject_ = java.util.Collections.unmodifiableList(languageKnownObject_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateLanguageRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateLanguageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.UpdateCandidateLanguageRequest.class, in.trujobs.proto.UpdateCandidateLanguageRequest.Builder.class);
  }

  private int bitField0_;
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

  public static final int LANGUAGEKNOWNOBJECT_FIELD_NUMBER = 2;
  private java.util.List<in.trujobs.proto.LanguageKnownObject> languageKnownObject_;
  /**
   * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
   */
  public java.util.List<in.trujobs.proto.LanguageKnownObject> getLanguageKnownObjectList() {
    return languageKnownObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
   */
  public java.util.List<? extends in.trujobs.proto.LanguageKnownObjectOrBuilder> 
      getLanguageKnownObjectOrBuilderList() {
    return languageKnownObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
   */
  public int getLanguageKnownObjectCount() {
    return languageKnownObject_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
   */
  public in.trujobs.proto.LanguageKnownObject getLanguageKnownObject(int index) {
    return languageKnownObject_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
   */
  public in.trujobs.proto.LanguageKnownObjectOrBuilder getLanguageKnownObjectOrBuilder(
      int index) {
    return languageKnownObject_.get(index);
  }

  public static final int JOBPOSTID_FIELD_NUMBER = 3;
  private long jobPostId_;
  /**
   * <code>optional int64 jobPostId = 3;</code>
   */
  public long getJobPostId() {
    return jobPostId_;
  }

  public static final int ISFINALFRAGMENT_FIELD_NUMBER = 4;
  private boolean isFinalFragment_;
  /**
   * <code>optional bool isFinalFragment = 4;</code>
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
    for (int i = 0; i < languageKnownObject_.size(); i++) {
      output.writeMessage(2, languageKnownObject_.get(i));
    }
    if (jobPostId_ != 0L) {
      output.writeInt64(3, jobPostId_);
    }
    if (isFinalFragment_ != false) {
      output.writeBool(4, isFinalFragment_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCandidateMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, candidateMobile_);
    }
    for (int i = 0; i < languageKnownObject_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, languageKnownObject_.get(i));
    }
    if (jobPostId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, jobPostId_);
    }
    if (isFinalFragment_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isFinalFragment_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateLanguageRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.UpdateCandidateLanguageRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.UpdateCandidateLanguageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.UpdateCandidateLanguageRequest)
      in.trujobs.proto.UpdateCandidateLanguageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateLanguageRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateLanguageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.UpdateCandidateLanguageRequest.class, in.trujobs.proto.UpdateCandidateLanguageRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.UpdateCandidateLanguageRequest.newBuilder()
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
        getLanguageKnownObjectFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      candidateMobile_ = "";

      if (languageKnownObjectBuilder_ == null) {
        languageKnownObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        languageKnownObjectBuilder_.clear();
      }
      jobPostId_ = 0L;

      isFinalFragment_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateLanguageRequest_descriptor;
    }

    public in.trujobs.proto.UpdateCandidateLanguageRequest getDefaultInstanceForType() {
      return in.trujobs.proto.UpdateCandidateLanguageRequest.getDefaultInstance();
    }

    public in.trujobs.proto.UpdateCandidateLanguageRequest build() {
      in.trujobs.proto.UpdateCandidateLanguageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.UpdateCandidateLanguageRequest buildPartial() {
      in.trujobs.proto.UpdateCandidateLanguageRequest result = new in.trujobs.proto.UpdateCandidateLanguageRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.candidateMobile_ = candidateMobile_;
      if (languageKnownObjectBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          languageKnownObject_ = java.util.Collections.unmodifiableList(languageKnownObject_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.languageKnownObject_ = languageKnownObject_;
      } else {
        result.languageKnownObject_ = languageKnownObjectBuilder_.build();
      }
      result.jobPostId_ = jobPostId_;
      result.isFinalFragment_ = isFinalFragment_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.UpdateCandidateLanguageRequest) {
        return mergeFrom((in.trujobs.proto.UpdateCandidateLanguageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.UpdateCandidateLanguageRequest other) {
      if (other == in.trujobs.proto.UpdateCandidateLanguageRequest.getDefaultInstance()) return this;
      if (!other.getCandidateMobile().isEmpty()) {
        candidateMobile_ = other.candidateMobile_;
        onChanged();
      }
      if (languageKnownObjectBuilder_ == null) {
        if (!other.languageKnownObject_.isEmpty()) {
          if (languageKnownObject_.isEmpty()) {
            languageKnownObject_ = other.languageKnownObject_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLanguageKnownObjectIsMutable();
            languageKnownObject_.addAll(other.languageKnownObject_);
          }
          onChanged();
        }
      } else {
        if (!other.languageKnownObject_.isEmpty()) {
          if (languageKnownObjectBuilder_.isEmpty()) {
            languageKnownObjectBuilder_.dispose();
            languageKnownObjectBuilder_ = null;
            languageKnownObject_ = other.languageKnownObject_;
            bitField0_ = (bitField0_ & ~0x00000002);
            languageKnownObjectBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getLanguageKnownObjectFieldBuilder() : null;
          } else {
            languageKnownObjectBuilder_.addAllMessages(other.languageKnownObject_);
          }
        }
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
      in.trujobs.proto.UpdateCandidateLanguageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.UpdateCandidateLanguageRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.util.List<in.trujobs.proto.LanguageKnownObject> languageKnownObject_ =
      java.util.Collections.emptyList();
    private void ensureLanguageKnownObjectIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        languageKnownObject_ = new java.util.ArrayList<in.trujobs.proto.LanguageKnownObject>(languageKnownObject_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.LanguageKnownObject, in.trujobs.proto.LanguageKnownObject.Builder, in.trujobs.proto.LanguageKnownObjectOrBuilder> languageKnownObjectBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public java.util.List<in.trujobs.proto.LanguageKnownObject> getLanguageKnownObjectList() {
      if (languageKnownObjectBuilder_ == null) {
        return java.util.Collections.unmodifiableList(languageKnownObject_);
      } else {
        return languageKnownObjectBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public int getLanguageKnownObjectCount() {
      if (languageKnownObjectBuilder_ == null) {
        return languageKnownObject_.size();
      } else {
        return languageKnownObjectBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public in.trujobs.proto.LanguageKnownObject getLanguageKnownObject(int index) {
      if (languageKnownObjectBuilder_ == null) {
        return languageKnownObject_.get(index);
      } else {
        return languageKnownObjectBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder setLanguageKnownObject(
        int index, in.trujobs.proto.LanguageKnownObject value) {
      if (languageKnownObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.set(index, value);
        onChanged();
      } else {
        languageKnownObjectBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder setLanguageKnownObject(
        int index, in.trujobs.proto.LanguageKnownObject.Builder builderForValue) {
      if (languageKnownObjectBuilder_ == null) {
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.set(index, builderForValue.build());
        onChanged();
      } else {
        languageKnownObjectBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder addLanguageKnownObject(in.trujobs.proto.LanguageKnownObject value) {
      if (languageKnownObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.add(value);
        onChanged();
      } else {
        languageKnownObjectBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder addLanguageKnownObject(
        int index, in.trujobs.proto.LanguageKnownObject value) {
      if (languageKnownObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.add(index, value);
        onChanged();
      } else {
        languageKnownObjectBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder addLanguageKnownObject(
        in.trujobs.proto.LanguageKnownObject.Builder builderForValue) {
      if (languageKnownObjectBuilder_ == null) {
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.add(builderForValue.build());
        onChanged();
      } else {
        languageKnownObjectBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder addLanguageKnownObject(
        int index, in.trujobs.proto.LanguageKnownObject.Builder builderForValue) {
      if (languageKnownObjectBuilder_ == null) {
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.add(index, builderForValue.build());
        onChanged();
      } else {
        languageKnownObjectBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder addAllLanguageKnownObject(
        java.lang.Iterable<? extends in.trujobs.proto.LanguageKnownObject> values) {
      if (languageKnownObjectBuilder_ == null) {
        ensureLanguageKnownObjectIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, languageKnownObject_);
        onChanged();
      } else {
        languageKnownObjectBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder clearLanguageKnownObject() {
      if (languageKnownObjectBuilder_ == null) {
        languageKnownObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        languageKnownObjectBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public Builder removeLanguageKnownObject(int index) {
      if (languageKnownObjectBuilder_ == null) {
        ensureLanguageKnownObjectIsMutable();
        languageKnownObject_.remove(index);
        onChanged();
      } else {
        languageKnownObjectBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public in.trujobs.proto.LanguageKnownObject.Builder getLanguageKnownObjectBuilder(
        int index) {
      return getLanguageKnownObjectFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public in.trujobs.proto.LanguageKnownObjectOrBuilder getLanguageKnownObjectOrBuilder(
        int index) {
      if (languageKnownObjectBuilder_ == null) {
        return languageKnownObject_.get(index);  } else {
        return languageKnownObjectBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public java.util.List<? extends in.trujobs.proto.LanguageKnownObjectOrBuilder> 
         getLanguageKnownObjectOrBuilderList() {
      if (languageKnownObjectBuilder_ != null) {
        return languageKnownObjectBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(languageKnownObject_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public in.trujobs.proto.LanguageKnownObject.Builder addLanguageKnownObjectBuilder() {
      return getLanguageKnownObjectFieldBuilder().addBuilder(
          in.trujobs.proto.LanguageKnownObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public in.trujobs.proto.LanguageKnownObject.Builder addLanguageKnownObjectBuilder(
        int index) {
      return getLanguageKnownObjectFieldBuilder().addBuilder(
          index, in.trujobs.proto.LanguageKnownObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.LanguageKnownObject languageKnownObject = 2;</code>
     */
    public java.util.List<in.trujobs.proto.LanguageKnownObject.Builder> 
         getLanguageKnownObjectBuilderList() {
      return getLanguageKnownObjectFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.LanguageKnownObject, in.trujobs.proto.LanguageKnownObject.Builder, in.trujobs.proto.LanguageKnownObjectOrBuilder> 
        getLanguageKnownObjectFieldBuilder() {
      if (languageKnownObjectBuilder_ == null) {
        languageKnownObjectBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.LanguageKnownObject, in.trujobs.proto.LanguageKnownObject.Builder, in.trujobs.proto.LanguageKnownObjectOrBuilder>(
                languageKnownObject_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        languageKnownObject_ = null;
      }
      return languageKnownObjectBuilder_;
    }

    private long jobPostId_ ;
    /**
     * <code>optional int64 jobPostId = 3;</code>
     */
    public long getJobPostId() {
      return jobPostId_;
    }
    /**
     * <code>optional int64 jobPostId = 3;</code>
     */
    public Builder setJobPostId(long value) {
      
      jobPostId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 jobPostId = 3;</code>
     */
    public Builder clearJobPostId() {
      
      jobPostId_ = 0L;
      onChanged();
      return this;
    }

    private boolean isFinalFragment_ ;
    /**
     * <code>optional bool isFinalFragment = 4;</code>
     */
    public boolean getIsFinalFragment() {
      return isFinalFragment_;
    }
    /**
     * <code>optional bool isFinalFragment = 4;</code>
     */
    public Builder setIsFinalFragment(boolean value) {
      
      isFinalFragment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isFinalFragment = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.UpdateCandidateLanguageRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.UpdateCandidateLanguageRequest)
  private static final in.trujobs.proto.UpdateCandidateLanguageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.UpdateCandidateLanguageRequest();
  }

  public static in.trujobs.proto.UpdateCandidateLanguageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCandidateLanguageRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCandidateLanguageRequest>() {
    public UpdateCandidateLanguageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateCandidateLanguageRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<UpdateCandidateLanguageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCandidateLanguageRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.UpdateCandidateLanguageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

