package com.khanhpham.icon;

import com.khanhpham.MekanismExtension;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;



public class IconRegistry {
    private static final DeferredRegister<Item> ITEMS = register(ForgeRegistries.ITEMS);
    private static final DeferredRegister<Block> BLOCKS = register(ForgeRegistries.BLOCKS);

    public static final RegistryObject<Item> ICON = register("mekanism_plus");

    private static RegistryObject<Item> register(String name) {
        return ITEMS.register(name, () -> new Item( new Item.Properties().group(MekanismExtension.ICON_GROUP)));
    }

    private static <T extends IForgeRegistryEntry<T>> DeferredRegister<T> register(IForgeRegistry<T> registryType ) {
        return DeferredRegister.create(registryType, MekanismExtension.MOD_ID);
    }

    public static void init() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
