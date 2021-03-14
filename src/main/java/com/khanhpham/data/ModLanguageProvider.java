package com.khanhpham.data;

import com.khanhpham.MekanismExtension;
import com.khanhpham.icon.IconRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen) {
        super(gen, MekanismExtension.MOD_ID , "en_us");
    }

    @Override
    protected void addTranslations() {
        add(IconRegistry.ICON.get(),"Plus Icon");
    }
}
