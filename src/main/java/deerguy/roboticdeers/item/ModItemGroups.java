package deerguy.roboticdeers.item;

import deerguy.roboticdeers.RoboticDeers;
import deerguy.roboticdeers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TERAFORM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RoboticDeers.MOD_ID, "teraform"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.teraform"))
            .icon(() -> new ItemStack(ModItems.TITANIUM)).entries((dispalyContext, entries) -> {
                entries.add(ModItems.TITANIUM);
                entries.add(ModItems.RAW_TITANIUM);
                entries.add(ModBlocks.TITANIUM_BLOCK);
                entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                entries.add(ModBlocks.TITANIUM_ORE);

                entries.add(ModBlocks.MANTAM_ORE);
                entries.add(ModItems.MANTAM_SHARD);
                entries.add(ModItems.MANTAM_XON);
                entries.add(ModItems.MANTAM_XON_CHARGED);

                entries.add(ModBlocks.SYFAOC);
                entries.add(ModBlocks.SYFAOC_RED);
                entries.add(ModBlocks.COBBLED_SYFAOC);
                entries.add(ModBlocks.COBBLED_SYFAOC_RED);

                entries.add(ModItems.POTATOBAG);
                entries.add(ModItems.NUTRITIONBAG);
            }).build());


    public static void registerItemGroups(){
        RoboticDeers.LOGGER.info("Registering item groups for " + RoboticDeers.MOD_ID);
    }
}
