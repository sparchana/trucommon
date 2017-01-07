// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.FeedbackReasonResponse}
 */
public  final class FeedbackReasonResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.FeedbackReasonResponse)
    FeedbackReasonResponseOrBuilder {
  // Use FeedbackReasonResponse.newBuilder() to construct.
  private FeedbackReasonResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FeedbackReasonResponse() {
    feedbackReasonObject_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FeedbackReasonResponse(
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
              feedbackReasonObject_ = new java.util.ArrayList<in.trujobs.proto.FeedbackReasonObject>();
              mutable_bitField0_ |= 0x00000001;
            }
            feedbackReasonObject_.add(input.readMessage(in.trujobs.proto.FeedbackReasonObject.parser(), extensionRegistry));
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
        feedbackReasonObject_ = java.util.Collections.unmodifiableList(feedbackReasonObject_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.FeedbackReasonResponse.class, in.trujobs.proto.FeedbackReasonResponse.Builder.class);
  }

  public static final int FEEDBACKREASONOBJECT_FIELD_NUMBER = 1;
  private java.util.List<in.trujobs.proto.FeedbackReasonObject> feedbackReasonObject_;
  /**
   * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
   */
  public java.util.List<in.trujobs.proto.FeedbackReasonObject> getFeedbackReasonObjectList() {
    return feedbackReasonObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
   */
  public java.util.List<? extends in.trujobs.proto.FeedbackReasonObjectOrBuilder> 
      getFeedbackReasonObjectOrBuilderList() {
    return feedbackReasonObject_;
  }
  /**
   * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
   */
  public int getFeedbackReasonObjectCount() {
    return feedbackReasonObject_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
   */
  public in.trujobs.proto.FeedbackReasonObject getFeedbackReasonObject(int index) {
    return feedbackReasonObject_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
   */
  public in.trujobs.proto.FeedbackReasonObjectOrBuilder getFeedbackReasonObjectOrBuilder(
      int index) {
    return feedbackReasonObject_.get(index);
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
    for (int i = 0; i < feedbackReasonObject_.size(); i++) {
      output.writeMessage(1, feedbackReasonObject_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < feedbackReasonObject_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, feedbackReasonObject_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.FeedbackReasonResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.FeedbackReasonResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.FeedbackReasonResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.FeedbackReasonResponse)
      in.trujobs.proto.FeedbackReasonResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.FeedbackReasonResponse.class, in.trujobs.proto.FeedbackReasonResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.FeedbackReasonResponse.newBuilder()
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
        getFeedbackReasonObjectFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (feedbackReasonObjectBuilder_ == null) {
        feedbackReasonObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        feedbackReasonObjectBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FeedbackReasonResponse_descriptor;
    }

    public in.trujobs.proto.FeedbackReasonResponse getDefaultInstanceForType() {
      return in.trujobs.proto.FeedbackReasonResponse.getDefaultInstance();
    }

    public in.trujobs.proto.FeedbackReasonResponse build() {
      in.trujobs.proto.FeedbackReasonResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.FeedbackReasonResponse buildPartial() {
      in.trujobs.proto.FeedbackReasonResponse result = new in.trujobs.proto.FeedbackReasonResponse(this);
      int from_bitField0_ = bitField0_;
      if (feedbackReasonObjectBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          feedbackReasonObject_ = java.util.Collections.unmodifiableList(feedbackReasonObject_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.feedbackReasonObject_ = feedbackReasonObject_;
      } else {
        result.feedbackReasonObject_ = feedbackReasonObjectBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.FeedbackReasonResponse) {
        return mergeFrom((in.trujobs.proto.FeedbackReasonResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.FeedbackReasonResponse other) {
      if (other == in.trujobs.proto.FeedbackReasonResponse.getDefaultInstance()) return this;
      if (feedbackReasonObjectBuilder_ == null) {
        if (!other.feedbackReasonObject_.isEmpty()) {
          if (feedbackReasonObject_.isEmpty()) {
            feedbackReasonObject_ = other.feedbackReasonObject_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeedbackReasonObjectIsMutable();
            feedbackReasonObject_.addAll(other.feedbackReasonObject_);
          }
          onChanged();
        }
      } else {
        if (!other.feedbackReasonObject_.isEmpty()) {
          if (feedbackReasonObjectBuilder_.isEmpty()) {
            feedbackReasonObjectBuilder_.dispose();
            feedbackReasonObjectBuilder_ = null;
            feedbackReasonObject_ = other.feedbackReasonObject_;
            bitField0_ = (bitField0_ & ~0x00000001);
            feedbackReasonObjectBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getFeedbackReasonObjectFieldBuilder() : null;
          } else {
            feedbackReasonObjectBuilder_.addAllMessages(other.feedbackReasonObject_);
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
      in.trujobs.proto.FeedbackReasonResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.FeedbackReasonResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<in.trujobs.proto.FeedbackReasonObject> feedbackReasonObject_ =
      java.util.Collections.emptyList();
    private void ensureFeedbackReasonObjectIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        feedbackReasonObject_ = new java.util.ArrayList<in.trujobs.proto.FeedbackReasonObject>(feedbackReasonObject_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.FeedbackReasonObject, in.trujobs.proto.FeedbackReasonObject.Builder, in.trujobs.proto.FeedbackReasonObjectOrBuilder> feedbackReasonObjectBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public java.util.List<in.trujobs.proto.FeedbackReasonObject> getFeedbackReasonObjectList() {
      if (feedbackReasonObjectBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feedbackReasonObject_);
      } else {
        return feedbackReasonObjectBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public int getFeedbackReasonObjectCount() {
      if (feedbackReasonObjectBuilder_ == null) {
        return feedbackReasonObject_.size();
      } else {
        return feedbackReasonObjectBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public in.trujobs.proto.FeedbackReasonObject getFeedbackReasonObject(int index) {
      if (feedbackReasonObjectBuilder_ == null) {
        return feedbackReasonObject_.get(index);
      } else {
        return feedbackReasonObjectBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder setFeedbackReasonObject(
        int index, in.trujobs.proto.FeedbackReasonObject value) {
      if (feedbackReasonObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.set(index, value);
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder setFeedbackReasonObject(
        int index, in.trujobs.proto.FeedbackReasonObject.Builder builderForValue) {
      if (feedbackReasonObjectBuilder_ == null) {
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.set(index, builderForValue.build());
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder addFeedbackReasonObject(in.trujobs.proto.FeedbackReasonObject value) {
      if (feedbackReasonObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.add(value);
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder addFeedbackReasonObject(
        int index, in.trujobs.proto.FeedbackReasonObject value) {
      if (feedbackReasonObjectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.add(index, value);
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder addFeedbackReasonObject(
        in.trujobs.proto.FeedbackReasonObject.Builder builderForValue) {
      if (feedbackReasonObjectBuilder_ == null) {
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.add(builderForValue.build());
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder addFeedbackReasonObject(
        int index, in.trujobs.proto.FeedbackReasonObject.Builder builderForValue) {
      if (feedbackReasonObjectBuilder_ == null) {
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.add(index, builderForValue.build());
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder addAllFeedbackReasonObject(
        java.lang.Iterable<? extends in.trujobs.proto.FeedbackReasonObject> values) {
      if (feedbackReasonObjectBuilder_ == null) {
        ensureFeedbackReasonObjectIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feedbackReasonObject_);
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder clearFeedbackReasonObject() {
      if (feedbackReasonObjectBuilder_ == null) {
        feedbackReasonObject_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public Builder removeFeedbackReasonObject(int index) {
      if (feedbackReasonObjectBuilder_ == null) {
        ensureFeedbackReasonObjectIsMutable();
        feedbackReasonObject_.remove(index);
        onChanged();
      } else {
        feedbackReasonObjectBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public in.trujobs.proto.FeedbackReasonObject.Builder getFeedbackReasonObjectBuilder(
        int index) {
      return getFeedbackReasonObjectFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public in.trujobs.proto.FeedbackReasonObjectOrBuilder getFeedbackReasonObjectOrBuilder(
        int index) {
      if (feedbackReasonObjectBuilder_ == null) {
        return feedbackReasonObject_.get(index);  } else {
        return feedbackReasonObjectBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public java.util.List<? extends in.trujobs.proto.FeedbackReasonObjectOrBuilder> 
         getFeedbackReasonObjectOrBuilderList() {
      if (feedbackReasonObjectBuilder_ != null) {
        return feedbackReasonObjectBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feedbackReasonObject_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public in.trujobs.proto.FeedbackReasonObject.Builder addFeedbackReasonObjectBuilder() {
      return getFeedbackReasonObjectFieldBuilder().addBuilder(
          in.trujobs.proto.FeedbackReasonObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public in.trujobs.proto.FeedbackReasonObject.Builder addFeedbackReasonObjectBuilder(
        int index) {
      return getFeedbackReasonObjectFieldBuilder().addBuilder(
          index, in.trujobs.proto.FeedbackReasonObject.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.FeedbackReasonObject feedbackReasonObject = 1;</code>
     */
    public java.util.List<in.trujobs.proto.FeedbackReasonObject.Builder> 
         getFeedbackReasonObjectBuilderList() {
      return getFeedbackReasonObjectFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.FeedbackReasonObject, in.trujobs.proto.FeedbackReasonObject.Builder, in.trujobs.proto.FeedbackReasonObjectOrBuilder> 
        getFeedbackReasonObjectFieldBuilder() {
      if (feedbackReasonObjectBuilder_ == null) {
        feedbackReasonObjectBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.FeedbackReasonObject, in.trujobs.proto.FeedbackReasonObject.Builder, in.trujobs.proto.FeedbackReasonObjectOrBuilder>(
                feedbackReasonObject_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        feedbackReasonObject_ = null;
      }
      return feedbackReasonObjectBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.FeedbackReasonResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.FeedbackReasonResponse)
  private static final in.trujobs.proto.FeedbackReasonResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.FeedbackReasonResponse();
  }

  public static in.trujobs.proto.FeedbackReasonResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedbackReasonResponse>
      PARSER = new com.google.protobuf.AbstractParser<FeedbackReasonResponse>() {
    public FeedbackReasonResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FeedbackReasonResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<FeedbackReasonResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedbackReasonResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.FeedbackReasonResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
