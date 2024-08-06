    package deerguy.roboticdeers.datagen;

    import deerguy.roboticdeers.block.ModBlocks;
    import deerguy.roboticdeers.item.ModItems;
    import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
    import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
    import net.minecraft.data.client.BlockStateModelGenerator;
    import net.minecraft.data.client.ItemModelGenerator;
    import net.minecraft.data.client.Models;

    public class ModModelTagProvider extends FabricModelProvider {
        public ModModelTagProvider(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SYFAOC);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SYFAOC_RED);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_SYFAOC);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_SYFAOC_RED);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MANTAM_ORE);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);
            blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITANIUM_BLOCK);


        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {

            itemModelGenerator.register(ModItems.MANTAM_SHARD, Models.GENERATED);
            itemModelGenerator.register(ModItems.MANTAM_XON_CHARGED, Models.GENERATED);
            itemModelGenerator.register(ModItems.MANTAM_XON, Models.GENERATED);
            itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
            itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);
            itemModelGenerator.register(ModItems.NUTRITIONBAG, Models.GENERATED);
            itemModelGenerator.register(ModItems.POTATOBAG, Models.GENERATED);
        }
    }
