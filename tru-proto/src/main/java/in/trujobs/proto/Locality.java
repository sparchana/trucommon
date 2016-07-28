// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.Locality}
 */
public  final class Locality extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.Locality)
    LocalityOrBuilder {
  // Use Locality.newBuilder() to construct.
  private Locality(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Locality() {
    localityId_ = 0L;
    localityName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Locality(
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

            localityId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            localityName_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_Locality_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_Locality_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.Locality.class, in.trujobs.proto.Locality.Builder.class);
  }

  public static final int LOCALITYID_FIELD_NUMBER = 1;
  private long localityId_;
  /**
   * <code>optional int64 localityId = 1;</code>
   */
  public long getLocalityId() {
    return localityId_;
  }

  public static final int LOCALITYNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object localityName_;
  /**
   * <code>optional string localityName = 2;</code>
   */
  public java.lang.String getLocalityName() {
    java.lang.Object ref = localityName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      localityName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string localityName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLocalityNameBytes() {
    java.lang.Object ref = localityName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      localityName_ = b;
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
    if (localityId_ != 0L) {
      output.writeInt64(1, localityId_);
    }
    if (!getLocalityNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, localityName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localityId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, localityId_);
    }
    if (!getLocalityNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, localityName_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.Locality parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.Locality parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.Locality parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.Locality parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.Locality parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.Locality parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.Locality parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.Locality parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.Locality parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.Locality parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.Locality prototype) {
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
   * Protobuf type {@code in.trujobs.proto.Locality}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.Locality)
      in.trujobs.proto.LocalityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_Locality_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_Locality_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.Locality.class, in.trujobs.proto.Locality.Builder.class);
    }

    // Construct using in.trujobs.proto.Locality.newBuilder()
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
      localityId_ = 0L;

      localityName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_Locality_descriptor;
    }

    public in.trujobs.proto.Locality getDefaultInstanceForType() {
      return in.trujobs.proto.Locality.getDefaultInstance();
    }

    public in.trujobs.proto.Locality build() {
      in.trujobs.proto.Locality result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.Locality buildPartial() {
      in.trujobs.proto.Locality result = new in.trujobs.proto.Locality(this);
      result.localityId_ = localityId_;
      result.localityName_ = localityName_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.Locality) {
        return mergeFrom((in.trujobs.proto.Locality)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.Locality other) {
      if (other == in.trujobs.proto.Locality.getDefaultInstance()) return this;
      if (other.getLocalityId() != 0L) {
        setLocalityId(other.getLocalityId());
      }
      if (!other.getLocalityName().isEmpty()) {
        localityName_ = other.localityName_;
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
      in.trujobs.proto.Locality parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.Locality) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long localityId_ ;
    /**
     * <code>optional int64 localityId = 1;</code>
     */
    public long getLocalityId() {
      return localityId_;
    }
    /**
     * <code>optional int64 localityId = 1;</code>
     */
    public Builder setLocalityId(long value) {
      
      localityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 localityId = 1;</code>
     */
    public Builder clearLocalityId() {
      
      localityId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object localityName_ = "";
    /**
     * <code>optional string localityName = 2;</code>
     */
    public java.lang.String getLocalityName() {
      java.lang.Object ref = localityName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        localityName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string localityName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocalityNameBytes() {
      java.lang.Object ref = localityName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        localityName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string localityName = 2;</code>
     */
    public Builder setLocalityName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      localityName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string localityName = 2;</code>
     */
    public Builder clearLocalityName() {
      
      localityName_ = getDefaultInstance().getLocalityName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string localityName = 2;</code>
     */
    public Builder setLocalityNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      localityName_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.Locality)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.Locality)
  private static final in.trujobs.proto.Locality DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.Locality();
  }

  public static in.trujobs.proto.Locality getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Locality>
      PARSER = new com.google.protobuf.AbstractParser<Locality>() {
    public Locality parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Locality(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<Locality> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Locality> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.Locality getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

