package naturix.divinerpg.entities.assets.model.vethea.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Karos extends ModelBase
{
    //fields
    ModelRenderer head1;
    ModelRenderer body1;
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer head2;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer body10;
    ModelRenderer body11;
    ModelRenderer body12;
    ModelRenderer body13;
    ModelRenderer body14;
    ModelRenderer body15;
    ModelRenderer body16;
    ModelRenderer body17;
    ModelRenderer body18;
    ModelRenderer body19;
    ModelRenderer body20;
    ModelRenderer body21;
    ModelRenderer body22;
    ModelRenderer body23;

    public Karos()
    {
        textureWidth = 64;
        textureHeight = 32;

        head1 = new ModelRenderer(this, 0, 0);
        head1.addBox(-4F, -8F, -4F, 8, 8, 8);
        head1.setRotationPoint(8F, -11F, 0F);
        head1.setTextureSize(64, 32);
        head1.mirror = true;
        setRotation(head1, 0F, 0F, 0F);
        body1 = new ModelRenderer(this, 16, 16);
        body1.addBox(-4F, 0F, -2F, 8, 6, 4);
        body1.setRotationPoint(4F, -1F, 2F);
        body1.setTextureSize(64, 32);
        body1.mirror = true;
        setRotation(body1, 0F, 0F, 0F);
        rightarm1 = new ModelRenderer(this, 40, 0);
        rightarm1.addBox(-4F, -4F, -3F, 6, 4, 6);
        rightarm1.setRotationPoint(-10F, 2F, 0F);
        rightarm1.setTextureSize(64, 32);
        rightarm1.mirror = true;
        setRotation(rightarm1, 0F, 0F, 0F);
        leftarm1 = new ModelRenderer(this, 40, 0);
        leftarm1.addBox(-2F, -4F, -3F, 6, 4, 6);
        leftarm1.setRotationPoint(10F, 2F, 0F);
        leftarm1.setTextureSize(64, 32);
        leftarm1.mirror = true;
        setRotation(leftarm1, 0F, 0F, 0F);
        head2 = new ModelRenderer(this, 0, 0);
        head2.addBox(-4F, -8F, -4F, 8, 8, 8);
        head2.setRotationPoint(-8F, -11F, 0F);
        head2.setTextureSize(64, 32);
        head2.mirror = true;
        setRotation(head2, 0F, 0F, 0F);
        rightarm2 = new ModelRenderer(this, 40, 16);
        rightarm2.addBox(-3F, -2F, -2F, 4, 12, 4);
        rightarm2.setRotationPoint(-10F, 2F, 0F);
        rightarm2.setTextureSize(64, 32);
        rightarm2.mirror = true;
        setRotation(rightarm2, 0F, 0F, 0F);
        leftarm2 = new ModelRenderer(this, 40, 16);
        leftarm2.addBox(-1F, -2F, -2F, 4, 12, 4);
        leftarm2.setRotationPoint(10F, 2F, 0F);
        leftarm2.setTextureSize(64, 32);
        leftarm2.mirror = true;
        setRotation(leftarm2, 0F, 0F, 0F);
        body2 = new ModelRenderer(this, 16, 16);
        body2.addBox(-4F, 0F, -2F, 8, 6, 4);
        body2.setRotationPoint(0F, -7F, 2F);
        body2.setTextureSize(64, 32);
        body2.mirror = true;
        setRotation(body2, 0F, 0F, 0F);
        body3 = new ModelRenderer(this, 16, 16);
        body3.addBox(-4F, 0F, -2F, 8, 6, 4);
        body3.setRotationPoint(-4F, -1F, 2F);
        body3.setTextureSize(64, 32);
        body3.mirror = true;
        setRotation(body3, 0F, 0F, 0F);
        body4 = new ModelRenderer(this, 16, 16);
        body4.addBox(-4F, 0F, -2F, 8, 6, 4);
        body4.setRotationPoint(-4F, -1F, -2F);
        body4.setTextureSize(64, 32);
        body4.mirror = true;
        setRotation(body4, 0F, 0F, 0F);
        body5 = new ModelRenderer(this, 16, 16);
        body5.addBox(-4F, 0F, -2F, 8, 6, 4);
        body5.setRotationPoint(4F, -1F, -2F);
        body5.setTextureSize(64, 32);
        body5.mirror = true;
        setRotation(body5, 0F, 0F, 0F);
        body6 = new ModelRenderer(this, 16, 16);
        body6.addBox(1F, -2F, -3F, 4, 4, 4);
        body6.setRotationPoint(6F, -6F, 1F);
        body6.setTextureSize(64, 32);
        body6.mirror = true;
        setRotation(body6, 0F, 0F, -0.6108652F);
        body7 = new ModelRenderer(this, 27, 0);
        body7.addBox(-4F, 0F, -2F, 1, 6, 1);
        body7.setRotationPoint(7F, 11F, 5F);
        body7.setTextureSize(64, 32);
        body7.mirror = true;
        setRotation(body7, 0F, 0F, 0F);
        body8 = new ModelRenderer(this, 16, 16);
        body8.addBox(-4F, 0F, -2F, 8, 6, 4);
        body8.setRotationPoint(0F, 5F, 2F);
        body8.setTextureSize(64, 32);
        body8.mirror = true;
        setRotation(body8, 0F, 0F, 0F);
        body9 = new ModelRenderer(this, 16, 16);
        body9.addBox(-4F, 0F, -2F, 8, 6, 4);
        body9.setRotationPoint(0F, 5F, -2F);
        body9.setTextureSize(64, 32);
        body9.mirror = true;
        setRotation(body9, 0F, 0F, 0F);
        body10 = new ModelRenderer(this, 27, 0);
        body10.addBox(-4F, 0F, -2F, 1, 6, 1);
        body10.setRotationPoint(0F, 11F, -2F);
        body10.setTextureSize(64, 32);
        body10.mirror = true;
        setRotation(body10, 0F, 0F, 0F);
        body11 = new ModelRenderer(this, 27, 0);
        body11.addBox(-4F, 0F, -2F, 1, 6, 1);
        body11.setRotationPoint(2F, 11F, 3F);
        body11.setTextureSize(64, 32);
        body11.mirror = true;
        setRotation(body11, 0F, 0F, 0F);
        body12 = new ModelRenderer(this, 27, 0);
        body12.addBox(-4F, 0F, -2F, 1, 6, 1);
        body12.setRotationPoint(1F, 11F, 5F);
        body12.setTextureSize(64, 32);
        body12.mirror = true;
        setRotation(body12, 0F, 0F, 0F);
        body13 = new ModelRenderer(this, 27, 0);
        body13.addBox(-4F, 0F, -2F, 1, 6, 1);
        body13.setRotationPoint(5F, 11F, 4F);
        body13.setTextureSize(64, 32);
        body13.mirror = true;
        setRotation(body13, 0F, 0F, 0F);
        body14 = new ModelRenderer(this, 27, 0);
        body14.addBox(-4F, 0F, -2F, 1, 6, 1);
        body14.setRotationPoint(6F, 11F, 0F);
        body14.setTextureSize(64, 32);
        body14.mirror = true;
        setRotation(body14, 0F, 0F, 0F);
        body15 = new ModelRenderer(this, 27, 0);
        body15.addBox(-4F, 0F, -2F, 1, 6, 1);
        body15.setRotationPoint(4F, 11F, 1F);
        body15.setTextureSize(64, 32);
        body15.mirror = true;
        setRotation(body15, 0F, 0F, 0F);
        body16 = new ModelRenderer(this, 27, 0);
        body16.addBox(-4F, 0F, -2F, 1, 6, 1);
        body16.setRotationPoint(7F, 11F, -2F);
        body16.setTextureSize(64, 32);
        body16.mirror = true;
        setRotation(body16, 0F, 0F, 0F);
        body17 = new ModelRenderer(this, 27, 0);
        body17.addBox(-4F, 0F, -2F, 1, 6, 1);
        body17.setRotationPoint(3F, 11F, -1F);
        body17.setTextureSize(64, 32);
        body17.mirror = true;
        setRotation(body17, 0F, 0F, 0F);
        body18 = new ModelRenderer(this, 16, 16);
        body18.addBox(-4F, 0F, -2F, 8, 6, 4);
        body18.setRotationPoint(0F, -7F, -2F);
        body18.setTextureSize(64, 32);
        body18.mirror = true;
        setRotation(body18, 0F, 0F, 0F);
        body19 = new ModelRenderer(this, 16, 16);
        body19.addBox(-5F, -2F, -3F, 4, 4, 4);
        body19.setRotationPoint(-5F, -6F, 1F);
        body19.setTextureSize(64, 32);
        body19.mirror = true;
        setRotation(body19, 0F, 0F, 0.6108652F);
        body20 = new ModelRenderer(this, 16, 16);
        body20.addBox(-4F, -1F, -2F, 7, 2, 2);
        body20.setRotationPoint(6F, -6F, 1F);
        body20.setTextureSize(64, 32);
        body20.mirror = true;
        setRotation(body20, 0F, 0F, -0.6108652F);
        body21 = new ModelRenderer(this, 32, 11);
        body21.addBox(-4F, -1F, -2F, 5, 2, 2);
        body21.setRotationPoint(9F, -11F, 1F);
        body21.setTextureSize(64, 32);
        body21.mirror = true;
        setRotation(body21, 0F, 0F, -1.570796F);
        body22 = new ModelRenderer(this, 16, 16);
        body22.addBox(-4F, -1F, -2F, 7, 2, 2);
        body22.setRotationPoint(-5F, -6F, 1F);
        body22.setTextureSize(64, 32);
        body22.mirror = true;
        setRotation(body22, 0F, 0F, 0.6108652F);
        body23 = new ModelRenderer(this, 32, 11);
        body23.addBox(-4F, -1F, -2F, 5, 2, 2);
        body23.setRotationPoint(-8F, -11F, 1F);
        body23.setTextureSize(64, 32);
        body23.mirror = true;
        setRotation(body23, 0F, 0F, -1.570796F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        head1.render(f5);
        body1.render(f5);
        rightarm1.render(f5);
        leftarm1.render(f5);
        head2.render(f5);
        rightarm2.render(f5);
        leftarm2.render(f5);
        body2.render(f5);
        body3.render(f5);
        body4.render(f5);
        body5.render(f5);
        body6.render(f5);
        body7.render(f5);
        body8.render(f5);
        body9.render(f5);
        body10.render(f5);
        body11.render(f5);
        body12.render(f5);
        body13.render(f5);
        body14.render(f5);
        body15.render(f5);
        body16.render(f5);
        body17.render(f5);
        body18.render(f5);
        body19.render(f5);
        body20.render(f5);
        body21.render(f5);
        body22.render(f5);
        body23.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {	    
        this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
        this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;

        this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
        this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
    }

}
