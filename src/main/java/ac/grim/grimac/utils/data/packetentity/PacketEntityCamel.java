package ac.grim.grimac.utils.data.packetentity;

import ac.grim.grimac.player.GrimPlayer;
import com.github.retrooper.packetevents.protocol.attribute.Attributes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;

public class PacketEntityCamel extends PacketEntityHorse {

    public boolean dashing = false; //TODO: handle camel dashing

    public PacketEntityCamel(GrimPlayer player, EntityType type, double x, double y, double z, float xRot) {
        super(player, type, x, y, z, xRot);

        getAttribute(Attributes.GENERIC_JUMP_STRENGTH).override(0.42f);
        getAttribute(Attributes.GENERIC_MOVEMENT_SPEED).override(0.09f);
        getAttribute(Attributes.GENERIC_STEP_HEIGHT).override(1.5f);
    }
}
