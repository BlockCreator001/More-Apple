package com.blocklegend001.moreapple.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties IRON_APPLE = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 5000), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 2400), 1f).build();

    public static final FoodProperties REDSTONE_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 7500, 1), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 4800, 1), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1), 1f).build();

    public static final FoodProperties LAPIS_APPLE = new FoodProperties.Builder().nutrition(10).saturationMod(0.10f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 8200, 2), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 6400, 2), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.LUCK, 2400, 2), 1f).build();

    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder().nutrition(12).saturationMod(0.12f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12500, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 9600, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.NIGHT_VISION, 7800, 3), 1).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 3), 1f).build();

    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder().nutrition(12).saturationMod(0.12f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12500, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 9600, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6800, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 3), 1f).build();

    public static final FoodProperties NETHERITE_APPLE = new FoodProperties.Builder().nutrition(12).saturationMod(0.12f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 12500, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 9600, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6800, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6800, 3), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 4800, 3), 1f).build();

    public static final FoodProperties ULTIMATE_APPLE = new FoodProperties.Builder().nutrition(12).saturationMod(0.12f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 14500, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.REGENERATION, 11500, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.NIGHT_VISION, 7800, 4), 1).effect(()
                    -> new MobEffectInstance(MobEffects.LUCK, 7200, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DIG_SPEED, 7200, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 7200, 4), 1f).effect(()
                    -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 4), 1f).build();

}