// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.TestMessage}
 */
public  final class TestMessage extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.TestMessage)
    TestMessageOrBuilder {
  // Use TestMessage.newBuilder() to construct.
  private TestMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TestMessage() {
    testName_ = "";
    testPage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TestMessage(
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

            testName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            testPage_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_TestMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_TestMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.TestMessage.class, in.trujobs.proto.TestMessage.Builder.class);
  }

  public static final int TESTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object testName_;
  /**
   * <code>optional string testName = 1;</code>
   */
  public java.lang.String getTestName() {
    java.lang.Object ref = testName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string testName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTestNameBytes() {
    java.lang.Object ref = testName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      testName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TESTPAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object testPage_;
  /**
   * <code>optional string testPage = 2;</code>
   */
  public java.lang.String getTestPage() {
    java.lang.Object ref = testPage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      testPage_ = s;
      return s;
    }
  }
  /**
   * <code>optional string testPage = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTestPageBytes() {
    java.lang.Object ref = testPage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      testPage_ = b;
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
    if (!getTestNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, testName_);
    }
    if (!getTestPageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, testPage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTestNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, testName_);
    }
    if (!getTestPageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, testPage_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.TestMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.TestMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.TestMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.TestMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.TestMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.TestMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.TestMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.TestMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.TestMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.TestMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.TestMessage prototype) {
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
   * Protobuf type {@code in.trujobs.proto.TestMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.TestMessage)
      in.trujobs.proto.TestMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_TestMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_TestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.TestMessage.class, in.trujobs.proto.TestMessage.Builder.class);
    }

    // Construct using in.trujobs.proto.TestMessage.newBuilder()
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
      testName_ = "";

      testPage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_TestMessage_descriptor;
    }

    public in.trujobs.proto.TestMessage getDefaultInstanceForType() {
      return in.trujobs.proto.TestMessage.getDefaultInstance();
    }

    public in.trujobs.proto.TestMessage build() {
      in.trujobs.proto.TestMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.TestMessage buildPartial() {
      in.trujobs.proto.TestMessage result = new in.trujobs.proto.TestMessage(this);
      result.testName_ = testName_;
      result.testPage_ = testPage_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.TestMessage) {
        return mergeFrom((in.trujobs.proto.TestMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.TestMessage other) {
      if (other == in.trujobs.proto.TestMessage.getDefaultInstance()) return this;
      if (!other.getTestName().isEmpty()) {
        testName_ = other.testName_;
        onChanged();
      }
      if (!other.getTestPage().isEmpty()) {
        testPage_ = other.testPage_;
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
      in.trujobs.proto.TestMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.TestMessage) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object testName_ = "";
    /**
     * <code>optional string testName = 1;</code>
     */
    public java.lang.String getTestName() {
      java.lang.Object ref = testName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string testName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTestNameBytes() {
      java.lang.Object ref = testName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string testName = 1;</code>
     */
    public Builder setTestName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      testName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string testName = 1;</code>
     */
    public Builder clearTestName() {
      
      testName_ = getDefaultInstance().getTestName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string testName = 1;</code>
     */
    public Builder setTestNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      testName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object testPage_ = "";
    /**
     * <code>optional string testPage = 2;</code>
     */
    public java.lang.String getTestPage() {
      java.lang.Object ref = testPage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testPage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string testPage = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTestPageBytes() {
      java.lang.Object ref = testPage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testPage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string testPage = 2;</code>
     */
    public Builder setTestPage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      testPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string testPage = 2;</code>
     */
    public Builder clearTestPage() {
      
      testPage_ = getDefaultInstance().getTestPage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string testPage = 2;</code>
     */
    public Builder setTestPageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      testPage_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.TestMessage)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.TestMessage)
  private static final in.trujobs.proto.TestMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.TestMessage();
  }

  public static in.trujobs.proto.TestMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestMessage>
      PARSER = new com.google.protobuf.AbstractParser<TestMessage>() {
    public TestMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new TestMessage(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<TestMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestMessage> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.TestMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

