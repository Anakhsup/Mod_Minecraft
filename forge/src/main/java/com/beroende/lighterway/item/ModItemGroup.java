package com.beroende.lighterway.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup
{
    public static final ItemGroup LIGHTER_WAY_GROUP = new ItemGroup("lighterWayTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.AMETHYST.get());
        }
    };

    public static final ItemGroup LIGHTER_WAY_GROUP_INSTRUMENTS = new ItemGroup("lighterWayTabInstruments") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.OAKSCISSORS.get());
        }
    };
}
