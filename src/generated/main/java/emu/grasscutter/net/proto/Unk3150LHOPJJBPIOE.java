// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_LHOPJJBPIOE.proto

package emu.grasscutter.net.proto;

public final class Unk3150LHOPJJBPIOE {
  private Unk3150LHOPJJBPIOE() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_LHOPJJBPIOEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_LHOPJJBPIOE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_IOANLJBMBAI = 4;</code>
     * @return The unk3250IOANLJBMBAI.
     */
    int getUnk3250IOANLJBMBAI();

    /**
     * <code>uint32 Unk3250_PGJKEICFKLL = 5;</code>
     * @return The unk3250PGJKEICFKLL.
     */
    int getUnk3250PGJKEICFKLL();

    /**
     * <code>uint32 Unk3150_EBFMEOLDJKB = 3;</code>
     * @return The unk3150EBFMEOLDJKB.
     */
    int getUnk3150EBFMEOLDJKB();

    /**
     * <code>uint32 Unk3250_AEGCNHLOPEP = 6;</code>
     * @return The unk3250AEGCNHLOPEP.
     */
    int getUnk3250AEGCNHLOPEP();

    /**
     * <code>uint32 Unk3250_IDEEPEOPCIL = 8;</code>
     * @return The unk3250IDEEPEOPCIL.
     */
    int getUnk3250IDEEPEOPCIL();

    /**
     * <code>uint32 Unk3250_IMEGFNOLDCE = 12;</code>
     * @return The unk3250IMEGFNOLDCE.
     */
    int getUnk3250IMEGFNOLDCE();

    /**
     * <code>uint32 Unk3250_DJEGJDACDEF = 14;</code>
     * @return The unk3250DJEGJDACDEF.
     */
    int getUnk3250DJEGJDACDEF();

