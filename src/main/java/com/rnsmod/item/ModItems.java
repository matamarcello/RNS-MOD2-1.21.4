package com.rnsmod.item;

import com.rnsmod.RNSMOD2;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {


    public static final Item RUBY = register("ruby",Item::new, new Item.Settings());

    public static final Item RUBY_SWORD = register("ruby_sword", settings -> new SwordItem(ModToolMaterials.RUBY, 3.0F, -2.4F, settings),
            new Item.Settings()
    );
    public static final Item RUBY_SHOVEL = register("ruby_shovel", settings -> new ShovelItem(ModToolMaterials.RUBY, 1.5F, -3.0F, settings),
            new Item.Settings()
    );
    public static final Item RUBY_PICKAXE = register("ruby_pickaxe", settings -> new PickaxeItem(ModToolMaterials.RUBY, 1.0F, -2.8F, settings),
            new Item.Settings()
    );
    public static final Item RUBY_AXE = register("ruby_axe", settings -> new AxeItem(ModToolMaterials.RUBY, 5.0F, -3.0F, settings),
            new Item.Settings()
    );
    public static final Item RUBY_HOE = register("ruby_hoe", settings -> new HoeItem(ModToolMaterials.RUBY, -3.0F, 0.0F, settings),
            new Item.Settings()
    );

    public static final Item SAPPHIRE = register("sapphire",Item::new, new Item.Settings());

    public static final Item SAPPHIRE_SWORD = register("sapphire_sword", settings -> new SwordItem(ModToolMaterials.SAPPHIRE, 3.0F, -2.4F, settings),
            new Item.Settings()
    );
    public static final Item SAPPHIRE_SHOVEL = register("sapphire_shovel", settings -> new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5F, -3.0F, settings),
            new Item.Settings()
    );
    public static final Item SAPPHIRE_PICKAXE = register("sapphire_pickaxe", settings -> new PickaxeItem(ModToolMaterials.SAPPHIRE, 1.0F, -2.8F, settings),
            new Item.Settings()
    );
    public static final Item SAPPHIRE_AXE = register("sapphire_axe", settings -> new AxeItem(ModToolMaterials.SAPPHIRE, 5.0F, -3.0F, settings),
            new Item.Settings()
    );
    public static final Item SAPPHIRE_HOE = register("sapphire_hoe", settings -> new HoeItem(ModToolMaterials.SAPPHIRE, -3.0F, 0.0F, settings),
            new Item.Settings()
    );



    public static final Item RUBY_HELMET = register("ruby_helmet",settings -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentType.HELMET, settings),
            new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item RUBY_CHESTPLATE = register("ruby_chestplate",settings -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentType.CHESTPLATE, settings),
            new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item RUBY_LEGGINGS = register("ruby_leggings",settings -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentType.LEGGINGS, settings),
            new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item RUBY_BOOTS = register("ruby_boots",settings -> new ArmorItem(ModArmorMaterials.RUBY, EquipmentType.BOOTS, settings),
            new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );

    public static final Item SAPPHIRE_HELMET = register("sapphire_helmet",settings -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentType.HELMET, settings),
            new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item SAPPHIRE_CHESTPLATE = register("sapphire_chestplate",settings -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentType.CHESTPLATE, settings),
            new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item SAPPHIRE_LEGGINGS = register("sapphire_leggings",settings -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentType.LEGGINGS, settings),
            new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item SAPPHIRE_BOOTS = register("sapphire_boots",settings -> new ArmorItem(ModArmorMaterials.SAPPHIRE, EquipmentType.BOOTS, settings),
            new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(ModArmorMaterials.BASE_DURABILITY))
    );

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(RNSMOD2.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }



    public static void initialize() {

    }

}


