package net.julian.modid.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.julian.modid.JulianMod1;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SUSPICIOUS_SNOW = registerBlock("suspicious_snow",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .sounds(BlockSoundGroup.POWDER_SNOW)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(JulianMod1.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(JulianMod1.MOD_ID, name), new BlockItem(block,new Item.Settings()));
    }

    public static void registerModBlocks() {
        JulianMod1.LOGGER.info("Registering Mod Blocks for " + JulianMod1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SUSPICIOUS_SNOW);
        });
    }
}
