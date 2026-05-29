package com.avaritia.block;

import com.avaritia.Avaritia;
import com.avaritia.block.custom.CompressedCraftingTable;
import com.avaritia.block.custom.NeutroniumCollector;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLOCK_CRYSTAL_MATRIX = registerBlock("crystal_matrix_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Avaritia.MOD_ID, "crystal_matrix_block")))
                    .strength(1.0f)));
    public static final Block NEUTRONIUM_BLOCK = registerBlock("neutronium_block",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Avaritia.MOD_ID, "neutronium_block")))
                    .strength(4.0f)));
    public static final Block COMPRESSED_CRAFTING_TABLE = registerBlock("compressed_crafting_table",
            new CompressedCraftingTable(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Avaritia.MOD_ID, "compressed_crafting_table")))
                    .strength(2.0f)));
    public static final Block DOUBLE_COMPRESSED_CRAFTING_TABLE = registerBlock("double_compressed_crafting_table",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Avaritia.MOD_ID, "double_compressed_crafting_table")))
                    .strength(2.0f)));
    public static final Block EXTREME_CRAFTING_TABLE = registerBlock("extreme_crafting_table",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Avaritia.MOD_ID, "extreme_crafting_table")))
                    .strength(3.0f)));
    public static final Block NEUTRONIUM_COLLECTOR = registerBlock("neutronium_collector",
            new NeutroniumCollector(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Avaritia.MOD_ID, "neutronium_collector")))
                    .strength(2.0f)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Avaritia.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Avaritia.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Avaritia.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        Avaritia.LOGGER.info("Registering Mod Blocks for " + Avaritia.MOD_ID);

    }
}
