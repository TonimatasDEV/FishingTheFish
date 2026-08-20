package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> FISHING_RODS = create("fishing_rods");

        private static TagKey<Item> create(String tag) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FishingTheFish.MOD_ID, tag));
        }
    }

    public static class Blocks {

    }
}
