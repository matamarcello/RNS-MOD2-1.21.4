package com.rnsmod.datagen;

import com.rnsmod.block.ModBlocks;
import com.rnsmod.item.ModArmorMaterials;
import com.rnsmod.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);

        BlockStateModelGenerator.BlockTexturePool sapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(ModItems.RUBY_HELMET, ModArmorMaterials.RUBY_ARMOR_MATERIAL_KEY, "boots", false);
        itemModelGenerator.registerArmor(ModItems.RUBY_CHESTPLATE, ModArmorMaterials.RUBY_ARMOR_MATERIAL_KEY, "boots", false);
        itemModelGenerator.registerArmor(ModItems.RUBY_LEGGINGS, ModArmorMaterials.RUBY_ARMOR_MATERIAL_KEY, "boots", false);
        itemModelGenerator.registerArmor(ModItems.RUBY_BOOTS, ModArmorMaterials.RUBY_ARMOR_MATERIAL_KEY, "boots", false);

        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_HELMET, ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL_KEY, "boots", false);
        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_CHESTPLATE, ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL_KEY, "boots", false);
        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_LEGGINGS, ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL_KEY, "boots", false);
        itemModelGenerator.registerArmor(ModItems.SAPPHIRE_BOOTS, ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL_KEY, "boots", false);
    }
}
