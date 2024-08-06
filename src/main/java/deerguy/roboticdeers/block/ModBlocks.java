package deerguy.roboticdeers.block;

import deerguy.roboticdeers.RoboticDeers;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f)));
    public static final Block RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).strength(3.75f)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(3.5f)));
    public static final Block SYFAOC = registerBlock("syfaoc", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.25f)));
    public static final Block SYFAOC_RED = registerBlock("syfaoc_red", new Block(FabricBlockSettings.copyOf(Blocks.STONE).strength(1.0f)));
    public static final Block COBBLED_SYFAOC = registerBlock("cobbled_syfaoc", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(2f)));
    public static final Block COBBLED_SYFAOC_RED = registerBlock("cobbled_syfaoc_red", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).strength(2.25f)));
    public static final Block MANTAM_ORE = registerBlock("mantam_ore", new Block(FabricBlockSettings.copyOf(Blocks.COAL_BLOCK)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(RoboticDeers.MOD_ID,name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, Identifier.of(RoboticDeers.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        RoboticDeers.LOGGER.info("Registering mod blocks for " + RoboticDeers.MOD_ID);
    }
}
