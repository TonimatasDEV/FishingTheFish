package dev.tonimatas.ftf.util;

import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class AttributesUtils {
    public static AttributeModifier value(String name, double value) {
        return new AttributeModifier(FishingTheFish.id(name), value, AttributeModifier.Operation.ADD_VALUE);
    }
}
