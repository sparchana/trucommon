// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gen.proto

package in.trujobs.proto;

public interface PreScreenLanguageObjectOrBuilder extends
    // @@protoc_insertion_point(interface_extends:in.trujobs.proto.PreScreenLanguageObject)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  java.util.List<in.trujobs.proto.LanguageObject> 
      getJobPostLanguageList();
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  in.trujobs.proto.LanguageObject getJobPostLanguage(int index);
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  int getJobPostLanguageCount();
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  java.util.List<? extends in.trujobs.proto.LanguageObjectOrBuilder> 
      getJobPostLanguageOrBuilderList();
  /**
   * <code>repeated .in.trujobs.proto.LanguageObject jobPostLanguage = 1;</code>
   */
  in.trujobs.proto.LanguageObjectOrBuilder getJobPostLanguageOrBuilder(
      int index);

  /**
   * <code>optional bool isMatching = 2;</code>
   */
  boolean getIsMatching();

  /**
   * <code>optional int32 propertyId = 3;</code>
   */
  int getPropertyId();

  /**
   * <code>optional string propertyTitle = 4;</code>
   */
  java.lang.String getPropertyTitle();
  /**
   * <code>optional string propertyTitle = 4;</code>
   */
  com.google.protobuf.ByteString
      getPropertyTitleBytes();
}