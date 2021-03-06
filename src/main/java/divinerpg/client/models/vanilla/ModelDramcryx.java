package divinerpg.client.models.vanilla;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelDramcryx<T extends Entity> extends SegmentedModel<T> {
    //fields
    ModelRenderer WolfHead;
    ModelRenderer Body;
    ModelRenderer Mane;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;
    ModelRenderer Tail;
    ModelRenderer Ear1;
    ModelRenderer Ear2;
    ModelRenderer Nose;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;

    public ModelDramcryx() {
        texWidth = 64;
        texHeight = 32;
        WolfHead = new ModelRenderer(this, 0, 0);
        WolfHead.addBox(-3F, -3F, -2F, 10, 9, 4);
        WolfHead.setPos(-3F, 11.5F, -7F);
        WolfHead.setTexSize(64, 32);
        WolfHead.mirror = true;
        setRotation(WolfHead, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 18, 14);
        Body.addBox(-4F, -2F, -3F, 6, 9, 6);
        Body.setPos(0F, 14F, 2F);
        Body.setTexSize(64, 32);
        Body.mirror = true;
        setRotation(Body, ((float) Math.PI / 2F), 0F, 0F);
        Mane = new ModelRenderer(this, 21, 0);
        Mane.addBox(-4F, -3F, -3F, 8, 10, 7);
        Mane.setPos(-1F, 14F, -2F);
        Mane.setTexSize(64, 32);
        Mane.mirror = true;
        setRotation(Mane, ((float) Math.PI / 2F), 0F, 0F);
        Leg1 = new ModelRenderer(this, 0, 18);
        Leg1.addBox(-1F, 0F, -1F, 3, 8, 3);
        Leg1.setPos(-5.5F, 16F, 7F);
        Leg1.setTexSize(64, 32);
        Leg1.mirror = true;
        setRotation(Leg1, 0F, 0F, 0F);
        Leg2 = new ModelRenderer(this, 0, 18);
        Leg2.addBox(-1F, 0F, -1F, 3, 8, 3);
        Leg2.setPos(2.5F, 16F, 7F);
        Leg2.setTexSize(64, 32);
        Leg2.mirror = true;
        setRotation(Leg2, 0F, 0F, 0F);
        Leg3 = new ModelRenderer(this, 0, 18);
        Leg3.addBox(-1F, 0F, -1F, 3, 8, 3);
        Leg3.setPos(-6.5F, 16F, -4F);
        Leg3.setTexSize(64, 32);
        Leg3.mirror = true;
        setRotation(Leg3, 0F, 0F, 0F);
        Leg4 = new ModelRenderer(this, 0, 18);
        Leg4.addBox(-1F, 0F, -1F, 3, 8, 3);
        Leg4.setPos(3.5F, 16F, -4F);
        Leg4.setTexSize(64, 32);
        Leg4.mirror = true;
        setRotation(Leg4, 0F, 0F, 0F);
        Tail = new ModelRenderer(this, 22, 13);
        Tail.addBox(-1F, 0F, -1F, 4, 12, 4);
        Tail.setPos(-2F, 14F, 7F);
        Tail.setTexSize(64, 32);
        Tail.mirror = true;
        setRotation(Tail, 1.130069F, 0F, 0F);
        Ear1 = new ModelRenderer(this, 16, 14);
        Ear1.addBox(-3F, -5F, 0F, 2, 4, 1);
        Ear1.setPos(-2F, 9.9F, -7F);
        Ear1.setTexSize(64, 32);
        Ear1.mirror = true;
        setRotation(Ear1, 0.3490659F, 0F, 0F);
        Ear2 = new ModelRenderer(this, 16, 14);
        Ear2.addBox(1F, -5F, 0F, 2, 4, 1);
        Ear2.setPos(0F, 9.9F, -7F);
        Ear2.setTexSize(64, 32);
        Ear2.mirror = true;
        setRotation(Ear2, 0.3490659F, 0F, 0F);
        Nose = new ModelRenderer(this, 0, 20);
        Nose.addBox(-2F, 0F, -5F, 6, 5, 4);
        Nose.setPos(-2F, 11.5F, -8F);
        Nose.setTexSize(64, 32);
        Nose.mirror = true;
        setRotation(Nose, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 52, 15);
        Shape1.addBox(-1F, -10F, 0F, 2, 10, 4);
        Shape1.setPos(-1F, 11F, 4F);
        Shape1.setTexSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, -1.003822F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 52, 15);
        Shape2.addBox(0F, 0F, 0F, 2, 13, 4);
        Shape2.setPos(-2F, 0F, 7F);
        Shape2.setTexSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, -0.6320364F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 52, 15);
        Shape3.addBox(0F, 0F, 0F, 2, 13, 4);
        Shape3.setPos(-2F, -2F, -5.466667F);
        Shape3.setTexSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0.1115358F, 0F, 0F);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {

        this.Leg1.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.Leg2.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
        this.Leg3.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
        this.Leg4.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(WolfHead, Body, Mane, Leg1, Leg2, Leg3, Leg4, Tail, Ear1, Ear2, Nose, Shape1, Shape2, Shape3);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }

}
