package com.rnsmod.item;

import com.rnsmod.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class ModToolMaterials {
    public static final ToolMaterial RUBY = new ToolMaterial(
            ModTags.INCORRECT_FOR_RUBY_TOOL,
            455,
            5.0F,
            1.5F,
            22,
            ModTags.RUBY_TOOL_MATERIALS
            );
    public static final ToolMaterial SAPPHIRE = new ToolMaterial(
            ModTags.INCORRECT_FOR_SAPPHIRE_TOOL,
            455,
            5.0F,
            1.5F,
            22,
            ModTags.SAPPHIRE_TOOL_MATERIALS
    );
}