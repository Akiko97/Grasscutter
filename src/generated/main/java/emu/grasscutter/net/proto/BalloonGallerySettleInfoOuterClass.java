// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BalloonGallerySettleInfo.proto

package emu.grasscutter.net.proto;

public final class BalloonGallerySettleInfoOuterClass {
  private BalloonGallerySettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BalloonGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BalloonGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 owner_uid = 2;</code>
     * @return The ownerUid.
     */
    int getOwnerUid();

    /**
     * <code>.GalleryStopReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.GalleryStopReason reason = 7;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason();

    /**
     * <code>uint32 hit_count = 13;</code>
     * @return The hitCount.
     */
    int getHitCount();
  }
  /**
   * Protobuf type {@code BalloonGallerySettleInfo}
   */
  public static final class BalloonGallerySettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BalloonGallerySettleInfo)
      BalloonGallerySettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BalloonGallerySettleInfo.newBuilder() to construct.
    private BalloonGallerySettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BalloonGallerySettleInfo() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BalloonGallerySettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BalloonGallerySettleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 16: {

              ownerUid_ = input.readUInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 96: {

              score_ = input.readUInt32();
              break;
            }
            case 104: {

              hitCount_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonGallerySettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonGallerySettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.class, emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 12;
    private int score_;
    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int OWNER_UID_FIELD_NUMBER = 2;
    private int ownerUid_;
    /**
     * <code>uint32 owner_uid = 2;</code>
     * @return The ownerUid.
     */
    @java.lang.Override
    public int getOwnerUid() {
      return ownerUid_;
    }

    public static final int REASON_FIELD_NUMBER = 7;
    private int reason_;
    /**
     * <code>.GalleryStopReason reason = 7;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.GalleryStopReason reason = 7;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
    }

    public static final int HIT_COUNT_FIELD_NUMBER = 13;
    private int hitCount_;
    /**
     * <code>uint32 hit_count = 13;</code>
     * @return The hitCount.
     */
    @java.lang.Override
    public int getHitCount() {
      return hitCount_;
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
      if (ownerUid_ != 0) {
        output.writeUInt32(2, ownerUid_);
      }
      if (reason_ != emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        output.writeEnum(7, reason_);
      }
      if (score_ != 0) {
        output.writeUInt32(12, score_);
      }
      if (hitCount_ != 0) {
        output.writeUInt32(13, hitCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ownerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, ownerUid_);
      }
      if (reason_ != emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.GALLERY_STOP_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, reason_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, score_);
      }
      if (hitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, hitCount_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo other = (emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getOwnerUid()
          != other.getOwnerUid()) return false;
      if (reason_ != other.reason_) return false;
      if (getHitCount()
          != other.getHitCount()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + OWNER_UID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerUid();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + HIT_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getHitCount();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo prototype) {
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
     * Protobuf type {@code BalloonGallerySettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BalloonGallerySettleInfo)
        emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.class, emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        score_ = 0;

        ownerUid_ = 0;

        reason_ = 0;

        hitCount_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonGallerySettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo build() {
        emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo buildPartial() {
        emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo result = new emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo(this);
        result.score_ = score_;
        result.ownerUid_ = ownerUid_;
        result.reason_ = reason_;
        result.hitCount_ = hitCount_;
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo other) {
        if (other == emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getOwnerUid() != 0) {
          setOwnerUid(other.getOwnerUid());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getHitCount() != 0) {
          setHitCount(other.getHitCount());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 12;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int ownerUid_ ;
      /**
       * <code>uint32 owner_uid = 2;</code>
       * @return The ownerUid.
       */
      @java.lang.Override
      public int getOwnerUid() {
        return ownerUid_;
      }
      /**
       * <code>uint32 owner_uid = 2;</code>
       * @param value The ownerUid to set.
       * @return This builder for chaining.
       */
      public Builder setOwnerUid(int value) {
        
        ownerUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 owner_uid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearOwnerUid() {
        
        ownerUid_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.GalleryStopReason reason = 7;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.GalleryStopReason reason = 7;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 7;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason result = emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStopReason reason = 7;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.GalleryStopReasonOuterClass.GalleryStopReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStopReason reason = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int hitCount_ ;
      /**
       * <code>uint32 hit_count = 13;</code>
       * @return The hitCount.
       */
      @java.lang.Override
      public int getHitCount() {
        return hitCount_;
      }
      /**
       * <code>uint32 hit_count = 13;</code>
       * @param value The hitCount to set.
       * @return This builder for chaining.
       */
      public Builder setHitCount(int value) {
        
        hitCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 hit_count = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearHitCount() {
        
        hitCount_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:BalloonGallerySettleInfo)
    }

    // @@protoc_insertion_point(class_scope:BalloonGallerySettleInfo)
    private static final emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo();
    }

    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BalloonGallerySettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<BalloonGallerySettleInfo>() {
      @java.lang.Override
      public BalloonGallerySettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BalloonGallerySettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BalloonGallerySettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BalloonGallerySettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BalloonGallerySettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BalloonGallerySettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BalloonGallerySettleInfo.proto\032\027Galler" +
      "yStopReason.proto\"s\n\030BalloonGallerySettl" +
      "eInfo\022\r\n\005score\030\014 \001(\r\022\021\n\towner_uid\030\002 \001(\r\022" +
      "\"\n\006reason\030\007 \001(\0162\022.GalleryStopReason\022\021\n\th" +
      "it_count\030\r \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GalleryStopReasonOuterClass.getDescriptor(),
        });
    internal_static_BalloonGallerySettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BalloonGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BalloonGallerySettleInfo_descriptor,
        new java.lang.String[] { "Score", "OwnerUid", "Reason", "HitCount", });
    emu.grasscutter.net.proto.GalleryStopReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}