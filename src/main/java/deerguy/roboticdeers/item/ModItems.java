package deerguy.roboticdeers.item;

import deerguy.roboticdeers.RoboticDeers;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item TITANIUM = registerItem("titanium", new Item(new Item.Settings()));
    public static final Item RAW_TITANIUM = registerItem("raw_titanium", new Item(new Item.Settings()));

    public static final Item POTATOBAG = registerItem("potato_bag", new Item(new Item.Settings().food(ModFoodComponents.POTATOBAG)));
    public static final Item NUTRITIONBAG = registerItem("nutrition_bag", new Item(new Item.Settings().food(ModFoodComponents.NUTRITIONBAG)));
    public static final Item MANTAM_SHARD = registerItem("mantam_shard", new Item(new Item.Settings()));
    public static final Item MANTAM_XON = registerItem("mantam_xon", new Item(new Item.Settings()));
    public static final Item MANTAM_XON_CHARGED = registerItem("mantam_xon_charged", new Item(new Item.Settings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries enteries){
        enteries.add(TITANIUM);
        enteries.add(RAW_TITANIUM);
    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(RoboticDeers.MOD_ID, name), item);
    }

    public static void registerModItems(){
        RoboticDeers.LOGGER.info("Registering Mod Items for " + RoboticDeers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
