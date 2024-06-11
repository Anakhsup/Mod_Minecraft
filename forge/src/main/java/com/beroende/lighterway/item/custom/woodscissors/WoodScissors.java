package com.beroende.lighterway.item.custom.woodscissors;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;

import java.util.Objects;

public class WoodScissors extends Item {

    public WoodScissors(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
        PlayerEntity playerEntity = Objects.requireNonNull(context.getPlayer());
        World world = context.getWorld();
        BlockState clickedBlock = world.getBlockState(context.getPos());


        BlockItemUseContext ciuc = new BlockItemUseContext(context);

        stack.damageItem(1, playerEntity, player -> player.sendBreakAnimation(context.getHand()));
        //world.destroyBlock(context.getPos(), false);
        if(clickedBlock.getBlock().isIn(BlockTags.LOGS)){
        //world.setBlockState(context.getPos(), Objects.requireNonNull(Blocks.JUNGLE_LOG.getStateForPlacement(ciuc)));
        replaceBlock(world, context);
        }

        return super.onItemUseFirst(stack, context);
    }

    public void replaceBlock(World world, ItemUseContext context) {
        BlockItemUseContext ciuc = new BlockItemUseContext(context);
        world.setBlockState(context.getPos(), Objects.requireNonNull(Blocks.JUNGLE_LOG.getStateForPlacement(ciuc)));
    }
}
