// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.EducationObject}
 */
public  final class EducationObject extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.EducationObject)
    EducationObjectOrBuilder {
  // Use EducationObject.newBuilder() to construct.
  private EducationObject(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private EducationObject() {
    educationId_ = 0L;
    educationName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EducationObject(
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

            educationId_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            educationName_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_EducationObject_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_EducationObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.EducationObject.class, in.trujobs.proto.EducationObject.Builder.class);
  }

  public static final int EDUCATIONID_FIELD_NUMBER = 1;
  private long educationId_;
  /**
   * <code>optional int64 educationId = 1;</code>
   */
  public long getEducationId() {
    return educationId_;
  }

  public static final int EDUCATIONNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object educationName_;
  /**
   * <code>optional string educationName = 2;</code>
   */
  public java.lang.String getEducationName() {
    java.lang.Object ref = educationName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      educationName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string educationName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getEducationNameBytes() {
    java.lang.Object ref = educationName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      educationName_ = b;
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
    if (educationId_ != 0L) {
      output.writeInt64(1, educationId_);
    }
    if (!getEducationNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, educationName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (educationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, educationId_);
    }
    if (!getEducationNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, educationName_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.EducationObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.EducationObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.EducationObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.EducationObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.EducationObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.EducationObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.EducationObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.EducationObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.EducationObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.EducationObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.EducationObject prototype) {
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
   * Protobuf type {@code in.trujobs.proto.EducationObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.EducationObject)
      in.trujobs.proto.EducationObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_EducationObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_EducationObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.EducationObject.class, in.trujobs.proto.EducationObject.Builder.class);
    }

    // Construct using in.trujobs.proto.EducationObject.newBuilder()
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
      educationId_ = 0L;

      educationName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_EducationObject_descriptor;
    }

    public in.trujobs.proto.EducationObject getDefaultInstanceForType() {
      return in.trujobs.proto.EducationObject.getDefaultInstance();
    }

    public in.trujobs.proto.EducationObject build() {
      in.trujobs.proto.EducationObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.EducationObject buildPartial() {
      in.trujobs.proto.EducationObject result = new in.trujobs.proto.EducationObject(this);
      result.educationId_ = educationId_;
      result.educationName_ = educationName_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.EducationObject) {
        return mergeFrom((in.trujobs.proto.EducationObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.EducationObject other) {
      if (other == in.trujobs.proto.EducationObject.getDefaultInstance()) return this;
      if (other.getEducationId() != 0L) {
        setEducationId(other.getEducationId());
      }
      if (!other.getEducationName().isEmpty()) {
        educationName_ = other.educationName_;
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
      in.trujobs.proto.EducationObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.EducationObject) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long educationId_ ;
    /**
     * <code>optional int64 educationId = 1;</code>
     */
    public long getEducationId() {
      return educationId_;
    }
    /**
     * <code>optional int64 educationId = 1;</code>
     */
    public Builder setEducationId(long value) {
      
      educationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 educationId = 1;</code>
     */
    public Builder clearEducationId() {
      
      educationId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object educationName_ = "";
    /**
     * <code>optional string educationName = 2;</code>
     */
    public java.lang.String getEducationName() {
      java.lang.Object ref = educationName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        educationName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string educationName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEducationNameBytes() {
      java.lang.Object ref = educationName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        educationName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string educationName = 2;</code>
     */
    public Builder setEducationName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      educationName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string educationName = 2;</code>
     */
    public Builder clearEducationName() {
      
      educationName_ = getDefaultInstance().getEducationName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string educationName = 2;</code>
     */
    public Builder setEducationNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      educationName_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.EducationObject)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.EducationObject)
  private static final in.trujobs.proto.EducationObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.EducationObject();
  }

  public static in.trujobs.proto.EducationObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EducationObject>
      PARSER = new com.google.protobuf.AbstractParser<EducationObject>() {
    public EducationObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new EducationObject(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<EducationObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EducationObject> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.EducationObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

