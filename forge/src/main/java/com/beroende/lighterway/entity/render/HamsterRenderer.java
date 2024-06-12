package com.beroende.lighterway.entity.render;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import com.beroende.lighterway.LighterWay;
import com.beroende.lighterway.entity.custom.HamsterEntity;
import com.beroende.lighterway.entity.model.HamsterModel;

public class HamsterRenderer extends MobRenderer<HamsterEntity, HamsterModel<HamsterEntity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(LighterWay.MOD_ID, "textures/entity/hamster.png");

    public HamsterRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HamsterModel<>(), 0.3F);
    }

    @Override
    public ResourceLocation getEntityTexture(HamsterEntity entity) {
        return TEXTURE;
    }
}