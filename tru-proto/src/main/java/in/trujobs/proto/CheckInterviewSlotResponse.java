// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.CheckInterviewSlotResponse}
 */
public  final class CheckInterviewSlotResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.CheckInterviewSlotResponse)
    CheckInterviewSlotResponseOrBuilder {
  // Use CheckInterviewSlotResponse.newBuilder() to construct.
  private CheckInterviewSlotResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CheckInterviewSlotResponse() {
    shouldShowInterview_ = false;
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CheckInterviewSlotResponse(
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

            shouldShowInterview_ = input.readBool();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CheckInterviewSlotResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CheckInterviewSlotResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.CheckInterviewSlotResponse.class, in.trujobs.proto.CheckInterviewSlotResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.CheckInterviewSlotResponse.Status}
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
     * <code>INVALID = 3;</code>
     */
    INVALID(3, 3),
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
     * <code>INVALID = 3;</code>
     */
    public static final int INVALID_VALUE = 3;


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
        case 3: return INVALID;
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
      return in.trujobs.proto.CheckInterviewSlotResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.CheckInterviewSlotResponse.Status)
  }

  public static final int SHOULDSHOWINTERVIEW_FIELD_NUMBER = 1;
  private boolean shouldShowInterview_;
  /**
   * <code>optional bool shouldShowInterview = 1;</code>
   */
  public boolean getShouldShowInterview() {
    return shouldShowInterview_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
   */
  public in.trujobs.proto.CheckInterviewSlotResponse.Status getStatus() {
    in.trujobs.proto.CheckInterviewSlotResponse.Status result = in.trujobs.proto.CheckInterviewSlotResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.CheckInterviewSlotResponse.Status.UNRECOGNIZED : result;
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
    if (shouldShowInterview_ != false) {
      output.writeBool(1, shouldShowInterview_);
    }
    if (status_ != in.trujobs.proto.CheckInterviewSlotResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(2, status_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shouldShowInterview_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, shouldShowInterview_);
    }
    if (status_ != in.trujobs.proto.CheckInterviewSlotResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.CheckInterviewSlotResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.CheckInterviewSlotResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.CheckInterviewSlotResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.CheckInterviewSlotResponse)
      in.trujobs.proto.CheckInterviewSlotResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CheckInterviewSlotResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CheckInterviewSlotResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.CheckInterviewSlotResponse.class, in.trujobs.proto.CheckInterviewSlotResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.CheckInterviewSlotResponse.newBuilder()
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
      shouldShowInterview_ = false;

      status_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_CheckInterviewSlotResponse_descriptor;
    }

    public in.trujobs.proto.CheckInterviewSlotResponse getDefaultInstanceForType() {
      return in.trujobs.proto.CheckInterviewSlotResponse.getDefaultInstance();
    }

    public in.trujobs.proto.CheckInterviewSlotResponse build() {
      in.trujobs.proto.CheckInterviewSlotResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.CheckInterviewSlotResponse buildPartial() {
      in.trujobs.proto.CheckInterviewSlotResponse result = new in.trujobs.proto.CheckInterviewSlotResponse(this);
      result.shouldShowInterview_ = shouldShowInterview_;
      result.status_ = status_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.CheckInterviewSlotResponse) {
        return mergeFrom((in.trujobs.proto.CheckInterviewSlotResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.CheckInterviewSlotResponse other) {
      if (other == in.trujobs.proto.CheckInterviewSlotResponse.getDefaultInstance()) return this;
      if (other.getShouldShowInterview() != false) {
        setShouldShowInterview(other.getShouldShowInterview());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      in.trujobs.proto.CheckInterviewSlotResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.CheckInterviewSlotResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean shouldShowInterview_ ;
    /**
     * <code>optional bool shouldShowInterview = 1;</code>
     */
    public boolean getShouldShowInterview() {
      return shouldShowInterview_;
    }
    /**
     * <code>optional bool shouldShowInterview = 1;</code>
     */
    public Builder setShouldShowInterview(boolean value) {
      
      shouldShowInterview_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool shouldShowInterview = 1;</code>
     */
    public Builder clearShouldShowInterview() {
      
      shouldShowInterview_ = false;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
     */
    public in.trujobs.proto.CheckInterviewSlotResponse.Status getStatus() {
      in.trujobs.proto.CheckInterviewSlotResponse.Status result = in.trujobs.proto.CheckInterviewSlotResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.CheckInterviewSlotResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
     */
    public Builder setStatus(in.trujobs.proto.CheckInterviewSlotResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CheckInterviewSlotResponse.Status status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.CheckInterviewSlotResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.CheckInterviewSlotResponse)
  private static final in.trujobs.proto.CheckInterviewSlotResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.CheckInterviewSlotResponse();
  }

  public static in.trujobs.proto.CheckInterviewSlotResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckInterviewSlotResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckInterviewSlotResponse>() {
    public CheckInterviewSlotResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new CheckInterviewSlotResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<CheckInterviewSlotResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckInterviewSlotResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.CheckInterviewSlotResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

