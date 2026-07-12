package dev.tonimatas.ftf;

import dev.tonimatas.ftf.registry.ModBlocks;
import dev.tonimatas.ftf.registry.ModItems;
import dev.tonimatas.ftf.registry.ModTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FishingTheFish {
	public static final Logger LOGGER = LoggerFactory.getLogger(FishingTheFish.class);
	public static final String MOD_ID = "fishingthefish";

	public static void init() {
		ModBlocks.BLOCKS.register();
		ModItems.ITEMS.register();
		ModTabs.TABS.register();

		LOGGER.info("Fishing correctly.");
	}
}
