package com.test.item;

import com.test.Test;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CRYSTAL_MATRIX_INGOT = registerItem("resource_crystal_matrix_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "resource_crystal_matrix_ingot")))));
    public static final Item DIAMOND_LATTICE = registerItem("resource_diamond_lattice", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Test.MOD_ID, "resource_diamond_lattice")))));


    // helper method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Test.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Test.LOGGER.info("Registering Mod Items for " + Test.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CRYSTAL_MATRIX_INGOT);
            entries.add(DIAMOND_LATTICE);
        });
    }


}
