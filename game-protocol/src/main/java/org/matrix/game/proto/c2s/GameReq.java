// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

// Protobuf Java Version: 3.25.1
package org.matrix.game.proto.c2s;

/**
 * Protobuf type {@code GameReq}
 */
public final class GameReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GameReq)
    GameReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameReq.newBuilder() to construct.
  private GameReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GameReq();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.matrix.game.proto.c2s.C2SMsg.internal_static_GameReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.matrix.game.proto.c2s.C2SMsg.internal_static_GameReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.matrix.game.proto.c2s.GameReq.class, org.matrix.game.proto.c2s.GameReq.Builder.class);
  }

  private int payloadCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object payload_;
  public enum PayloadCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TEST(3),
    TEST2(4),
    PAYLOAD_NOT_SET(0);
    private final int value;
    private PayloadCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PayloadCase valueOf(int value) {
      return forNumber(value);
    }

    public static PayloadCase forNumber(int value) {
      switch (value) {
        case 3: return TEST;
        case 4: return TEST2;
        case 0: return PAYLOAD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PayloadCase
  getPayloadCase() {
    return PayloadCase.forNumber(
        payloadCase_);
  }

  public static final int TEST_FIELD_NUMBER = 3;
  /**
   * <code>.Test test = 3;</code>
   * @return Whether the test field is set.
   */
  @java.lang.Override
  public boolean hasTest() {
    return payloadCase_ == 3;
  }
  /**
   * <code>.Test test = 3;</code>
   * @return The test.
   */
  @java.lang.Override
  public org.matrix.game.proto.c2s.Test getTest() {
    if (payloadCase_ == 3) {
       return (org.matrix.game.proto.c2s.Test) payload_;
    }
    return org.matrix.game.proto.c2s.Test.getDefaultInstance();
  }
  /**
   * <code>.Test test = 3;</code>
   */
  @java.lang.Override
  public org.matrix.game.proto.c2s.TestOrBuilder getTestOrBuilder() {
    if (payloadCase_ == 3) {
       return (org.matrix.game.proto.c2s.Test) payload_;
    }
    return org.matrix.game.proto.c2s.Test.getDefaultInstance();
  }

  public static final int TEST2_FIELD_NUMBER = 4;
  /**
   * <code>.Test2 test2 = 4;</code>
   * @return Whether the test2 field is set.
   */
  @java.lang.Override
  public boolean hasTest2() {
    return payloadCase_ == 4;
  }
  /**
   * <code>.Test2 test2 = 4;</code>
   * @return The test2.
   */
  @java.lang.Override
  public org.matrix.game.proto.c2s.Test2 getTest2() {
    if (payloadCase_ == 4) {
       return (org.matrix.game.proto.c2s.Test2) payload_;
    }
    return org.matrix.game.proto.c2s.Test2.getDefaultInstance();
  }
  /**
   * <code>.Test2 test2 = 4;</code>
   */
  @java.lang.Override
  public org.matrix.game.proto.c2s.Test2OrBuilder getTest2OrBuilder() {
    if (payloadCase_ == 4) {
       return (org.matrix.game.proto.c2s.Test2) payload_;
    }
    return org.matrix.game.proto.c2s.Test2.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (payloadCase_ == 3) {
      output.writeMessage(3, (org.matrix.game.proto.c2s.Test) payload_);
    }
    if (payloadCase_ == 4) {
      output.writeMessage(4, (org.matrix.game.proto.c2s.Test2) payload_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (payloadCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (org.matrix.game.proto.c2s.Test) payload_);
    }
    if (payloadCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (org.matrix.game.proto.c2s.Test2) payload_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.matrix.game.proto.c2s.GameReq)) {
      return super.equals(obj);
    }
    org.matrix.game.proto.c2s.GameReq other = (org.matrix.game.proto.c2s.GameReq) obj;

    if (!getPayloadCase().equals(other.getPayloadCase())) return false;
    switch (payloadCase_) {
      case 3:
        if (!getTest()
            .equals(other.getTest())) return false;
        break;
      case 4:
        if (!getTest2()
            .equals(other.getTest2())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (payloadCase_) {
      case 3:
        hash = (37 * hash) + TEST_FIELD_NUMBER;
        hash = (53 * hash) + getTest().hashCode();
        break;
      case 4:
        hash = (37 * hash) + TEST2_FIELD_NUMBER;
        hash = (53 * hash) + getTest2().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.matrix.game.proto.c2s.GameReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.matrix.game.proto.c2s.GameReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.matrix.game.proto.c2s.GameReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.matrix.game.proto.c2s.GameReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GameReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GameReq)
      org.matrix.game.proto.c2s.GameReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.matrix.game.proto.c2s.C2SMsg.internal_static_GameReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.matrix.game.proto.c2s.C2SMsg.internal_static_GameReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.matrix.game.proto.c2s.GameReq.class, org.matrix.game.proto.c2s.GameReq.Builder.class);
    }

    // Construct using org.matrix.game.proto.c2s.GameReq.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (testBuilder_ != null) {
        testBuilder_.clear();
      }
      if (test2Builder_ != null) {
        test2Builder_.clear();
      }
      payloadCase_ = 0;
      payload_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.matrix.game.proto.c2s.C2SMsg.internal_static_GameReq_descriptor;
    }

    @java.lang.Override
    public org.matrix.game.proto.c2s.GameReq getDefaultInstanceForType() {
      return org.matrix.game.proto.c2s.GameReq.getDefaultInstance();
    }

    @java.lang.Override
    public org.matrix.game.proto.c2s.GameReq build() {
      org.matrix.game.proto.c2s.GameReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.matrix.game.proto.c2s.GameReq buildPartial() {
      org.matrix.game.proto.c2s.GameReq result = new org.matrix.game.proto.c2s.GameReq(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.matrix.game.proto.c2s.GameReq result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.matrix.game.proto.c2s.GameReq result) {
      result.payloadCase_ = payloadCase_;
      result.payload_ = this.payload_;
      if (payloadCase_ == 3 &&
          testBuilder_ != null) {
        result.payload_ = testBuilder_.build();
      }
      if (payloadCase_ == 4 &&
          test2Builder_ != null) {
        result.payload_ = test2Builder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.matrix.game.proto.c2s.GameReq) {
        return mergeFrom((org.matrix.game.proto.c2s.GameReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.matrix.game.proto.c2s.GameReq other) {
      if (other == org.matrix.game.proto.c2s.GameReq.getDefaultInstance()) return this;
      switch (other.getPayloadCase()) {
        case TEST: {
          mergeTest(other.getTest());
          break;
        }
        case TEST2: {
          mergeTest2(other.getTest2());
          break;
        }
        case PAYLOAD_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 26: {
              input.readMessage(
                  getTestFieldBuilder().getBuilder(),
                  extensionRegistry);
              payloadCase_ = 3;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getTest2FieldBuilder().getBuilder(),
                  extensionRegistry);
              payloadCase_ = 4;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int payloadCase_ = 0;
    private java.lang.Object payload_;
    public PayloadCase
        getPayloadCase() {
      return PayloadCase.forNumber(
          payloadCase_);
    }

    public Builder clearPayload() {
      payloadCase_ = 0;
      payload_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.game.proto.c2s.Test, org.matrix.game.proto.c2s.Test.Builder, org.matrix.game.proto.c2s.TestOrBuilder> testBuilder_;
    /**
     * <code>.Test test = 3;</code>
     * @return Whether the test field is set.
     */
    @java.lang.Override
    public boolean hasTest() {
      return payloadCase_ == 3;
    }
    /**
     * <code>.Test test = 3;</code>
     * @return The test.
     */
    @java.lang.Override
    public org.matrix.game.proto.c2s.Test getTest() {
      if (testBuilder_ == null) {
        if (payloadCase_ == 3) {
          return (org.matrix.game.proto.c2s.Test) payload_;
        }
        return org.matrix.game.proto.c2s.Test.getDefaultInstance();
      } else {
        if (payloadCase_ == 3) {
          return testBuilder_.getMessage();
        }
        return org.matrix.game.proto.c2s.Test.getDefaultInstance();
      }
    }
    /**
     * <code>.Test test = 3;</code>
     */
    public Builder setTest(org.matrix.game.proto.c2s.Test value) {
      if (testBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        testBuilder_.setMessage(value);
      }
      payloadCase_ = 3;
      return this;
    }
    /**
     * <code>.Test test = 3;</code>
     */
    public Builder setTest(
        org.matrix.game.proto.c2s.Test.Builder builderForValue) {
      if (testBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        testBuilder_.setMessage(builderForValue.build());
      }
      payloadCase_ = 3;
      return this;
    }
    /**
     * <code>.Test test = 3;</code>
     */
    public Builder mergeTest(org.matrix.game.proto.c2s.Test value) {
      if (testBuilder_ == null) {
        if (payloadCase_ == 3 &&
            payload_ != org.matrix.game.proto.c2s.Test.getDefaultInstance()) {
          payload_ = org.matrix.game.proto.c2s.Test.newBuilder((org.matrix.game.proto.c2s.Test) payload_)
              .mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        if (payloadCase_ == 3) {
          testBuilder_.mergeFrom(value);
        } else {
          testBuilder_.setMessage(value);
        }
      }
      payloadCase_ = 3;
      return this;
    }
    /**
     * <code>.Test test = 3;</code>
     */
    public Builder clearTest() {
      if (testBuilder_ == null) {
        if (payloadCase_ == 3) {
          payloadCase_ = 0;
          payload_ = null;
          onChanged();
        }
      } else {
        if (payloadCase_ == 3) {
          payloadCase_ = 0;
          payload_ = null;
        }
        testBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.Test test = 3;</code>
     */
    public org.matrix.game.proto.c2s.Test.Builder getTestBuilder() {
      return getTestFieldBuilder().getBuilder();
    }
    /**
     * <code>.Test test = 3;</code>
     */
    @java.lang.Override
    public org.matrix.game.proto.c2s.TestOrBuilder getTestOrBuilder() {
      if ((payloadCase_ == 3) && (testBuilder_ != null)) {
        return testBuilder_.getMessageOrBuilder();
      } else {
        if (payloadCase_ == 3) {
          return (org.matrix.game.proto.c2s.Test) payload_;
        }
        return org.matrix.game.proto.c2s.Test.getDefaultInstance();
      }
    }
    /**
     * <code>.Test test = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.game.proto.c2s.Test, org.matrix.game.proto.c2s.Test.Builder, org.matrix.game.proto.c2s.TestOrBuilder> 
        getTestFieldBuilder() {
      if (testBuilder_ == null) {
        if (!(payloadCase_ == 3)) {
          payload_ = org.matrix.game.proto.c2s.Test.getDefaultInstance();
        }
        testBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.game.proto.c2s.Test, org.matrix.game.proto.c2s.Test.Builder, org.matrix.game.proto.c2s.TestOrBuilder>(
                (org.matrix.game.proto.c2s.Test) payload_,
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      payloadCase_ = 3;
      onChanged();
      return testBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.game.proto.c2s.Test2, org.matrix.game.proto.c2s.Test2.Builder, org.matrix.game.proto.c2s.Test2OrBuilder> test2Builder_;
    /**
     * <code>.Test2 test2 = 4;</code>
     * @return Whether the test2 field is set.
     */
    @java.lang.Override
    public boolean hasTest2() {
      return payloadCase_ == 4;
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     * @return The test2.
     */
    @java.lang.Override
    public org.matrix.game.proto.c2s.Test2 getTest2() {
      if (test2Builder_ == null) {
        if (payloadCase_ == 4) {
          return (org.matrix.game.proto.c2s.Test2) payload_;
        }
        return org.matrix.game.proto.c2s.Test2.getDefaultInstance();
      } else {
        if (payloadCase_ == 4) {
          return test2Builder_.getMessage();
        }
        return org.matrix.game.proto.c2s.Test2.getDefaultInstance();
      }
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    public Builder setTest2(org.matrix.game.proto.c2s.Test2 value) {
      if (test2Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        test2Builder_.setMessage(value);
      }
      payloadCase_ = 4;
      return this;
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    public Builder setTest2(
        org.matrix.game.proto.c2s.Test2.Builder builderForValue) {
      if (test2Builder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        test2Builder_.setMessage(builderForValue.build());
      }
      payloadCase_ = 4;
      return this;
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    public Builder mergeTest2(org.matrix.game.proto.c2s.Test2 value) {
      if (test2Builder_ == null) {
        if (payloadCase_ == 4 &&
            payload_ != org.matrix.game.proto.c2s.Test2.getDefaultInstance()) {
          payload_ = org.matrix.game.proto.c2s.Test2.newBuilder((org.matrix.game.proto.c2s.Test2) payload_)
              .mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        if (payloadCase_ == 4) {
          test2Builder_.mergeFrom(value);
        } else {
          test2Builder_.setMessage(value);
        }
      }
      payloadCase_ = 4;
      return this;
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    public Builder clearTest2() {
      if (test2Builder_ == null) {
        if (payloadCase_ == 4) {
          payloadCase_ = 0;
          payload_ = null;
          onChanged();
        }
      } else {
        if (payloadCase_ == 4) {
          payloadCase_ = 0;
          payload_ = null;
        }
        test2Builder_.clear();
      }
      return this;
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    public org.matrix.game.proto.c2s.Test2.Builder getTest2Builder() {
      return getTest2FieldBuilder().getBuilder();
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    @java.lang.Override
    public org.matrix.game.proto.c2s.Test2OrBuilder getTest2OrBuilder() {
      if ((payloadCase_ == 4) && (test2Builder_ != null)) {
        return test2Builder_.getMessageOrBuilder();
      } else {
        if (payloadCase_ == 4) {
          return (org.matrix.game.proto.c2s.Test2) payload_;
        }
        return org.matrix.game.proto.c2s.Test2.getDefaultInstance();
      }
    }
    /**
     * <code>.Test2 test2 = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.matrix.game.proto.c2s.Test2, org.matrix.game.proto.c2s.Test2.Builder, org.matrix.game.proto.c2s.Test2OrBuilder> 
        getTest2FieldBuilder() {
      if (test2Builder_ == null) {
        if (!(payloadCase_ == 4)) {
          payload_ = org.matrix.game.proto.c2s.Test2.getDefaultInstance();
        }
        test2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.matrix.game.proto.c2s.Test2, org.matrix.game.proto.c2s.Test2.Builder, org.matrix.game.proto.c2s.Test2OrBuilder>(
                (org.matrix.game.proto.c2s.Test2) payload_,
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      payloadCase_ = 4;
      onChanged();
      return test2Builder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GameReq)
  }

  // @@protoc_insertion_point(class_scope:GameReq)
  private static final org.matrix.game.proto.c2s.GameReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.matrix.game.proto.c2s.GameReq();
  }

  public static org.matrix.game.proto.c2s.GameReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameReq>
      PARSER = new com.google.protobuf.AbstractParser<GameReq>() {
    @java.lang.Override
    public GameReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GameReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.matrix.game.proto.c2s.GameReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
