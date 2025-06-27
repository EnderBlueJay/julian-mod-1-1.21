package net.julian.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.julian.modid.JulianMod1;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ICE_CRYSTAL = registerItem("ice_crystal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(JulianMod1.MOD_ID,name),item);
    }

    public static void registerModItems() {
        JulianMod1.LOGGER.info("Registering Mod items for " + JulianMod1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ICE_CRYSTAL);
        });
    }
}
