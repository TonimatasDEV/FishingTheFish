package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.item.FTFCreatureRod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item EXAMPLE = register(ModItemIds.EXAMPLE, (properties) ->
            new FTFCreatureRod(properties, 300, 50, 40, 20),
            new Item.Properties().durability(64));


    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void init() {

    }
}
