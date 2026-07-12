package dev.tonimatas.ftf.fabric.data;

import dev.tonimatas.ftf.FishingTheFish;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public class FTFDataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(@NonNull FabricDataGenerator fabricDataGenerator) {
        
    }

    @Override
    public @Nullable String getEffectiveModId() {
        return FishingTheFish.MOD_ID;
    }
}
