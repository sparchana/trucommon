// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.FeedbackReasonObject}
 */
public  final class FeedbackReasonObject extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.FeedbackReasonObject)
    FeedbackReasonObjectOrBuilder {
  // Use FeedbackReasonObject.newBuilder() to construct.
  private FeedbackReasonObject(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FeedbackReasonObject() {
    reasonId_ = 0L;
    reasonTitle_ = "";
    reasonType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FeedbackReasonObject(
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

            reasonId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            reasonTitle_ = s;
            break;
          }
          case 24: {

            reasonType_ = input.readInt32();
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonObject_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.FeedbackReasonObject.class, in.trujobs.proto.FeedbackReasonObject.Builder.class);
  }

  public static final int REASONID_FIELD_NUMBER = 1;
  private long reasonId_;
  /**
   * <code>optional int64 reasonId = 1;</code>
   */
  public long getReasonId() {
    return reasonId_;
  }

  public static final int REASONTITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object reasonTitle_;
  /**
   * <code>optional string reasonTitle = 2;</code>
   */
  public java.lang.String getReasonTitle() {
    java.lang.Object ref = reasonTitle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reasonTitle_ = s;
      return s;
    }
  }
  /**
   * <code>optional string reasonTitle = 2;</code>
   */
  public com.google.protobuf.ByteString
      getReasonTitleBytes() {
    java.lang.Object ref = reasonTitle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reasonTitle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REASONTYPE_FIELD_NUMBER = 3;
  private int reasonType_;
  /**
   * <code>optional int32 reasonType = 3;</code>
   */
  public int getReasonType() {
    return reasonType_;
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
    if (reasonId_ != 0L) {
      output.writeInt64(1, reasonId_);
    }
    if (!getReasonTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, reasonTitle_);
    }
    if (reasonType_ != 0) {
      output.writeInt32(3, reasonType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reasonId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, reasonId_);
    }
    if (!getReasonTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, reasonTitle_);
    }
    if (reasonType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, reasonType_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.FeedbackReasonObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.FeedbackReasonObject prototype) {
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
   * Protobuf type {@code in.trujobs.proto.FeedbackReasonObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.FeedbackReasonObject)
      in.trujobs.proto.FeedbackReasonObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.FeedbackReasonObject.class, in.trujobs.proto.FeedbackReasonObject.Builder.class);
    }

    // Construct using in.trujobs.proto.FeedbackReasonObject.newBuilder()
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
      reasonId_ = 0L;

      reasonTitle_ = "";

      reasonType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonObject_descriptor;
    }

    public in.trujobs.proto.FeedbackReasonObject getDefaultInstanceForType() {
      return in.trujobs.proto.FeedbackReasonObject.getDefaultInstance();
    }

    public in.trujobs.proto.FeedbackReasonObject build() {
      in.trujobs.proto.FeedbackReasonObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.FeedbackReasonObject buildPartial() {
      in.trujobs.proto.FeedbackReasonObject result = new in.trujobs.proto.FeedbackReasonObject(this);
      result.reasonId_ = reasonId_;
      result.reasonTitle_ = reasonTitle_;
      result.reasonType_ = reasonType_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.FeedbackReasonObject) {
        return mergeFrom((in.trujobs.proto.FeedbackReasonObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.FeedbackReasonObject other) {
      if (other == in.trujobs.proto.FeedbackReasonObject.getDefaultInstance()) return this;
      if (other.getReasonId() != 0L) {
        setReasonId(other.getReasonId());
      }
      if (!other.getReasonTitle().isEmpty()) {
        reasonTitle_ = other.reasonTitle_;
        onChanged();
      }
      if (other.getReasonType() != 0) {
        setReasonType(other.getReasonType());
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
      in.trujobs.proto.FeedbackReasonObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.FeedbackReasonObject) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long reasonId_ ;
    /**
     * <code>optional int64 reasonId = 1;</code>
     */
    public long getReasonId() {
      return reasonId_;
    }
    /**
     * <code>optional int64 reasonId = 1;</code>
     */
    public Builder setReasonId(long value) {
      
      reasonId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 reasonId = 1;</code>
     */
    public Builder clearReasonId() {
      
      reasonId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object reasonTitle_ = "";
    /**
     * <code>optional string reasonTitle = 2;</code>
     */
    public java.lang.String getReasonTitle() {
      java.lang.Object ref = reasonTitle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reasonTitle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string reasonTitle = 2;</code>
     */
    public com.google.protobuf.ByteString
        getReasonTitleBytes() {
      java.lang.Object ref = reasonTitle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reasonTitle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string reasonTitle = 2;</code>
     */
    public Builder setReasonTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reasonTitle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string reasonTitle = 2;</code>
     */
    public Builder clearReasonTitle() {
      
      reasonTitle_ = getDefaultInstance().getReasonTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string reasonTitle = 2;</code>
     */
    public Builder setReasonTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reasonTitle_ = value;
      onChanged();
      return this;
    }

    private int reasonType_ ;
    /**
     * <code>optional int32 reasonType = 3;</code>
     */
    public int getReasonType() {
      return reasonType_;
    }
    /**
     * <code>optional int32 reasonType = 3;</code>
     */
    public Builder setReasonType(int value) {
      
      reasonType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 reasonType = 3;</code>
     */
    public Builder clearReasonType() {
      
      reasonType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.FeedbackReasonObject)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.FeedbackReasonObject)
  private static final in.trujobs.proto.FeedbackReasonObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.FeedbackReasonObject();
  }

  public static in.trujobs.proto.FeedbackReasonObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedbackReasonObject>
      PARSER = new com.google.protobuf.AbstractParser<FeedbackReasonObject>() {
    public FeedbackReasonObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FeedbackReasonObject(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<FeedbackReasonObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedbackReasonObject> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.FeedbackReasonObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
