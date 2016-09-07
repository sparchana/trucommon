// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.ResetPasswordResponse}
 */
public  final class ResetPasswordResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.ResetPasswordResponse)
    ResetPasswordResponseOrBuilder {
  // Use ResetPasswordResponse.newBuilder() to construct.
  private ResetPasswordResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ResetPasswordResponse() {
    status_ = 0;
    otp_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ResetPasswordResponse(
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
          case 16: {

            otp_ = input.readInt32();
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.ResetPasswordResponse.class, in.trujobs.proto.ResetPasswordResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.ResetPasswordResponse.Status}
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
    /**
     * <code>USER_EXISTS = 3;</code>
     */
    USER_EXISTS(3, 3),
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
    /**
     * <code>USER_EXISTS = 3;</code>
     */
    public static final int USER_EXISTS_VALUE = 3;


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
        case 3: return USER_EXISTS;
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
      return in.trujobs.proto.ResetPasswordResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.ResetPasswordResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.ResetPasswordResponse.Status getStatus() {
    in.trujobs.proto.ResetPasswordResponse.Status result = in.trujobs.proto.ResetPasswordResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.ResetPasswordResponse.Status.UNRECOGNIZED : result;
  }

  public static final int OTP_FIELD_NUMBER = 2;
  private int otp_;
  /**
   * <code>optional int32 otp = 2;</code>
   */
  public int getOtp() {
    return otp_;
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
    if (status_ != in.trujobs.proto.ResetPasswordResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (otp_ != 0) {
      output.writeInt32(2, otp_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.ResetPasswordResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (otp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, otp_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.ResetPasswordResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.ResetPasswordResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.ResetPasswordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.ResetPasswordResponse)
      in.trujobs.proto.ResetPasswordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.ResetPasswordResponse.class, in.trujobs.proto.ResetPasswordResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.ResetPasswordResponse.newBuilder()
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
      status_ = 0;

      otp_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_ResetPasswordResponse_descriptor;
    }

    public in.trujobs.proto.ResetPasswordResponse getDefaultInstanceForType() {
      return in.trujobs.proto.ResetPasswordResponse.getDefaultInstance();
    }

    public in.trujobs.proto.ResetPasswordResponse build() {
      in.trujobs.proto.ResetPasswordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.ResetPasswordResponse buildPartial() {
      in.trujobs.proto.ResetPasswordResponse result = new in.trujobs.proto.ResetPasswordResponse(this);
      result.status_ = status_;
      result.otp_ = otp_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.ResetPasswordResponse) {
        return mergeFrom((in.trujobs.proto.ResetPasswordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.ResetPasswordResponse other) {
      if (other == in.trujobs.proto.ResetPasswordResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getOtp() != 0) {
        setOtp(other.getOtp());
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
      in.trujobs.proto.ResetPasswordResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.ResetPasswordResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.ResetPasswordResponse.Status getStatus() {
      in.trujobs.proto.ResetPasswordResponse.Status result = in.trujobs.proto.ResetPasswordResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.ResetPasswordResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.ResetPasswordResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.ResetPasswordResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int otp_ ;
    /**
     * <code>optional int32 otp = 2;</code>
     */
    public int getOtp() {
      return otp_;
    }
    /**
     * <code>optional int32 otp = 2;</code>
     */
    public Builder setOtp(int value) {
      
      otp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 otp = 2;</code>
     */
    public Builder clearOtp() {
      
      otp_ = 0;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.ResetPasswordResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.ResetPasswordResponse)
  private static final in.trujobs.proto.ResetPasswordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.ResetPasswordResponse();
  }

  public static in.trujobs.proto.ResetPasswordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetPasswordResponse>
      PARSER = new com.google.protobuf.AbstractParser<ResetPasswordResponse>() {
    public ResetPasswordResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new ResetPasswordResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<ResetPasswordResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetPasswordResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.ResetPasswordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

