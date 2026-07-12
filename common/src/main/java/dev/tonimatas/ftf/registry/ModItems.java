package dev.tonimatas.ftf.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(FishingTheFish.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> EXAMPLE = ITEMS.register("example", () ->
            new FishingRodItem(new Item.Properties().setId(getId("example")).durability(64).enchantable(1).arch$tab(ModTabs.PRIMARY_TAB)));

    public static ResourceKey<Item> getId(String id) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(FishingTheFish.MOD_ID, id));
    }
}
