package com.rnsmod.block;

import com.rnsmod.RNSMOD2;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.function.Function;

public class ModBlocks {
    public static final Block RUBY_ORE = register("ruby_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), settings),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F),
            true
    );
    public static final Block RUBY_BLOCK = register("ruby_block",
            Block::new,
            AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(NoteBlockInstrument.BIT).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL),
            true
    );
    public static final Block SAPPHIRE_ORE = register("sapphire_ore",
            settings -> new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), settings),
            AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F),
            true
    );
    public static final Block SAPPHIRE_BLOCK = register("sapphire_block",
            Block::new,
            AbstractBlock.Settings.create().mapColor(MapColor.BLUE).instrument(NoteBlockInstrument.BIT).requiresTool().strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL),
            true
    );

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register((itemGroup) -> {
            itemGroup.add(ModBlocks.RUBY_ORE);
            itemGroup.add(ModBlocks.SAPPHIRE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.RUBY_BLOCK);
            itemGroup.add(ModBlocks.SAPPHIRE_BLOCK);
        });


        if (shouldRegisterItem) {

            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);


    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RNSMOD2.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, name));
    }

    public static void initialize() {}
}

