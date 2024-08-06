package deerguy.roboticdeers.entity;

import deerguy.roboticdeers.RoboticDeers;
import deerguy.roboticdeers.entity.custom.CopperRoboticDeerEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<CopperRoboticDeerEntity> COPPER_ROBOTIC_DEER = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(RoboticDeers.MOD_ID, "copper_robotic_deer"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,CopperRoboticDeerEntity::new).dimensions(EntityDimensions.fixed(1f,1f)).build());
}
