package com.khanhpham.data;

import com.khanhpham.MekanismExtension;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class IconModelProvider extends ItemModelProvider {
    public IconModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MekanismExtension.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile modelFile = getExistingFile(mcLoc("item/generated"));

        builder(modelFile, "mekanism_plus");
    }

    private ItemModelBuilder builder(ModelFile modelFile, String name) {
        return getBuilder(name).parent(modelFile).texture("layer0", "icon/" + name);
    }



    @Nonnull
    @Override
    public String getName() {
        return "Advancement Plus Mekanism Extension - Icons";
    }
}
