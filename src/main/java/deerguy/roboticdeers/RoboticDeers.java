package deerguy.roboticdeers;

import deerguy.roboticdeers.block.ModBlocks;
import deerguy.roboticdeers.entity.ModEntities;
import deerguy.roboticdeers.entity.custom.CopperRoboticDeerEntity;
import deerguy.roboticdeers.item.ModItemGroups;
import deerguy.roboticdeers.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RoboticDeers implements ModInitializer {
	public static final String MOD_ID = "roboticdeers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.MANTAM_XON_CHARGED, 10);
		FabricDefaultAttributeRegistry.register(ModEntities.COPPER_ROBOTIC_DEER, CopperRoboticDeerEntity.createCopperRoboticDeerAttributes());
	}
}