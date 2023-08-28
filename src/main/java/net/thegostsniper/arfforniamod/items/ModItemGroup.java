package net.thegostsniper.arfforniamod.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thegostsniper.arfforniamod.ArfforniaMod;

public class ModItemGroup {
    public static final ItemGroup SILICON_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ArfforniaMod.MOD_ID, "silicon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.silicon"))
                    .icon(()-> new ItemStack(ModItems.RAW_SILICON)).entries((displayContext, entries) -> {
        entries.add(ModItems.RAW_SILICON);
        entries.add(ModItems.SILICON_ORE);


    }).build());


    public static void registerItemGroups(){
        ArfforniaMod.LOGGER.info("Registering Item Groups for " + ArfforniaMod.MOD_ID);
    }


}

