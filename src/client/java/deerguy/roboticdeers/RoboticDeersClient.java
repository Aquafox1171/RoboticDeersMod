package deerguy.roboticdeers;

import deerguy.roboticdeers.entity.ModEntities;
import deerguy.roboticdeers.entity.client.CopperRoboticDeerModel;
import deerguy.roboticdeers.entity.client.CopperRoboticDeerRender;
import deerguy.roboticdeers.entity.client.ModModelLayers;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class RoboticDeersClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(ModEntities.COPPER_ROBOTIC_DEER, CopperRoboticDeerRender::new);
		EntityModelLayerRegistry.registerModelLayer(ModModelLayers.COPPER_ROBOTIC_DEER, CopperRoboticDeerModel::getTexturedModelData);
	}
}