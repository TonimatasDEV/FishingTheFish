package dev.tonimatas.ftf.neoforge;

import dev.tonimatas.ftf.FishingTheFish;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLDedicatedServerSetupEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = FishingTheFish.MOD_ID, value = Dist.DEDICATED_SERVER)
public class FTFServerNeoForge {
    @SubscribeEvent
    public static void onDedicatedServerSetup(FMLDedicatedServerSetupEvent event) {

    }
}

