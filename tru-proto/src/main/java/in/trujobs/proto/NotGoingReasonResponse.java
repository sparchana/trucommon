// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.NotGoingReasonResponse}
 */
public  final class NotGoingReasonResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.NotGoingReasonResponse)
    NotGoingReasonResponseOrBuilder {
  // Use NotGoingReasonResponse.newBuilder() to construct.
  private NotGoingReasonResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private NotGoingReasonResponse() {
    reasonObject_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NotGoingReasonResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              reasonObject_ = new java.util.ArrayList<in.trujobs.proto.ReasonObject>();
              mutable_bitField0_ |= 0x00000001;
            }
            reasonObject_.add(input.readMessage(in.trujobs.proto.ReasonObject.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        reasonObject_ = java.util.Collections.unmodifiableList(reasonObject_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_NotGoingReasonResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_NotGoingReasonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.NotGoingReasonResponse.class, in.trujobs.proto.NotGoingReasonResponse.Builder.class);
  }

  public static final int REASONOBJECT_FIELD_NUMBER = 1;
  private java.util.List<in.trujobs.proto.ReasonObject> reasonObject_;
  /**
   * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
   */
  public java.util.List<in.trujobs.proto.ReasonObject> getReasonObjectList() {
    return reasonObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
   */
  public java.util.List<? extends in.trujobs.proto.ReasonObjectOrBuilder> 
      getReasonObjectOrBuilderList() {
    return reasonObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
   */
  public int getReasonObjectCount() {
    return reasonObject_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
   */
  public in.trujobs.proto.ReasonObject getReasonObject(int index) {
    return reasonObject_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
   */
  public in.trujobs.proto.ReasonObjectOrBuilder getReasonObjectOrBuilder(
      int index) {
    return reasonObject_.get(index);
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
    for (int i = 0; i < reasonObject_.size(); i++) {
      output.writeMessage(1, reasonObject_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reasonObject_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reasonObject_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.NotGoingReasonResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.NotGoingReasonResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.NotGoingReasonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.NotGoingReasonResponse)
      in.trujobs.proto.NotGoingReasonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_NotGoingReasonResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_NotGoingReasonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.NotGoingReasonResponse.class, in.trujobs.proto.NotGoingReasonResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.NotGoingReasonResponse.newBuilder()
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
        getReasonObjectFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (reasonObjectBuilder_ == null) {
        reasonObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        reasonObjectBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_NotGoingReasonResponse_descriptor;
    }

    public in.trujobs.proto.NotGoingReasonResponse getDefaultInstanceForType() {
      return in.trujobs.proto.NotGoingReasonResponse.getDefaultInstance();
    }

    public in.trujobs.proto.NotGoingReasonResponse build() {
      in.trujobs.proto.NotGoingReasonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.NotGoingReasonResponse buildPartial() {
      in.trujobs.proto.NotGoingReasonResponse result = new in.trujobs.proto.NotGoingReasonResponse(this);
      int from_bitField0_ = bitField0_;
      if (reasonObjectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          reasonObject_ = java.util.Collections.unmodifiableList(reasonObject_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reasonObject_ = reasonObject_;
      } else {
        result.reasonObject_ = reasonObjectBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.NotGoingReasonResponse) {
        return mergeFrom((in.trujobs.proto.NotGoingReasonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.NotGoingReasonResponse other) {
      if (other == in.trujobs.proto.NotGoingReasonResponse.getDefaultInstance()) return this;
      if (reasonObjectBuilder_ == null) {
        if (!other.reasonObject_.isEmpty()) {
          if (reasonObject_.isEmpty()) {
            reasonObject_ = other.reasonObject_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReasonObjectIsMutable();
            reasonObject_.addAll(other.reasonObject_);
          }
          onChanged();
        }
      } else {
        if (!other.reasonObject_.isEmpty()) {
          if (reasonObjectBuilder_.isEmpty()) {
            reasonObjectBuilder_.dispose();
            reasonObjectBuilder_ = null;
            reasonObject_ = other.reasonObject_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reasonObjectBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getReasonObjectFieldBuilder() : null;
          } else {
            reasonObjectBuilder_.addAllMessages(other.reasonObject_);
          }
        }
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
      in.trujobs.proto.NotGoingReasonResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.NotGoingReasonResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<in.trujobs.proto.ReasonObject> reasonObject_ =
      java.util.Collections.emptyList();
    private void ensureReasonObjectIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        reasonObject_ = new java.util.ArrayList<in.trujobs.proto.ReasonObject>(reasonObject_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.ReasonObject, in.trujobs.proto.ReasonObject.Builder, in.trujobs.proto.ReasonObjectOrBuilder> reasonObjectBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public java.util.List<in.trujobs.proto.ReasonObject> getReasonObjectList() {
      if (reasonObjectBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reasonObject_);
      } else {
        return reasonObjectBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public int getReasonObjectCount() {
      if (reasonObjectBuilder_ == null) {
        return reasonObject_.size();
      } else {
        return reasonObjectBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public in.trujobs.proto.ReasonObject getReasonObject(int index) {
      if (reasonObjectBuilder_ == null) {
        return reasonObject_.get(index);
      } else {
        return reasonObjectBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder setReasonObject(
        int index, in.trujobs.proto.ReasonObject value) {
      if (reasonObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReasonObjectIsMutable();
        reasonObject_.set(index, value);
        onChanged();
      } else {
        reasonObjectBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder setReasonObject(
        int index, in.trujobs.proto.ReasonObject.Builder builderForValue) {
      if (reasonObjectBuilder_ == null) {
        ensureReasonObjectIsMutable();
        reasonObject_.set(index, builderForValue.build());
        onChanged();
      } else {
        reasonObjectBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder addReasonObject(in.trujobs.proto.ReasonObject value) {
      if (reasonObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReasonObjectIsMutable();
        reasonObject_.add(value);
        onChanged();
      } else {
        reasonObjectBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder addReasonObject(
        int index, in.trujobs.proto.ReasonObject value) {
      if (reasonObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReasonObjectIsMutable();
        reasonObject_.add(index, value);
        onChanged();
      } else {
        reasonObjectBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder addReasonObject(
        in.trujobs.proto.ReasonObject.Builder builderForValue) {
      if (reasonObjectBuilder_ == null) {
        ensureReasonObjectIsMutable();
        reasonObject_.add(builderForValue.build());
        onChanged();
      } else {
        reasonObjectBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder addReasonObject(
        int index, in.trujobs.proto.ReasonObject.Builder builderForValue) {
      if (reasonObjectBuilder_ == null) {
        ensureReasonObjectIsMutable();
        reasonObject_.add(index, builderForValue.build());
        onChanged();
      } else {
        reasonObjectBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder addAllReasonObject(
        java.lang.Iterable<? extends in.trujobs.proto.ReasonObject> values) {
      if (reasonObjectBuilder_ == null) {
        ensureReasonObjectIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reasonObject_);
        onChanged();
      } else {
        reasonObjectBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder clearReasonObject() {
      if (reasonObjectBuilder_ == null) {
        reasonObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reasonObjectBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public Builder removeReasonObject(int index) {
      if (reasonObjectBuilder_ == null) {
        ensureReasonObjectIsMutable();
        reasonObject_.remove(index);
        onChanged();
      } else {
        reasonObjectBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public in.trujobs.proto.ReasonObject.Builder getReasonObjectBuilder(
        int index) {
      return getReasonObjectFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public in.trujobs.proto.ReasonObjectOrBuilder getReasonObjectOrBuilder(
        int index) {
      if (reasonObjectBuilder_ == null) {
        return reasonObject_.get(index);  } else {
        return reasonObjectBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public java.util.List<? extends in.trujobs.proto.ReasonObjectOrBuilder> 
         getReasonObjectOrBuilderList() {
      if (reasonObjectBuilder_ != null) {
        return reasonObjectBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reasonObject_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public in.trujobs.proto.ReasonObject.Builder addReasonObjectBuilder() {
      return getReasonObjectFieldBuilder().addBuilder(
          in.trujobs.proto.ReasonObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public in.trujobs.proto.ReasonObject.Builder addReasonObjectBuilder(
        int index) {
      return getReasonObjectFieldBuilder().addBuilder(
          index, in.trujobs.proto.ReasonObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.ReasonObject reasonObject = 1;</code>
     */
    public java.util.List<in.trujobs.proto.ReasonObject.Builder> 
         getReasonObjectBuilderList() {
      return getReasonObjectFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.ReasonObject, in.trujobs.proto.ReasonObject.Builder, in.trujobs.proto.ReasonObjectOrBuilder> 
        getReasonObjectFieldBuilder() {
      if (reasonObjectBuilder_ == null) {
        reasonObjectBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.ReasonObject, in.trujobs.proto.ReasonObject.Builder, in.trujobs.proto.ReasonObjectOrBuilder>(
                reasonObject_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        reasonObject_ = null;
      }
      return reasonObjectBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.NotGoingReasonResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.NotGoingReasonResponse)
  private static final in.trujobs.proto.NotGoingReasonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.NotGoingReasonResponse();
  }

  public static in.trujobs.proto.NotGoingReasonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotGoingReasonResponse>
      PARSER = new com.google.protobuf.AbstractParser<NotGoingReasonResponse>() {
    public NotGoingReasonResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new NotGoingReasonResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<NotGoingReasonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotGoingReasonResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.NotGoingReasonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

