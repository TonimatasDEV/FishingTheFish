package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.FishingTheFish;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;

public class ModAttributes {
    public static final Holder<Attribute> FISHING_SPEED = register("fishing_speed", 0, 0, 300, true);

    public static final Holder<Attribute> HOOKING_SPEED = register("hooking_speed", 0, 0, 80, true);

    public static final Holder<Attribute> CREATURE_CHANCE = register("creature_chance", 0, 0, 100, true);

    public static final Holder<Attribute> LOOT_CHANCE = register("loot_chance", 0, 0, 100, true);

    public static final Holder<Attribute> DOUBLE_HOOK_CHANCE = register("double_hook_chance",0, 0, 100, true);

    private static Holder<Attribute> register(String name, double defaultValue, double minValue, double maxValue, boolean syncedWithClient) {
        Identifier identifier = FishingTheFish.id(name);
        Attribute entityAttribute = new RangedAttribute("attribute." + identifier.toLanguageKey(), defaultValue, minValue, maxValue).setSyncable(syncedWithClient);
        return Registry.registerForHolder(BuiltInRegistries.ATTRIBUTE, identifier, entityAttribute);
    }

    public static void init() {
        FabricDefaultAttributeRegistry.MODIFY.register((listener) -> {
            listener.modify(EntityTypes.PLAYER, (_, builder) -> {
                builder.add(FISHING_SPEED, 0);
                builder.add(HOOKING_SPEED, 0);
            });
        });
    }
}
