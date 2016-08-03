// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.GetCandidateInformationResponse}
 */
public  final class GetCandidateInformationResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.GetCandidateInformationResponse)
    GetCandidateInformationResponseOrBuilder {
  // Use GetCandidateInformationResponse.newBuilder() to construct.
  private GetCandidateInformationResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetCandidateInformationResponse() {
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetCandidateInformationResponse(
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
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            in.trujobs.proto.CandidateObject.Builder subBuilder = null;
            if (candidate_ != null) {
              subBuilder = candidate_.toBuilder();
            }
            candidate_ = input.readMessage(in.trujobs.proto.CandidateObject.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(candidate_);
              candidate_ = subBuilder.buildPartial();
            }

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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetCandidateInformationResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetCandidateInformationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.GetCandidateInformationResponse.class, in.trujobs.proto.GetCandidateInformationResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.GetCandidateInformationResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0, 0),
    /**
     * <code>SUCCESS = 1;</code>
     */
    SUCCESS(1, 1),
    /**
     * <code>FAILURE = 2;</code>
     */
    FAILURE(2, 2),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SUCCESS = 1;</code>
     */
    public static final int SUCCESS_VALUE = 1;
    /**
     * <code>FAILURE = 2;</code>
     */
    public static final int FAILURE_VALUE = 2;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static Status valueOf(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SUCCESS;
        case 2: return FAILURE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return in.trujobs.proto.GetCandidateInformationResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private Status(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.GetCandidateInformationResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.GetCandidateInformationResponse.Status getStatus() {
    in.trujobs.proto.GetCandidateInformationResponse.Status result = in.trujobs.proto.GetCandidateInformationResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.GetCandidateInformationResponse.Status.UNRECOGNIZED : result;
  }

  public static final int CANDIDATE_FIELD_NUMBER = 2;
  private in.trujobs.proto.CandidateObject candidate_;
  /**
   * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
   */
  public boolean hasCandidate() {
    return candidate_ != null;
  }
  /**
   * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
   */
  public in.trujobs.proto.CandidateObject getCandidate() {
    return candidate_ == null ? in.trujobs.proto.CandidateObject.getDefaultInstance() : candidate_;
  }
  /**
   * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
   */
  public in.trujobs.proto.CandidateObjectOrBuilder getCandidateOrBuilder() {
    return getCandidate();
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
    if (status_ != in.trujobs.proto.GetCandidateInformationResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (candidate_ != null) {
      output.writeMessage(2, getCandidate());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.GetCandidateInformationResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (candidate_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCandidate());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.GetCandidateInformationResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.GetCandidateInformationResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.GetCandidateInformationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.GetCandidateInformationResponse)
      in.trujobs.proto.GetCandidateInformationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetCandidateInformationResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetCandidateInformationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.GetCandidateInformationResponse.class, in.trujobs.proto.GetCandidateInformationResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.GetCandidateInformationResponse.newBuilder()
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
      status_ = 0;

      if (candidateBuilder_ == null) {
        candidate_ = null;
      } else {
        candidate_ = null;
        candidateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_GetCandidateInformationResponse_descriptor;
    }

    public in.trujobs.proto.GetCandidateInformationResponse getDefaultInstanceForType() {
      return in.trujobs.proto.GetCandidateInformationResponse.getDefaultInstance();
    }

    public in.trujobs.proto.GetCandidateInformationResponse build() {
      in.trujobs.proto.GetCandidateInformationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.GetCandidateInformationResponse buildPartial() {
      in.trujobs.proto.GetCandidateInformationResponse result = new in.trujobs.proto.GetCandidateInformationResponse(this);
      result.status_ = status_;
      if (candidateBuilder_ == null) {
        result.candidate_ = candidate_;
      } else {
        result.candidate_ = candidateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.GetCandidateInformationResponse) {
        return mergeFrom((in.trujobs.proto.GetCandidateInformationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.GetCandidateInformationResponse other) {
      if (other == in.trujobs.proto.GetCandidateInformationResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasCandidate()) {
        mergeCandidate(other.getCandidate());
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
      in.trujobs.proto.GetCandidateInformationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.GetCandidateInformationResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.GetCandidateInformationResponse.Status getStatus() {
      in.trujobs.proto.GetCandidateInformationResponse.Status result = in.trujobs.proto.GetCandidateInformationResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.GetCandidateInformationResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.GetCandidateInformationResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.GetCandidateInformationResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private in.trujobs.proto.CandidateObject candidate_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        in.trujobs.proto.CandidateObject, in.trujobs.proto.CandidateObject.Builder, in.trujobs.proto.CandidateObjectOrBuilder> candidateBuilder_;
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public boolean hasCandidate() {
      return candidateBuilder_ != null || candidate_ != null;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public in.trujobs.proto.CandidateObject getCandidate() {
      if (candidateBuilder_ == null) {
        return candidate_ == null ? in.trujobs.proto.CandidateObject.getDefaultInstance() : candidate_;
      } else {
        return candidateBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public Builder setCandidate(in.trujobs.proto.CandidateObject value) {
      if (candidateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        candidate_ = value;
        onChanged();
      } else {
        candidateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public Builder setCandidate(
        in.trujobs.proto.CandidateObject.Builder builderForValue) {
      if (candidateBuilder_ == null) {
        candidate_ = builderForValue.build();
        onChanged();
      } else {
        candidateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public Builder mergeCandidate(in.trujobs.proto.CandidateObject value) {
      if (candidateBuilder_ == null) {
        if (candidate_ != null) {
          candidate_ =
            in.trujobs.proto.CandidateObject.newBuilder(candidate_).mergeFrom(value).buildPartial();
        } else {
          candidate_ = value;
        }
        onChanged();
      } else {
        candidateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public Builder clearCandidate() {
      if (candidateBuilder_ == null) {
        candidate_ = null;
        onChanged();
      } else {
        candidate_ = null;
        candidateBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public in.trujobs.proto.CandidateObject.Builder getCandidateBuilder() {
      
      onChanged();
      return getCandidateFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    public in.trujobs.proto.CandidateObjectOrBuilder getCandidateOrBuilder() {
      if (candidateBuilder_ != null) {
        return candidateBuilder_.getMessageOrBuilder();
      } else {
        return candidate_ == null ?
            in.trujobs.proto.CandidateObject.getDefaultInstance() : candidate_;
      }
    }
    /**
     * <code>optional .in.trujobs.proto.CandidateObject candidate = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        in.trujobs.proto.CandidateObject, in.trujobs.proto.CandidateObject.Builder, in.trujobs.proto.CandidateObjectOrBuilder> 
        getCandidateFieldBuilder() {
      if (candidateBuilder_ == null) {
        candidateBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            in.trujobs.proto.CandidateObject, in.trujobs.proto.CandidateObject.Builder, in.trujobs.proto.CandidateObjectOrBuilder>(
                getCandidate(),
                getParentForChildren(),
                isClean());
        candidate_ = null;
      }
      return candidateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.GetCandidateInformationResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.GetCandidateInformationResponse)
  private static final in.trujobs.proto.GetCandidateInformationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.GetCandidateInformationResponse();
  }

  public static in.trujobs.proto.GetCandidateInformationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCandidateInformationResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCandidateInformationResponse>() {
    public GetCandidateInformationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new GetCandidateInformationResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<GetCandidateInformationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCandidateInformationResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.GetCandidateInformationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

