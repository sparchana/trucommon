// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface GetCandidateBasicProfileStaticResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.GetCandidateBasicProfileStaticResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.GetCandidateBasicProfileStaticResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.GetCandidateBasicProfileStaticResponse.Status status = 1;</code>
   */
  in.trujobs.proto.GetCandidateBasicProfileStaticResponse.Status getStatus();

  /**
   * <code>repeated .in.trujobs.proto.TimeShiftObject timeShiftList = 2;</code>
   */
  java.util.List<in.trujobs.proto.TimeShiftObject> 
      getTimeShiftListList();
  /**
   * <code>repeated .in.trujobs.proto.TimeShiftObject timeShiftList = 2;</code>
   */
  in.trujobs.proto.TimeShiftObject getTimeShiftList(int index);
  /**
   * <code>repeated .in.trujobs.proto.TimeShiftObject timeShiftList = 2;</code>
   */
  int getTimeShiftListCount();
  /**
   * <code>repeated .in.trujobs.proto.TimeShiftObject timeShiftList = 2;</code>
   */
  java.util.List<? extends in.trujobs.proto.TimeShiftObjectOrBuilder> 
      getTimeShiftListOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.TimeShiftObject timeShiftList = 2;</code>
   */
  in.trujobs.proto.TimeShiftObjectOrBuilder getTimeShiftListOrBuilder(
      int index);
}
