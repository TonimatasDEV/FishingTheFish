package dev.tonimatas.ftf;

import dev.tonimatas.ftf.registry.ModBlocks;
import dev.tonimatas.ftf.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingTheFish {
	public static final Logger LOGGER = LoggerFactory.getLogger(FishingTheFish.class);
	public static final String MOD_ID = "fishingthefish";

	public static void init() {
		ModItems.ITEMS.register();
		ModBlocks.BLOCKS.register();

		LOGGER.info("Fishing correctly.");
	}
}
