package dev.tonimatas.ftf.fabric.data.providers;

import dev.tonimatas.ftf.registry.ModLootTables;
import dev.tonimatas.ftf.registry.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableSubProvider;
import net.minecraft.advancements.predicates.DataComponentMatchers;
import net.minecraft.advancements.predicates.EnchantmentPredicate;
import net.minecraft.advancements.predicates.ItemPredicate;
import net.minecraft.advancements.predicates.MinMaxBounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.predicates.DataComponentPredicates;
import net.minecraft.core.component.predicates.EnchantmentsPredicate;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import org.jspecify.annotations.NonNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class FTFLootTableProvider extends SimpleFabricLootTableSubProvider {
    public CompletableFuture<HolderLookup.Provider> registries;

    public FTFLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture, LootContextParamSets.FISHING);
        this.registries = registryLookupFuture;
    }

    @Override
    public void generate(@NonNull BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {

        HolderLookup.RegistryLookup<Item> items = this.registries.resultNow().lookupOrThrow(Registries.ITEM);
        output.accept(ModLootTables.EXAMPLE, LootTable.lootTable().withPool(LootPool.lootPool()
                .add(LootItem.lootTableItem(Items.ITEM_FRAME).setWeight(50))
                .add(LootItem.lootTableItem(Items.GLOW_ITEM_FRAME)
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item()
                                .of(items, ModTags.Items.FISHING_RODS)
                                .withComponents(DataComponentMatchers.Builder.components()
                                        .partial(DataComponentPredicates.ENCHANTMENTS, EnchantmentsPredicate.enchantments(
                                                List.of(new EnchantmentPredicate(this.registries.resultNow()
                                                        .lookupOrThrow(Registries.ENCHANTMENT)
                                                        .getOrThrow(Enchantments.LUCK_OF_THE_SEA), MinMaxBounds.Ints.atLeast(1))))).build()))).setWeight(50))));
        //output.accept(ModLootTables.CREATURES, LootTable.lootTable().withPool(LootPool.lootPool()
        //        .add(LootPoolEntryContainer.)));
    }
}
