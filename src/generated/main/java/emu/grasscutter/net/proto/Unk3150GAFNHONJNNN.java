// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3150_GAFNHONJNNN.proto

package emu.grasscutter.net.proto;

public final class Unk3150GAFNHONJNNN {
  private Unk3150GAFNHONJNNN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3150_GAFNHONJNNNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3150_GAFNHONJNNN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3250_BHOMHPHLOHL = 8;</code>
     * @return The unk3250BHOMHPHLOHL.
     */
    int getUnk3250BHOMHPHLOHL();

    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason();

    /**
     * <code>bool Unk3150_EDFCCGHIMHG = 13;</code>
     * @return The unk3150EDFCCGHIMHG.
     */
    boolean getUnk3150EDFCCGHIMHG();

    /**
     * <code>uint32 Unk3150_KEOFACPABMF = 6;</code>
     * @return The unk3150KEOFACPABMF.
     */
    int getUnk3150KEOFACPABMF();

    /**
     * <code>uint32 final_score = 15;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 Unk3250_POCDEGBHJEA = 11;</code>
     * @return The unk3250POCDEGBHJEA.
     */
    int getUnk3250POCDEGBHJEA();

    /**
     * <code>bool Unk3250_PNLJLLCACHA = 1;</code>
     * @return The unk3250PNLJLLCACHA.
     */
    boolean getUnk3250PNLJLLCACHA();

