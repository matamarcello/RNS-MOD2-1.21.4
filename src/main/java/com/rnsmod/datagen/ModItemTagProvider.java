package com.rnsmod.datagen;

import com.rnsmod.item.ModItems;
import com.rnsmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.TRANSFORMABLE_ITEMS)
                .add(ModItems.RUBY)
                .add(ModItems.SAPPHIRE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.SAPPHIRE_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.SAPPHIRE_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.SAPPHIRE_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.SAPPHIRE_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.SAPPHIRE_BOOTS);

        getOrCreateTagBuilder(ModTags.REPAIRS_RUBY_ARMOR)
                .add(ModItems.RUBY);
        getOrCreateTagBuilder(ModTags.RUBY_TOOL_MATERIALS)
                .add(ModItems.RUBY);
        getOrCreateTagBuilder(ModTags.REPAIRS_SAPPHIRE_ARMOR)
                .add(ModItems.SAPPHIRE);
        getOrCreateTagBuilder(ModTags.SAPPHIRE_TOOL_MATERIALS)
                .add(ModItems.SAPPHIRE);
    }


}
