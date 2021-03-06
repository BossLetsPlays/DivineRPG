package divinerpg.client.models.twilight;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelSoulStealer<T extends Entity> extends SegmentedModel<T> {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape2;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer back;
    ModelRenderer back1;
    ModelRenderer back2;
    ModelRenderer back3;
    ModelRenderer back4;

    public ModelSoulStealer()
    {
        this.texWidth = 64;
        this.texHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setPos(0.0F, 0.0F, 0.0F);
        this.head.setTexSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setPos(0.0F, 0.0F, 0.0F);
        this.body.setTexSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setPos(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTexSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setPos(5.0F, 2.0F, 0.0F);
        this.leftarm.setTexSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setPos(-2.0F, 12.0F, 0.0F);
        this.rightleg.setTexSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setPos(2.0F, 12.0F, 0.0F);
        this.leftleg.setTexSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 8, 0);
        this.Shape1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape1.setPos(2.0F, -8.0F, -9.0F);
        this.Shape1.setTexSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 8, 0);
        this.Shape3.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape3.setPos(-4.0F, -8.0F, -9.0F);
        this.Shape3.setTexSize(64, 32);
        this.Shape3.mirror = true;
        this.setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 9, 0);
        this.Shape2.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape2.setPos(4.0F, -6.0F, -4.0F);
        this.Shape2.setTexSize(64, 32);
        this.Shape2.mirror = true;
        this.setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 9, 0);
        this.Shape4.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape4.setPos(-8.0F, -6.0F, -4.0F);
        this.Shape4.setTexSize(64, 32);
        this.Shape4.mirror = true;
        this.setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
        this.Shape5 = new ModelRenderer(this, 9, 0);
        this.Shape5.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape5.setPos(4.0F, -3.0F, -4.0F);
        this.Shape5.setTexSize(64, 32);
        this.Shape5.mirror = true;
        this.setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
        this.Shape6 = new ModelRenderer(this, 9, 0);
        this.Shape6.addBox(0.0F, 0.0F, 0.0F, 4, 2, 2);
        this.Shape6.setPos(-8.0F, -3.0F, -4.0F);
        this.Shape6.setTexSize(64, 32);
        this.Shape6.mirror = true;
        this.setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
        this.Shape7 = new ModelRenderer(this, 8, 0);
        this.Shape7.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape7.setPos(6.0F, -6.0F, -9.0F);
        this.Shape7.setTexSize(64, 32);
        this.Shape7.mirror = true;
        this.setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
        this.Shape8 = new ModelRenderer(this, 8, 0);
        this.Shape8.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape8.setPos(6.0F, -3.0F, -9.0F);
        this.Shape8.setTexSize(64, 32);
        this.Shape8.mirror = true;
        this.setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
        this.Shape9 = new ModelRenderer(this, 8, 0);
        this.Shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape9.setPos(-8.0F, -6.0F, -9.0F);
        this.Shape9.setTexSize(64, 32);
        this.Shape9.mirror = true;
        this.setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
        this.Shape10 = new ModelRenderer(this, 8, 0);
        this.Shape10.addBox(0.0F, 0.0F, 0.0F, 2, 2, 5);
        this.Shape10.setPos(-8.0F, -3.0F, -9.0F);
        this.Shape10.setTexSize(64, 32);
        this.Shape10.mirror = true;
        this.setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
        this.back = new ModelRenderer(this, 4, 0);
        this.back.addBox(0.0F, 0.0F, 0.0F, 4, 4, 5);
        this.back.setPos(-2.0F, 0.0F, 2.0F);
        this.back.setTexSize(64, 32);
        this.back.mirror = true;
        this.setRotation(this.back, 0.0F, 0.0F, 0.0F);
        this.back1 = new ModelRenderer(this, 8, 0);
        this.back1.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2);
        this.back1.setPos(2.0F, 0.0F, 5.0F);
        this.back1.setTexSize(64, 32);
        this.back1.mirror = true;
        this.setRotation(this.back1, 0.0F, 0.0F, 0.0F);
        this.back2 = new ModelRenderer(this, 8, 0);
        this.back2.addBox(0.0F, 0.0F, 0.0F, 5, 2, 2);
        this.back2.setPos(-7.0F, 0.0F, 5.0F);
        this.back2.setTexSize(64, 32);
        this.back2.mirror = true;
        this.setRotation(this.back2, 0.0F, 0.0F, 0.0F);
        this.back3 = new ModelRenderer(this, 15, 25);
        this.back3.addBox(0.0F, 0.0F, 0.0F, 9, 2, 2);
        this.back3.setPos(5.0F, 0.0F, 5.0F);
        this.back3.setTexSize(64, 32);
        this.back3.mirror = true;
        this.setRotation(this.back3, 0.0F, 0.0F, -((float)Math.PI / 2F));
        this.back4 = new ModelRenderer(this, 15, 25);
        this.back4.addBox(0.0F, -1.0F, 0.0F, 9, 2, 2);
        this.back4.setPos(-6.0F, 0.0F, 5.0F);
        this.back4.setTexSize(64, 32);
        this.back4.mirror = true;
        this.setRotation(this.back4, 0.0F, 0.0F, -((float)Math.PI / 2F));
    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(head, body, rightarm, leftarm, rightleg, leftleg, Shape1, Shape2, Shape3, Shape4, Shape5, Shape6, Shape7, Shape8, Shape9, Shape10, back, back1, back2, back3, back4);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.xRot = var2;
        var1.yRot = var3;
        var1.zRot = var4;
    }

    @Override
    public void setupAnim(T e, float var1, float var2, float var3, float var4, float var5)
    {
        this.rightarm.xRot = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.leftarm.xRot = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.rightarm.zRot = 0.0F;
        this.leftarm.zRot = 0.0F;
        this.rightleg.xRot = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.leftleg.xRot = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
        this.rightleg.yRot = 0.0F;
        this.leftleg.yRot = 0.0F;
    }
}
