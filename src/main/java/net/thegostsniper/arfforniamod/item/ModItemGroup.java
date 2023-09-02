package net.thegostsniper.arfforniamod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thegostsniper.arfforniamod.ArfforniaMod;
import net.thegostsniper.arfforniamod.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup SILICON_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArfforniaMod.MOD_ID, "silicon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.silicon"))
                    .icon(()-> new ItemStack(ModItems.RAW_SILICON)).entries((displayContext, entries) -> {
        //raw :
        entries.add(ModItems.RAW_SILICON);
        entries.add(ModItems.RAW_LEAD);
        entries.add(ModItems.RAW_BAUXITE);
        entries.add(ModItems.RAW_URANIUM);


        //plates :
        entries.add(ModItems.COAL_PLATE);
        entries.add(ModItems.GOLD_PLATE);
        entries.add(ModItems.IRON_PLATE);
        entries.add(ModItems.LEAD_PLATE);
        entries.add(ModItems.REDSTONE_PLATE);
        entries.add(ModItems.SILICON_PLATE);
        entries.add(ModItems.URANIUM_PLATE);

        //ingots :
        entries.add(ModItems.LEAD_INGOT);
        entries.add(ModItems.SILICON_INGOT);
        entries.add(ModItems.URANIUM_INGOT);

        //blocks :
        entries.add(ModBlocks.SILICON_ORE);
        entries.add(ModBlocks.BAUXITE_ORE);
        entries.add(ModBlocks.LEAD_ORE);
        entries.add(ModBlocks.URANIUM_ORE);


        entries.add(ModBlocks.SILICON_BLOCK);
        entries.add(ModBlocks.URANIUM_BLOCK);
        entries.add(ModBlocks.LEAD_BLOCK);




    }).build());


    public static void registerItemGroups(){
        ArfforniaMod.LOGGER.info("Registering Item Groups for " + ArfforniaMod.MOD_ID);
    }


}

