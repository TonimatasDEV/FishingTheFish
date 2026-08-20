package dev.tonimatas.ftf.item;

import dev.tonimatas.ftf.registry.ModAttributes;

public class FTFLootRod extends FTFRod {
    public FTFLootRod(Properties properties, double fishingSpeed, double lootChance, double hookingSpeed, double doubleHookChance) {
        super(properties, fishingSpeed, ModAttributes.LOOT_CHANCE, "loot_chance", lootChance, hookingSpeed, doubleHookChance);
    }
}
