// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

/**
 * Protobuf type {@code in.trujobs.proto.LogInResponse}
 */
public  final class LogInResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:in.trujobs.proto.LogInResponse)
    LogInResponseOrBuilder {
  // Use LogInResponse.newBuilder() to construct.
  private LogInResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private LogInResponse() {
    status_ = 0;
    leadId_ = 0L;
    candidateId_ = 0L;
    candidateGender_ = 0;
    candidateFirstName_ = "";
    candidateLastName_ = "";
    candidateIsAssessed_ = 0;
    sessionId_ = "";
    sessionExpiryMillis_ = 0L;
    minProfile_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private LogInResponse(
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

            leadId_ = input.readInt64();
            break;
          }
          case 24: {

            candidateId_ = input.readInt64();
            break;
          }
          case 32: {

            candidateGender_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            candidateFirstName_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            candidateLastName_ = s;
            break;
          }
          case 56: {

            candidateIsAssessed_ = input.readInt32();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionId_ = s;
            break;
          }
          case 72: {

            sessionExpiryMillis_ = input.readInt64();
            break;
          }
          case 80: {

            minProfile_ = input.readInt32();
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
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.trujobs.proto.LogInResponse.class, in.trujobs.proto.LogInResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code in.trujobs.proto.LogInResponse.Status}
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
    /**
     * <code>NO_USER = 3;</code>
     */
    NO_USER(3, 3),
    /**
     * <code>WRONG_PASSWORD = 4;</code>
     */
    WRONG_PASSWORD(4, 4),
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
    /**
     * <code>NO_USER = 3;</code>
     */
    public static final int NO_USER_VALUE = 3;
    /**
     * <code>WRONG_PASSWORD = 4;</code>
     */
    public static final int WRONG_PASSWORD_VALUE = 4;


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
        case 3: return NO_USER;
        case 4: return WRONG_PASSWORD;
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
      return in.trujobs.proto.LogInResponse.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:in.trujobs.proto.LogInResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
   */
  public in.trujobs.proto.LogInResponse.Status getStatus() {
    in.trujobs.proto.LogInResponse.Status result = in.trujobs.proto.LogInResponse.Status.valueOf(status_);
    return result == null ? in.trujobs.proto.LogInResponse.Status.UNRECOGNIZED : result;
  }

  public static final int LEADID_FIELD_NUMBER = 2;
  private long leadId_;
  /**
   * <code>optional int64 leadId = 2;</code>
   */
  public long getLeadId() {
    return leadId_;
  }

  public static final int CANDIDATEID_FIELD_NUMBER = 3;
  private long candidateId_;
  /**
   * <code>optional int64 candidateId = 3;</code>
   */
  public long getCandidateId() {
    return candidateId_;
  }

  public static final int CANDIDATEGENDER_FIELD_NUMBER = 4;
  private int candidateGender_;
  /**
   * <code>optional int32 candidateGender = 4;</code>
   */
  public int getCandidateGender() {
    return candidateGender_;
  }

  public static final int CANDIDATEFIRSTNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object candidateFirstName_;
  /**
   * <code>optional string candidateFirstName = 5;</code>
   */
  public java.lang.String getCandidateFirstName() {
    java.lang.Object ref = candidateFirstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateFirstName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string candidateFirstName = 5;</code>
   */
  public com.google.protobuf.ByteString
      getCandidateFirstNameBytes() {
    java.lang.Object ref = candidateFirstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateFirstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CANDIDATELASTNAME_FIELD_NUMBER = 6;
  private volatile java.lang.Object candidateLastName_;
  /**
   * <code>optional string candidateLastName = 6;</code>
   */
  public java.lang.String getCandidateLastName() {
    java.lang.Object ref = candidateLastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateLastName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string candidateLastName = 6;</code>
   */
  public com.google.protobuf.ByteString
      getCandidateLastNameBytes() {
    java.lang.Object ref = candidateLastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateLastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CANDIDATEISASSESSED_FIELD_NUMBER = 7;
  private int candidateIsAssessed_;
  /**
   * <code>optional int32 candidateIsAssessed = 7;</code>
   */
  public int getCandidateIsAssessed() {
    return candidateIsAssessed_;
  }

  public static final int SESSION_ID_FIELD_NUMBER = 8;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>optional string session_id = 8;</code>
   */
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string session_id = 8;</code>
   */
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSION_EXPIRY_MILLIS_FIELD_NUMBER = 9;
  private long sessionExpiryMillis_;
  /**
   * <code>optional int64 session_expiry_millis = 9;</code>
   */
  public long getSessionExpiryMillis() {
    return sessionExpiryMillis_;
  }

  public static final int MINPROFILE_FIELD_NUMBER = 10;
  private int minProfile_;
  /**
   * <code>optional int32 minProfile = 10;</code>
   */
  public int getMinProfile() {
    return minProfile_;
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
    if (status_ != in.trujobs.proto.LogInResponse.Status.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (leadId_ != 0L) {
      output.writeInt64(2, leadId_);
    }
    if (candidateId_ != 0L) {
      output.writeInt64(3, candidateId_);
    }
    if (candidateGender_ != 0) {
      output.writeInt32(4, candidateGender_);
    }
    if (!getCandidateFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, candidateFirstName_);
    }
    if (!getCandidateLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 6, candidateLastName_);
    }
    if (candidateIsAssessed_ != 0) {
      output.writeInt32(7, candidateIsAssessed_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 8, sessionId_);
    }
    if (sessionExpiryMillis_ != 0L) {
      output.writeInt64(9, sessionExpiryMillis_);
    }
    if (minProfile_ != 0) {
      output.writeInt32(10, minProfile_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != in.trujobs.proto.LogInResponse.Status.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (leadId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, leadId_);
    }
    if (candidateId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, candidateId_);
    }
    if (candidateGender_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, candidateGender_);
    }
    if (!getCandidateFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, candidateFirstName_);
    }
    if (!getCandidateLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(6, candidateLastName_);
    }
    if (candidateIsAssessed_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(7, candidateIsAssessed_);
    }
    if (!getSessionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(8, sessionId_);
    }
    if (sessionExpiryMillis_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, sessionExpiryMillis_);
    }
    if (minProfile_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(10, minProfile_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static in.trujobs.proto.LogInResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.LogInResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static in.trujobs.proto.LogInResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static in.trujobs.proto.LogInResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.trujobs.proto.LogInResponse prototype) {
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
   * Protobuf type {@code in.trujobs.proto.LogInResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:in.trujobs.proto.LogInResponse)
      in.trujobs.proto.LogInResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.trujobs.proto.LogInResponse.class, in.trujobs.proto.LogInResponse.Builder.class);
    }

    // Construct using in.trujobs.proto.LogInResponse.newBuilder()
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

      leadId_ = 0L;

      candidateId_ = 0L;

      candidateGender_ = 0;

      candidateFirstName_ = "";

      candidateLastName_ = "";

      candidateIsAssessed_ = 0;

      sessionId_ = "";

      sessionExpiryMillis_ = 0L;

      minProfile_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.trujobs.proto.Gen.internal_static_in_trujobs_proto_LogInResponse_descriptor;
    }

    public in.trujobs.proto.LogInResponse getDefaultInstanceForType() {
      return in.trujobs.proto.LogInResponse.getDefaultInstance();
    }

    public in.trujobs.proto.LogInResponse build() {
      in.trujobs.proto.LogInResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public in.trujobs.proto.LogInResponse buildPartial() {
      in.trujobs.proto.LogInResponse result = new in.trujobs.proto.LogInResponse(this);
      result.status_ = status_;
      result.leadId_ = leadId_;
      result.candidateId_ = candidateId_;
      result.candidateGender_ = candidateGender_;
      result.candidateFirstName_ = candidateFirstName_;
      result.candidateLastName_ = candidateLastName_;
      result.candidateIsAssessed_ = candidateIsAssessed_;
      result.sessionId_ = sessionId_;
      result.sessionExpiryMillis_ = sessionExpiryMillis_;
      result.minProfile_ = minProfile_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.trujobs.proto.LogInResponse) {
        return mergeFrom((in.trujobs.proto.LogInResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.trujobs.proto.LogInResponse other) {
      if (other == in.trujobs.proto.LogInResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getLeadId() != 0L) {
        setLeadId(other.getLeadId());
      }
      if (other.getCandidateId() != 0L) {
        setCandidateId(other.getCandidateId());
      }
      if (other.getCandidateGender() != 0) {
        setCandidateGender(other.getCandidateGender());
      }
      if (!other.getCandidateFirstName().isEmpty()) {
        candidateFirstName_ = other.candidateFirstName_;
        onChanged();
      }
      if (!other.getCandidateLastName().isEmpty()) {
        candidateLastName_ = other.candidateLastName_;
        onChanged();
      }
      if (other.getCandidateIsAssessed() != 0) {
        setCandidateIsAssessed(other.getCandidateIsAssessed());
      }
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      if (other.getSessionExpiryMillis() != 0L) {
        setSessionExpiryMillis(other.getSessionExpiryMillis());
      }
      if (other.getMinProfile() != 0) {
        setMinProfile(other.getMinProfile());
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
      in.trujobs.proto.LogInResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.trujobs.proto.LogInResponse) e.getUnfinishedMessage();
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
     * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
     */
    public in.trujobs.proto.LogInResponse.Status getStatus() {
      in.trujobs.proto.LogInResponse.Status result = in.trujobs.proto.LogInResponse.Status.valueOf(status_);
      return result == null ? in.trujobs.proto.LogInResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
     */
    public Builder setStatus(in.trujobs.proto.LogInResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .in.trujobs.proto.LogInResponse.Status status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private long leadId_ ;
    /**
     * <code>optional int64 leadId = 2;</code>
     */
    public long getLeadId() {
      return leadId_;
    }
    /**
     * <code>optional int64 leadId = 2;</code>
     */
    public Builder setLeadId(long value) {
      
      leadId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 leadId = 2;</code>
     */
    public Builder clearLeadId() {
      
      leadId_ = 0L;
      onChanged();
      return this;
    }

    private long candidateId_ ;
    /**
     * <code>optional int64 candidateId = 3;</code>
     */
    public long getCandidateId() {
      return candidateId_;
    }
    /**
     * <code>optional int64 candidateId = 3;</code>
     */
    public Builder setCandidateId(long value) {
      
      candidateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 candidateId = 3;</code>
     */
    public Builder clearCandidateId() {
      
      candidateId_ = 0L;
      onChanged();
      return this;
    }

    private int candidateGender_ ;
    /**
     * <code>optional int32 candidateGender = 4;</code>
     */
    public int getCandidateGender() {
      return candidateGender_;
    }
    /**
     * <code>optional int32 candidateGender = 4;</code>
     */
    public Builder setCandidateGender(int value) {
      
      candidateGender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 candidateGender = 4;</code>
     */
    public Builder clearCandidateGender() {
      
      candidateGender_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object candidateFirstName_ = "";
    /**
     * <code>optional string candidateFirstName = 5;</code>
     */
    public java.lang.String getCandidateFirstName() {
      java.lang.Object ref = candidateFirstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateFirstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string candidateFirstName = 5;</code>
     */
    public com.google.protobuf.ByteString
        getCandidateFirstNameBytes() {
      java.lang.Object ref = candidateFirstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateFirstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string candidateFirstName = 5;</code>
     */
    public Builder setCandidateFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidateFirstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidateFirstName = 5;</code>
     */
    public Builder clearCandidateFirstName() {
      
      candidateFirstName_ = getDefaultInstance().getCandidateFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidateFirstName = 5;</code>
     */
    public Builder setCandidateFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidateFirstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object candidateLastName_ = "";
    /**
     * <code>optional string candidateLastName = 6;</code>
     */
    public java.lang.String getCandidateLastName() {
      java.lang.Object ref = candidateLastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateLastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string candidateLastName = 6;</code>
     */
    public com.google.protobuf.ByteString
        getCandidateLastNameBytes() {
      java.lang.Object ref = candidateLastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateLastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string candidateLastName = 6;</code>
     */
    public Builder setCandidateLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidateLastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidateLastName = 6;</code>
     */
    public Builder clearCandidateLastName() {
      
      candidateLastName_ = getDefaultInstance().getCandidateLastName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string candidateLastName = 6;</code>
     */
    public Builder setCandidateLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidateLastName_ = value;
      onChanged();
      return this;
    }

    private int candidateIsAssessed_ ;
    /**
     * <code>optional int32 candidateIsAssessed = 7;</code>
     */
    public int getCandidateIsAssessed() {
      return candidateIsAssessed_;
    }
    /**
     * <code>optional int32 candidateIsAssessed = 7;</code>
     */
    public Builder setCandidateIsAssessed(int value) {
      
      candidateIsAssessed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 candidateIsAssessed = 7;</code>
     */
    public Builder clearCandidateIsAssessed() {
      
      candidateIsAssessed_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>optional string session_id = 8;</code>
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string session_id = 8;</code>
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string session_id = 8;</code>
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string session_id = 8;</code>
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string session_id = 8;</code>
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }

    private long sessionExpiryMillis_ ;
    /**
     * <code>optional int64 session_expiry_millis = 9;</code>
     */
    public long getSessionExpiryMillis() {
      return sessionExpiryMillis_;
    }
    /**
     * <code>optional int64 session_expiry_millis = 9;</code>
     */
    public Builder setSessionExpiryMillis(long value) {
      
      sessionExpiryMillis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 session_expiry_millis = 9;</code>
     */
    public Builder clearSessionExpiryMillis() {
      
      sessionExpiryMillis_ = 0L;
      onChanged();
      return this;
    }

    private int minProfile_ ;
    /**
     * <code>optional int32 minProfile = 10;</code>
     */
    public int getMinProfile() {
      return minProfile_;
    }
    /**
     * <code>optional int32 minProfile = 10;</code>
     */
    public Builder setMinProfile(int value) {
      
      minProfile_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 minProfile = 10;</code>
     */
    public Builder clearMinProfile() {
      
      minProfile_ = 0;
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


    // @@protoc_insertion_point(builder_scope:in.trujobs.proto.LogInResponse)
  }

  // @@protoc_insertion_point(class_scope:in.trujobs.proto.LogInResponse)
  private static final in.trujobs.proto.LogInResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.trujobs.proto.LogInResponse();
  }

  public static in.trujobs.proto.LogInResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogInResponse>
      PARSER = new com.google.protobuf.AbstractParser<LogInResponse>() {
    public LogInResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new LogInResponse(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<LogInResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogInResponse> getParserForType() {
    return PARSER;
  }

  public in.trujobs.proto.LogInResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

