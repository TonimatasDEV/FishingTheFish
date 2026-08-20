package dev.tonimatas.client;

import dev.tonimatas.client.data.FTFItemTagProvider;
import dev.tonimatas.client.data.FTFLootTableProvider;
import dev.tonimatas.ftf.FishingTheFish;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NonNull;

public class FishingTheFishDataGenerator implements DataGeneratorEntrypoint {
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
