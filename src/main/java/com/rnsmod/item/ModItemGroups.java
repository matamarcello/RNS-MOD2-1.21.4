package com.rnsmod.item;

import com.rnsmod.RNSMOD2;
import com.rnsmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RNSMOD2.MOD_ID, "ruby_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.rnsmod.ruby_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build()
    );
    public static final ItemGroup SAPPHIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(RNSMOD2.MOD_ID, "sapphire_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.rnsmod.sapphire_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);

                    }).build()
    );



    public static void registerItemGroups() {
        RNSMOD2.LOGGER.info("Registering item groups for " + RNSMOD2.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> {
            itemGroup.add(ModItems.RUBY);
            itemGroup.add(ModItems.SAPPHIRE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> {
            itemGroup.add(ModItems.RUBY_SWORD);
            itemGroup.add(ModItems.RUBY_AXE);
            itemGroup.add(ModItems.RUBY_HELMET);
            itemGroup.add(ModItems.RUBY_CHESTPLATE);
            itemGroup.add(ModItems.RUBY_LEGGINGS);
            itemGroup.add(ModItems.RUBY_BOOTS);
            itemGroup.add(ModItems.SAPPHIRE_SWORD);
            itemGroup.add(ModItems.SAPPHIRE_AXE);
            itemGroup.add(ModItems.SAPPHIRE_HELMET);
            itemGroup.add(ModItems.SAPPHIRE_CHESTPLATE);
            itemGroup.add(ModItems.SAPPHIRE_LEGGINGS);
            itemGroup.add(ModItems.SAPPHIRE_BOOTS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> {
            itemGroup.add(ModItems.RUBY_PICKAXE);
            itemGroup.add(ModItems.RUBY_SHOVEL);
            itemGroup.add(ModItems.RUBY_HOE);
            itemGroup.add(ModItems.RUBY_AXE);
            itemGroup.add(ModItems.SAPPHIRE_PICKAXE);
            itemGroup.add(ModItems.SAPPHIRE_SHOVEL);
            itemGroup.add(ModItems.SAPPHIRE_HOE);
            itemGroup.add(ModItems.SAPPHIRE_AXE);
        });


    }
}
