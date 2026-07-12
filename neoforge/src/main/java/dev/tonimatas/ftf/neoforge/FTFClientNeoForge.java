package dev.tonimatas.ftf.neoforge;

import dev.tonimatas.ftf.FishingTheFish;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = FishingTheFish.MOD_ID, value = Dist.CLIENT)
public class FTFClientNeoForge {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

    }
}
