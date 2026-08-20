package dev.tonimatas.ftf.item;

import dev.tonimatas.ftf.registry.ModAttributes;

public class FTFCreatureRod extends FTFRod {

    public FTFCreatureRod(Properties properties, double fishingSpeed, double creatureChance, double hookingSpeed, double doubleHookChance) {
        super(properties, fishingSpeed, ModAttributes.CREATURE_CHANCE, "creature_chance", creatureChance, hookingSpeed, doubleHookChance);
    }
}
