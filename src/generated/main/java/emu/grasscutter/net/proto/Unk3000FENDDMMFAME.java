// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_FENDDMMFAME.proto

package emu.grasscutter.net.proto;

public final class Unk3000FENDDMMFAME {
  private Unk3000FENDDMMFAME() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_FENDDMMFAMEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_FENDDMMFAME)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 9;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 15;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    int getUnk3250PPIHJFNMEFB();

    /**
     * <code>uint32 Unk3250_AMEEFGKPPFA = 7;</code>
     * @return The unk3250AMEEFGKPPFA.
     */
    int getUnk3250AMEEFGKPPFA();
  }
  /**
   * Protobuf type {@code Unk3000_FENDDMMFAME}
   */
  public static final class Unk3000_FENDDMMFAME extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_FENDDMMFAME)
      Unk3000_FENDDMMFAMEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_FENDDMMFAME.newBuilder() to construct.
    private Unk3000_FENDDMMFAME(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_FENDDMMFAME() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_FENDDMMFAME();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_FENDDMMFAME(
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
            case 48: {

              isOpen_ = input.readBool();
              break;
            }
            case 56: {

              unk3250AMEEFGKPPFA_ = input.readUInt32();
              break;
            }
            case 72: {

              isFinished_ = input.readBool();
              break;
            }
            case 120: {

              unk3250PPIHJFNMEFB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3000FENDDMMFAME.internal_static_Unk3000_FENDDMMFAME_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3000FENDDMMFAME.internal_static_Unk3000_FENDDMMFAME_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.class, emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 9;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 9;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 6;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int UNK3250_PPIHJFNMEFB_FIELD_NUMBER = 15;
    private int unk3250PPIHJFNMEFB_;
    /**
     * <code>uint32 Unk3250_PPIHJFNMEFB = 15;</code>
     * @return The unk3250PPIHJFNMEFB.
     */
    @java.lang.Override
    public int getUnk3250PPIHJFNMEFB() {
      return unk3250PPIHJFNMEFB_;
    }

    public static final int UNK3250_AMEEFGKPPFA_FIELD_NUMBER = 7;
    private int unk3250AMEEFGKPPFA_;
    /**
     * <code>uint32 Unk3250_AMEEFGKPPFA = 7;</code>
     * @return The unk3250AMEEFGKPPFA.
     */
    @java.lang.Override
    public int getUnk3250AMEEFGKPPFA() {
      return unk3250AMEEFGKPPFA_;
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
      if (isOpen_ != false) {
        output.writeBool(6, isOpen_);
      }
      if (unk3250AMEEFGKPPFA_ != 0) {
        output.writeUInt32(7, unk3250AMEEFGKPPFA_);
      }
      if (isFinished_ != false) {
        output.writeBool(9, isFinished_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        output.writeUInt32(15, unk3250PPIHJFNMEFB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isOpen_);
      }
      if (unk3250AMEEFGKPPFA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3250AMEEFGKPPFA_);
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isFinished_);
      }
      if (unk3250PPIHJFNMEFB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, unk3250PPIHJFNMEFB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME other = (emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getUnk3250PPIHJFNMEFB()
          != other.getUnk3250PPIHJFNMEFB()) return false;
      if (getUnk3250AMEEFGKPPFA()
          != other.getUnk3250AMEEFGKPPFA()) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + UNK3250_PPIHJFNMEFB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PPIHJFNMEFB();
      hash = (37 * hash) + UNK3250_AMEEFGKPPFA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250AMEEFGKPPFA();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME prototype) {
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
     * Protobuf type {@code Unk3000_FENDDMMFAME}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_FENDDMMFAME)
        emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3000FENDDMMFAME.internal_static_Unk3000_FENDDMMFAME_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3000FENDDMMFAME.internal_static_Unk3000_FENDDMMFAME_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.class, emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.newBuilder()
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
        isFinished_ = false;

        isOpen_ = false;

        unk3250PPIHJFNMEFB_ = 0;

        unk3250AMEEFGKPPFA_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3000FENDDMMFAME.internal_static_Unk3000_FENDDMMFAME_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME build() {
        emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME buildPartial() {
        emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME result = new emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME(this);
        result.isFinished_ = isFinished_;
        result.isOpen_ = isOpen_;
        result.unk3250PPIHJFNMEFB_ = unk3250PPIHJFNMEFB_;
        result.unk3250AMEEFGKPPFA_ = unk3250AMEEFGKPPFA_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME other) {
        if (other == emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getUnk3250PPIHJFNMEFB() != 0) {
          setUnk3250PPIHJFNMEFB(other.getUnk3250PPIHJFNMEFB());
        }
        if (other.getUnk3250AMEEFGKPPFA() != 0) {
          setUnk3250AMEEFGKPPFA(other.getUnk3250AMEEFGKPPFA());
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
        emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 9;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 9;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 6;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int unk3250PPIHJFNMEFB_ ;
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 15;</code>
       * @return The unk3250PPIHJFNMEFB.
       */
      @java.lang.Override
      public int getUnk3250PPIHJFNMEFB() {
        return unk3250PPIHJFNMEFB_;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 15;</code>
       * @param value The unk3250PPIHJFNMEFB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PPIHJFNMEFB(int value) {
        
        unk3250PPIHJFNMEFB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PPIHJFNMEFB = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PPIHJFNMEFB() {
        
        unk3250PPIHJFNMEFB_ = 0;
        onChanged();
        return this;
      }

      private int unk3250AMEEFGKPPFA_ ;
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 7;</code>
       * @return The unk3250AMEEFGKPPFA.
       */
      @java.lang.Override
      public int getUnk3250AMEEFGKPPFA() {
        return unk3250AMEEFGKPPFA_;
      }
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 7;</code>
       * @param value The unk3250AMEEFGKPPFA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250AMEEFGKPPFA(int value) {
        
        unk3250AMEEFGKPPFA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_AMEEFGKPPFA = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250AMEEFGKPPFA() {
        
        unk3250AMEEFGKPPFA_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_FENDDMMFAME)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_FENDDMMFAME)
    private static final emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME();
    }

    public static emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_FENDDMMFAME>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_FENDDMMFAME>() {
      @java.lang.Override
      public Unk3000_FENDDMMFAME parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_FENDDMMFAME(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_FENDDMMFAME> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_FENDDMMFAME> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_FENDDMMFAME_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_FENDDMMFAME_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_FENDDMMFAME.proto\"u\n\023Unk3000_F" +
      "ENDDMMFAME\022\023\n\013is_finished\030\t \001(\010\022\017\n\007is_op" +
      "en\030\006 \001(\010\022\033\n\023Unk3250_PPIHJFNMEFB\030\017 \001(\r\022\033\n" +
      "\023Unk3250_AMEEFGKPPFA\030\007 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3000_FENDDMMFAME_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_FENDDMMFAME_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_FENDDMMFAME_descriptor,
        new java.lang.String[] { "IsFinished", "IsOpen", "Unk3250PPIHJFNMEFB", "Unk3250AMEEFGKPPFA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}