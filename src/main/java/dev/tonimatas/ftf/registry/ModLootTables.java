package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class ModLootTables {
    public static final ResourceKey<LootTable> EXAMPLE = register("example");
    public static final ResourceKey<LootTable> CREATURES = register("creatures");

    private static ResourceKey<LootTable> register(String id) {
        return ResourceKey.create(Registries.LOOT_TABLE, Identifier.fromNamespaceAndPath(FishingTheFish.MOD_ID, "ftf/" + id));
    }
}
