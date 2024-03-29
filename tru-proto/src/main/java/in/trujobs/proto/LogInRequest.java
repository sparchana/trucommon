// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.LogInRequest}
 */
public  final class LogInRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.LogInRequest)
    LogInRequestOrBuilder {
  // Use LogInRequest.newBuilder() to construct.
  private LogInRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LogInRequest() {
    candidateMobile_ = "";
    candidatePassword_ = "";
    appVersionCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LogInRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            candidatePassword_ = s;
            break;
          }
          case 24: {

            appVersionCode_ = input.readInt32();
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.LogInRequest.class, in.trujobs.proto.LogInRequest.Builder.class);
  }

  public static final int CANDIDATEMOBILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object candidateMobile_;
  /**
   * <code>optional string candidateMobile = 1;</code>
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
   * <code>optional string candidateMobile = 1;</code>
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

  public static final int CANDIDATEPASSWORD_FIELD_NUMBER = 2;
  private volatile java.lang.Object candidatePassword_;
  /**
   * <code>optional string candidatePassword = 2;</code>
   */
  public java.lang.String getCandidatePassword() {
    java.lang.Object ref = candidatePassword_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidatePassword_ = s;
      return s;
    }
  }
  /**
   * <code>optional string candidatePassword = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCandidatePasswordBytes() {
    java.lang.Object ref = candidatePassword_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidatePassword_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPVERSIONCODE_FIELD_NUMBER = 3;
  private int appVersionCode_;
  /**
   * <code>optional int32 appVersionCode = 3;</code>
   */
  public int getAppVersionCode() {
    return appVersionCode_;
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
    if (!getCandidatePasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, candidatePassword_);
    }
    if (appVersionCode_ != 0) {
      output.writeInt32(3, appVersionCode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCandidateMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, candidateMobile_);
    }
    if (!getCandidatePasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, candidatePassword_);
    }
    if (appVersionCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, appVersionCode_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.LogInRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.LogInRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.LogInRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.LogInRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.LogInRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.LogInRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.LogInRequest)
      in.trujobs.proto.LogInRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.LogInRequest.class, in.trujobs.proto.LogInRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.LogInRequest.newBuilder()
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

      candidatePassword_ = "";

      appVersionCode_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInRequest_descriptor;
    }

    public in.trujobs.proto.LogInRequest getDefaultInstanceForType() {
      return in.trujobs.proto.LogInRequest.getDefaultInstance();
    }

    public in.trujobs.proto.LogInRequest build() {
      in.trujobs.proto.LogInRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.LogInRequest buildPartial() {
      in.trujobs.proto.LogInRequest result = new in.trujobs.proto.LogInRequest(this);
      result.candidateMobile_ = candidateMobile_;
      result.candidatePassword_ = candidatePassword_;
      result.appVersionCode_ = appVersionCode_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.LogInRequest) {
        return mergeFrom((in.trujobs.proto.LogInRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.LogInRequest other) {
      if (other == in.trujobs.proto.LogInRequest.getDefaultInstance()) return this;
      if (!other.getCandidateMobile().isEmpty()) {
        candidateMobile_ = other.candidateMobile_;
        onChanged();
      }
      if (!other.getCandidatePassword().isEmpty()) {
        candidatePassword_ = other.candidatePassword_;
        onChanged();
      }
      if (other.getAppVersionCode() != 0) {
        setAppVersionCode(other.getAppVersionCode());
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
      in.trujobs.proto.LogInRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.LogInRequest) e.getUnfinishedMessage();
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
     * <code>optional string candidateMobile = 1;</code>
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
     * <code>optional string candidateMobile = 1;</code>
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
     * <code>optional string candidateMobile = 1;</code>
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
     * <code>optional string candidateMobile = 1;</code>
     */
    public Builder clearCandidateMobile() {
      
      candidateMobile_ = getDefaultInstance().getCandidateMobile();
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidateMobile = 1;</code>
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

    private java.lang.Object candidatePassword_ = "";
    /**
     * <code>optional string candidatePassword = 2;</code>
     */
    public java.lang.String getCandidatePassword() {
      java.lang.Object ref = candidatePassword_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidatePassword_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string candidatePassword = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCandidatePasswordBytes() {
      java.lang.Object ref = candidatePassword_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidatePassword_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string candidatePassword = 2;</code>
     */
    public Builder setCandidatePassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidatePassword_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidatePassword = 2;</code>
     */
    public Builder clearCandidatePassword() {
      
      candidatePassword_ = getDefaultInstance().getCandidatePassword();
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidatePassword = 2;</code>
     */
    public Builder setCandidatePasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidatePassword_ = value;
      onChanged();
      return this;
    }

    private int appVersionCode_ ;
    /**
     * <code>optional int32 appVersionCode = 3;</code>
     */
    public int getAppVersionCode() {
      return appVersionCode_;
    }
    /**
     * <code>optional int32 appVersionCode = 3;</code>
     */
    public Builder setAppVersionCode(int value) {
      
      appVersionCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 appVersionCode = 3;</code>
     */
    public Builder clearAppVersionCode() {
      
      appVersionCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.LogInRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.LogInRequest)
  private static final in.trujobs.proto.LogInRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.LogInRequest();
  }

  public static in.trujobs.proto.LogInRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogInRequest>
      PARSER = new com.google.protobuf.AbstractParser<LogInRequest>() {
    public LogInRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LogInRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<LogInRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogInRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.LogInRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

