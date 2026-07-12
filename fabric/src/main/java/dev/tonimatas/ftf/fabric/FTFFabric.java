package dev.tonimatas.ftf.fabric;

import dev.tonimatas.ftf.FishingTheFish;
import net.fabricmc.api.ModInitializer;

public class FTFFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        FishingTheFish.init();
    }
}