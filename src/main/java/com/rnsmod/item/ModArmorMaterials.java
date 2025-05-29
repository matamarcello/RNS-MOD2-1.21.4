package com.rnsmod.item;

import com.rnsmod.RNSMOD2;
import com.rnsmod.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

import static net.minecraft.item.equipment.EquipmentAssetKeys.REGISTRY_KEY;


public class ModArmorMaterials {
    public static final int BASE_DURABILITY = 26;
    public static final RegistryKey<EquipmentAsset> RUBY_ARMOR_MATERIAL_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(RNSMOD2.MOD_ID, "ruby"));
    public static final RegistryKey<EquipmentAsset> SAPPHIRE_ARMOR_MATERIAL_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(RNSMOD2.MOD_ID, "sapphire"));

    public static final ArmorMaterial RUBY = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 2,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.LEGGINGS, 7,
                    EquipmentType.BOOTS, 3,
                    EquipmentType.BODY, 9
            ),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            ModTags.REPAIRS_RUBY_ARMOR,
            RUBY_ARMOR_MATERIAL_KEY
    );
    public static final ArmorMaterial SAPPHIRE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 2,
                    EquipmentType.CHESTPLATE, 7,
                    EquipmentType.LEGGINGS, 7,
                    EquipmentType.BOOTS, 3,
                    EquipmentType.BODY, 9
            ),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            ModTags.REPAIRS_SAPPHIRE_ARMOR,
            SAPPHIRE_ARMOR_MATERIAL_KEY
    );
}