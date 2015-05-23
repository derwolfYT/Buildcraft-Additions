package buildcraftAdditions.client.models;

/**
 * Copyright (c) 2014-2015, AEnterprise
 * http://buildcraftadditions.wordpress.com/
 * Buildcraft Additions is distributed under the terms of GNU GPL v3.0
 * Please check the contents of the license located in
 * http://buildcraftadditions.wordpress.com/wiki/licensing-stuff/
 */
import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelLeg - Plenituz
 * Created using Tabula 4.1.1
 */
public class ModelRocketPants extends ModelBiped {

	public static ModelRocketPants INSTANCE = new ModelRocketPants();

	public ModelRenderer shape9;
	public ModelRenderer shape9_1;
	public ModelRenderer shape9_2;
	public ModelRenderer shape9_3;
	public ModelRenderer shape9_4;
	public ModelRenderer shape9_5;
	public ModelRenderer shape9_6;
	public ModelRenderer shape9_7;
	public ModelRenderer shape9_8;
	public ModelRenderer shape9_9;
	public ModelRenderer shape9_10;
	public ModelRenderer shape9_11;
	public ModelRenderer shape9_12;
	public ModelRenderer shape9_13;
	public ModelRenderer shape9_14;
	public ModelRenderer shape9_15;
	public ModelRenderer shape9_16;
	public ModelRenderer shape9_17;
	public ModelRenderer shape9_18;
	public ModelRenderer shape9_19;
	public ModelRenderer shape9_20;
	public ModelRenderer shape9_21;
	public ModelRenderer frl;
	public ModelRenderer shape9_22;
	public ModelRenderer shape9_23;
	public ModelRenderer frl_1;
	public ModelRenderer shape9_24;
	public ModelRenderer shape9_25;
	public ModelRenderer shape9_26;
	public ModelRenderer shape9_27;
	public ModelRenderer shape9_28;
	public ModelRenderer shape9_29;
	public ModelRenderer frl_2;
	public ModelRenderer shape9_30;
	public ModelRenderer frl_3;
	public ModelRenderer shape9_31;

