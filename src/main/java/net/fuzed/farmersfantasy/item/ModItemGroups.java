package net.fuzed.farmersfantasy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fuzed.farmersfantasy.FarmersFantasy;
import net.fuzed.farmersfantasy.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup FARMERS_FANTASY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FarmersFantasy.MOD_ID, "farmers_fantasy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FERTILIZER_BOTTLE))
                    .displayName(Text.translatable("itemgroup.farmersfantasy.farmers_fantasy_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RARE_BONE_MEAL);
                        entries.add(ModItems.EPIC_BONE_MEAL);
                        entries.add(ModItems.LEGENDARY_BONE_MEAL);
                        entries.add(ModItems.FERTILIZER_BOTTLE);

                    }).build());

    public static final ItemGroup FARMERS_FANTASY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FarmersFantasy.MOD_ID, "farmers_fantasy_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.LEGENDARY_BONE_BLOCK))
                    .displayName(Text.translatable("itemgroup.farmersfantasy.farmers_fantasy_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RARE_BONE_BLOCK);
                        entries.add(ModBlocks.EPIC_BONE_BLOCK);
                        entries.add(ModBlocks.LEGENDARY_BONE_BLOCK);


                    }).build());

    public static void registerItemGroups(){
        FarmersFantasy.LOGGER.info("Registering Item Groups for" + FarmersFantasy.MOD_ID);
    }
}
