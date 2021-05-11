package divinerpg.client.renders.layer;

import com.mojang.blaze3d.matrix.*;
import divinerpg.client.models.boss.*;
import divinerpg.entities.boss.*;
import divinerpg.registries.*;
import net.minecraft.client.*;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.client.renderer.entity.layers.*;
import net.minecraft.client.renderer.model.*;
import net.minecraft.util.math.vector.*;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ReyvorBowLayer extends LayerRenderer<EntityReyvor, ModelDensos<EntityReyvor>> {
    public ReyvorBowLayer(IEntityRenderer<EntityReyvor, ModelDensos<EntityReyvor>> p_i50935_1_) {
        super(p_i50935_1_);
    }

    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, EntityReyvor entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        matrixStackIn.pushPose();
        ModelRenderer modelrenderer = this.getParentModel().rightarm;
        modelrenderer.translateAndRotate(matrixStackIn);
        matrixStackIn.translate(-0.0625F, 0.4375F, 0.0625F);
        matrixStackIn.translate(-0.125F, -0.14f, -0.02);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(-90.0F));
//            matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-45.0F));
        Minecraft.getInstance().getItemRenderer().renderStatic(entitylivingbaseIn, ItemRegistry.twilightBow.getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, false, matrixStackIn, bufferIn, entitylivingbaseIn.level, packedLightIn, LivingRenderer.getOverlayCoords(entitylivingbaseIn, 0.0F));

        matrixStackIn.popPose();
    }
}