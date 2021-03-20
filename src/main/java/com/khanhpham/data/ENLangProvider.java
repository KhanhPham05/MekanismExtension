package com.khanhpham.data;

import com.khanhpham.MekanismExtension;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.ArrayList;
import java.util.List;

public class ENLangProvider extends LanguageProvider {
    public ENLangProvider(DataGenerator gen) {
        super(gen, MekanismExtension.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add();
    }

    private static final List<String> keyList = new ArrayList<>();
    private static final List<String> titleList = new ArrayList<>();
    private static final List<String> descList = new ArrayList<>();

    public static void putTrans(String key, String title, String desc) {
        keyList.add(key);
        titleList.add(title);
        descList.add(desc);
    }

    private void add() {
        for (String key : keyList)
            for (String title : titleList) {
                super.add("advancement.plus." + key + ".title", title);
                break;
            }

        for (String key : keyList)
            for (String desc : descList) {
                super.add("advancement.plus." + key + ".desc", desc);
                break;
            }
    }
}
