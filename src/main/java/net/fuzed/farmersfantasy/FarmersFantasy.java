package net.fuzed.farmersfantasy;

import net.fabricmc.api.ModInitializer;

import net.fuzed.farmersfantasy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarmersFantasy implements ModInitializer {
	public static final String MOD_ID = "farmersfantasy";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}