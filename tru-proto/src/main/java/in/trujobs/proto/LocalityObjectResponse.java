// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.LocalityObjectResponse}
 */
public  final class LocalityObjectResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.LocalityObjectResponse)
    LocalityObjectResponseOrBuilder {
  // Use LocalityObjectResponse.newBuilder() to construct.
  private LocalityObjectResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LocalityObjectResponse() {
    status_ = 0;
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LocalityObjectResponse(
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
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 26: {
            in.trujobs.proto.LocalityObject.Builder subBuilder = null;
            if (locality_ != null) {
              subBuilder = locality_.toBuilder();
            }
            locality_ = input.readMessage(in.trujobs.proto.LocalityObject.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(locality_);
              locality_ = subBuilder.buildPartial();
            }

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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LocalityObjectResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LocalityObjectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.LocalityObjectResponse.class, in.trujobs.proto.LocalityObjectResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.LocalityObjectResponse.Status}
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
      return in.trujobs.proto.LocalityObjectResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.LocalityObjectResponse.Status)
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.LocalityObjectResponse.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNDEFINED = 0;</code>
     */
    UNDEFINED(0, 0),
    /**
     * <code>FOR_PLACEID = 1;</code>
     */
    FOR_PLACEID(1, 1),
    /**
     * <code>FOR_LATLNG = 2;</code>
     */
    FOR_LATLNG(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>UNDEFINED = 0;</code>
     */
    public static final int UNDEFINED_VALUE = 0;
    /**
     * <code>FOR_PLACEID = 1;</code>
     */
    public static final int FOR_PLACEID_VALUE = 1;
    /**
     * <code>FOR_LATLNG = 2;</code>
     */
    public static final int FOR_LATLNG_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static Type valueOf(int value) {
      switch (value) {
        case 0: return UNDEFINED;
        case 1: return FOR_PLACEID;
        case 2: return FOR_LATLNG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.valueOf(number);
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
      return in.trujobs.proto.LocalityObjectResponse.getDescriptor().getEnumTypes().get(1);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.LocalityObjectResponse.Type)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.LocalityObjectResponse.Status getStatus() {
    in.trujobs.proto.LocalityObjectResponse.Status result = in.trujobs.proto.LocalityObjectResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.LocalityObjectResponse.Status.UNRECOGNIZED : result;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
   */
  public in.trujobs.proto.LocalityObjectResponse.Type getType() {
    in.trujobs.proto.LocalityObjectResponse.Type result = in.trujobs.proto.LocalityObjectResponse.Type.valueOf(type_);
    return result == null ? in.trujobs.proto.LocalityObjectResponse.Type.UNRECOGNIZED : result;
  }

  public static final int LOCALITY_FIELD_NUMBER = 3;
  private in.trujobs.proto.LocalityObject locality_;
  /**
   * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
   */
  public boolean hasLocality() {
    return locality_ != null;
  }
  /**
   * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
   */
  public in.trujobs.proto.LocalityObject getLocality() {
    return locality_ == null ? in.trujobs.proto.LocalityObject.getDefaultInstance() : locality_;
  }
  /**
   * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
   */
  public in.trujobs.proto.LocalityObjectOrBuilder getLocalityOrBuilder() {
    return getLocality();
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
    if (status_ != in.trujobs.proto.LocalityObjectResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (type_ != in.trujobs.proto.LocalityObjectResponse.Type.UNDEFINED.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (locality_ != null) {
      output.writeMessage(3, getLocality());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.LocalityObjectResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (type_ != in.trujobs.proto.LocalityObjectResponse.Type.UNDEFINED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (locality_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getLocality());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.LocalityObjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.LocalityObjectResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.LocalityObjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.LocalityObjectResponse)
      in.trujobs.proto.LocalityObjectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LocalityObjectResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LocalityObjectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.LocalityObjectResponse.class, in.trujobs.proto.LocalityObjectResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.LocalityObjectResponse.newBuilder()
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

      type_ = 0;

      if (localityBuilder_ == null) {
        locality_ = null;
      } else {
        locality_ = null;
        localityBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LocalityObjectResponse_descriptor;
    }

    public in.trujobs.proto.LocalityObjectResponse getDefaultInstanceForType() {
      return in.trujobs.proto.LocalityObjectResponse.getDefaultInstance();
    }

    public in.trujobs.proto.LocalityObjectResponse build() {
      in.trujobs.proto.LocalityObjectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.LocalityObjectResponse buildPartial() {
      in.trujobs.proto.LocalityObjectResponse result = new in.trujobs.proto.LocalityObjectResponse(this);
      result.status_ = status_;
      result.type_ = type_;
      if (localityBuilder_ == null) {
        result.locality_ = locality_;
      } else {
        result.locality_ = localityBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.LocalityObjectResponse) {
        return mergeFrom((in.trujobs.proto.LocalityObjectResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.LocalityObjectResponse other) {
      if (other == in.trujobs.proto.LocalityObjectResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.hasLocality()) {
        mergeLocality(other.getLocality());
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
      in.trujobs.proto.LocalityObjectResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.LocalityObjectResponse) e.getUnfinishedMessage();
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
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.LocalityObjectResponse.Status getStatus() {
      in.trujobs.proto.LocalityObjectResponse.Status result = in.trujobs.proto.LocalityObjectResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.LocalityObjectResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.LocalityObjectResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
     */
    public in.trujobs.proto.LocalityObjectResponse.Type getType() {
      in.trujobs.proto.LocalityObjectResponse.Type result = in.trujobs.proto.LocalityObjectResponse.Type.valueOf(type_);
      return result == null ? in.trujobs.proto.LocalityObjectResponse.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
     */
    public Builder setType(in.trujobs.proto.LocalityObjectResponse.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObjectResponse.Type type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private in.trujobs.proto.LocalityObject locality_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        in.trujobs.proto.LocalityObject, in.trujobs.proto.LocalityObject.Builder, in.trujobs.proto.LocalityObjectOrBuilder> localityBuilder_;
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public boolean hasLocality() {
      return localityBuilder_ != null || locality_ != null;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public in.trujobs.proto.LocalityObject getLocality() {
      if (localityBuilder_ == null) {
        return locality_ == null ? in.trujobs.proto.LocalityObject.getDefaultInstance() : locality_;
      } else {
        return localityBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public Builder setLocality(in.trujobs.proto.LocalityObject value) {
      if (localityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locality_ = value;
        onChanged();
      } else {
        localityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public Builder setLocality(
        in.trujobs.proto.LocalityObject.Builder builderForValue) {
      if (localityBuilder_ == null) {
        locality_ = builderForValue.build();
        onChanged();
      } else {
        localityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public Builder mergeLocality(in.trujobs.proto.LocalityObject value) {
      if (localityBuilder_ == null) {
        if (locality_ != null) {
          locality_ =
            in.trujobs.proto.LocalityObject.newBuilder(locality_).mergeFrom(value).buildPartial();
        } else {
          locality_ = value;
        }
        onChanged();
      } else {
        localityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public Builder clearLocality() {
      if (localityBuilder_ == null) {
        locality_ = null;
        onChanged();
      } else {
        locality_ = null;
        localityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public in.trujobs.proto.LocalityObject.Builder getLocalityBuilder() {
      
      onChanged();
      return getLocalityFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    public in.trujobs.proto.LocalityObjectOrBuilder getLocalityOrBuilder() {
      if (localityBuilder_ != null) {
        return localityBuilder_.getMessageOrBuilder();
      } else {
        return locality_ == null ?
            in.trujobs.proto.LocalityObject.getDefaultInstance() : locality_;
      }
    }
    /**
     * <code>optional .in.trujobs.proto.LocalityObject locality = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        in.trujobs.proto.LocalityObject, in.trujobs.proto.LocalityObject.Builder, in.trujobs.proto.LocalityObjectOrBuilder> 
        getLocalityFieldBuilder() {
      if (localityBuilder_ == null) {
        localityBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            in.trujobs.proto.LocalityObject, in.trujobs.proto.LocalityObject.Builder, in.trujobs.proto.LocalityObjectOrBuilder>(
                getLocality(),
                getParentForChildren(),
                isClean());
        locality_ = null;
      }
      return localityBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.LocalityObjectResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.LocalityObjectResponse)
  private static final in.trujobs.proto.LocalityObjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.LocalityObjectResponse();
  }

  public static in.trujobs.proto.LocalityObjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalityObjectResponse>
      PARSER = new com.google.protobuf.AbstractParser<LocalityObjectResponse>() {
    public LocalityObjectResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LocalityObjectResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<LocalityObjectResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalityObjectResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.LocalityObjectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

