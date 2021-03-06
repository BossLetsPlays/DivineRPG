package divinerpg.client.models.vanilla;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelHusk<T extends Entity> extends SegmentedModel<T> {
    //fields
    ModelRenderer head;
    ModelRenderer tooth2;
    ModelRenderer tooth1;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg2;
    ModelRenderer leg1;
    ModelRenderer body;

    public ModelHusk() {
        texWidth = 64;
        texHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -4F, -6F, 8, 8, 6);
        head.setPos(0F, 4F, -7F);
        head.setTexSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        tooth2 = new ModelRenderer(this, 22, 0);
        tooth2.addBox(2F, -7F, 6F, 1, 3, 1);
        tooth2.setPos(0F, 3F, -6F);
        tooth2.setTexSize(64, 32);
        tooth2.mirror = true;
        setRotation(tooth2, -3.141593F, 0F, 0F);
        tooth1 = new ModelRenderer(this, 22, 0);
        tooth1.addBox(-3F, -7F, 6F, 1, 3, 1);
        tooth1.setPos(0F, 3F, -6F);
        tooth1.setTexSize(64, 32);
        tooth1.mirror = true;
        setRotation(tooth1, -3.141593F, 0F, 0F);
        leg3 = new ModelRenderer(this, 0, 13);
        leg3.addBox(-3F, 0F, -3F, 4, 15, 4);
        leg3.setPos(-3F, 9F, -5F);
        leg3.setTexSize(64, 32);
        leg3.mirror = true;
        setRotation(leg3, 0F, 0F, 0F);
        leg4 = new ModelRenderer(this, 0, 13);
        leg4.addBox(-1F, 0F, -3F, 4, 15, 4);
        leg4.setPos(3F, 9F, -5F);
        leg4.setTexSize(64, 32);
        leg4.mirror = true;
        setRotation(leg4, 0F, 0F, 0F);
        leg2 = new ModelRenderer(this, 0, 16);
        leg2.addBox(-1F, 0F, -2F, 4, 12, 4);
        leg2.setPos(3F, 12F, 5F);
        leg2.setTexSize(64, 32);
        leg2.mirror = true;
        setRotation(leg2, 0F, 0F, 0F);
        leg1 = new ModelRenderer(this, 0, 16);
        leg1.addBox(-3F, 0F, -2F, 4, 12, 4);
        leg1.setPos(-3F, 12F, 5F);
        leg1.setTexSize(64, 32);
        leg1.mirror = true;
        setRotation(leg1, 0F, 0F, 0F);
        body = new ModelRenderer(this, 18, 4);
        body.addBox(-6F, -10F, -7F, 12, 18, 10);
        body.setPos(0F, 5F, 2F);
        body.setTexSize(64, 32);
        body.mirror = true;
        setRotation(body, 1.362596F, 0F, 0F);
    }

    @Override
    public void setupAnim(T entityIn, float f, float f1, float ageInTicks, float netHeadYaw, float headPitch) {
        this.leg1.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg2.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
        this.leg3.xRot = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg4.xRot = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(head, tooth2, tooth1, leg3, leg4, leg2, leg1, body);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }
}
