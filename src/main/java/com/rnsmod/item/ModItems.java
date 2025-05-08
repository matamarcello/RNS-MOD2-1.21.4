package com.rnsmod.item;

import com.rnsmod.RNSMOD2;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item RUBY = register("ruby", Item::new, new Item.Settings());
    public static final Item SAPPHIRE = register("sapphire", Item::new, new Item.Settings());
    public static final Item RUBY_HELMET = register("ruby_helmet", Item::new, new Item.Settings());
    public static final Item RUBY_CHESTPLATE = register("ruby_chestplate", Item::new, new Item.Settings());
    public static final Item RUBY_LEGGINGS = register("ruby_leggings", Item::new, new Item.Settings());
    public static final Item RUBY_BOOTS = register("ruby_boots", Item::new, new Item.Settings());
    public static final Item RUBY_SWORD = register("ruby_sword", Item::new, new Item.Settings());
    public static final Item RUBY_AXE = register("ruby_axe", Item::new, new Item.Settings());
    public static final Item RUBY_PICKAXE = register("ruby_pickaxe", Item::new, new Item.Settings());
    public static final Item RUBY_SHOVEL = register("ruby_shovel", Item::new, new Item.Settings());
    public static final Item RUBY_HOE = register("ruby_hoe", Item::new, new Item.Settings());

    public static void initialize() {
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
                });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register((itemGroup) -> {
            itemGroup.add(ModItems.RUBY_PICKAXE);
            itemGroup.add(ModItems.RUBY_SHOVEL);
            itemGroup.add(ModItems.RUBY_HOE);
            itemGroup.add(ModItems.RUBY_AXE);
                });
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;

    }


}

