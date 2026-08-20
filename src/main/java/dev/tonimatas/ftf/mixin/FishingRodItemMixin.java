package dev.tonimatas.ftf.mixin;

import dev.tonimatas.ftf.util.Constants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(FishingRodItem.class)
public class FishingRodItemMixin {
    @Redirect(method = "use", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;getFishingTimeReduction(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/Entity;)F"))
    private float ftf$use(ServerLevel serverLevel, ItemStack rod, Entity fisher) {
        Holder<Enchantment> enchantment = serverLevel.holderLookup(Registries.ENCHANTMENT).get(Enchantments.LURE).orElseThrow();
        return EnchantmentHelper.getItemEnchantmentLevel(enchantment, rod) * Constants.LURE_FISHING_SPEED_PER_LEVEL;
    }

    @ModifyConstant(method = "use", constant = @Constant(floatValue = 20.0F))
    private float ftf$use(float constant) {
        return 1;
    }
}
