package com.rnsmod.datagen;

import com.rnsmod.block.ModBlocks;
import com.rnsmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE);

        getOrCreateTagBuilder(ModTags.NEEDS_RUBY_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);
        getOrCreateTagBuilder(ModTags.NEEDS_SAPPHIRE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE);

    }
}
