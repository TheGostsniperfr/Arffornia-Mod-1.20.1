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

    public static final Item RAW_SILICON = registerItem("raw_silicon", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){

        entries.add(RAW_SILICON);
    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ArfforniaMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ArfforniaMod.LOGGER.info("Registering Mod Items for " + ArfforniaMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((ModItems::addItemsToIngredientItemGroup));
    }
}
