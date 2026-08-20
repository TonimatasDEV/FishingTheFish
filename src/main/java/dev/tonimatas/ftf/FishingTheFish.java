package dev.tonimatas.ftf;

import dev.tonimatas.ftf.registry.ModAttributes;
import dev.tonimatas.ftf.registry.ModBlocks;
import dev.tonimatas.ftf.registry.ModItems;
import dev.tonimatas.ftf.registry.ModTabs;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingTheFish implements ModInitializer {
	public static final String MOD_ID = "fishing-the-fish";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModAttributes.init();
		ModBlocks.init();
		ModItems.init();
		ModTabs.init();

		LOGGER.info("Fishing correctly.");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
