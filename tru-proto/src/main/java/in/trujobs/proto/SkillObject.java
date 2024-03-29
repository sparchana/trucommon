// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.SkillObject}
 */
public  final class SkillObject extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.SkillObject)
    SkillObjectOrBuilder {
  // Use SkillObject.newBuilder() to construct.
  private SkillObject(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SkillObject() {
    skillId_ = 0;
    skillName_ = "";
    skillQuestion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SkillObject(
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

            skillId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            skillName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            skillQuestion_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_SkillObject_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_SkillObject_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.SkillObject.class, in.trujobs.proto.SkillObject.Builder.class);
  }

  public static final int SKILLID_FIELD_NUMBER = 1;
  private int skillId_;
  /**
   * <code>optional int32 skillId = 1;</code>
   */
  public int getSkillId() {
    return skillId_;
  }

  public static final int SKILLNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object skillName_;
  /**
   * <code>optional string skillName = 2;</code>
   */
  public java.lang.String getSkillName() {
    java.lang.Object ref = skillName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skillName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string skillName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSkillNameBytes() {
    java.lang.Object ref = skillName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skillName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKILLQUESTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object skillQuestion_;
  /**
   * <code>optional string skillQuestion = 3;</code>
   */
  public java.lang.String getSkillQuestion() {
    java.lang.Object ref = skillQuestion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skillQuestion_ = s;
      return s;
    }
  }
  /**
   * <code>optional string skillQuestion = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSkillQuestionBytes() {
    java.lang.Object ref = skillQuestion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skillQuestion_ = b;
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
    if (skillId_ != 0) {
      output.writeInt32(1, skillId_);
    }
    if (!getSkillNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, skillName_);
    }
    if (!getSkillQuestionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, skillQuestion_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, skillId_);
    }
    if (!getSkillNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, skillName_);
    }
    if (!getSkillQuestionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, skillQuestion_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.SkillObject parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.SkillObject parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.SkillObject parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.SkillObject parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.SkillObject parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.SkillObject parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.SkillObject parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.SkillObject parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.SkillObject parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.SkillObject parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.SkillObject prototype) {
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
   * Protobuf type {@code in.trujobs.proto.SkillObject}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.SkillObject)
      in.trujobs.proto.SkillObjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_SkillObject_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_SkillObject_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.SkillObject.class, in.trujobs.proto.SkillObject.Builder.class);
    }

    // Construct using in.trujobs.proto.SkillObject.newBuilder()
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
      skillId_ = 0;

      skillName_ = "";

      skillQuestion_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_SkillObject_descriptor;
    }

    public in.trujobs.proto.SkillObject getDefaultInstanceForType() {
      return in.trujobs.proto.SkillObject.getDefaultInstance();
    }

    public in.trujobs.proto.SkillObject build() {
      in.trujobs.proto.SkillObject result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.SkillObject buildPartial() {
      in.trujobs.proto.SkillObject result = new in.trujobs.proto.SkillObject(this);
      result.skillId_ = skillId_;
      result.skillName_ = skillName_;
      result.skillQuestion_ = skillQuestion_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.SkillObject) {
        return mergeFrom((in.trujobs.proto.SkillObject)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.SkillObject other) {
      if (other == in.trujobs.proto.SkillObject.getDefaultInstance()) return this;
      if (other.getSkillId() != 0) {
        setSkillId(other.getSkillId());
      }
      if (!other.getSkillName().isEmpty()) {
        skillName_ = other.skillName_;
        onChanged();
      }
      if (!other.getSkillQuestion().isEmpty()) {
        skillQuestion_ = other.skillQuestion_;
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
      in.trujobs.proto.SkillObject parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.SkillObject) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int skillId_ ;
    /**
     * <code>optional int32 skillId = 1;</code>
     */
    public int getSkillId() {
      return skillId_;
    }
    /**
     * <code>optional int32 skillId = 1;</code>
     */
    public Builder setSkillId(int value) {
      
      skillId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 skillId = 1;</code>
     */
    public Builder clearSkillId() {
      
      skillId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object skillName_ = "";
    /**
     * <code>optional string skillName = 2;</code>
     */
    public java.lang.String getSkillName() {
      java.lang.Object ref = skillName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skillName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string skillName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSkillNameBytes() {
      java.lang.Object ref = skillName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skillName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string skillName = 2;</code>
     */
    public Builder setSkillName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skillName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string skillName = 2;</code>
     */
    public Builder clearSkillName() {
      
      skillName_ = getDefaultInstance().getSkillName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string skillName = 2;</code>
     */
    public Builder setSkillNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skillName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skillQuestion_ = "";
    /**
     * <code>optional string skillQuestion = 3;</code>
     */
    public java.lang.String getSkillQuestion() {
      java.lang.Object ref = skillQuestion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skillQuestion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string skillQuestion = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSkillQuestionBytes() {
      java.lang.Object ref = skillQuestion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skillQuestion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string skillQuestion = 3;</code>
     */
    public Builder setSkillQuestion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skillQuestion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string skillQuestion = 3;</code>
     */
    public Builder clearSkillQuestion() {
      
      skillQuestion_ = getDefaultInstance().getSkillQuestion();
      onChanged();
      return this;
    }
    /**
     * <code>optional string skillQuestion = 3;</code>
     */
    public Builder setSkillQuestionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skillQuestion_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.SkillObject)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.SkillObject)
  private static final in.trujobs.proto.SkillObject DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.SkillObject();
  }

  public static in.trujobs.proto.SkillObject getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkillObject>
      PARSER = new com.google.protobuf.AbstractParser<SkillObject>() {
    public SkillObject parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new SkillObject(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<SkillObject> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkillObject> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.SkillObject getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

