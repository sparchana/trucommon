// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.ResetPasswordRequest}
 */
public  final class ResetPasswordRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.ResetPasswordRequest)
    ResetPasswordRequestOrBuilder {
  // Use ResetPasswordRequest.newBuilder() to construct.
  private ResetPasswordRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResetPasswordRequest() {
    mobile_ = "";
    password_ = "";
    appVersionCode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResetPasswordRequest(
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

            mobile_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            password_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.ResetPasswordRequest.class, in.trujobs.proto.ResetPasswordRequest.Builder.class);
  }

  public static final int MOBILE_FIELD_NUMBER = 1;
  private volatile java.lang.Object mobile_;
  /**
   * <code>optional string mobile = 1;</code>
   */
  public java.lang.String getMobile() {
    java.lang.Object ref = mobile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mobile_ = s;
      return s;
    }
  }
  /**
   * <code>optional string mobile = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMobileBytes() {
    java.lang.Object ref = mobile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mobile_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  private volatile java.lang.Object password_;
  /**
   * <code>optional string password = 2;</code>
   */
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>optional string password = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
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
    if (!getMobileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, mobile_);
    }
    if (!getPasswordBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, password_);
    }
    if (appVersionCode_ != 0) {
      output.writeInt32(3, appVersionCode_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, mobile_);
    }
    if (!getPasswordBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, password_);
    }
    if (appVersionCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, appVersionCode_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.ResetPasswordRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.ResetPasswordRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.ResetPasswordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.ResetPasswordRequest)
      in.trujobs.proto.ResetPasswordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.ResetPasswordRequest.class, in.trujobs.proto.ResetPasswordRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.ResetPasswordRequest.newBuilder()
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
      mobile_ = "";

      password_ = "";

      appVersionCode_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordRequest_descriptor;
    }

    public in.trujobs.proto.ResetPasswordRequest getDefaultInstanceForType() {
      return in.trujobs.proto.ResetPasswordRequest.getDefaultInstance();
    }

    public in.trujobs.proto.ResetPasswordRequest build() {
      in.trujobs.proto.ResetPasswordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.ResetPasswordRequest buildPartial() {
      in.trujobs.proto.ResetPasswordRequest result = new in.trujobs.proto.ResetPasswordRequest(this);
      result.mobile_ = mobile_;
      result.password_ = password_;
      result.appVersionCode_ = appVersionCode_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.ResetPasswordRequest) {
        return mergeFrom((in.trujobs.proto.ResetPasswordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.ResetPasswordRequest other) {
      if (other == in.trujobs.proto.ResetPasswordRequest.getDefaultInstance()) return this;
      if (!other.getMobile().isEmpty()) {
        mobile_ = other.mobile_;
        onChanged();
      }
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
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
      in.trujobs.proto.ResetPasswordRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.ResetPasswordRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mobile_ = "";
    /**
     * <code>optional string mobile = 1;</code>
     */
    public java.lang.String getMobile() {
      java.lang.Object ref = mobile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mobile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string mobile = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMobileBytes() {
      java.lang.Object ref = mobile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mobile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string mobile = 1;</code>
     */
    public Builder setMobile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mobile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string mobile = 1;</code>
     */
    public Builder clearMobile() {
      
      mobile_ = getDefaultInstance().getMobile();
      onChanged();
      return this;
    }
    /**
     * <code>optional string mobile = 1;</code>
     */
    public Builder setMobileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mobile_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object password_ = "";
    /**
     * <code>optional string password = 2;</code>
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string password = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string password = 2;</code>
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string password = 2;</code>
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <code>optional string password = 2;</code>
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.ResetPasswordRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.ResetPasswordRequest)
  private static final in.trujobs.proto.ResetPasswordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.ResetPasswordRequest();
  }

  public static in.trujobs.proto.ResetPasswordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetPasswordRequest>
      PARSER = new com.google.protobuf.AbstractParser<ResetPasswordRequest>() {
    public ResetPasswordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ResetPasswordRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ResetPasswordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetPasswordRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.ResetPasswordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

