package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;

public class ModBlockItemIds {
    private static BlockItemId create(String name) {
        Identifier id = FishingTheFish.id(name);
        return BlockItemId.create(id, id);
    }
}
