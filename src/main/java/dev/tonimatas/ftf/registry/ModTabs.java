package dev.tonimatas.ftf.registry;

import dev.tonimatas.ftf.FishingTheFish;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final ResourceKey<CreativeModeTab> FTF_CREATIVE_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), FishingTheFish.id("ftf"));

    public static final CreativeModeTab FTF_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.EXAMPLE))
            .title(Component.translatable("creativeTab.ftf"))
            .displayItems((params, output) -> {
                output.accept(ModItems.EXAMPLE);
            })
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, FTF_CREATIVE_TAB_KEY, FTF_CREATIVE_TAB);
    }
}
