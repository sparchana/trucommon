// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public final class Gen {
  private Gen() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_in_trujobs_proto_AddLeadRequest_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_in_trujobs_proto_AddLeadRequest_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_in_trujobs_proto_TestMessage_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_in_trujobs_proto_TestMessage_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_in_trujobs_proto_AddLeadResponse_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_in_trujobs_proto_AddLeadResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tgen.proto\022\020in.trujobs.proto\"6\n\016AddLead" +
      "Request\022\020\n\010leadName\030\001 \001(\t\022\022\n\nleadMobile\030" +
      "\002 \001(\t\"1\n\013TestMessage\022\020\n\010testName\030\001 \001(\t\022\020" +
      "\n\010testPage\030\002 \001(\t\"\270\001\n\017AddLeadResponse\0228\n\006" +
      "status\030\001 \001(\0162(.in.trujobs.proto.AddLeadR" +
      "esponse.Status\"k\n\006Status\022\013\n\007UNKNOWN\020\000\022\013\n" +
      "\007SUCCESS\020\001\022\013\n\007FAILURE\020\002\022\016\n\nNO_ACCOUNT\020\003\022" +
      "\026\n\022PASSWORD_INCORRECT\020\004\022\022\n\016ALREADY_EXIST" +
      "S\020\005B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_in_trujobs_proto_AddLeadRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_in_trujobs_proto_AddLeadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_in_trujobs_proto_AddLeadRequest_descriptor,
        new java.lang.String[] { "LeadName", "LeadMobile", });
    internal_static_in_trujobs_proto_TestMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_in_trujobs_proto_TestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_in_trujobs_proto_TestMessage_descriptor,
        new java.lang.String[] { "TestName", "TestPage", });
    internal_static_in_trujobs_proto_AddLeadResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_in_trujobs_proto_AddLeadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_in_trujobs_proto_AddLeadResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
