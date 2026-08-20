package dev.tonimatas.ftf.registry;

import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class ModAttributes {
    private static final DeferredRegister<Attribute> ATTRIBUTES = DeferredRegister.create(FishingTheFish.MOD_ID, Registries.ATTRIBUTE);

    public static final RegistrySupplier<Attribute> FISHING_SPEED = ATTRIBUTES.register("fishing_speed", () -> new RangedAttribute(
       "attributes.fishingthefish.fishing_speed", 0, 0, 600).setSyncable(true));

    public static final RegistrySupplier<Attribute> HOOKING_SPEED = ATTRIBUTES.register("hooking_speed", () -> new RangedAttribute(
            "attributes.fishingthefish.hooking_speed", 0, 0, 80).setSyncable(true));

    public static final RegistrySupplier<Attribute> CREATURE_CHANCE = ATTRIBUTES.register("creature_chance", () -> new RangedAttribute(
            "attributes.fishingthefish.creature_chance", 0, 0, 100).setSyncable(true));

    public static final RegistrySupplier<Attribute> LOOT_CHANCE = ATTRIBUTES.register("loot_chance", () -> new RangedAttribute(
            "attributes.fishingthefish.loot_chance", 0, 0, 100).setSyncable(true));

    public static final RegistrySupplier<Attribute> DOUBLE_HOOK_CHANCE = ATTRIBUTES.register("double_hook_chance", () -> new RangedAttribute(
            "attributes.fishingthefish.double_hook_chance", 0, 0, 100).setSyncable(true));

    public static void register() {
        ATTRIBUTES.register();
        EntityAttributeRegistry.register(() ->  EntityTypes.PLAYER, () -> Player.createAttributes().add(FISHING_SPEED.asHolder(), 0).add(HOOKING_SPEED.asHolder(), 0));
    }
}
