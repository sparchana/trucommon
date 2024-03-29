// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.UpdateCandidateDocumentRequest}
 */
public  final class UpdateCandidateDocumentRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.UpdateCandidateDocumentRequest)
    UpdateCandidateDocumentRequestOrBuilder {
  // Use UpdateCandidateDocumentRequest.newBuilder() to construct.
  private UpdateCandidateDocumentRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateCandidateDocumentRequest() {
    candidateMobile_ = "";
    idProof_ = java.util.Collections.emptyList();
    jobPostId_ = 0L;
    isFinalFragment_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateCandidateDocumentRequest(
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
              idProof_ = new java.util.ArrayList<in.trujobs.proto.IdProofObjectWithNumber>();
              mutable_bitField0_ |= 0x00000002;
            }
            idProof_.add(input.readMessage(in.trujobs.proto.IdProofObjectWithNumber.parser(), extensionRegistry));
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
        idProof_ = java.util.Collections.unmodifiableList(idProof_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateDocumentRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateDocumentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.UpdateCandidateDocumentRequest.class, in.trujobs.proto.UpdateCandidateDocumentRequest.Builder.class);
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

  public static final int IDPROOF_FIELD_NUMBER = 2;
  private java.util.List<in.trujobs.proto.IdProofObjectWithNumber> idProof_;
  /**
   * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
   */
  public java.util.List<in.trujobs.proto.IdProofObjectWithNumber> getIdProofList() {
    return idProof_;
  }
  /**
   * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
   */
  public java.util.List<? extends in.trujobs.proto.IdProofObjectWithNumberOrBuilder> 
      getIdProofOrBuilderList() {
    return idProof_;
  }
  /**
   * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
   */
  public int getIdProofCount() {
    return idProof_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
   */
  public in.trujobs.proto.IdProofObjectWithNumber getIdProof(int index) {
    return idProof_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
   */
  public in.trujobs.proto.IdProofObjectWithNumberOrBuilder getIdProofOrBuilder(
      int index) {
    return idProof_.get(index);
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
    for (int i = 0; i < idProof_.size(); i++) {
      output.writeMessage(2, idProof_.get(i));
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
    for (int i = 0; i < idProof_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, idProof_.get(i));
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
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateDocumentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.UpdateCandidateDocumentRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.UpdateCandidateDocumentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.UpdateCandidateDocumentRequest)
      in.trujobs.proto.UpdateCandidateDocumentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateDocumentRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateDocumentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.UpdateCandidateDocumentRequest.class, in.trujobs.proto.UpdateCandidateDocumentRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.UpdateCandidateDocumentRequest.newBuilder()
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
        getIdProofFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      candidateMobile_ = "";

      if (idProofBuilder_ == null) {
        idProof_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        idProofBuilder_.clear();
      }
      jobPostId_ = 0L;

      isFinalFragment_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateDocumentRequest_descriptor;
    }

    public in.trujobs.proto.UpdateCandidateDocumentRequest getDefaultInstanceForType() {
      return in.trujobs.proto.UpdateCandidateDocumentRequest.getDefaultInstance();
    }

    public in.trujobs.proto.UpdateCandidateDocumentRequest build() {
      in.trujobs.proto.UpdateCandidateDocumentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.UpdateCandidateDocumentRequest buildPartial() {
      in.trujobs.proto.UpdateCandidateDocumentRequest result = new in.trujobs.proto.UpdateCandidateDocumentRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.candidateMobile_ = candidateMobile_;
      if (idProofBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          idProof_ = java.util.Collections.unmodifiableList(idProof_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.idProof_ = idProof_;
      } else {
        result.idProof_ = idProofBuilder_.build();
      }
      result.jobPostId_ = jobPostId_;
      result.isFinalFragment_ = isFinalFragment_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.UpdateCandidateDocumentRequest) {
        return mergeFrom((in.trujobs.proto.UpdateCandidateDocumentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.UpdateCandidateDocumentRequest other) {
      if (other == in.trujobs.proto.UpdateCandidateDocumentRequest.getDefaultInstance()) return this;
      if (!other.getCandidateMobile().isEmpty()) {
        candidateMobile_ = other.candidateMobile_;
        onChanged();
      }
      if (idProofBuilder_ == null) {
        if (!other.idProof_.isEmpty()) {
          if (idProof_.isEmpty()) {
            idProof_ = other.idProof_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureIdProofIsMutable();
            idProof_.addAll(other.idProof_);
          }
          onChanged();
        }
      } else {
        if (!other.idProof_.isEmpty()) {
          if (idProofBuilder_.isEmpty()) {
            idProofBuilder_.dispose();
            idProofBuilder_ = null;
            idProof_ = other.idProof_;
            bitField0_ = (bitField0_ & ~0x00000002);
            idProofBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getIdProofFieldBuilder() : null;
          } else {
            idProofBuilder_.addAllMessages(other.idProof_);
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
      in.trujobs.proto.UpdateCandidateDocumentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.UpdateCandidateDocumentRequest) e.getUnfinishedMessage();
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

    private java.util.List<in.trujobs.proto.IdProofObjectWithNumber> idProof_ =
      java.util.Collections.emptyList();
    private void ensureIdProofIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        idProof_ = new java.util.ArrayList<in.trujobs.proto.IdProofObjectWithNumber>(idProof_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.IdProofObjectWithNumber, in.trujobs.proto.IdProofObjectWithNumber.Builder, in.trujobs.proto.IdProofObjectWithNumberOrBuilder> idProofBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public java.util.List<in.trujobs.proto.IdProofObjectWithNumber> getIdProofList() {
      if (idProofBuilder_ == null) {
        return java.util.Collections.unmodifiableList(idProof_);
      } else {
        return idProofBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public int getIdProofCount() {
      if (idProofBuilder_ == null) {
        return idProof_.size();
      } else {
        return idProofBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public in.trujobs.proto.IdProofObjectWithNumber getIdProof(int index) {
      if (idProofBuilder_ == null) {
        return idProof_.get(index);
      } else {
        return idProofBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder setIdProof(
        int index, in.trujobs.proto.IdProofObjectWithNumber value) {
      if (idProofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdProofIsMutable();
        idProof_.set(index, value);
        onChanged();
      } else {
        idProofBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder setIdProof(
        int index, in.trujobs.proto.IdProofObjectWithNumber.Builder builderForValue) {
      if (idProofBuilder_ == null) {
        ensureIdProofIsMutable();
        idProof_.set(index, builderForValue.build());
        onChanged();
      } else {
        idProofBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder addIdProof(in.trujobs.proto.IdProofObjectWithNumber value) {
      if (idProofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdProofIsMutable();
        idProof_.add(value);
        onChanged();
      } else {
        idProofBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder addIdProof(
        int index, in.trujobs.proto.IdProofObjectWithNumber value) {
      if (idProofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIdProofIsMutable();
        idProof_.add(index, value);
        onChanged();
      } else {
        idProofBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder addIdProof(
        in.trujobs.proto.IdProofObjectWithNumber.Builder builderForValue) {
      if (idProofBuilder_ == null) {
        ensureIdProofIsMutable();
        idProof_.add(builderForValue.build());
        onChanged();
      } else {
        idProofBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder addIdProof(
        int index, in.trujobs.proto.IdProofObjectWithNumber.Builder builderForValue) {
      if (idProofBuilder_ == null) {
        ensureIdProofIsMutable();
        idProof_.add(index, builderForValue.build());
        onChanged();
      } else {
        idProofBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder addAllIdProof(
        java.lang.Iterable<? extends in.trujobs.proto.IdProofObjectWithNumber> values) {
      if (idProofBuilder_ == null) {
        ensureIdProofIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, idProof_);
        onChanged();
      } else {
        idProofBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder clearIdProof() {
      if (idProofBuilder_ == null) {
        idProof_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        idProofBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public Builder removeIdProof(int index) {
      if (idProofBuilder_ == null) {
        ensureIdProofIsMutable();
        idProof_.remove(index);
        onChanged();
      } else {
        idProofBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public in.trujobs.proto.IdProofObjectWithNumber.Builder getIdProofBuilder(
        int index) {
      return getIdProofFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public in.trujobs.proto.IdProofObjectWithNumberOrBuilder getIdProofOrBuilder(
        int index) {
      if (idProofBuilder_ == null) {
        return idProof_.get(index);  } else {
        return idProofBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public java.util.List<? extends in.trujobs.proto.IdProofObjectWithNumberOrBuilder> 
         getIdProofOrBuilderList() {
      if (idProofBuilder_ != null) {
        return idProofBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(idProof_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public in.trujobs.proto.IdProofObjectWithNumber.Builder addIdProofBuilder() {
      return getIdProofFieldBuilder().addBuilder(
          in.trujobs.proto.IdProofObjectWithNumber.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public in.trujobs.proto.IdProofObjectWithNumber.Builder addIdProofBuilder(
        int index) {
      return getIdProofFieldBuilder().addBuilder(
          index, in.trujobs.proto.IdProofObjectWithNumber.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.IdProofObjectWithNumber idProof = 2;</code>
     */
    public java.util.List<in.trujobs.proto.IdProofObjectWithNumber.Builder> 
         getIdProofBuilderList() {
      return getIdProofFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.IdProofObjectWithNumber, in.trujobs.proto.IdProofObjectWithNumber.Builder, in.trujobs.proto.IdProofObjectWithNumberOrBuilder> 
        getIdProofFieldBuilder() {
      if (idProofBuilder_ == null) {
        idProofBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.IdProofObjectWithNumber, in.trujobs.proto.IdProofObjectWithNumber.Builder, in.trujobs.proto.IdProofObjectWithNumberOrBuilder>(
                idProof_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        idProof_ = null;
      }
      return idProofBuilder_;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.UpdateCandidateDocumentRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.UpdateCandidateDocumentRequest)
  private static final in.trujobs.proto.UpdateCandidateDocumentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.UpdateCandidateDocumentRequest();
  }

  public static in.trujobs.proto.UpdateCandidateDocumentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCandidateDocumentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCandidateDocumentRequest>() {
    public UpdateCandidateDocumentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateCandidateDocumentRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<UpdateCandidateDocumentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCandidateDocumentRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.UpdateCandidateDocumentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

