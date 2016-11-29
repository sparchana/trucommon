// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.AssetObject}
 */
public  final class AssetObject extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.AssetObject)
    AssetObjectOrBuilder {
  // Use AssetObject.newBuilder() to construct.
  private AssetObject(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AssetObject() {
    assetId_ = 0;
    assetTitle_ = "";
    isCommon_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AssetObject(
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

            assetId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            assetTitle_ = s;
            break;
          }
          case 24: {

            isCommon_ = input.readBool();
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AssetObject_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AssetObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.AssetObject.class, in.trujobs.proto.AssetObject.Builder.class);
  }

  public static final int ASSETID_FIELD_NUMBER = 1;
  private int assetId_;
  /**
   * <code>optional int32 assetId = 1;</code>
   */
  public int getAssetId() {
    return assetId_;
  }

  public static final int ASSETTITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object assetTitle_;
  /**
   * <code>optional string assetTitle = 2;</code>
   */
  public java.lang.String getAssetTitle() {
    java.lang.Object ref = assetTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetTitle_ = s;
      return s;
    }
  }
  /**
   * <code>optional string assetTitle = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAssetTitleBytes() {
    java.lang.Object ref = assetTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISCOMMON_FIELD_NUMBER = 3;
  private boolean isCommon_;
  /**
   * <code>optional bool isCommon = 3;</code>
   */
  public boolean getIsCommon() {
    return isCommon_;
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
    if (assetId_ != 0) {
      output.writeInt32(1, assetId_);
    }
    if (!getAssetTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, assetTitle_);
    }
    if (isCommon_ != false) {
      output.writeBool(3, isCommon_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, assetId_);
    }
    if (!getAssetTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, assetTitle_);
    }
    if (isCommon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isCommon_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.AssetObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.AssetObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.AssetObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.AssetObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.AssetObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.AssetObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.AssetObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.AssetObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.AssetObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.AssetObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.AssetObject prototype) {
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
   * Protobuf type {@code in.trujobs.proto.AssetObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.AssetObject)
      in.trujobs.proto.AssetObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AssetObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AssetObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.AssetObject.class, in.trujobs.proto.AssetObject.Builder.class);
    }

    // Construct using in.trujobs.proto.AssetObject.newBuilder()
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
      assetId_ = 0;

      assetTitle_ = "";

      isCommon_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AssetObject_descriptor;
    }

    public in.trujobs.proto.AssetObject getDefaultInstanceForType() {
      return in.trujobs.proto.AssetObject.getDefaultInstance();
    }

    public in.trujobs.proto.AssetObject build() {
      in.trujobs.proto.AssetObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.AssetObject buildPartial() {
      in.trujobs.proto.AssetObject result = new in.trujobs.proto.AssetObject(this);
      result.assetId_ = assetId_;
      result.assetTitle_ = assetTitle_;
      result.isCommon_ = isCommon_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.AssetObject) {
        return mergeFrom((in.trujobs.proto.AssetObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.AssetObject other) {
      if (other == in.trujobs.proto.AssetObject.getDefaultInstance()) return this;
      if (other.getAssetId() != 0) {
        setAssetId(other.getAssetId());
      }
      if (!other.getAssetTitle().isEmpty()) {
        assetTitle_ = other.assetTitle_;
        onChanged();
      }
      if (other.getIsCommon() != false) {
        setIsCommon(other.getIsCommon());
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
      in.trujobs.proto.AssetObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.AssetObject) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int assetId_ ;
    /**
     * <code>optional int32 assetId = 1;</code>
     */
    public int getAssetId() {
      return assetId_;
    }
    /**
     * <code>optional int32 assetId = 1;</code>
     */
    public Builder setAssetId(int value) {
      
      assetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 assetId = 1;</code>
     */
    public Builder clearAssetId() {
      
      assetId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object assetTitle_ = "";
    /**
     * <code>optional string assetTitle = 2;</code>
     */
    public java.lang.String getAssetTitle() {
      java.lang.Object ref = assetTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string assetTitle = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAssetTitleBytes() {
      java.lang.Object ref = assetTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string assetTitle = 2;</code>
     */
    public Builder setAssetTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string assetTitle = 2;</code>
     */
    public Builder clearAssetTitle() {
      
      assetTitle_ = getDefaultInstance().getAssetTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string assetTitle = 2;</code>
     */
    public Builder setAssetTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetTitle_ = value;
      onChanged();
      return this;
    }

    private boolean isCommon_ ;
    /**
     * <code>optional bool isCommon = 3;</code>
     */
    public boolean getIsCommon() {
      return isCommon_;
    }
    /**
     * <code>optional bool isCommon = 3;</code>
     */
    public Builder setIsCommon(boolean value) {
      
      isCommon_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isCommon = 3;</code>
     */
    public Builder clearIsCommon() {
      
      isCommon_ = false;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.AssetObject)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.AssetObject)
  private static final in.trujobs.proto.AssetObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.AssetObject();
  }

  public static in.trujobs.proto.AssetObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetObject>
      PARSER = new com.google.protobuf.AbstractParser<AssetObject>() {
    public AssetObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new AssetObject(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<AssetObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetObject> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.AssetObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
