package dev.tonimatas.ftf.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(FishingTheFish.MOD_ID, Registries.BLOCK);
}
