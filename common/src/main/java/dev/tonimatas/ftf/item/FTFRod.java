package dev.tonimatas.ftf.item;

import dev.tonimatas.ftf.registry.ModAttributes;
import dev.tonimatas.ftf.registry.ModTabs;
import dev.tonimatas.ftf.util.AttributesUtils;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class FTFRod extends FishingRodItem {
    @SuppressWarnings("UnstableApiUsage")
    public FTFRod(final Item.Properties properties, double fishingSpeed, Holder<Attribute> attributeChance, String attributeName, double chance, double hookingSpeed, double doubleHookChance) {
        super(properties.attributes(ItemAttributeModifiers.builder()
                .add(ModAttributes.FISHING_SPEED.asHolder(), AttributesUtils.value("fishing_speed", fishingSpeed), EquipmentSlotGroup.MAINHAND)
                .add(attributeChance, AttributesUtils.value(attributeName, chance), EquipmentSlotGroup.MAINHAND)
                .add(ModAttributes.HOOKING_SPEED.asHolder(), AttributesUtils.value("hooking_speed", hookingSpeed), EquipmentSlotGroup.MAINHAND)
                .add(ModAttributes.DOUBLE_HOOK_CHANCE.asHolder(), AttributesUtils.value("double_hook_chance", doubleHookChance), EquipmentSlotGroup.MAINHAND)
                .build())
                .arch$tab(ModTabs.PRIMARY_TAB));
    }
}
