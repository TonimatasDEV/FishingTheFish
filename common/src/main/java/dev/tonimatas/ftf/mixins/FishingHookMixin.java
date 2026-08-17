package dev.tonimatas.ftf.mixins;

import dev.tonimatas.ftf.registry.ModAttributes;
import dev.tonimatas.ftf.registry.ModTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(FishingHook.class)
public abstract class FishingHookMixin {
    @Shadow
    public abstract @Nullable Player getPlayerOwner();

    @Redirect(method = "shouldStopFishing", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;is(Ljava/lang/Object;)Z"))
    private boolean ftf$shouldStopFishing$1(ItemStack instance, Object o) {
        return instance.is(ModTags.Items.FISHING_RODS);
    }

    @ModifyArg(method = "retrieve", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/ReloadableServerRegistries$Holder;getLootTable(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/level/storage/loot/LootTable;"))
    private ResourceKey<LootTable> ftf$retrieve(ResourceKey<LootTable> id) {
        //if (rod.get().is(ModItems.EXAMPLE.get())) {
        //    return ModLootTables.EXAMPLE;
        //}

        return id;
    }

    @ModifyConstant(method = "catchingFish", constant = @Constant(intValue = 600))
    private int ftf$catchingFish$maxTimeUntilLure(int constant) {
        return ftf$getMaxTimeUntilLure();
    }

    @ModifyConstant(method = "catchingFish", constant = @Constant(intValue = 100))
    private int ftf$catchingFish$minTimeUntilLure(int constant) {
        return Math.max(1, ftf$getMaxTimeUntilLure() - 100);
    }

    @Unique
    public int ftf$getMaxTimeUntilLure() {
        Player player = this.getPlayerOwner();

        if (player != null) {
            return 600 - (int) player.getAttributeValue(ModAttributes.FISHING_SPEED.asHolder());
        }

        return 600;
    }

    @ModifyConstant(method = "catchingFish", constant = @Constant(intValue = 80))
    private int ftf$catchingFish$maxTimeUntilHooked(int constant) {
        return ftf$getMaxTimeUntilHooked();
    }

    @ModifyConstant(method = "catchingFish", constant = @Constant(intValue = 20, ordinal = 3))
    private int ftf$catchingFish$minTimeUntilHooked(int constant) {
        return Math.max(1, ftf$getMaxTimeUntilHooked() - 10);
    }

    @Unique
    public int ftf$getMaxTimeUntilHooked() {
        Player player = this.getPlayerOwner();

        if (player != null) {
            return 80 - (int) player.getAttributeValue(ModAttributes.HOOKING_SPEED.asHolder());
        }

        return 80;
    }
}
