package com.beroende.lighterway.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import com.beroende.lighterway.entity.custom.HamsterEntity;

public class HamsterModel<T extends HamsterEntity> extends EntityModel<T> {
    private final ModelRenderer legs1;
    private final ModelRenderer head;
    private final ModelRenderer body;
    private final ModelRenderer tail;
    private final ModelRenderer legs2;

    public HamsterModel() {
        textureWidth = 32;
        textureHeight = 32;

        legs1 = new ModelRenderer(this);
        legs1.setRotationPoint(0.0F, 24.0F, 0.0F);
        legs1.setTextureOffset(16, 16).addBox(0.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        legs1.setTextureOffset(0, 16).addBox(-3.0F, -2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.setTextureOffset(0, 9).addBox(-4.0F, -6.0F, -4.0F, 7.0F, 4.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(16, 4).addBox(1.0F, -7.0F, -3.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
        head.setTextureOffset(0, 3).addBox(-4.0F, -7.0F, -3.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 0).addBox(-3.0F, -4.0F, -2.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);

        tail = new ModelRenderer(this);
        tail.setRotationPoint(0.0F, 24.0F, 0.0F);
        tail.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        legs2 = new ModelRenderer(this);
        legs2.setRotationPoint(0.0F, 24.0F, 0.0F);
        legs2.setTextureOffset(16, 0).addBox(0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        legs2.setTextureOffset(8, 16).addBox(-3.0F, -2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
                                  float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = 0.5f * (headPitch * ((float)Math.PI / 180F));
        this.head.rotateAngleY = 0.5f * (netHeadYaw * ((float)Math.PI / 180F));

        this.legs1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 0.7F * limbSwingAmount;
        this.legs2.rotateAngleX =  MathHelper.cos(limbSwing * 0.6662F) * 0.7F * limbSwingAmount;

        this.tail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        legs1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        legs2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}