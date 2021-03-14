package com.khanhpham;

import com.khanhpham.icon.IconRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(MekanismExtension.MOD_ID)
public class MekanismExtension {

    public static final String MOD_ID = "mekanismextension";
    public static final ItemGroup ICON_GROUP = new ItemGroup("mekanismextension.icons") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(IconRegistry.ICON.get());
        }
    };
    public MekanismExtension() {

        IconRegistry.init();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
