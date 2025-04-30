package net.fuzed.farmersfantasy.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fuzed.farmersfantasy.FarmersFantasy;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FERTILIZER_BOTTLE = registerItem("fertilizer_bottle", new Item(new Item.Settings()));
    public static final Item RARE_BONE_MEAL = registerItem("rare_bone_meal", new Item(new Item.Settings()));
    public static final Item EPIC_BONE_MEAL = registerItem("epic_bone_meal", new Item(new Item.Settings()));
    public static final Item LEGENDARY_BONE_MEAL = registerItem("legendary_bone_meal", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FarmersFantasy.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FarmersFantasy.LOGGER.info("Regestering Mod Items for" + FarmersFantasy.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

            entries.add(FERTILIZER_BOTTLE);
            entries.add(RARE_BONE_MEAL);
            entries.add(EPIC_BONE_MEAL);
            entries.add(LEGENDARY_BONE_MEAL);


        });
    }

}
