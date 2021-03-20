package com.khanhpham.data;

import com.khanhpham.MekanismExtension;
import net.minecraft.data.AdvancementProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MekanismExtension.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenEvent {
    private DataGenEvent() {}

    @SubscribeEvent
    public static void generateEvent(GatherDataEvent event) {
        DataGenerator data = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        data.addProvider(new IconModelProvider(data, fileHelper));
        data.addProvider(new ModAdvancementProvider(data));
        data.addProvider(new ENLangProvider(data));
    }
}
