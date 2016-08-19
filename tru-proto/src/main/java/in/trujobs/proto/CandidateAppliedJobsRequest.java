// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.CandidateAppliedJobsRequest}
 */
public  final class CandidateAppliedJobsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.CandidateAppliedJobsRequest)
    CandidateAppliedJobsRequestOrBuilder {
  // Use CandidateAppliedJobsRequest.newBuilder() to construct.
  private CandidateAppliedJobsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CandidateAppliedJobsRequest() {
    candidateMobile_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CandidateAppliedJobsRequest(
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.CandidateAppliedJobsRequest.class, in.trujobs.proto.CandidateAppliedJobsRequest.Builder.class);
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
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCandidateMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, candidateMobile_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CandidateAppliedJobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.CandidateAppliedJobsRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.CandidateAppliedJobsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.CandidateAppliedJobsRequest)
      in.trujobs.proto.CandidateAppliedJobsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.CandidateAppliedJobsRequest.class, in.trujobs.proto.CandidateAppliedJobsRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.CandidateAppliedJobsRequest.newBuilder()
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

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CandidateAppliedJobsRequest_descriptor;
    }

    public in.trujobs.proto.CandidateAppliedJobsRequest getDefaultInstanceForType() {
      return in.trujobs.proto.CandidateAppliedJobsRequest.getDefaultInstance();
    }

    public in.trujobs.proto.CandidateAppliedJobsRequest build() {
      in.trujobs.proto.CandidateAppliedJobsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.CandidateAppliedJobsRequest buildPartial() {
      in.trujobs.proto.CandidateAppliedJobsRequest result = new in.trujobs.proto.CandidateAppliedJobsRequest(this);
      result.candidateMobile_ = candidateMobile_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.CandidateAppliedJobsRequest) {
        return mergeFrom((in.trujobs.proto.CandidateAppliedJobsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.CandidateAppliedJobsRequest other) {
      if (other == in.trujobs.proto.CandidateAppliedJobsRequest.getDefaultInstance()) return this;
      if (!other.getCandidateMobile().isEmpty()) {
        candidateMobile_ = other.candidateMobile_;
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
      in.trujobs.proto.CandidateAppliedJobsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.CandidateAppliedJobsRequest) e.getUnfinishedMessage();
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.CandidateAppliedJobsRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.CandidateAppliedJobsRequest)
  private static final in.trujobs.proto.CandidateAppliedJobsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.CandidateAppliedJobsRequest();
  }

  public static in.trujobs.proto.CandidateAppliedJobsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CandidateAppliedJobsRequest>
      PARSER = new com.google.protobuf.AbstractParser<CandidateAppliedJobsRequest>() {
    public CandidateAppliedJobsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new CandidateAppliedJobsRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<CandidateAppliedJobsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CandidateAppliedJobsRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.CandidateAppliedJobsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

