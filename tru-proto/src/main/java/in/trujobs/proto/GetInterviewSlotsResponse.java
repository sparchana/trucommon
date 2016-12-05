// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.GetInterviewSlotsResponse}
 */
public  final class GetInterviewSlotsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.GetInterviewSlotsResponse)
    GetInterviewSlotsResponseOrBuilder {
  // Use GetInterviewSlotsResponse.newBuilder() to construct.
  private GetInterviewSlotsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetInterviewSlotsResponse() {
    interviewSlots_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetInterviewSlotsResponse(
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
              interviewSlots_ = new java.util.ArrayList<in.trujobs.proto.InterviewSlot>();
              mutable_bitField0_ |= 0x00000001;
            }
            interviewSlots_.add(input.readMessage(in.trujobs.proto.InterviewSlot.parser(), extensionRegistry));
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
        interviewSlots_ = java.util.Collections.unmodifiableList(interviewSlots_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetInterviewSlotsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetInterviewSlotsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.GetInterviewSlotsResponse.class, in.trujobs.proto.GetInterviewSlotsResponse.Builder.class);
  }

  public static final int INTERVIEWSLOTS_FIELD_NUMBER = 1;
  private java.util.List<in.trujobs.proto.InterviewSlot> interviewSlots_;
  /**
   * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
   */
  public java.util.List<in.trujobs.proto.InterviewSlot> getInterviewSlotsList() {
    return interviewSlots_;
  }
  /**
   * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
   */
  public java.util.List<? extends in.trujobs.proto.InterviewSlotOrBuilder> 
      getInterviewSlotsOrBuilderList() {
    return interviewSlots_;
  }
  /**
   * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
   */
  public int getInterviewSlotsCount() {
    return interviewSlots_.size();
  }
  /**
   * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
   */
  public in.trujobs.proto.InterviewSlot getInterviewSlots(int index) {
    return interviewSlots_.get(index);
  }
  /**
   * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
   */
  public in.trujobs.proto.InterviewSlotOrBuilder getInterviewSlotsOrBuilder(
      int index) {
    return interviewSlots_.get(index);
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
    for (int i = 0; i < interviewSlots_.size(); i++) {
      output.writeMessage(1, interviewSlots_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < interviewSlots_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, interviewSlots_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.GetInterviewSlotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.GetInterviewSlotsResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.GetInterviewSlotsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.GetInterviewSlotsResponse)
      in.trujobs.proto.GetInterviewSlotsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetInterviewSlotsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetInterviewSlotsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.GetInterviewSlotsResponse.class, in.trujobs.proto.GetInterviewSlotsResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.GetInterviewSlotsResponse.newBuilder()
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
        getInterviewSlotsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (interviewSlotsBuilder_ == null) {
        interviewSlots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        interviewSlotsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetInterviewSlotsResponse_descriptor;
    }

    public in.trujobs.proto.GetInterviewSlotsResponse getDefaultInstanceForType() {
      return in.trujobs.proto.GetInterviewSlotsResponse.getDefaultInstance();
    }

    public in.trujobs.proto.GetInterviewSlotsResponse build() {
      in.trujobs.proto.GetInterviewSlotsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.GetInterviewSlotsResponse buildPartial() {
      in.trujobs.proto.GetInterviewSlotsResponse result = new in.trujobs.proto.GetInterviewSlotsResponse(this);
      int from_bitField0_ = bitField0_;
      if (interviewSlotsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          interviewSlots_ = java.util.Collections.unmodifiableList(interviewSlots_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.interviewSlots_ = interviewSlots_;
      } else {
        result.interviewSlots_ = interviewSlotsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.GetInterviewSlotsResponse) {
        return mergeFrom((in.trujobs.proto.GetInterviewSlotsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.GetInterviewSlotsResponse other) {
      if (other == in.trujobs.proto.GetInterviewSlotsResponse.getDefaultInstance()) return this;
      if (interviewSlotsBuilder_ == null) {
        if (!other.interviewSlots_.isEmpty()) {
          if (interviewSlots_.isEmpty()) {
            interviewSlots_ = other.interviewSlots_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInterviewSlotsIsMutable();
            interviewSlots_.addAll(other.interviewSlots_);
          }
          onChanged();
        }
      } else {
        if (!other.interviewSlots_.isEmpty()) {
          if (interviewSlotsBuilder_.isEmpty()) {
            interviewSlotsBuilder_.dispose();
            interviewSlotsBuilder_ = null;
            interviewSlots_ = other.interviewSlots_;
            bitField0_ = (bitField0_ & ~0x00000001);
            interviewSlotsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getInterviewSlotsFieldBuilder() : null;
          } else {
            interviewSlotsBuilder_.addAllMessages(other.interviewSlots_);
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
      in.trujobs.proto.GetInterviewSlotsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.GetInterviewSlotsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<in.trujobs.proto.InterviewSlot> interviewSlots_ =
      java.util.Collections.emptyList();
    private void ensureInterviewSlotsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        interviewSlots_ = new java.util.ArrayList<in.trujobs.proto.InterviewSlot>(interviewSlots_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.InterviewSlot, in.trujobs.proto.InterviewSlot.Builder, in.trujobs.proto.InterviewSlotOrBuilder> interviewSlotsBuilder_;

    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public java.util.List<in.trujobs.proto.InterviewSlot> getInterviewSlotsList() {
      if (interviewSlotsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(interviewSlots_);
      } else {
        return interviewSlotsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public int getInterviewSlotsCount() {
      if (interviewSlotsBuilder_ == null) {
        return interviewSlots_.size();
      } else {
        return interviewSlotsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public in.trujobs.proto.InterviewSlot getInterviewSlots(int index) {
      if (interviewSlotsBuilder_ == null) {
        return interviewSlots_.get(index);
      } else {
        return interviewSlotsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder setInterviewSlots(
        int index, in.trujobs.proto.InterviewSlot value) {
      if (interviewSlotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterviewSlotsIsMutable();
        interviewSlots_.set(index, value);
        onChanged();
      } else {
        interviewSlotsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder setInterviewSlots(
        int index, in.trujobs.proto.InterviewSlot.Builder builderForValue) {
      if (interviewSlotsBuilder_ == null) {
        ensureInterviewSlotsIsMutable();
        interviewSlots_.set(index, builderForValue.build());
        onChanged();
      } else {
        interviewSlotsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder addInterviewSlots(in.trujobs.proto.InterviewSlot value) {
      if (interviewSlotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterviewSlotsIsMutable();
        interviewSlots_.add(value);
        onChanged();
      } else {
        interviewSlotsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder addInterviewSlots(
        int index, in.trujobs.proto.InterviewSlot value) {
      if (interviewSlotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInterviewSlotsIsMutable();
        interviewSlots_.add(index, value);
        onChanged();
      } else {
        interviewSlotsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder addInterviewSlots(
        in.trujobs.proto.InterviewSlot.Builder builderForValue) {
      if (interviewSlotsBuilder_ == null) {
        ensureInterviewSlotsIsMutable();
        interviewSlots_.add(builderForValue.build());
        onChanged();
      } else {
        interviewSlotsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder addInterviewSlots(
        int index, in.trujobs.proto.InterviewSlot.Builder builderForValue) {
      if (interviewSlotsBuilder_ == null) {
        ensureInterviewSlotsIsMutable();
        interviewSlots_.add(index, builderForValue.build());
        onChanged();
      } else {
        interviewSlotsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder addAllInterviewSlots(
        java.lang.Iterable<? extends in.trujobs.proto.InterviewSlot> values) {
      if (interviewSlotsBuilder_ == null) {
        ensureInterviewSlotsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, interviewSlots_);
        onChanged();
      } else {
        interviewSlotsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder clearInterviewSlots() {
      if (interviewSlotsBuilder_ == null) {
        interviewSlots_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        interviewSlotsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public Builder removeInterviewSlots(int index) {
      if (interviewSlotsBuilder_ == null) {
        ensureInterviewSlotsIsMutable();
        interviewSlots_.remove(index);
        onChanged();
      } else {
        interviewSlotsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public in.trujobs.proto.InterviewSlot.Builder getInterviewSlotsBuilder(
        int index) {
      return getInterviewSlotsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public in.trujobs.proto.InterviewSlotOrBuilder getInterviewSlotsOrBuilder(
        int index) {
      if (interviewSlotsBuilder_ == null) {
        return interviewSlots_.get(index);  } else {
        return interviewSlotsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public java.util.List<? extends in.trujobs.proto.InterviewSlotOrBuilder> 
         getInterviewSlotsOrBuilderList() {
      if (interviewSlotsBuilder_ != null) {
        return interviewSlotsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(interviewSlots_);
      }
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public in.trujobs.proto.InterviewSlot.Builder addInterviewSlotsBuilder() {
      return getInterviewSlotsFieldBuilder().addBuilder(
          in.trujobs.proto.InterviewSlot.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public in.trujobs.proto.InterviewSlot.Builder addInterviewSlotsBuilder(
        int index) {
      return getInterviewSlotsFieldBuilder().addBuilder(
          index, in.trujobs.proto.InterviewSlot.getDefaultInstance());
    }
    /**
     * <code>repeated .in.trujobs.proto.InterviewSlot interviewSlots = 1;</code>
     */
    public java.util.List<in.trujobs.proto.InterviewSlot.Builder> 
         getInterviewSlotsBuilderList() {
      return getInterviewSlotsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        in.trujobs.proto.InterviewSlot, in.trujobs.proto.InterviewSlot.Builder, in.trujobs.proto.InterviewSlotOrBuilder> 
        getInterviewSlotsFieldBuilder() {
      if (interviewSlotsBuilder_ == null) {
        interviewSlotsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            in.trujobs.proto.InterviewSlot, in.trujobs.proto.InterviewSlot.Builder, in.trujobs.proto.InterviewSlotOrBuilder>(
                interviewSlots_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        interviewSlots_ = null;
      }
      return interviewSlotsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.GetInterviewSlotsResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.GetInterviewSlotsResponse)
  private static final in.trujobs.proto.GetInterviewSlotsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.GetInterviewSlotsResponse();
  }

  public static in.trujobs.proto.GetInterviewSlotsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetInterviewSlotsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetInterviewSlotsResponse>() {
    public GetInterviewSlotsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetInterviewSlotsResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetInterviewSlotsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetInterviewSlotsResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.GetInterviewSlotsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

