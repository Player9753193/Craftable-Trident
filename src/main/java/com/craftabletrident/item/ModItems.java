package com.craftabletrident.item;

import com.craftabletrident.CraftableTrident;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PRISMARINE_STICK = registerItems("prismarine_stick", new Item(new Item.Settings()));
    public static final Item FRAGILE_TRIDENT = registerItems("fragile_trident", new Item(new Item.Settings()));
    //Prismarine_Ingot Fragile_Trident


    private static Item registerItems(String id, Item item){
        //return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), ofVanilla(MoreTools.MOD_ID)), item);
        return Registry.register(Registries.ITEM, Identifier.of(CraftableTrident.MOD_ID, id), item);
    }
    private static void addItemToG(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(PRISMARINE_STICK);
        fabricItemGroupEntries.add(FRAGILE_TRIDENT);
    }
    public static void registerModItems(){
        CraftableTrident.LOGGER.info("Registering Item");
    }


}
