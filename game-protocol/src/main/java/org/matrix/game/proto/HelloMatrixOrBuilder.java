// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

// Protobuf Java Version: 3.25.1
package org.matrix.game.proto;

public interface HelloMatrixOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HelloMatrix)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Test test = 3;</code>
   * @return Whether the test field is set.
   */
  boolean hasTest();
  /**
   * <code>.Test test = 3;</code>
   * @return The test.
   */
  org.matrix.game.proto.Test getTest();
  /**
   * <code>.Test test = 3;</code>
   */
  org.matrix.game.proto.TestOrBuilder getTestOrBuilder();

  /**
   * <code>.Test2 test2 = 4;</code>
   * @return Whether the test2 field is set.
   */
  boolean hasTest2();
  /**
   * <code>.Test2 test2 = 4;</code>
   * @return The test2.
   */
  org.matrix.game.proto.Test2 getTest2();
  /**
   * <code>.Test2 test2 = 4;</code>
   */
  org.matrix.game.proto.Test2OrBuilder getTest2OrBuilder();

  org.matrix.game.proto.HelloMatrix.PayloadCase getPayloadCase();
}
