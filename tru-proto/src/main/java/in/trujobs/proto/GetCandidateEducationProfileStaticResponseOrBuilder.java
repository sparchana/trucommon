// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface GetCandidateEducationProfileStaticResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.GetCandidateEducationProfileStaticResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .in.trujobs.proto.GetCandidateEducationProfileStaticResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .in.trujobs.proto.GetCandidateEducationProfileStaticResponse.Status status = 1;</code>
   */
  in.trujobs.proto.GetCandidateEducationProfileStaticResponse.Status getStatus();

  /**
   * <code>repeated .in.trujobs.proto.DegreeObject degreeObject = 2;</code>
   */
  java.util.List<in.trujobs.proto.DegreeObject> 
      getDegreeObjectList();
  /**
   * <code>repeated .in.trujobs.proto.DegreeObject degreeObject = 2;</code>
   */
  in.trujobs.proto.DegreeObject getDegreeObject(int index);
  /**
   * <code>repeated .in.trujobs.proto.DegreeObject degreeObject = 2;</code>
   */
  int getDegreeObjectCount();
  /**
   * <code>repeated .in.trujobs.proto.DegreeObject degreeObject = 2;</code>
   */
  java.util.List<? extends in.trujobs.proto.DegreeObjectOrBuilder> 
      getDegreeObjectOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.DegreeObject degreeObject = 2;</code>
   */
  in.trujobs.proto.DegreeObjectOrBuilder getDegreeObjectOrBuilder(
      int index);

  /**
   * <code>repeated .in.trujobs.proto.EducationObject educationObject = 3;</code>
   */
  java.util.List<in.trujobs.proto.EducationObject> 
      getEducationObjectList();
  /**
   * <code>repeated .in.trujobs.proto.EducationObject educationObject = 3;</code>
   */
  in.trujobs.proto.EducationObject getEducationObject(int index);
  /**
   * <code>repeated .in.trujobs.proto.EducationObject educationObject = 3;</code>
   */
  int getEducationObjectCount();
  /**
   * <code>repeated .in.trujobs.proto.EducationObject educationObject = 3;</code>
   */
  java.util.List<? extends in.trujobs.proto.EducationObjectOrBuilder> 
      getEducationObjectOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.EducationObject educationObject = 3;</code>
   */
  in.trujobs.proto.EducationObjectOrBuilder getEducationObjectOrBuilder(
      int index);
}
