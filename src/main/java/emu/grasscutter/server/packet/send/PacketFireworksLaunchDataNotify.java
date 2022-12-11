package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.FireworksLaunchDataNotifyOuterClass.FireworksLaunchDataNotify;
import emu.grasscutter.net.proto.FireworksLaunchSchemeDataOuterClass.FireworksLaunchSchemeData;;

public class PacketFireworksLaunchDataNotify extends BasePacket {
    public PacketFireworksLaunchDataNotify(FireworksLaunchSchemeData pinfo) {
        super(PacketOpcodes.FireworksLaunchDataNotify);

        var proto = FireworksLaunchDataNotify.newBuilder()
            .addSchemeDataList(pinfo);

        setData(proto.build());
    }
}
