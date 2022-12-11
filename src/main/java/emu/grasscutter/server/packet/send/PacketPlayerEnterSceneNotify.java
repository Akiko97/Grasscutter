package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.player.Player.SceneLoadState;
import emu.grasscutter.game.props.EnterReason;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.EnterTypeOuterClass.EnterType;
import emu.grasscutter.net.proto.PlayerEnterSceneNotifyOuterClass.PlayerEnterSceneNotify;
import emu.grasscutter.utils.Position;
import emu.grasscutter.utils.Utils;

public class PacketPlayerEnterSceneNotify extends BasePacket {

    // Login
    public PacketPlayerEnterSceneNotify(Player player) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        PlayerEnterSceneNotify.Builder proto = PlayerEnterSceneNotify.newBuilder()
                .setSceneId(player.getSceneId())
                .setPos(player.getPosition().toProto())
                .setSceneBeginTime(System.currentTimeMillis())
                .setType(EnterType.ENTER_TYPE_SELF)
                .setTargetUid(player.getUid())
                .setEnterSceneToken(player.getEnterSceneToken())
                .setWorldLevel(player.getWorldLevel())
                //.setUnk3250LFFBNEBMAAG(EnterReason.Login.getValue())
                .setUnk3250OKMNOFOHKOB(player.isFirstLoginEnterScene())
                .setUnk3250LIDGFMDDOOM(1)
                .setSceneTransaction("3-" + player.getUid() + "-" + (int) (System.currentTimeMillis() / 1000) + "-" + 18402);

        this.setData(proto);
    }

    public PacketPlayerEnterSceneNotify(Player player, EnterType type, EnterReason reason, int newScene, Position newPos) {
        this(player, player, type, reason, newScene, newPos);
    }

    // Teleport or go somewhere
    public PacketPlayerEnterSceneNotify(Player player, Player target, EnterType type, EnterReason reason, int newScene, Position newPos) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        PlayerEnterSceneNotify.Builder proto = PlayerEnterSceneNotify.newBuilder()
                .setUnk3250LLHABHMLNAH(player.getSceneId())
                .setPrevPos(player.getPosition().toProto())
                .setSceneId(newScene)
                .setPos(newPos.toProto())
                .setSceneBeginTime(System.currentTimeMillis())
                .setType(type)
                .setTargetUid(target.getUid())
                .setEnterSceneToken(player.getEnterSceneToken())
                .setWorldLevel(target.getWorld().getWorldLevel())
                // .setEnterReason(reason.getValue())
                .setUnk3250LIDGFMDDOOM(1)
                .setSceneTransaction(newScene + "-" + target.getUid() + "-" + (int) (System.currentTimeMillis() / 1000) + "-" + 18402);

        this.setData(proto);
    }
}