    /**
     * <code>uint32 Unk3250_KKFBMHLOLFC = 10;</code>
     * @return The unk3250KKFBMHLOLFC.
     */
    int getUnk3250KKFBMHLOLFC();
  }
  /**
   * <pre>
   * CmdId: 24589
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk3150_GAFNHONJNNN}
   */
  public static final class Unk3150_GAFNHONJNNN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3150_GAFNHONJNNN)
      Unk3150_GAFNHONJNNNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3150_GAFNHONJNNN.newBuilder() to construct.
    private Unk3150_GAFNHONJNNN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3150_GAFNHONJNNN() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3150_GAFNHONJNNN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3150_GAFNHONJNNN(
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
            case 8: {

              unk3250PNLJLLCACHA_ = input.readBool();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 48: {

              unk3150KEOFACPABMF_ = input.readUInt32();
              break;
            }
            case 64: {

              unk3250BHOMHPHLOHL_ = input.readUInt32();
              break;
            }
            case 80: {

              unk3250KKFBMHLOLFC_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3250POCDEGBHJEA_ = input.readUInt32();
              break;
            }
            case 104: {

              unk3150EDFCCGHIMHG_ = input.readBool();
              break;
            }
            case 120: {

              finalScore_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.internal_static_Unk3150_GAFNHONJNNN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.internal_static_Unk3150_GAFNHONJNNN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.class, emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.Builder.class);
    }

    public static final int UNK3250_BHOMHPHLOHL_FIELD_NUMBER = 8;
    private int unk3250BHOMHPHLOHL_;
    /**
     * <code>uint32 Unk3250_BHOMHPHLOHL = 8;</code>
     * @return The unk3250BHOMHPHLOHL.
     */
    @java.lang.Override
    public int getUnk3250BHOMHPHLOHL() {
      return unk3250BHOMHPHLOHL_;
    }

    public static final int REASON_FIELD_NUMBER = 5;
    private int reason_;
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
    }

    public static final int UNK3150_EDFCCGHIMHG_FIELD_NUMBER = 13;
    private boolean unk3150EDFCCGHIMHG_;
    /**
     * <code>bool Unk3150_EDFCCGHIMHG = 13;</code>
     * @return The unk3150EDFCCGHIMHG.
     */
    @java.lang.Override
    public boolean getUnk3150EDFCCGHIMHG() {
      return unk3150EDFCCGHIMHG_;
    }

    public static final int UNK3150_KEOFACPABMF_FIELD_NUMBER = 6;
    private int unk3150KEOFACPABMF_;
    /**
     * <code>uint32 Unk3150_KEOFACPABMF = 6;</code>
     * @return The unk3150KEOFACPABMF.
     */
    @java.lang.Override
    public int getUnk3150KEOFACPABMF() {
      return unk3150KEOFACPABMF_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 15;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 15;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int UNK3250_POCDEGBHJEA_FIELD_NUMBER = 11;
    private int unk3250POCDEGBHJEA_;
    /**
     * <code>uint32 Unk3250_POCDEGBHJEA = 11;</code>
     * @return The unk3250POCDEGBHJEA.
     */
    @java.lang.Override
    public int getUnk3250POCDEGBHJEA() {
      return unk3250POCDEGBHJEA_;
    }

    public static final int UNK3250_PNLJLLCACHA_FIELD_NUMBER = 1;
    private boolean unk3250PNLJLLCACHA_;
    /**
     * <code>bool Unk3250_PNLJLLCACHA = 1;</code>
     * @return The unk3250PNLJLLCACHA.
     */
    @java.lang.Override
    public boolean getUnk3250PNLJLLCACHA() {
      return unk3250PNLJLLCACHA_;
    }

    public static final int UNK3250_KKFBMHLOLFC_FIELD_NUMBER = 10;
    private int unk3250KKFBMHLOLFC_;
    /**
     * <code>uint32 Unk3250_KKFBMHLOLFC = 10;</code>
     * @return The unk3250KKFBMHLOLFC.
     */
    @java.lang.Override
    public int getUnk3250KKFBMHLOLFC() {
      return unk3250KKFBMHLOLFC_;
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
      if (unk3250PNLJLLCACHA_ != false) {
        output.writeBool(1, unk3250PNLJLLCACHA_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        output.writeEnum(5, reason_);
      }
      if (unk3150KEOFACPABMF_ != 0) {
        output.writeUInt32(6, unk3150KEOFACPABMF_);
      }
      if (unk3250BHOMHPHLOHL_ != 0) {
        output.writeUInt32(8, unk3250BHOMHPHLOHL_);
      }
      if (unk3250KKFBMHLOLFC_ != 0) {
        output.writeUInt32(10, unk3250KKFBMHLOLFC_);
      }
      if (unk3250POCDEGBHJEA_ != 0) {
        output.writeUInt32(11, unk3250POCDEGBHJEA_);
      }
      if (unk3150EDFCCGHIMHG_ != false) {
        output.writeBool(13, unk3150EDFCCGHIMHG_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(15, finalScore_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3250PNLJLLCACHA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, unk3250PNLJLLCACHA_);
      }
      if (reason_ != emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.Unk2700_MOFABPNGIKP_Unk2700_DGJFKKIBLCJ.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, reason_);
      }
      if (unk3150KEOFACPABMF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3150KEOFACPABMF_);
      }
      if (unk3250BHOMHPHLOHL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3250BHOMHPHLOHL_);
      }
      if (unk3250KKFBMHLOLFC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3250KKFBMHLOLFC_);
      }
      if (unk3250POCDEGBHJEA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3250POCDEGBHJEA_);
      }
      if (unk3150EDFCCGHIMHG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, unk3150EDFCCGHIMHG_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, finalScore_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN other = (emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN) obj;

      if (getUnk3250BHOMHPHLOHL()
          != other.getUnk3250BHOMHPHLOHL()) return false;
      if (reason_ != other.reason_) return false;
      if (getUnk3150EDFCCGHIMHG()
          != other.getUnk3150EDFCCGHIMHG()) return false;
      if (getUnk3150KEOFACPABMF()
          != other.getUnk3150KEOFACPABMF()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getUnk3250POCDEGBHJEA()
          != other.getUnk3250POCDEGBHJEA()) return false;
      if (getUnk3250PNLJLLCACHA()
          != other.getUnk3250PNLJLLCACHA()) return false;
      if (getUnk3250KKFBMHLOLFC()
          != other.getUnk3250KKFBMHLOLFC()) return false;
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
      hash = (37 * hash) + UNK3250_BHOMHPHLOHL_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250BHOMHPHLOHL();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + UNK3150_EDFCCGHIMHG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3150EDFCCGHIMHG());
      hash = (37 * hash) + UNK3150_KEOFACPABMF_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3150KEOFACPABMF();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + UNK3250_POCDEGBHJEA_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250POCDEGBHJEA();
      hash = (37 * hash) + UNK3250_PNLJLLCACHA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk3250PNLJLLCACHA());
      hash = (37 * hash) + UNK3250_KKFBMHLOLFC_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3250KKFBMHLOLFC();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN prototype) {
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
     * CmdId: 24589
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk3150_GAFNHONJNNN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3150_GAFNHONJNNN)
        emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.internal_static_Unk3150_GAFNHONJNNN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.internal_static_Unk3150_GAFNHONJNNN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.class, emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.newBuilder()
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
        unk3250BHOMHPHLOHL_ = 0;

        reason_ = 0;

        unk3150EDFCCGHIMHG_ = false;

        unk3150KEOFACPABMF_ = 0;

        finalScore_ = 0;

        unk3250POCDEGBHJEA_ = 0;

        unk3250PNLJLLCACHA_ = false;

        unk3250KKFBMHLOLFC_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.internal_static_Unk3150_GAFNHONJNNN_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN build() {
        emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN buildPartial() {
        emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN result = new emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN(this);
        result.unk3250BHOMHPHLOHL_ = unk3250BHOMHPHLOHL_;
        result.reason_ = reason_;
        result.unk3150EDFCCGHIMHG_ = unk3150EDFCCGHIMHG_;
        result.unk3150KEOFACPABMF_ = unk3150KEOFACPABMF_;
        result.finalScore_ = finalScore_;
        result.unk3250POCDEGBHJEA_ = unk3250POCDEGBHJEA_;
        result.unk3250PNLJLLCACHA_ = unk3250PNLJLLCACHA_;
        result.unk3250KKFBMHLOLFC_ = unk3250KKFBMHLOLFC_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN) {
          return mergeFrom((emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN other) {
        if (other == emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN.getDefaultInstance()) return this;
        if (other.getUnk3250BHOMHPHLOHL() != 0) {
          setUnk3250BHOMHPHLOHL(other.getUnk3250BHOMHPHLOHL());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getUnk3150EDFCCGHIMHG() != false) {
          setUnk3150EDFCCGHIMHG(other.getUnk3150EDFCCGHIMHG());
        }
        if (other.getUnk3150KEOFACPABMF() != 0) {
          setUnk3150KEOFACPABMF(other.getUnk3150KEOFACPABMF());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getUnk3250POCDEGBHJEA() != 0) {
          setUnk3250POCDEGBHJEA(other.getUnk3250POCDEGBHJEA());
        }
        if (other.getUnk3250PNLJLLCACHA() != false) {
          setUnk3250PNLJLLCACHA(other.getUnk3250PNLJLLCACHA());
        }
        if (other.getUnk3250KKFBMHLOLFC() != 0) {
          setUnk3250KKFBMHLOLFC(other.getUnk3250KKFBMHLOLFC());
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
        emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3250BHOMHPHLOHL_ ;
      /**
       * <code>uint32 Unk3250_BHOMHPHLOHL = 8;</code>
       * @return The unk3250BHOMHPHLOHL.
       */
      @java.lang.Override
      public int getUnk3250BHOMHPHLOHL() {
        return unk3250BHOMHPHLOHL_;
      }
      /**
       * <code>uint32 Unk3250_BHOMHPHLOHL = 8;</code>
       * @param value The unk3250BHOMHPHLOHL to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250BHOMHPHLOHL(int value) {
        
        unk3250BHOMHPHLOHL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_BHOMHPHLOHL = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250BHOMHPHLOHL() {
        
        unk3250BHOMHPHLOHL_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP result = emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.Unk2700_MOFABPNGIKP value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_MOFABPNGIKP reason = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3150EDFCCGHIMHG_ ;
      /**
       * <code>bool Unk3150_EDFCCGHIMHG = 13;</code>
       * @return The unk3150EDFCCGHIMHG.
       */
      @java.lang.Override
      public boolean getUnk3150EDFCCGHIMHG() {
        return unk3150EDFCCGHIMHG_;
      }
      /**
       * <code>bool Unk3150_EDFCCGHIMHG = 13;</code>
       * @param value The unk3150EDFCCGHIMHG to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150EDFCCGHIMHG(boolean value) {
        
        unk3150EDFCCGHIMHG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3150_EDFCCGHIMHG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150EDFCCGHIMHG() {
        
        unk3150EDFCCGHIMHG_ = false;
        onChanged();
        return this;
      }

      private int unk3150KEOFACPABMF_ ;
      /**
       * <code>uint32 Unk3150_KEOFACPABMF = 6;</code>
       * @return The unk3150KEOFACPABMF.
       */
      @java.lang.Override
      public int getUnk3150KEOFACPABMF() {
        return unk3150KEOFACPABMF_;
      }
      /**
       * <code>uint32 Unk3150_KEOFACPABMF = 6;</code>
       * @param value The unk3150KEOFACPABMF to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3150KEOFACPABMF(int value) {
        
        unk3150KEOFACPABMF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3150_KEOFACPABMF = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3150KEOFACPABMF() {
        
        unk3150KEOFACPABMF_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 15;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 15;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int unk3250POCDEGBHJEA_ ;
      /**
       * <code>uint32 Unk3250_POCDEGBHJEA = 11;</code>
       * @return The unk3250POCDEGBHJEA.
       */
      @java.lang.Override
      public int getUnk3250POCDEGBHJEA() {
        return unk3250POCDEGBHJEA_;
      }
      /**
       * <code>uint32 Unk3250_POCDEGBHJEA = 11;</code>
       * @param value The unk3250POCDEGBHJEA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250POCDEGBHJEA(int value) {
        
        unk3250POCDEGBHJEA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_POCDEGBHJEA = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250POCDEGBHJEA() {
        
        unk3250POCDEGBHJEA_ = 0;
        onChanged();
        return this;
      }

      private boolean unk3250PNLJLLCACHA_ ;
      /**
       * <code>bool Unk3250_PNLJLLCACHA = 1;</code>
       * @return The unk3250PNLJLLCACHA.
       */
      @java.lang.Override
      public boolean getUnk3250PNLJLLCACHA() {
        return unk3250PNLJLLCACHA_;
      }
      /**
       * <code>bool Unk3250_PNLJLLCACHA = 1;</code>
       * @param value The unk3250PNLJLLCACHA to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250PNLJLLCACHA(boolean value) {
        
        unk3250PNLJLLCACHA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk3250_PNLJLLCACHA = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250PNLJLLCACHA() {
        
        unk3250PNLJLLCACHA_ = false;
        onChanged();
        return this;
      }

      private int unk3250KKFBMHLOLFC_ ;
      /**
       * <code>uint32 Unk3250_KKFBMHLOLFC = 10;</code>
       * @return The unk3250KKFBMHLOLFC.
       */
      @java.lang.Override
      public int getUnk3250KKFBMHLOLFC() {
        return unk3250KKFBMHLOLFC_;
      }
      /**
       * <code>uint32 Unk3250_KKFBMHLOLFC = 10;</code>
       * @param value The unk3250KKFBMHLOLFC to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3250KKFBMHLOLFC(int value) {
        
        unk3250KKFBMHLOLFC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3250_KKFBMHLOLFC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3250KKFBMHLOLFC() {
        
        unk3250KKFBMHLOLFC_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk3150_GAFNHONJNNN)
    }

    // @@protoc_insertion_point(class_scope:Unk3150_GAFNHONJNNN)
    private static final emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN();
    }

    public static emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3150_GAFNHONJNNN>
        PARSER = new com.google.protobuf.AbstractParser<Unk3150_GAFNHONJNNN>() {
      @java.lang.Override
      public Unk3150_GAFNHONJNNN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3150_GAFNHONJNNN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3150_GAFNHONJNNN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3150_GAFNHONJNNN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk3150GAFNHONJNNN.Unk3150_GAFNHONJNNN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3150_GAFNHONJNNN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3150_GAFNHONJNNN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3150_GAFNHONJNNN.proto\032\031Unk2700_MOF" +
      "ABPNGIKP.proto\"\376\001\n\023Unk3150_GAFNHONJNNN\022\033" +
      "\n\023Unk3250_BHOMHPHLOHL\030\010 \001(\r\022$\n\006reason\030\005 " +
      "\001(\0162\024.Unk2700_MOFABPNGIKP\022\033\n\023Unk3150_EDF" +
      "CCGHIMHG\030\r \001(\010\022\033\n\023Unk3150_KEOFACPABMF\030\006 " +
      "\001(\r\022\023\n\013final_score\030\017 \001(\r\022\033\n\023Unk3250_POCD" +
      "EGBHJEA\030\013 \001(\r\022\033\n\023Unk3250_PNLJLLCACHA\030\001 \001" +
      "(\010\022\033\n\023Unk3250_KKFBMHLOLFC\030\n \001(\rB\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor(),
        });
    internal_static_Unk3150_GAFNHONJNNN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3150_GAFNHONJNNN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3150_GAFNHONJNNN_descriptor,
        new java.lang.String[] { "Unk3250BHOMHPHLOHL", "Reason", "Unk3150EDFCCGHIMHG", "Unk3150KEOFACPABMF", "FinalScore", "Unk3250POCDEGBHJEA", "Unk3250PNLJLLCACHA", "Unk3250KKFBMHLOLFC", });
    emu.grasscutter.net.proto.Unk2700MOFABPNGIKP.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}