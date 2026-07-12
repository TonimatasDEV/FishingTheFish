package dev.tonimatas.ftf.neoforge;

import dev.tonimatas.ftf.FishingTheFish;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@SuppressWarnings("unused")
@Mod(FishingTheFish.MOD_ID)
public class FTFNeoForge {
    public FTFNeoForge(IEventBus eventBus) {
        FishingTheFish.init();
    }
}