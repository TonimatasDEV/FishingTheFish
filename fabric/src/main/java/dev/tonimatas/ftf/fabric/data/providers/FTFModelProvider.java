package dev.tonimatas.ftf.fabric.data.providers;

import dev.tonimatas.ftf.registry.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.jspecify.annotations.NonNull;

public class FTFModelProvider extends FabricModelProvider {
    public FTFModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators gen) {
        gen.createFlatItemModel(ModItems.EXAMPLE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
