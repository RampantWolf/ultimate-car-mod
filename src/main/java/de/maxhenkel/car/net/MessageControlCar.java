package de.maxhenkel.car.net;

import de.maxhenkel.car.Main;
import de.maxhenkel.car.entity.car.base.EntityCarBase;
import de.maxhenkel.corelib.net.Message;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.PlayPayloadContext;

import java.util.UUID;

public class MessageControlCar implements Message<MessageControlCar> {

    public static ResourceLocation ID = new ResourceLocation(Main.MODID, "control_car");

    private boolean forward, backward, left, right;
    private UUID uuid;

    public MessageControlCar() {

    }

    public MessageControlCar(boolean forward, boolean backward, boolean left, boolean right, Player player) {
        this.forward = forward;
        this.backward = backward;
        this.left = left;
        this.right = right;
        this.uuid = player.getUUID();
    }

    @Override
    public PacketFlow getExecutingSide() {
        return PacketFlow.SERVERBOUND;
    }

    @Override
    public void executeServerSide(PlayPayloadContext context) {
        if (!(context.player().orElse(null) instanceof ServerPlayer sender)) {
            return;
        }

        if (!sender.getUUID().equals(uuid)) {
            Main.LOGGER.error("The UUID of the sender was not equal to the packet UUID");
            return;
        }

        if (!(sender.getVehicle() instanceof EntityCarBase car)) {
            return;
        }

        car.updateControls(forward, backward, left, right, sender);
    }

    @Override
    public MessageControlCar fromBytes(FriendlyByteBuf buf) {
        this.forward = buf.readBoolean();
        this.backward = buf.readBoolean();
        this.left = buf.readBoolean();
        this.right = buf.readBoolean();
        this.uuid = buf.readUUID();
        return this;
    }

    @Override
    public void toBytes(FriendlyByteBuf buf) {
        buf.writeBoolean(forward);
        buf.writeBoolean(backward);
        buf.writeBoolean(left);
        buf.writeBoolean(right);
        buf.writeUUID(uuid);
    }

    @Override
    public ResourceLocation id() {
        return ID;
    }

}
