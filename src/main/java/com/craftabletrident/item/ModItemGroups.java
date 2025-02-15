package com.craftabletrident.item;

import com.craftabletrident.CraftableTrident;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> CRAFTABLE_TRIDENT_GROUP = register("craftable_trident_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(CraftableTrident.MOD_ID, id));
    }
    public static void registerModItemGroups(){
        Registry.register(Registries.ITEM_GROUP, CRAFTABLE_TRIDENT_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 100)
                        .displayName(Text.translatable("itemGroup.craftable_trident_group"))
                        .icon(() -> new ItemStack(ModItems.PRISMARINE_STICK))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.PRISMARINE_STICK);
                            entries.add(ModItems.FRAGILE_TRIDENT);
                        }).build());
        CraftableTrident.LOGGER.info("Registering ItemGroups");
    }
}
