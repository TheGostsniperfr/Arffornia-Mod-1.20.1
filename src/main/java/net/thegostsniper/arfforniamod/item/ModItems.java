package net.thegostsniper.arfforniamod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thegostsniper.arfforniamod.ArfforniaMod;

public class ModItems {

    //raw
    public static final Item RAW_SILICON = registerItem("raw_silicon", new Item(new FabricItemSettings()));
    public static final Item RAW_BAUXITE = registerItem("raw_bauxite", new Item(new FabricItemSettings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings()));
    public static final Item RAW_URANIUM = registerItem("raw_uranium", new Item(new FabricItemSettings()));


    //plates :
    public static final Item COAL_PLATE = registerItem("coal_plate", new Item(new FabricItemSettings()));
    public static final Item GOLD_PLATE = registerItem("gold_plate", new Item(new FabricItemSettings()));
    public static final Item IRON_PLATE = registerItem("iron_plate", new Item(new FabricItemSettings()));
    public static final Item LEAD_PLATE = registerItem("lead_plate", new Item(new FabricItemSettings()));
    public static final Item REDSTONE_PLATE = registerItem("redstone_plate", new Item(new FabricItemSettings()));
    public static final Item SILICON_PLATE = registerItem("silicon_plate", new Item(new FabricItemSettings()));
    public static final Item URANIUM_PLATE = registerItem("uranium_plate", new Item(new FabricItemSettings()));


    //ingots :
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final Item SILICON_INGOT = registerItem("silicon_ingot", new Item(new FabricItemSettings()));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new FabricItemSettings()));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){


    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ArfforniaMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ArfforniaMod.LOGGER.info("Registering Mod Items for " + ArfforniaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((ModItems::addItemsToIngredientItemGroup));
    }
}
