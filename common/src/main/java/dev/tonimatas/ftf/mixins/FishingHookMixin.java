package dev.tonimatas.ftf.mixins;

import dev.tonimatas.ftf.registry.ModTags;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FishingHook.class)
public class FishingHookMixin {
    @Redirect(method = "shouldStopFishing", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Ljava/lang/Object;)Z"))
    private boolean ftf$shouldStopFishing$1(ItemStack instance, Object o) {
        return instance.is(ModTags.Items.FISHING_RODS);
    }
}
