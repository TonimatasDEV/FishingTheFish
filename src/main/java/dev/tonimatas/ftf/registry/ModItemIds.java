package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    public static final ResourceKey<Item> EXAMPLE = create("example");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, FishingTheFish.id(name));
    }
}
