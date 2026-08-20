package dev.tonimatas.client.data;

import dev.tonimatas.ftf.registry.ModItemIds;
import dev.tonimatas.ftf.registry.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class FTFItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public FTFItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider registries) {
        tag(ModTags.Items.FISHING_RODS)
                .add(ModItemIds.EXAMPLE)
                .add(ItemIds.FISHING_ROD);
        tag(ConventionalItemTags.FISHING_ROD_TOOLS)
                .add(ModItemIds.EXAMPLE);
        tag(ItemTags.FISHING_ENCHANTABLE)
                .add(ModItemIds.EXAMPLE);
    }
}
