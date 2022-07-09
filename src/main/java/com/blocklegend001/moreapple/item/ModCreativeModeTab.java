package com.blocklegend001.moreapple.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOREAPPLE_TAB = new CreativeModeTab("moreappletab") {
        @Override
        public ItemStack makeIcon() {

            return new ItemStack(ModItems.ULTIMATE_APPLE.get());
        }
    };
}
