package dev.tonimatas.ftf.fabric.data;

import dev.tonimatas.ftf.FishingTheFish;
import dev.tonimatas.ftf.fabric.data.providers.FTFItemTagProvider;
import dev.tonimatas.ftf.fabric.data.providers.FTFLootTableProvider;
import dev.tonimatas.ftf.fabric.data.providers.FTFModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public class FTFDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NonNull FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(FTFItemTagProvider::new);
        pack.addProvider(FTFLootTableProvider::new);
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return FishingTheFish.MOD_ID;
    }
}
