package com.beroende.lighterway.item.custom.woodscissors;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemUseContext;
import net.minecraft.world.World;

import java.util.Objects;

public class OakScissors extends WoodScissors {
    public OakScissors(Properties properties) {
        super(properties);
    }

    @Override
    public void replaceBlock(World world, ItemUseContext context) {
        BlockItemUseContext ciuc = new BlockItemUseContext(context);
        world.setBlockState(context.getPos(), Objects.requireNonNull(Blocks.OAK_LOG.getStateForPlacement(ciuc)));
    }
}
