package com.avaritia.item;

import com.avaritia.Avaritia;
import com.avaritia.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup AVARITIA_GROUP = Registry.register(Registries.ITEM_GROUP,
                    Identifier.of(Avaritia.MOD_ID, "avaritia_group"),
                    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.INFINITY_INGOT))
                    .displayName(Text.translatable("itemgroup.avaritia.avaritia_group"))
                    .entries((displayContext, entries) -> {
                        //ITEMS
                        entries.add(ModItems.NEUTRONIUM_INGOT);
                        entries.add(ModItems.NEUTRON_NUGGET);
                        entries.add(ModItems.NEUTRON_PILE);
                        entries.add(ModItems.CRYSTAL_MATRIX_INGOT);
                        entries.add(ModItems.DIAMOND_LATTICE);
                        entries.add(ModItems.INFINITY_INGOT);
                        entries.add(ModItems.INFINITY_CATALYST);


                        //BLOCKS
                        entries.add(ModBlocks.BLOCK_CRYSTAL_MATRIX);
                        entries.add(ModBlocks.NEUTRONIUM_BLOCK);
                        entries.add(ModBlocks.COMPRESSED_CRAFTING_TABLE);
                        entries.add(ModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE);
                        entries.add(ModBlocks.EXTREME_CRAFTING_TABLE);
                        entries.add(ModBlocks.NEUTRONIUM_COLLECTOR);

                        //TOOLS AND ARMOR

                    })
                    .build());

    public static void registerItemGroups() {
        Avaritia.LOGGER.info("Registering Item Groups for " + Avaritia.MOD_ID);

    }

}
