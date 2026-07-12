package dev.tonimatas.ftf.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.tonimatas.ftf.FishingTheFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(FishingTheFish.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> PRIMARY_TAB = TABS.register("ftf_primary_tab", () ->
            CreativeTabRegistry.create(
                    Component.literal("Fishing The Fish"),
                    () -> new ItemStack(ModItems.EXAMPLE.get())));
}
