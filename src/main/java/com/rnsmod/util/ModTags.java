package com.rnsmod.util;

import com.rnsmod.RNSMOD2;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(RNSMOD2.MOD_ID, "incorrect_for_ruby_tool"));

    public static final TagKey<Block> NEEDS_RUBY_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(RNSMOD2.MOD_ID, "needs_ruby_tool"));

    public static final TagKey<Item> RUBY_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, "ruby_tool_materials"));

    public static final TagKey<Item> REPAIRS_RUBY_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, "repairs_ruby_armor"));

    public static final TagKey<Block> INCORRECT_FOR_SAPPHIRE_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(RNSMOD2.MOD_ID, "incorrect_for_sapphire_tool"));

    public static final TagKey<Block> NEEDS_SAPPHIRE_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(RNSMOD2.MOD_ID, "needs_sapphire_tool"));

    public static final TagKey<Item> SAPPHIRE_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, "sapphire_tool_materials"));

    public static final TagKey<Item> REPAIRS_SAPPHIRE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, "repairs_sapphire_armor"));

    public static final TagKey<Item> TRANSFORMABLE_ITEMS = TagKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, "transformable_items"));

    }

