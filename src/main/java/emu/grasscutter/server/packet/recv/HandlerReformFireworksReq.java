package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.ReformFireworksReqOuterClass.ReformFireworksReq;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketReformFireworksRsp;
import emu.grasscutter.server.packet.send.PacketFireworksReformDataNotify;

@Opcodes(PacketOpcodes.ReformFireworksReq)
public class HandlerReformFireworksReq extends PacketHandler {
    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var req = ReformFireworksReq.parseFrom(payload);

        session.send(new PacketFireworksReformDataNotify(req.getFireworksReformData()));
        session.send(new PacketReformFireworksRsp());
    }
}