	private ModelRocketPants() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.shape9_7 = new ModelRenderer(this, 0, 0);
		this.shape9_7.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_7.addBox(-0.3000000000000025F, 13.7F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_19 = new ModelRenderer(this, 0, 0);
		this.shape9_19.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_19.addBox(-1.0F, 0.6F, 0.0F, 1, 4, 1, 0.0F);
		this.shape9_25 = new ModelRenderer(this, 0, 0);
		this.shape9_25.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_25.addBox(3.8F, 7.4F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_16 = new ModelRenderer(this, 0, 0);
		this.shape9_16.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_16.addBox(4.5F, 0.6F, 2.0F, 1, 4, 1, 0.0F);
		this.shape9_22 = new ModelRenderer(this, 0, 0);
		this.shape9_22.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_22.addBox(-1.0F, 0.6F, 1.6F, 1, 1, 1, 0.0F);
		this.shape9_1 = new ModelRenderer(this, 0, 0);
		this.shape9_1.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_1.addBox(0.0F, 0.6F, 0.0F, 1, 4, 2, 0.0F);
		this.shape9_27 = new ModelRenderer(this, 0, 0);
		this.shape9_27.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_27.addBox(3.8F, 13.7F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_9 = new ModelRenderer(this, 0, 0);
		this.shape9_9.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_9.addBox(1.4000000000000172F, 7.4F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_11 = new ModelRenderer(this, 0, 0);
		this.shape9_11.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_11.addBox(-1.599999999999994F, 7.4F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_18 = new ModelRenderer(this, 0, 0);
		this.shape9_18.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_18.addBox(0.0F, 0.9F, 5.1F, 3, 1, 1, 0.0F);
		this.shape9 = new ModelRenderer(this, 0, 0);
		this.shape9.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9.addBox(0.0F, 0.6F, 0.0F, 3, 4, 2, 0.0F);
		this.shape9_15 = new ModelRenderer(this, 0, 0);
		this.shape9_15.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_15.addBox(3.0F, 0.6F, 0.0F, 1, 4, 1, 0.0F);
		this.shape9_5 = new ModelRenderer(this, 0, 0);
		this.shape9_5.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_5.addBox(-0.3000000000000025F, 7.4F, 0.0F, 1, 1, 1, 0.0F);
		this.frl_3 = new ModelRenderer(this, 0, 0);
		this.frl_3.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.frl_3.addBox(6.6F, 10.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_8 = new ModelRenderer(this, 0, 0);
		this.shape9_8.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_8.addBox(1.4000000000000172F, 4.6F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_14 = new ModelRenderer(this, 0, 0);
		this.shape9_14.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_14.addBox(9.0F, 1.4F, 2.7F, 1, 1, 1, 0.0F);
		this.shape9_28 = new ModelRenderer(this, 0, 0);
		this.shape9_28.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_28.addBox(9.6F, 4.6F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_23 = new ModelRenderer(this, 0, 0);
		this.shape9_23.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_23.addBox(-1.0F, 1.4F, 2.5F, 1, 1, 1, 0.0F);
		this.shape9_2 = new ModelRenderer(this, 0, 0);
		this.shape9_2.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_2.addBox(0.0F, 1.3F, 0.0F, 2, 1, 2, 0.0F);
		this.shape9_3 = new ModelRenderer(this, 0, 0);
		this.shape9_3.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_3.addBox(5.0F, 0.6F, 0.0F, 1, 4, 2, 0.0F);
		this.shape9_20 = new ModelRenderer(this, 0, 0);
		this.shape9_20.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_20.addBox(-1.0F, 0.6F, 2.0F, 1, 4, 1, 0.0F);
		this.shape9_17 = new ModelRenderer(this, 0, 0);
		this.shape9_17.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_17.addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
		this.frl_2 = new ModelRenderer(this, 0, 0);
		this.frl_2.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.frl_2.addBox(9.5F, 10.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_30 = new ModelRenderer(this, 0, 0);
		this.shape9_30.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_30.addBox(6.6F, 4.6F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_4 = new ModelRenderer(this, 0, 0);
		this.shape9_4.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_4.addBox(-0.3000000000000025F, 4.6F, 0.0F, 1, 1, 1, 0.0F);
		this.frl_1 = new ModelRenderer(this, 0, 0);
		this.frl_1.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.frl_1.addBox(-1.599999999999994F, 10.0F, 0.0F, 1, 1, 1, 0.0F);
		this.frl = new ModelRenderer(this, 0, 0);
		this.frl.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.frl.addBox(1.3000000000000171F, 10.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_6 = new ModelRenderer(this, 0, 0);
		this.shape9_6.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_6.addBox(-0.3000000000000025F, 10.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_10 = new ModelRenderer(this, 0, 0);
		this.shape9_10.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_10.addBox(-1.599999999999994F, 4.6F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_29 = new ModelRenderer(this, 0, 0);
		this.shape9_29.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_29.addBox(9.6F, 7.4F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_31 = new ModelRenderer(this, 0, 0);
		this.shape9_31.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_31.addBox(6.6F, 7.4F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_26 = new ModelRenderer(this, 0, 0);
		this.shape9_26.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_26.addBox(3.8F, 10.0F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_12 = new ModelRenderer(this, 0, 0);
		this.shape9_12.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_12.addBox(4.5F, 0.2F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_24 = new ModelRenderer(this, 0, 0);
		this.shape9_24.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_24.addBox(3.8F, 4.6F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_21 = new ModelRenderer(this, 0, 0);
		this.shape9_21.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_21.addBox(-1.0F, 0.2F, 0.0F, 1, 1, 1, 0.0F);
		this.shape9_13 = new ModelRenderer(this, 0, 0);
		this.shape9_13.setRotationPoint(1.9F, 12.0F, 0.0F);
		this.shape9_13.addBox(6.0F, 0.6F, 1.7F, 1, 1, 1, 0.0F);
	}

	private void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		this.shape9.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9.rotateAngleY = 0.0F;
		this.shape9_1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_1.rotateAngleY = 0.0F;
		this.shape9_2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_2.rotateAngleY = 0.0F;
		this.shape9_3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_3.rotateAngleY = 0.0F;
		this.shape9_4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_4.rotateAngleY = 0.0F;
		this.shape9_5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_5.rotateAngleY = 0.0F;
		this.shape9_6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_6.rotateAngleY = 0.0F;
		this.shape9_7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_7.rotateAngleY = 0.0F;
		this.shape9_8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_8.rotateAngleY = 0.0F;
		this.shape9_9.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_9.rotateAngleY = 0.0F;
		this.frl.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.frl.rotateAngleY = 0.0F;
		this.shape9_10.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_10.rotateAngleY = 0.0F;
		this.shape9_11.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_11.rotateAngleY = 0.0F;
		this.frl_1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.frl_1.rotateAngleY = 0.0F;
		this.shape9_12.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_12.rotateAngleY = 0.0F;
		this.shape9_13.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_13.rotateAngleY = 0.0F;
		this.shape9_14.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_14.rotateAngleY = 0.0F;
		this.shape9_15.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_15.rotateAngleY = 0.0F;
		this.shape9_16.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_16.rotateAngleY = 0.0F;
		this.shape9_17.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_17.rotateAngleY = 0.0F;
		this.shape9_18.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_18.rotateAngleY = 0.0F;
		this.shape9_19.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_19.rotateAngleY = 0.0F;
		this.shape9_20.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_20.rotateAngleY = 0.0F;
		this.shape9_21.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_21.rotateAngleY = 0.0F;
		this.shape9_22.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_22.rotateAngleY = 0.0F;
		this.shape9_23.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_23.rotateAngleY = 0.0F;
		this.shape9_24.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_24.rotateAngleY = 0.0F;
		this.shape9_25.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_25.rotateAngleY = 0.0F;
		this.shape9_26.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_26.rotateAngleY = 0.0F;
		this.shape9_27.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_27.rotateAngleY = 0.0F;
		this.shape9_28.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_28.rotateAngleY = 0.0F;
		this.shape9_29.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_29.rotateAngleY = 0.0F;
		this.frl_2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.frl_2.rotateAngleY = 0.0F;
		this.shape9_30.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_30.rotateAngleY = 0.0F;
		this.shape9_31.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.shape9_31.rotateAngleY = 0.0F;
		this.frl_3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
		this.frl_3.rotateAngleY = 0.0F;

	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glTranslatef(-0.1f, 0, 0.15f);
		GL11.glPushMatrix();
		setRotationAngles(f, f1, f2, f3, f4, f5);
		GL11.glTranslatef(this.shape9_7.offsetX, this.shape9_7.offsetY, this.shape9_7.offsetZ);
		GL11.glTranslatef(this.shape9_7.rotationPointX * f5, this.shape9_7.rotationPointY * f5, this.shape9_7.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.4D, 0.4D);
		GL11.glTranslatef(-this.shape9_7.offsetX, -this.shape9_7.offsetY, -this.shape9_7.offsetZ);
		GL11.glTranslatef(-this.shape9_7.rotationPointX * f5, -this.shape9_7.rotationPointY * f5, -this.shape9_7.rotationPointZ * f5);
		this.shape9_7.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_19.offsetX, this.shape9_19.offsetY, this.shape9_19.offsetZ);
		GL11.glTranslatef(this.shape9_19.rotationPointX * f5, this.shape9_19.rotationPointY * f5, this.shape9_19.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.8D, 0.8D);
		GL11.glTranslatef(-this.shape9_19.offsetX, -this.shape9_19.offsetY, -this.shape9_19.offsetZ);
		GL11.glTranslatef(-this.shape9_19.rotationPointX * f5, -this.shape9_19.rotationPointY * f5, -this.shape9_19.rotationPointZ * f5);
		this.shape9_19.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_25.offsetX, this.shape9_25.offsetY, this.shape9_25.offsetZ);
		GL11.glTranslatef(this.shape9_25.rotationPointX * f5, this.shape9_25.rotationPointY * f5, this.shape9_25.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.6D, 0.8D);
		GL11.glTranslatef(-this.shape9_25.offsetX, -this.shape9_25.offsetY, -this.shape9_25.offsetZ);
		GL11.glTranslatef(-this.shape9_25.rotationPointX * f5, -this.shape9_25.rotationPointY * f5, -this.shape9_25.rotationPointZ * f5);
		this.shape9_25.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_16.offsetX, this.shape9_16.offsetY, this.shape9_16.offsetZ);
		GL11.glTranslatef(this.shape9_16.rotationPointX * f5, this.shape9_16.rotationPointY * f5, this.shape9_16.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.8D, 0.4D);
		GL11.glTranslatef(-this.shape9_16.offsetX, -this.shape9_16.offsetY, -this.shape9_16.offsetZ);
		GL11.glTranslatef(-this.shape9_16.rotationPointX * f5, -this.shape9_16.rotationPointY * f5, -this.shape9_16.rotationPointZ * f5);
		this.shape9_16.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_22.offsetX, this.shape9_22.offsetY, this.shape9_22.offsetZ);
		GL11.glTranslatef(this.shape9_22.rotationPointX * f5, this.shape9_22.rotationPointY * f5, this.shape9_22.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape9_22.offsetX, -this.shape9_22.offsetY, -this.shape9_22.offsetZ);
		GL11.glTranslatef(-this.shape9_22.rotationPointX * f5, -this.shape9_22.rotationPointY * f5, -this.shape9_22.rotationPointZ * f5);
		this.shape9_22.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_1.offsetX, this.shape9_1.offsetY, this.shape9_1.offsetZ);
		GL11.glTranslatef(this.shape9_1.rotationPointX * f5, this.shape9_1.rotationPointY * f5, this.shape9_1.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.8D, 0.7D);
		GL11.glTranslatef(-this.shape9_1.offsetX, -this.shape9_1.offsetY, -this.shape9_1.offsetZ);
		GL11.glTranslatef(-this.shape9_1.rotationPointX * f5, -this.shape9_1.rotationPointY * f5, -this.shape9_1.rotationPointZ * f5);
		this.shape9_1.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_27.offsetX, this.shape9_27.offsetY, this.shape9_27.offsetZ);
		GL11.glTranslatef(this.shape9_27.rotationPointX * f5, this.shape9_27.rotationPointY * f5, this.shape9_27.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.4D, 0.4D);
		GL11.glTranslatef(-this.shape9_27.offsetX, -this.shape9_27.offsetY, -this.shape9_27.offsetZ);
		GL11.glTranslatef(-this.shape9_27.rotationPointX * f5, -this.shape9_27.rotationPointY * f5, -this.shape9_27.rotationPointZ * f5);
		this.shape9_27.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_9.offsetX, this.shape9_9.offsetY, this.shape9_9.offsetZ);
		GL11.glTranslatef(this.shape9_9.rotationPointX * f5, this.shape9_9.rotationPointY * f5, this.shape9_9.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape9_9.offsetX, -this.shape9_9.offsetY, -this.shape9_9.offsetZ);
		GL11.glTranslatef(-this.shape9_9.rotationPointX * f5, -this.shape9_9.rotationPointY * f5, -this.shape9_9.rotationPointZ * f5);
		this.shape9_9.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_11.offsetX, this.shape9_11.offsetY, this.shape9_11.offsetZ);
		GL11.glTranslatef(this.shape9_11.rotationPointX * f5, this.shape9_11.rotationPointY * f5, this.shape9_11.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape9_11.offsetX, -this.shape9_11.offsetY, -this.shape9_11.offsetZ);
		GL11.glTranslatef(-this.shape9_11.rotationPointX * f5, -this.shape9_11.rotationPointY * f5, -this.shape9_11.rotationPointZ * f5);
		this.shape9_11.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_18.offsetX, this.shape9_18.offsetY, this.shape9_18.offsetZ);
		GL11.glTranslatef(this.shape9_18.rotationPointX * f5, this.shape9_18.rotationPointY * f5, this.shape9_18.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.2D, 0.2D);
		GL11.glTranslatef(-this.shape9_18.offsetX, -this.shape9_18.offsetY, -this.shape9_18.offsetZ);
		GL11.glTranslatef(-this.shape9_18.rotationPointX * f5, -this.shape9_18.rotationPointY * f5, -this.shape9_18.rotationPointZ * f5);
		this.shape9_18.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9.offsetX, this.shape9.offsetY, this.shape9.offsetZ);
		GL11.glTranslatef(this.shape9.rotationPointX * f5, this.shape9.rotationPointY * f5, this.shape9.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.8D, 0.6D);
		GL11.glTranslatef(-this.shape9.offsetX, -this.shape9.offsetY, -this.shape9.offsetZ);
		GL11.glTranslatef(-this.shape9.rotationPointX * f5, -this.shape9.rotationPointY * f5, -this.shape9.rotationPointZ * f5);
		this.shape9.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_15.offsetX, this.shape9_15.offsetY, this.shape9_15.offsetZ);
		GL11.glTranslatef(this.shape9_15.rotationPointX * f5, this.shape9_15.rotationPointY * f5, this.shape9_15.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.8D, 0.8D);
		GL11.glTranslatef(-this.shape9_15.offsetX, -this.shape9_15.offsetY, -this.shape9_15.offsetZ);
		GL11.glTranslatef(-this.shape9_15.rotationPointX * f5, -this.shape9_15.rotationPointY * f5, -this.shape9_15.rotationPointZ * f5);
		this.shape9_15.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_5.offsetX, this.shape9_5.offsetY, this.shape9_5.offsetZ);
		GL11.glTranslatef(this.shape9_5.rotationPointX * f5, this.shape9_5.rotationPointY * f5, this.shape9_5.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.6D, 0.8D);
		GL11.glTranslatef(-this.shape9_5.offsetX, -this.shape9_5.offsetY, -this.shape9_5.offsetZ);
		GL11.glTranslatef(-this.shape9_5.rotationPointX * f5, -this.shape9_5.rotationPointY * f5, -this.shape9_5.rotationPointZ * f5);
		this.shape9_5.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.frl_3.offsetX, this.frl_3.offsetY, this.frl_3.offsetZ);
		GL11.glTranslatef(this.frl_3.rotationPointX * f5, this.frl_3.rotationPointY * f5, this.frl_3.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.5D, 0.4D);
		GL11.glTranslatef(-this.frl_3.offsetX, -this.frl_3.offsetY, -this.frl_3.offsetZ);
		GL11.glTranslatef(-this.frl_3.rotationPointX * f5, -this.frl_3.rotationPointY * f5, -this.frl_3.rotationPointZ * f5);
		this.frl_3.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_8.offsetX, this.shape9_8.offsetY, this.shape9_8.offsetZ);
		GL11.glTranslatef(this.shape9_8.rotationPointX * f5, this.shape9_8.rotationPointY * f5, this.shape9_8.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.8D, 0.8D);
		GL11.glTranslatef(-this.shape9_8.offsetX, -this.shape9_8.offsetY, -this.shape9_8.offsetZ);
		GL11.glTranslatef(-this.shape9_8.rotationPointX * f5, -this.shape9_8.rotationPointY * f5, -this.shape9_8.rotationPointZ * f5);
		this.shape9_8.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_14.offsetX, this.shape9_14.offsetY, this.shape9_14.offsetZ);
		GL11.glTranslatef(this.shape9_14.rotationPointX * f5, this.shape9_14.rotationPointY * f5, this.shape9_14.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.2D, 0.3D);
		GL11.glTranslatef(-this.shape9_14.offsetX, -this.shape9_14.offsetY, -this.shape9_14.offsetZ);
		GL11.glTranslatef(-this.shape9_14.rotationPointX * f5, -this.shape9_14.rotationPointY * f5, -this.shape9_14.rotationPointZ * f5);
		this.shape9_14.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_28.offsetX, this.shape9_28.offsetY, this.shape9_28.offsetZ);
		GL11.glTranslatef(this.shape9_28.rotationPointX * f5, this.shape9_28.rotationPointY * f5, this.shape9_28.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.8D, 0.8D);
		GL11.glTranslatef(-this.shape9_28.offsetX, -this.shape9_28.offsetY, -this.shape9_28.offsetZ);
		GL11.glTranslatef(-this.shape9_28.rotationPointX * f5, -this.shape9_28.rotationPointY * f5, -this.shape9_28.rotationPointZ * f5);
		this.shape9_28.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_23.offsetX, this.shape9_23.offsetY, this.shape9_23.offsetZ);
		GL11.glTranslatef(this.shape9_23.rotationPointX * f5, this.shape9_23.rotationPointY * f5, this.shape9_23.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.2D, 0.3D);
		GL11.glTranslatef(-this.shape9_23.offsetX, -this.shape9_23.offsetY, -this.shape9_23.offsetZ);
		GL11.glTranslatef(-this.shape9_23.rotationPointX * f5, -this.shape9_23.rotationPointY * f5, -this.shape9_23.rotationPointZ * f5);
		this.shape9_23.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_2.offsetX, this.shape9_2.offsetY, this.shape9_2.offsetZ);
		GL11.glTranslatef(this.shape9_2.rotationPointX * f5, this.shape9_2.rotationPointY * f5, this.shape9_2.rotationPointZ * f5);
		GL11.glScaled(0.9D, 0.3D, 0.7D);
		GL11.glTranslatef(-this.shape9_2.offsetX, -this.shape9_2.offsetY, -this.shape9_2.offsetZ);
		GL11.glTranslatef(-this.shape9_2.rotationPointX * f5, -this.shape9_2.rotationPointY * f5, -this.shape9_2.rotationPointZ * f5);
		this.shape9_2.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_3.offsetX, this.shape9_3.offsetY, this.shape9_3.offsetZ);
		GL11.glTranslatef(this.shape9_3.rotationPointX * f5, this.shape9_3.rotationPointY * f5, this.shape9_3.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.8D, 0.7D);
		GL11.glTranslatef(-this.shape9_3.offsetX, -this.shape9_3.offsetY, -this.shape9_3.offsetZ);
		GL11.glTranslatef(-this.shape9_3.rotationPointX * f5, -this.shape9_3.rotationPointY * f5, -this.shape9_3.rotationPointZ * f5);
		this.shape9_3.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_20.offsetX, this.shape9_20.offsetY, this.shape9_20.offsetZ);
		GL11.glTranslatef(this.shape9_20.rotationPointX * f5, this.shape9_20.rotationPointY * f5, this.shape9_20.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.8D, 0.4D);
		GL11.glTranslatef(-this.shape9_20.offsetX, -this.shape9_20.offsetY, -this.shape9_20.offsetZ);
		GL11.glTranslatef(-this.shape9_20.rotationPointX * f5, -this.shape9_20.rotationPointY * f5, -this.shape9_20.rotationPointZ * f5);
		this.shape9_20.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_17.offsetX, this.shape9_17.offsetY, this.shape9_17.offsetZ);
		GL11.glTranslatef(this.shape9_17.rotationPointX * f5, this.shape9_17.rotationPointY * f5, this.shape9_17.rotationPointZ * f5);
		GL11.glScaled(0.6D, 0.5D, 1.0D);
		GL11.glTranslatef(-this.shape9_17.offsetX, -this.shape9_17.offsetY, -this.shape9_17.offsetZ);
		GL11.glTranslatef(-this.shape9_17.rotationPointX * f5, -this.shape9_17.rotationPointY * f5, -this.shape9_17.rotationPointZ * f5);
		this.shape9_17.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.frl_2.offsetX, this.frl_2.offsetY, this.frl_2.offsetZ);
		GL11.glTranslatef(this.frl_2.rotationPointX * f5, this.frl_2.rotationPointY * f5, this.frl_2.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.5D, 0.4D);
		GL11.glTranslatef(-this.frl_2.offsetX, -this.frl_2.offsetY, -this.frl_2.offsetZ);
		GL11.glTranslatef(-this.frl_2.rotationPointX * f5, -this.frl_2.rotationPointY * f5, -this.frl_2.rotationPointZ * f5);
		this.frl_2.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_30.offsetX, this.shape9_30.offsetY, this.shape9_30.offsetZ);
		GL11.glTranslatef(this.shape9_30.rotationPointX * f5, this.shape9_30.rotationPointY * f5, this.shape9_30.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.8D, 0.8D);
		GL11.glTranslatef(-this.shape9_30.offsetX, -this.shape9_30.offsetY, -this.shape9_30.offsetZ);
		GL11.glTranslatef(-this.shape9_30.rotationPointX * f5, -this.shape9_30.rotationPointY * f5, -this.shape9_30.rotationPointZ * f5);
		this.shape9_30.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_4.offsetX, this.shape9_4.offsetY, this.shape9_4.offsetZ);
		GL11.glTranslatef(this.shape9_4.rotationPointX * f5, this.shape9_4.rotationPointY * f5, this.shape9_4.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.8D, 1.0D);
		GL11.glTranslatef(-this.shape9_4.offsetX, -this.shape9_4.offsetY, -this.shape9_4.offsetZ);
		GL11.glTranslatef(-this.shape9_4.rotationPointX * f5, -this.shape9_4.rotationPointY * f5, -this.shape9_4.rotationPointZ * f5);
		this.shape9_4.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.frl_1.offsetX, this.frl_1.offsetY, this.frl_1.offsetZ);
		GL11.glTranslatef(this.frl_1.rotationPointX * f5, this.frl_1.rotationPointY * f5, this.frl_1.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.5D, 0.4D);
		GL11.glTranslatef(-this.frl_1.offsetX, -this.frl_1.offsetY, -this.frl_1.offsetZ);
		GL11.glTranslatef(-this.frl_1.rotationPointX * f5, -this.frl_1.rotationPointY * f5, -this.frl_1.rotationPointZ * f5);
		this.frl_1.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.frl.offsetX, this.frl.offsetY, this.frl.offsetZ);
		GL11.glTranslatef(this.frl.rotationPointX * f5, this.frl.rotationPointY * f5, this.frl.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.5D, 0.4D);
		GL11.glTranslatef(-this.frl.offsetX, -this.frl.offsetY, -this.frl.offsetZ);
		GL11.glTranslatef(-this.frl.rotationPointX * f5, -this.frl.rotationPointY * f5, -this.frl.rotationPointZ * f5);
		this.frl.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_6.offsetX, this.shape9_6.offsetY, this.shape9_6.offsetZ);
		GL11.glTranslatef(this.shape9_6.rotationPointX * f5, this.shape9_6.rotationPointY * f5, this.shape9_6.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.5D, 0.6D);
		GL11.glTranslatef(-this.shape9_6.offsetX, -this.shape9_6.offsetY, -this.shape9_6.offsetZ);
		GL11.glTranslatef(-this.shape9_6.rotationPointX * f5, -this.shape9_6.rotationPointY * f5, -this.shape9_6.rotationPointZ * f5);
		this.shape9_6.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_10.offsetX, this.shape9_10.offsetY, this.shape9_10.offsetZ);
		GL11.glTranslatef(this.shape9_10.rotationPointX * f5, this.shape9_10.rotationPointY * f5, this.shape9_10.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.8D, 0.8D);
		GL11.glTranslatef(-this.shape9_10.offsetX, -this.shape9_10.offsetY, -this.shape9_10.offsetZ);
		GL11.glTranslatef(-this.shape9_10.rotationPointX * f5, -this.shape9_10.rotationPointY * f5, -this.shape9_10.rotationPointZ * f5);
		this.shape9_10.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_29.offsetX, this.shape9_29.offsetY, this.shape9_29.offsetZ);
		GL11.glTranslatef(this.shape9_29.rotationPointX * f5, this.shape9_29.rotationPointY * f5, this.shape9_29.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape9_29.offsetX, -this.shape9_29.offsetY, -this.shape9_29.offsetZ);
		GL11.glTranslatef(-this.shape9_29.rotationPointX * f5, -this.shape9_29.rotationPointY * f5, -this.shape9_29.rotationPointZ * f5);
		this.shape9_29.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_31.offsetX, this.shape9_31.offsetY, this.shape9_31.offsetZ);
		GL11.glTranslatef(this.shape9_31.rotationPointX * f5, this.shape9_31.rotationPointY * f5, this.shape9_31.rotationPointZ * f5);
		GL11.glScaled(0.2D, 0.6D, 0.6D);
		GL11.glTranslatef(-this.shape9_31.offsetX, -this.shape9_31.offsetY, -this.shape9_31.offsetZ);
		GL11.glTranslatef(-this.shape9_31.rotationPointX * f5, -this.shape9_31.rotationPointY * f5, -this.shape9_31.rotationPointZ * f5);
		this.shape9_31.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_26.offsetX, this.shape9_26.offsetY, this.shape9_26.offsetZ);
		GL11.glTranslatef(this.shape9_26.rotationPointX * f5, this.shape9_26.rotationPointY * f5, this.shape9_26.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.5D, 0.6D);
		GL11.glTranslatef(-this.shape9_26.offsetX, -this.shape9_26.offsetY, -this.shape9_26.offsetZ);
		GL11.glTranslatef(-this.shape9_26.rotationPointX * f5, -this.shape9_26.rotationPointY * f5, -this.shape9_26.rotationPointZ * f5);
		this.shape9_26.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_12.offsetX, this.shape9_12.offsetY, this.shape9_12.offsetZ);
		GL11.glTranslatef(this.shape9_12.rotationPointX * f5, this.shape9_12.rotationPointY * f5, this.shape9_12.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.4D, 0.5D);
		GL11.glTranslatef(-this.shape9_12.offsetX, -this.shape9_12.offsetY, -this.shape9_12.offsetZ);
		GL11.glTranslatef(-this.shape9_12.rotationPointX * f5, -this.shape9_12.rotationPointY * f5, -this.shape9_12.rotationPointZ * f5);
		this.shape9_12.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_24.offsetX, this.shape9_24.offsetY, this.shape9_24.offsetZ);
		GL11.glTranslatef(this.shape9_24.rotationPointX * f5, this.shape9_24.rotationPointY * f5, this.shape9_24.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.8D, 1.0D);
		GL11.glTranslatef(-this.shape9_24.offsetX, -this.shape9_24.offsetY, -this.shape9_24.offsetZ);
		GL11.glTranslatef(-this.shape9_24.rotationPointX * f5, -this.shape9_24.rotationPointY * f5, -this.shape9_24.rotationPointZ * f5);
		this.shape9_24.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_21.offsetX, this.shape9_21.offsetY, this.shape9_21.offsetZ);
		GL11.glTranslatef(this.shape9_21.rotationPointX * f5, this.shape9_21.rotationPointY * f5, this.shape9_21.rotationPointZ * f5);
		GL11.glScaled(0.4D, 0.4D, 0.5D);
		GL11.glTranslatef(-this.shape9_21.offsetX, -this.shape9_21.offsetY, -this.shape9_21.offsetZ);
		GL11.glTranslatef(-this.shape9_21.rotationPointX * f5, -this.shape9_21.rotationPointY * f5, -this.shape9_21.rotationPointZ * f5);
		this.shape9_21.render(f5);
		GL11.glPopMatrix();
		GL11.glPushMatrix();
		GL11.glTranslatef(this.shape9_13.offsetX, this.shape9_13.offsetY, this.shape9_13.offsetZ);
		GL11.glTranslatef(this.shape9_13.rotationPointX * f5, this.shape9_13.rotationPointY * f5, this.shape9_13.rotationPointZ * f5);
		GL11.glScaled(0.3D, 0.3D, 0.3D);
		GL11.glTranslatef(-this.shape9_13.offsetX, -this.shape9_13.offsetY, -this.shape9_13.offsetZ);
		GL11.glTranslatef(-this.shape9_13.rotationPointX * f5, -this.shape9_13.rotationPointY * f5, -this.shape9_13.rotationPointZ * f5);
		this.shape9_13.render(f5);
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
