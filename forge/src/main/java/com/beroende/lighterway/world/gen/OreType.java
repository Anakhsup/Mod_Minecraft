package com.beroende.lighterway.world.gen;

import com.beroende.lighterway.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    AMETHYST(Lazy.of(ModBlocks.AMETHYST_ORE), 8, 25, 50);

    private final Lazy<Block> block;
    private final int maxVienSize;
    private final int minHeight;
    private final int maxHeight;

    OreType(Lazy<Block> block, int maxVienSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVienSize = maxVienSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVienSize() {
        return maxVienSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block){
        for (OreType ore : values()){
            if (block == ore.block){
                return ore;
            }
        }

        return null;
    }
}
