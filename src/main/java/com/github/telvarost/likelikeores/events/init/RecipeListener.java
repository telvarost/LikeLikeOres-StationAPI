package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class RecipeListener {

    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        Identifier type = event.recipeId;

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
//            if (LikeLikeOres.TIN_ORE_SETTINGS.settingOreSmeltingRecipe.isEnabled) {
//                CraftingRegistry.addShapedRecipe(new ItemStack(LikeLikeOres.COPPER_BLOCK.asItem(), 1), "XXX", "XXX", "XXX", 'X', LikeLikeOres.COPPER_INGOT);
//            }
        }

        if (type == RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            if (LikeLikeOres.TIN_ORE_SETTINGS.settingOreSmeltingRecipe.isEnabled) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(LikeLikeOres.TIN_INGOT   , 1), new ItemStack(LikeLikeOres.TIN_ORE.asItem(), 1));
            }

            if (LikeLikeOres.COPPER_ORE_SETTINGS.settingOreSmeltingRecipe.isEnabled) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(LikeLikeOres.COPPER_INGOT, 1), new ItemStack(LikeLikeOres.COPPER_ORE.asItem(), 1));
            }

            if (LikeLikeOres.SILVER_ORE_SETTINGS.settingOreSmeltingRecipe.isEnabled) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(LikeLikeOres.SILVER_INGOT, 1), new ItemStack(LikeLikeOres.SILVER_ORE.asItem(), 1));
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
//            if (LikeLikeOres.TIN_ORE_SETTINGS.settingOreSmeltingRecipe.isEnabled) {
//                CraftingRegistry.addShapelessRecipe(new ItemStack(LikeLikeOres.COPPER_INGOT, 9), LikeLikeOres.COPPER_BLOCK);
//            }
        }
    }
}