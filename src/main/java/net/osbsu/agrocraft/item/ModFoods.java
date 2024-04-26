package net.osbsu.agrocraft.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoods {
    public static final FoodProperties LEMON= new FoodProperties.Builder().nutrition(2)
        .saturationMod(0.2f).build();

    public static final FoodProperties LEMON_HALF = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.2f).fast().build();


    public static final FoodProperties FRESH_LEMONADE= new FoodProperties.Builder().nutrition(3)
            .saturationMod(1f).fast().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1).build();
}