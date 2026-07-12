package dev.tonimatas.ftf.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(FishingTheFish.MOD_ID, Registries.ITEM);
}
