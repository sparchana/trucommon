// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.UpdateCandidateStatusRequest}
 */
public  final class UpdateCandidateStatusRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.UpdateCandidateStatusRequest)
    UpdateCandidateStatusRequestOrBuilder {
  // Use UpdateCandidateStatusRequest.newBuilder() to construct.
  private UpdateCandidateStatusRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateCandidateStatusRequest() {
    candidateMobile_ = "";
    jpId_ = 0L;
    candidateStatus_ = 0;
    notGoingReason_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpdateCandidateStatusRequest(
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

            jpId_ = input.readInt64();
            break;
          }
          case 24: {

            candidateStatus_ = input.readInt32();
            break;
          }
          case 32: {

            notGoingReason_ = input.readInt64();
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateStatusRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateStatusRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.UpdateCandidateStatusRequest.class, in.trujobs.proto.UpdateCandidateStatusRequest.Builder.class);
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

  public static final int JPID_FIELD_NUMBER = 2;
  private long jpId_;
  /**
   * <code>optional int64 jpId = 2;</code>
   */
  public long getJpId() {
    return jpId_;
  }

  public static final int CANDIDATESTATUS_FIELD_NUMBER = 3;
  private int candidateStatus_;
  /**
   * <code>optional int32 candidateStatus = 3;</code>
   */
  public int getCandidateStatus() {
    return candidateStatus_;
  }

  public static final int NOTGOINGREASON_FIELD_NUMBER = 4;
  private long notGoingReason_;
  /**
   * <code>optional int64 notGoingReason = 4;</code>
   */
  public long getNotGoingReason() {
    return notGoingReason_;
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
    if (jpId_ != 0L) {
      output.writeInt64(2, jpId_);
    }
    if (candidateStatus_ != 0) {
      output.writeInt32(3, candidateStatus_);
    }
    if (notGoingReason_ != 0L) {
      output.writeInt64(4, notGoingReason_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCandidateMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, candidateMobile_);
    }
    if (jpId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, jpId_);
    }
    if (candidateStatus_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, candidateStatus_);
    }
    if (notGoingReason_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, notGoingReason_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.UpdateCandidateStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.UpdateCandidateStatusRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.UpdateCandidateStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.UpdateCandidateStatusRequest)
      in.trujobs.proto.UpdateCandidateStatusRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateStatusRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateStatusRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.UpdateCandidateStatusRequest.class, in.trujobs.proto.UpdateCandidateStatusRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.UpdateCandidateStatusRequest.newBuilder()
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

      jpId_ = 0L;

      candidateStatus_ = 0;

      notGoingReason_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_UpdateCandidateStatusRequest_descriptor;
    }

    public in.trujobs.proto.UpdateCandidateStatusRequest getDefaultInstanceForType() {
      return in.trujobs.proto.UpdateCandidateStatusRequest.getDefaultInstance();
    }

    public in.trujobs.proto.UpdateCandidateStatusRequest build() {
      in.trujobs.proto.UpdateCandidateStatusRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.UpdateCandidateStatusRequest buildPartial() {
      in.trujobs.proto.UpdateCandidateStatusRequest result = new in.trujobs.proto.UpdateCandidateStatusRequest(this);
      result.candidateMobile_ = candidateMobile_;
      result.jpId_ = jpId_;
      result.candidateStatus_ = candidateStatus_;
      result.notGoingReason_ = notGoingReason_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.UpdateCandidateStatusRequest) {
        return mergeFrom((in.trujobs.proto.UpdateCandidateStatusRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.UpdateCandidateStatusRequest other) {
      if (other == in.trujobs.proto.UpdateCandidateStatusRequest.getDefaultInstance()) return this;
      if (!other.getCandidateMobile().isEmpty()) {
        candidateMobile_ = other.candidateMobile_;
        onChanged();
      }
      if (other.getJpId() != 0L) {
        setJpId(other.getJpId());
      }
      if (other.getCandidateStatus() != 0) {
        setCandidateStatus(other.getCandidateStatus());
      }
      if (other.getNotGoingReason() != 0L) {
        setNotGoingReason(other.getNotGoingReason());
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
      in.trujobs.proto.UpdateCandidateStatusRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.UpdateCandidateStatusRequest) e.getUnfinishedMessage();
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

    private long jpId_ ;
    /**
     * <code>optional int64 jpId = 2;</code>
     */
    public long getJpId() {
      return jpId_;
    }
    /**
     * <code>optional int64 jpId = 2;</code>
     */
    public Builder setJpId(long value) {
      
      jpId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 jpId = 2;</code>
     */
    public Builder clearJpId() {
      
      jpId_ = 0L;
      onChanged();
      return this;
    }

    private int candidateStatus_ ;
    /**
     * <code>optional int32 candidateStatus = 3;</code>
     */
    public int getCandidateStatus() {
      return candidateStatus_;
    }
    /**
     * <code>optional int32 candidateStatus = 3;</code>
     */
    public Builder setCandidateStatus(int value) {
      
      candidateStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 candidateStatus = 3;</code>
     */
    public Builder clearCandidateStatus() {
      
      candidateStatus_ = 0;
      onChanged();
      return this;
    }

    private long notGoingReason_ ;
    /**
     * <code>optional int64 notGoingReason = 4;</code>
     */
    public long getNotGoingReason() {
      return notGoingReason_;
    }
    /**
     * <code>optional int64 notGoingReason = 4;</code>
     */
    public Builder setNotGoingReason(long value) {
      
      notGoingReason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 notGoingReason = 4;</code>
     */
    public Builder clearNotGoingReason() {
      
      notGoingReason_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.UpdateCandidateStatusRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.UpdateCandidateStatusRequest)
  private static final in.trujobs.proto.UpdateCandidateStatusRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.UpdateCandidateStatusRequest();
  }

  public static in.trujobs.proto.UpdateCandidateStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCandidateStatusRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCandidateStatusRequest>() {
    public UpdateCandidateStatusRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new UpdateCandidateStatusRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<UpdateCandidateStatusRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCandidateStatusRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.UpdateCandidateStatusRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
