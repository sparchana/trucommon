// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.AddLeadRequest}
 */
public  final class AddLeadRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.AddLeadRequest)
    AddLeadRequestOrBuilder {
  // Use AddLeadRequest.newBuilder() to construct.
  private AddLeadRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AddLeadRequest() {
    leadName_ = "";
    leadMobile_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AddLeadRequest(
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

            leadName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            leadMobile_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AddLeadRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AddLeadRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.AddLeadRequest.class, in.trujobs.proto.AddLeadRequest.Builder.class);
  }

  public static final int LEADNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object leadName_;
  /**
   * <code>optional string leadName = 1;</code>
   */
  public java.lang.String getLeadName() {
    java.lang.Object ref = leadName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leadName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string leadName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLeadNameBytes() {
    java.lang.Object ref = leadName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leadName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEADMOBILE_FIELD_NUMBER = 2;
  private volatile java.lang.Object leadMobile_;
  /**
   * <code>optional string leadMobile = 2;</code>
   */
  public java.lang.String getLeadMobile() {
    java.lang.Object ref = leadMobile_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      leadMobile_ = s;
      return s;
    }
  }
  /**
   * <code>optional string leadMobile = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLeadMobileBytes() {
    java.lang.Object ref = leadMobile_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      leadMobile_ = b;
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
    if (!getLeadNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, leadName_);
    }
    if (!getLeadMobileBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, leadMobile_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLeadNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, leadName_);
    }
    if (!getLeadMobileBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, leadMobile_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.AddLeadRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.AddLeadRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.AddLeadRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.AddLeadRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.AddLeadRequest prototype) {
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
   * Protobuf type {@code in.trujobs.proto.AddLeadRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.AddLeadRequest)
      in.trujobs.proto.AddLeadRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AddLeadRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AddLeadRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.AddLeadRequest.class, in.trujobs.proto.AddLeadRequest.Builder.class);
    }

    // Construct using in.trujobs.proto.AddLeadRequest.newBuilder()
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
      leadName_ = "";

      leadMobile_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_AddLeadRequest_descriptor;
    }

    public in.trujobs.proto.AddLeadRequest getDefaultInstanceForType() {
      return in.trujobs.proto.AddLeadRequest.getDefaultInstance();
    }

    public in.trujobs.proto.AddLeadRequest build() {
      in.trujobs.proto.AddLeadRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.AddLeadRequest buildPartial() {
      in.trujobs.proto.AddLeadRequest result = new in.trujobs.proto.AddLeadRequest(this);
      result.leadName_ = leadName_;
      result.leadMobile_ = leadMobile_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.AddLeadRequest) {
        return mergeFrom((in.trujobs.proto.AddLeadRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.AddLeadRequest other) {
      if (other == in.trujobs.proto.AddLeadRequest.getDefaultInstance()) return this;
      if (!other.getLeadName().isEmpty()) {
        leadName_ = other.leadName_;
        onChanged();
      }
      if (!other.getLeadMobile().isEmpty()) {
        leadMobile_ = other.leadMobile_;
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
      in.trujobs.proto.AddLeadRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.AddLeadRequest) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object leadName_ = "";
    /**
     * <code>optional string leadName = 1;</code>
     */
    public java.lang.String getLeadName() {
      java.lang.Object ref = leadName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leadName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string leadName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLeadNameBytes() {
      java.lang.Object ref = leadName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leadName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string leadName = 1;</code>
     */
    public Builder setLeadName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leadName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string leadName = 1;</code>
     */
    public Builder clearLeadName() {
      
      leadName_ = getDefaultInstance().getLeadName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string leadName = 1;</code>
     */
    public Builder setLeadNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leadName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object leadMobile_ = "";
    /**
     * <code>optional string leadMobile = 2;</code>
     */
    public java.lang.String getLeadMobile() {
      java.lang.Object ref = leadMobile_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        leadMobile_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string leadMobile = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLeadMobileBytes() {
      java.lang.Object ref = leadMobile_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        leadMobile_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string leadMobile = 2;</code>
     */
    public Builder setLeadMobile(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      leadMobile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string leadMobile = 2;</code>
     */
    public Builder clearLeadMobile() {
      
      leadMobile_ = getDefaultInstance().getLeadMobile();
      onChanged();
      return this;
    }
    /**
     * <code>optional string leadMobile = 2;</code>
     */
    public Builder setLeadMobileBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      leadMobile_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.AddLeadRequest)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.AddLeadRequest)
  private static final in.trujobs.proto.AddLeadRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.AddLeadRequest();
  }

  public static in.trujobs.proto.AddLeadRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddLeadRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddLeadRequest>() {
    public AddLeadRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new AddLeadRequest(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<AddLeadRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddLeadRequest> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.AddLeadRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
