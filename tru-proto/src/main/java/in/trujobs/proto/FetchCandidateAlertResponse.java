// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.FetchCandidateAlertResponse}
 */
public  final class FetchCandidateAlertResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.FetchCandidateAlertResponse)
    FetchCandidateAlertResponseOrBuilder {
  // Use FetchCandidateAlertResponse.newBuilder() to construct.
  private FetchCandidateAlertResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FetchCandidateAlertResponse() {
    status_ = 0;
    alertType_ = 0;
    alertMessage_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private FetchCandidateAlertResponse(
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
          case 16: {
            int rawValue = input.readEnum();

            alertType_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            alertMessage_ = s;
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FetchCandidateAlertResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FetchCandidateAlertResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.FetchCandidateAlertResponse.class, in.trujobs.proto.FetchCandidateAlertResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.FetchCandidateAlertResponse.Status}
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
      return in.trujobs.proto.FetchCandidateAlertResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.FetchCandidateAlertResponse.Status)
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.FetchCandidateAlertResponse.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DEFAULT = 0;</code>
     */
    DEFAULT(0, 0),
    /**
     * <code>COMPLETE_PROFILE = 1;</code>
     */
    COMPLETE_PROFILE(1, 1),
    /**
     * <code>INTERVIEW_SCHEDULED = 2;</code>
     */
    INTERVIEW_SCHEDULED(2, 2),
    /**
     * <code>JOINING_DATE_CONFIRMED = 3;</code>
     */
    JOINING_DATE_CONFIRMED(3, 3),
    /**
     * <code>PROFILE_DEACTIVATED = 4;</code>
     */
    PROFILE_DEACTIVATED(4, 4),
    /**
     * <code>NEW_JOBS_IN_LOCALITY = 5;</code>
     */
    NEW_JOBS_IN_LOCALITY(5, 5),
    /**
     * <code>COMPLETE_ASSESSMENT = 6;</code>
     */
    COMPLETE_ASSESSMENT(6, 6),
    UNRECOGNIZED(-1, -1),
    ;

    /**
     * <code>DEFAULT = 0;</code>
     */
    public static final int DEFAULT_VALUE = 0;
    /**
     * <code>COMPLETE_PROFILE = 1;</code>
     */
    public static final int COMPLETE_PROFILE_VALUE = 1;
    /**
     * <code>INTERVIEW_SCHEDULED = 2;</code>
     */
    public static final int INTERVIEW_SCHEDULED_VALUE = 2;
    /**
     * <code>JOINING_DATE_CONFIRMED = 3;</code>
     */
    public static final int JOINING_DATE_CONFIRMED_VALUE = 3;
    /**
     * <code>PROFILE_DEACTIVATED = 4;</code>
     */
    public static final int PROFILE_DEACTIVATED_VALUE = 4;
    /**
     * <code>NEW_JOBS_IN_LOCALITY = 5;</code>
     */
    public static final int NEW_JOBS_IN_LOCALITY_VALUE = 5;
    /**
     * <code>COMPLETE_ASSESSMENT = 6;</code>
     */
    public static final int COMPLETE_ASSESSMENT_VALUE = 6;


    public final int getNumber() {
      if (index == -1) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    public static Type valueOf(int value) {
      switch (value) {
        case 0: return DEFAULT;
        case 1: return COMPLETE_PROFILE;
        case 2: return INTERVIEW_SCHEDULED;
        case 3: return JOINING_DATE_CONFIRMED;
        case 4: return PROFILE_DEACTIVATED;
        case 5: return NEW_JOBS_IN_LOCALITY;
        case 6: return COMPLETE_ASSESSMENT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.valueOf(number);
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
      return in.trujobs.proto.FetchCandidateAlertResponse.getDescriptor().getEnumTypes().get(1);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.FetchCandidateAlertResponse.Type)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.FetchCandidateAlertResponse.Status getStatus() {
    in.trujobs.proto.FetchCandidateAlertResponse.Status result = in.trujobs.proto.FetchCandidateAlertResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.FetchCandidateAlertResponse.Status.UNRECOGNIZED : result;
  }

  public static final int ALERTTYPE_FIELD_NUMBER = 2;
  private int alertType_;
  /**
   * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
   */
  public int getAlertTypeValue() {
    return alertType_;
  }
  /**
   * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
   */
  public in.trujobs.proto.FetchCandidateAlertResponse.Type getAlertType() {
    in.trujobs.proto.FetchCandidateAlertResponse.Type result = in.trujobs.proto.FetchCandidateAlertResponse.Type.valueOf(alertType_);
    return result == null ? in.trujobs.proto.FetchCandidateAlertResponse.Type.UNRECOGNIZED : result;
  }

  public static final int ALERTMESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object alertMessage_;
  /**
   * <code>optional string alertMessage = 3;</code>
   */
  public java.lang.String getAlertMessage() {
    java.lang.Object ref = alertMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alertMessage_ = s;
      return s;
    }
  }
  /**
   * <code>optional string alertMessage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAlertMessageBytes() {
    java.lang.Object ref = alertMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alertMessage_ = b;
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
    if (status_ != in.trujobs.proto.FetchCandidateAlertResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (alertType_ != in.trujobs.proto.FetchCandidateAlertResponse.Type.DEFAULT.getNumber()) {
      output.writeEnum(2, alertType_);
    }
    if (!getAlertMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, alertMessage_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.FetchCandidateAlertResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (alertType_ != in.trujobs.proto.FetchCandidateAlertResponse.Type.DEFAULT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, alertType_);
    }
    if (!getAlertMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, alertMessage_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.FetchCandidateAlertResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.FetchCandidateAlertResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.FetchCandidateAlertResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.FetchCandidateAlertResponse)
      in.trujobs.proto.FetchCandidateAlertResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FetchCandidateAlertResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FetchCandidateAlertResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.FetchCandidateAlertResponse.class, in.trujobs.proto.FetchCandidateAlertResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.FetchCandidateAlertResponse.newBuilder()
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

      alertType_ = 0;

      alertMessage_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_FetchCandidateAlertResponse_descriptor;
    }

    public in.trujobs.proto.FetchCandidateAlertResponse getDefaultInstanceForType() {
      return in.trujobs.proto.FetchCandidateAlertResponse.getDefaultInstance();
    }

    public in.trujobs.proto.FetchCandidateAlertResponse build() {
      in.trujobs.proto.FetchCandidateAlertResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.FetchCandidateAlertResponse buildPartial() {
      in.trujobs.proto.FetchCandidateAlertResponse result = new in.trujobs.proto.FetchCandidateAlertResponse(this);
      result.status_ = status_;
      result.alertType_ = alertType_;
      result.alertMessage_ = alertMessage_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.FetchCandidateAlertResponse) {
        return mergeFrom((in.trujobs.proto.FetchCandidateAlertResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.FetchCandidateAlertResponse other) {
      if (other == in.trujobs.proto.FetchCandidateAlertResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.alertType_ != 0) {
        setAlertTypeValue(other.getAlertTypeValue());
      }
      if (!other.getAlertMessage().isEmpty()) {
        alertMessage_ = other.alertMessage_;
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
      in.trujobs.proto.FetchCandidateAlertResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.FetchCandidateAlertResponse) e.getUnfinishedMessage();
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
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.FetchCandidateAlertResponse.Status getStatus() {
      in.trujobs.proto.FetchCandidateAlertResponse.Status result = in.trujobs.proto.FetchCandidateAlertResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.FetchCandidateAlertResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.FetchCandidateAlertResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int alertType_ = 0;
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
     */
    public int getAlertTypeValue() {
      return alertType_;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
     */
    public Builder setAlertTypeValue(int value) {
      alertType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
     */
    public in.trujobs.proto.FetchCandidateAlertResponse.Type getAlertType() {
      in.trujobs.proto.FetchCandidateAlertResponse.Type result = in.trujobs.proto.FetchCandidateAlertResponse.Type.valueOf(alertType_);
      return result == null ? in.trujobs.proto.FetchCandidateAlertResponse.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
     */
    public Builder setAlertType(in.trujobs.proto.FetchCandidateAlertResponse.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      alertType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.FetchCandidateAlertResponse.Type alertType = 2;</code>
     */
    public Builder clearAlertType() {
      
      alertType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object alertMessage_ = "";
    /**
     * <code>optional string alertMessage = 3;</code>
     */
    public java.lang.String getAlertMessage() {
      java.lang.Object ref = alertMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alertMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string alertMessage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAlertMessageBytes() {
      java.lang.Object ref = alertMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alertMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string alertMessage = 3;</code>
     */
    public Builder setAlertMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alertMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string alertMessage = 3;</code>
     */
    public Builder clearAlertMessage() {
      
      alertMessage_ = getDefaultInstance().getAlertMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string alertMessage = 3;</code>
     */
    public Builder setAlertMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alertMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.FetchCandidateAlertResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.FetchCandidateAlertResponse)
  private static final in.trujobs.proto.FetchCandidateAlertResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.FetchCandidateAlertResponse();
  }

  public static in.trujobs.proto.FetchCandidateAlertResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchCandidateAlertResponse>
      PARSER = new com.google.protobuf.AbstractParser<FetchCandidateAlertResponse>() {
    public FetchCandidateAlertResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new FetchCandidateAlertResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<FetchCandidateAlertResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchCandidateAlertResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.FetchCandidateAlertResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

