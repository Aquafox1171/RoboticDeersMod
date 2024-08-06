package deerguy.roboticdeers.datagen;


import deerguy.roboticdeers.block.ModBlocks;
import deerguy.roboticdeers.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableTagProvider extends FabricBlockLootTableProvider {
    public ModLootTableTagProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TITANIUM_BLOCK);
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.COBBLED_SYFAOC);
        addDrop(ModBlocks.COBBLED_SYFAOC_RED);
        addDrop(ModBlocks.SYFAOC, drops(ModBlocks.SYFAOC, ModBlocks.COBBLED_SYFAOC));
        addDrop(ModBlocks.SYFAOC_RED, drops(ModBlocks.SYFAOC_RED, ModBlocks.COBBLED_SYFAOC_RED));
        addDrop(ModBlocks.TITANIUM_ORE, oreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM));
        addDrop(ModBlocks.MANTAM_ORE, oreDrops(ModBlocks.MANTAM_ORE, ModItems.MANTAM_SHARD));
    }
}