    /**
     * <code>uint32 Unk3250_MBPLICBFAGL = 10;</code>
     * @return The unk3250MBPLICBFAGL.
     */
    int getUnk3250MBPLICBFAGL();
  }
  /**
   * <pre>
   * CmdId: 21885
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_LHOPJJBPIOE}
   */
  public static final class Unk3150_LHOPJJBPIOE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_LHOPJJBPIOE)
      Unk3150_LHOPJJBPIOEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_LHOPJJBPIOE.newBuilder() to construct.
    private Unk3150_LHOPJJBPIOE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_LHOPJJBPIOE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_LHOPJJBPIOE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3150_LHOPJJBPIOE(
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
            case 24: {

              unk3150EBFMEOLDJKB_ = input.readUInt32();
              break;
            }
            case 32: {

              unk3250IOANLJBMBAI_ = input.readUInt32();
              break;
            }
            case 40: {

              unk3250PGJKEICFKLL_ = input.readUInt32();
              break;
            }
            case 48: {

              unk3250AEGCNHLOPEP_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3250IDEEPEOPCIL_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3250MBPLICBFAGL_ = input.readUInt32();
              break;
            }
            case 96: {

              unk3250IMEGFNOLDCE_ = input.readUInt32();
              break;
            }
            case 112: {

              unk3250DJEGJDACDEF_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.internal_static_Unk3150_LHOPJJBPIOE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.internal_static_Unk3150_LHOPJJBPIOE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.class, emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.Builder.class);
    }

    public static final int UNK3250_IOANLJBMBAI_FIELD_NUMBER = 4;
    private int unk3250IOANLJBMBAI_;
    /**
     * <code>uint32 Unk3250_IOANLJBMBAI = 4;</code>
     * @return The unk3250IOANLJBMBAI.
     */
    @java.lang.Override
    public int getUnk3250IOANLJBMBAI() {
      return unk3250IOANLJBMBAI_;
    }

    public static final int UNK3250_PGJKEICFKLL_FIELD_NUMBER = 5;
    private int unk3250PGJKEICFKLL_;
    /**
     * <code>uint32 Unk3250_PGJKEICFKLL = 5;</code>
     * @return The unk3250PGJKEICFKLL.
     */
    @java.lang.Override
    public int getUnk3250PGJKEICFKLL() {
      return unk3250PGJKEICFKLL_;
    }

    public static final int UNK3150_EBFMEOLDJKB_FIELD_NUMBER = 3;
    private int unk3150EBFMEOLDJKB_;
    /**
     * <code>uint32 Unk3150_EBFMEOLDJKB = 3;</code>
     * @return The unk3150EBFMEOLDJKB.
     */
    @java.lang.Override
    public int getUnk3150EBFMEOLDJKB() {
      return unk3150EBFMEOLDJKB_;
    }

    public static final int UNK3250_AEGCNHLOPEP_FIELD_NUMBER = 6;
    private int unk3250AEGCNHLOPEP_;
    /**
     * <code>uint32 Unk3250_AEGCNHLOPEP = 6;</code>
     * @return The unk3250AEGCNHLOPEP.
     */
    @java.lang.Override
    public int getUnk3250AEGCNHLOPEP() {
      return unk3250AEGCNHLOPEP_;
    }

    public static final int UNK3250_IDEEPEOPCIL_FIELD_NUMBER = 8;
    private int unk3250IDEEPEOPCIL_;
    /**
     * <code>uint32 Unk3250_IDEEPEOPCIL = 8;</code>
     * @return The unk3250IDEEPEOPCIL.
     */
    @java.lang.Override
    public int getUnk3250IDEEPEOPCIL() {
      return unk3250IDEEPEOPCIL_;
    }

    public static final int UNK3250_IMEGFNOLDCE_FIELD_NUMBER = 12;
    private int unk3250IMEGFNOLDCE_;
    /**
     * <code>uint32 Unk3250_IMEGFNOLDCE = 12;</code>
     * @return The unk3250IMEGFNOLDCE.
     */
    @java.lang.Override
    public int getUnk3250IMEGFNOLDCE() {
      return unk3250IMEGFNOLDCE_;
    }

    public static final int UNK3250_DJEGJDACDEF_FIELD_NUMBER = 14;
    private int unk3250DJEGJDACDEF_;
    /**
     * <code>uint32 Unk3250_DJEGJDACDEF = 14;</code>
     * @return The unk3250DJEGJDACDEF.
     */
    @java.lang.Override
    public int getUnk3250DJEGJDACDEF() {
      return unk3250DJEGJDACDEF_;
    }

    public static final int UNK3250_MBPLICBFAGL_FIELD_NUMBER = 10;
    private int unk3250MBPLICBFAGL_;
    /**
     * <code>uint32 Unk3250_MBPLICBFAGL = 10;</code>
     * @return The unk3250MBPLICBFAGL.
     */
    @java.lang.Override
    public int getUnk3250MBPLICBFAGL() {
      return unk3250MBPLICBFAGL_;
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
      if (unk3150EBFMEOLDJKB_ != 0) {
        output.writeUInt32(3, unk3150EBFMEOLDJKB_);
      }
      if (unk3250IOANLJBMBAI_ != 0) {
        output.writeUInt32(4, unk3250IOANLJBMBAI_);
      }
      if (unk3250PGJKEICFKLL_ != 0) {
        output.writeUInt32(5, unk3250PGJKEICFKLL_);
      }
      if (unk3250AEGCNHLOPEP_ != 0) {
        output.writeUInt32(6, unk3250AEGCNHLOPEP_);
      }
      if (unk3250IDEEPEOPCIL_ != 0) {
        output.writeUInt32(8, unk3250IDEEPEOPCIL_);
      }
      if (unk3250MBPLICBFAGL_ != 0) {
        output.writeUInt32(10, unk3250MBPLICBFAGL_);
      }
      if (unk3250IMEGFNOLDCE_ != 0) {
        output.writeUInt32(12, unk3250IMEGFNOLDCE_);
      }
      if (unk3250DJEGJDACDEF_ != 0) {
        output.writeUInt32(14, unk3250DJEGJDACDEF_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3150EBFMEOLDJKB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3150EBFMEOLDJKB_);
      }
      if (unk3250IOANLJBMBAI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, unk3250IOANLJBMBAI_);
      }
      if (unk3250PGJKEICFKLL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, unk3250PGJKEICFKLL_);
      }
      if (unk3250AEGCNHLOPEP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3250AEGCNHLOPEP_);
      }
      if (unk3250IDEEPEOPCIL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3250IDEEPEOPCIL_);
      }
      if (unk3250MBPLICBFAGL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3250MBPLICBFAGL_);
      }
      if (unk3250IMEGFNOLDCE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk3250IMEGFNOLDCE_);
      }
      if (unk3250DJEGJDACDEF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk3250DJEGJDACDEF_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE other = (emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE) obj;

      if (getUnk3250IOANLJBMBAI()
          != other.getUnk3250IOANLJBMBAI()) return false;
      if (getUnk3250PGJKEICFKLL()
          != other.getUnk3250PGJKEICFKLL()) return false;
      if (getUnk3150EBFMEOLDJKB()
          != other.getUnk3150EBFMEOLDJKB()) return false;
      if (getUnk3250AEGCNHLOPEP()
          != other.getUnk3250AEGCNHLOPEP()) return false;
      if (getUnk3250IDEEPEOPCIL()
          != other.getUnk3250IDEEPEOPCIL()) return false;
      if (getUnk3250IMEGFNOLDCE()
          != other.getUnk3250IMEGFNOLDCE()) return false;
      if (getUnk3250DJEGJDACDEF()
          != other.getUnk3250DJEGJDACDEF()) return false;
      if (getUnk3250MBPLICBFAGL()
          != other.getUnk3250MBPLICBFAGL()) return false;
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
      hash = (37 * hash) + UNK3250_IOANLJBMBAI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250IOANLJBMBAI();
      hash = (37 * hash) + UNK3250_PGJKEICFKLL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250PGJKEICFKLL();
      hash = (37 * hash) + UNK3150_EBFMEOLDJKB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150EBFMEOLDJKB();
      hash = (37 * hash) + UNK3250_AEGCNHLOPEP_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250AEGCNHLOPEP();
      hash = (37 * hash) + UNK3250_IDEEPEOPCIL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250IDEEPEOPCIL();
      hash = (37 * hash) + UNK3250_IMEGFNOLDCE_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250IMEGFNOLDCE();
      hash = (37 * hash) + UNK3250_DJEGJDACDEF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250DJEGJDACDEF();
      hash = (37 * hash) + UNK3250_MBPLICBFAGL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250MBPLICBFAGL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE prototype) {
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
     * <pre>
     * CmdId: 21885
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_LHOPJJBPIOE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_LHOPJJBPIOE)
        emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.internal_static_Unk3150_LHOPJJBPIOE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.internal_static_Unk3150_LHOPJJBPIOE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.class, emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.newBuilder()
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
        unk3250IOANLJBMBAI_ = 0;

        unk3250PGJKEICFKLL_ = 0;

        unk3150EBFMEOLDJKB_ = 0;

        unk3250AEGCNHLOPEP_ = 0;

        unk3250IDEEPEOPCIL_ = 0;

        unk3250IMEGFNOLDCE_ = 0;

        unk3250DJEGJDACDEF_ = 0;

        unk3250MBPLICBFAGL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.internal_static_Unk3150_LHOPJJBPIOE_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE build() {
        emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE buildPartial() {
        emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE result = new emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE(this);
        result.unk3250IOANLJBMBAI_ = unk3250IOANLJBMBAI_;
        result.unk3250PGJKEICFKLL_ = unk3250PGJKEICFKLL_;
        result.unk3150EBFMEOLDJKB_ = unk3150EBFMEOLDJKB_;
        result.unk3250AEGCNHLOPEP_ = unk3250AEGCNHLOPEP_;
        result.unk3250IDEEPEOPCIL_ = unk3250IDEEPEOPCIL_;
        result.unk3250IMEGFNOLDCE_ = unk3250IMEGFNOLDCE_;
        result.unk3250DJEGJDACDEF_ = unk3250DJEGJDACDEF_;
        result.unk3250MBPLICBFAGL_ = unk3250MBPLICBFAGL_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE other) {
        if (other == emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE.getDefaultInstance()) return this;
        if (other.getUnk3250IOANLJBMBAI() != 0) {
          setUnk3250IOANLJBMBAI(other.getUnk3250IOANLJBMBAI());
        }
        if (other.getUnk3250PGJKEICFKLL() != 0) {
          setUnk3250PGJKEICFKLL(other.getUnk3250PGJKEICFKLL());
        }
        if (other.getUnk3150EBFMEOLDJKB() != 0) {
          setUnk3150EBFMEOLDJKB(other.getUnk3150EBFMEOLDJKB());
        }
        if (other.getUnk3250AEGCNHLOPEP() != 0) {
          setUnk3250AEGCNHLOPEP(other.getUnk3250AEGCNHLOPEP());
        }
        if (other.getUnk3250IDEEPEOPCIL() != 0) {
          setUnk3250IDEEPEOPCIL(other.getUnk3250IDEEPEOPCIL());
        }
        if (other.getUnk3250IMEGFNOLDCE() != 0) {
          setUnk3250IMEGFNOLDCE(other.getUnk3250IMEGFNOLDCE());
        }
        if (other.getUnk3250DJEGJDACDEF() != 0) {
          setUnk3250DJEGJDACDEF(other.getUnk3250DJEGJDACDEF());
        }
        if (other.getUnk3250MBPLICBFAGL() != 0) {
          setUnk3250MBPLICBFAGL(other.getUnk3250MBPLICBFAGL());
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
        emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3250IOANLJBMBAI_ ;
      /**
       * <code>uint32 Unk3250_IOANLJBMBAI = 4;</code>
       * @return The unk3250IOANLJBMBAI.
       */
      @java.lang.Override
      public int getUnk3250IOANLJBMBAI() {
        return unk3250IOANLJBMBAI_;
      }
      /**
       * <code>uint32 Unk3250_IOANLJBMBAI = 4;</code>
       * @param value The unk3250IOANLJBMBAI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IOANLJBMBAI(int value) {
        
        unk3250IOANLJBMBAI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_IOANLJBMBAI = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IOANLJBMBAI() {
        
        unk3250IOANLJBMBAI_ = 0;
        onChanged();
        return this;
      }

      private int unk3250PGJKEICFKLL_ ;
      /**
       * <code>uint32 Unk3250_PGJKEICFKLL = 5;</code>
       * @return The unk3250PGJKEICFKLL.
       */
      @java.lang.Override
      public int getUnk3250PGJKEICFKLL() {
        return unk3250PGJKEICFKLL_;
      }
      /**
       * <code>uint32 Unk3250_PGJKEICFKLL = 5;</code>
       * @param value The unk3250PGJKEICFKLL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PGJKEICFKLL(int value) {
        
        unk3250PGJKEICFKLL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_PGJKEICFKLL = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PGJKEICFKLL() {
        
        unk3250PGJKEICFKLL_ = 0;
        onChanged();
        return this;
      }

      private int unk3150EBFMEOLDJKB_ ;
      /**
       * <code>uint32 Unk3150_EBFMEOLDJKB = 3;</code>
       * @return The unk3150EBFMEOLDJKB.
       */
      @java.lang.Override
      public int getUnk3150EBFMEOLDJKB() {
        return unk3150EBFMEOLDJKB_;
      }
      /**
       * <code>uint32 Unk3150_EBFMEOLDJKB = 3;</code>
       * @param value The unk3150EBFMEOLDJKB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150EBFMEOLDJKB(int value) {
        
        unk3150EBFMEOLDJKB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_EBFMEOLDJKB = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150EBFMEOLDJKB() {
        
        unk3150EBFMEOLDJKB_ = 0;
        onChanged();
        return this;
      }

      private int unk3250AEGCNHLOPEP_ ;
      /**
       * <code>uint32 Unk3250_AEGCNHLOPEP = 6;</code>
       * @return The unk3250AEGCNHLOPEP.
       */
      @java.lang.Override
      public int getUnk3250AEGCNHLOPEP() {
        return unk3250AEGCNHLOPEP_;
      }
      /**
       * <code>uint32 Unk3250_AEGCNHLOPEP = 6;</code>
       * @param value The unk3250AEGCNHLOPEP to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250AEGCNHLOPEP(int value) {
        
        unk3250AEGCNHLOPEP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_AEGCNHLOPEP = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250AEGCNHLOPEP() {
        
        unk3250AEGCNHLOPEP_ = 0;
        onChanged();
        return this;
      }

      private int unk3250IDEEPEOPCIL_ ;
      /**
       * <code>uint32 Unk3250_IDEEPEOPCIL = 8;</code>
       * @return The unk3250IDEEPEOPCIL.
       */
      @java.lang.Override
      public int getUnk3250IDEEPEOPCIL() {
        return unk3250IDEEPEOPCIL_;
      }
      /**
       * <code>uint32 Unk3250_IDEEPEOPCIL = 8;</code>
       * @param value The unk3250IDEEPEOPCIL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IDEEPEOPCIL(int value) {
        
        unk3250IDEEPEOPCIL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_IDEEPEOPCIL = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IDEEPEOPCIL() {
        
        unk3250IDEEPEOPCIL_ = 0;
        onChanged();
        return this;
      }

      private int unk3250IMEGFNOLDCE_ ;
      /**
       * <code>uint32 Unk3250_IMEGFNOLDCE = 12;</code>
       * @return The unk3250IMEGFNOLDCE.
       */
      @java.lang.Override
      public int getUnk3250IMEGFNOLDCE() {
        return unk3250IMEGFNOLDCE_;
      }
      /**
       * <code>uint32 Unk3250_IMEGFNOLDCE = 12;</code>
       * @param value The unk3250IMEGFNOLDCE to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250IMEGFNOLDCE(int value) {
        
        unk3250IMEGFNOLDCE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_IMEGFNOLDCE = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250IMEGFNOLDCE() {
        
        unk3250IMEGFNOLDCE_ = 0;
        onChanged();
        return this;
      }

      private int unk3250DJEGJDACDEF_ ;
      /**
       * <code>uint32 Unk3250_DJEGJDACDEF = 14;</code>
       * @return The unk3250DJEGJDACDEF.
       */
      @java.lang.Override
      public int getUnk3250DJEGJDACDEF() {
        return unk3250DJEGJDACDEF_;
      }
      /**
       * <code>uint32 Unk3250_DJEGJDACDEF = 14;</code>
       * @param value The unk3250DJEGJDACDEF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250DJEGJDACDEF(int value) {
        
        unk3250DJEGJDACDEF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_DJEGJDACDEF = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250DJEGJDACDEF() {
        
        unk3250DJEGJDACDEF_ = 0;
        onChanged();
        return this;
      }

      private int unk3250MBPLICBFAGL_ ;
      /**
       * <code>uint32 Unk3250_MBPLICBFAGL = 10;</code>
       * @return The unk3250MBPLICBFAGL.
       */
      @java.lang.Override
      public int getUnk3250MBPLICBFAGL() {
        return unk3250MBPLICBFAGL_;
      }
      /**
       * <code>uint32 Unk3250_MBPLICBFAGL = 10;</code>
       * @param value The unk3250MBPLICBFAGL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250MBPLICBFAGL(int value) {
        
        unk3250MBPLICBFAGL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_MBPLICBFAGL = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250MBPLICBFAGL() {
        
        unk3250MBPLICBFAGL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_LHOPJJBPIOE)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_LHOPJJBPIOE)
    private static final emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE();
    }

    public static emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_LHOPJJBPIOE>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_LHOPJJBPIOE>() {
      @java.lang.Override
      public Unk3150_LHOPJJBPIOE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3150_LHOPJJBPIOE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3150_LHOPJJBPIOE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_LHOPJJBPIOE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3150LHOPJJBPIOE.Unk3150_LHOPJJBPIOE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_LHOPJJBPIOE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_LHOPJJBPIOE_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_LHOPJJBPIOE.proto\"\375\001\n\023Unk3150_" +
      "LHOPJJBPIOE\022\033\n\023Unk3250_IOANLJBMBAI\030\004 \001(\r" +
      "\022\033\n\023Unk3250_PGJKEICFKLL\030\005 \001(\r\022\033\n\023Unk3150" +
      "_EBFMEOLDJKB\030\003 \001(\r\022\033\n\023Unk3250_AEGCNHLOPE" +
      "P\030\006 \001(\r\022\033\n\023Unk3250_IDEEPEOPCIL\030\010 \001(\r\022\033\n\023" +
      "Unk3250_IMEGFNOLDCE\030\014 \001(\r\022\033\n\023Unk3250_DJE" +
      "GJDACDEF\030\016 \001(\r\022\033\n\023Unk3250_MBPLICBFAGL\030\n " +
      "\001(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk3150_LHOPJJBPIOE_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_LHOPJJBPIOE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_LHOPJJBPIOE_descriptor,
        new java.lang.String[] { "Unk3250IOANLJBMBAI", "Unk3250PGJKEICFKLL", "Unk3150EBFMEOLDJKB", "Unk3250AEGCNHLOPEP", "Unk3250IDEEPEOPCIL", "Unk3250IMEGFNOLDCE", "Unk3250DJEGJDACDEF", "Unk3250MBPLICBFAGL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}