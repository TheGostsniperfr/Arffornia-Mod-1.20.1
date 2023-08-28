package net.thegostsniper.arfforniamod;

import net.fabricmc.api.ModInitializer;

import net.thegostsniper.arfforniamod.items.ModItemGroup;
import net.thegostsniper.arfforniamod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArfforniaMod implements ModInitializer {
	public static final String MOD_ID = "arfforniamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
        ModItemGroup.registerItemGroups();
	}
}