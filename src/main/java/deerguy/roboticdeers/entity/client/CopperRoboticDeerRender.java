package deerguy.roboticdeers.entity.client;

import deerguy.roboticdeers.RoboticDeers;
import deerguy.roboticdeers.entity.custom.CopperRoboticDeerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class CopperRoboticDeerRender extends MobEntityRenderer<CopperRoboticDeerEntity, CopperRoboticDeerModel<CopperRoboticDeerEntity>> {

    private static final Identifier TEXTURE = Identifier.of(RoboticDeers.MOD_ID,"textures/entity/copper_robotic_deer.png");

    public CopperRoboticDeerRender(EntityRendererFactory.Context context) {
        super(context, new CopperRoboticDeerModel<>(context.getPart(ModModelLayers.COPPER_ROBOTIC_DEER)),1f);
    }

    @Override
    public Identifier getTexture(CopperRoboticDeerEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(CopperRoboticDeerEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()){
            matrixStack.scale(0.5f,0.5f,0.5f);
        }else {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
