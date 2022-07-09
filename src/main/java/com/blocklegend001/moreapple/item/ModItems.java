package com.blocklegend001.moreapple.item;

import com.blocklegend001.moreapple.MoreApple;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreApple.MOD_ID);


    public static final RegistryObject<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.IRON_APPLE)));

    public static final RegistryObject<Item> REDSTONE_APPLE = ITEMS.register("redstone_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.REDSTONE_APPLE)));

    public static final RegistryObject<Item> LAPIS_APPLE = ITEMS.register("lapis_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.LAPIS_APPLE)));

    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.DIAMOND_APPLE)));

    public static final RegistryObject<Item> EMERALD_APPLE = ITEMS.register("emerald_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.EMERALD_APPLE)));

    public static final RegistryObject<Item> NETHERITE_APPLE = ITEMS.register("netherite_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.NETHERITE_APPLE)));

    public static final RegistryObject<Item> ULTIMATE_APPLE = ITEMS.register("ultimate_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MOREAPPLE_TAB).food(ModFoods.ULTIMATE_APPLE)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus);
    }
}
