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
            if (LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapedRecipe(new ItemStack(LikeLikeOres.TIN_BLOCK.asItem(), 1), "XXX", "XXX", "XXX", 'X', LikeLikeOres.TIN_INGOT);
            }

            if (LikeLikeOres.COPPER_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapedRecipe(new ItemStack(LikeLikeOres.COPPER_BLOCK.asItem(), 1), "XXX", "XXX", "XXX", 'X', LikeLikeOres.COPPER_INGOT);
            }

            if (LikeLikeOres.SILVER_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapedRecipe(new ItemStack(LikeLikeOres.SILVER_BLOCK.asItem(), 1), "XXX", "XXX", "XXX", 'X', LikeLikeOres.SILVER_INGOT);
            }

            if (LikeLikeOres.BRONZE_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapedRecipe(new ItemStack(LikeLikeOres.BRONZE_BLOCK.asItem(), 1), "XXX", "XXX", "XXX", 'X', LikeLikeOres.BRONZE_INGOT);
            }

            if (LikeLikeOres.ELECTRUM_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapedRecipe(new ItemStack(LikeLikeOres.ELECTRUM_BLOCK.asItem(), 1), "XXX", "XXX", "XXX", 'X', LikeLikeOres.ELECTRUM_INGOT);
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            if (LikeLikeOres.TIN_ORE_SETTINGS.settingOreSmeltingRecipe.getIsEnabled()) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(LikeLikeOres.TIN_INGOT   , 1), new ItemStack(LikeLikeOres.TIN_ORE.asItem(), 1));
            }

            if (LikeLikeOres.COPPER_ORE_SETTINGS.settingOreSmeltingRecipe.getIsEnabled()) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(LikeLikeOres.COPPER_INGOT, 1), new ItemStack(LikeLikeOres.COPPER_ORE.asItem(), 1));
            }

            if (LikeLikeOres.SILVER_ORE_SETTINGS.settingOreSmeltingRecipe.getIsEnabled()) {
                SmeltingRegistry.addSmeltingRecipe(new ItemStack(LikeLikeOres.SILVER_INGOT, 1), new ItemStack(LikeLikeOres.SILVER_ORE.asItem(), 1));
            }
        }

        if (type == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            if (LikeLikeOres.TIN_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(LikeLikeOres.TIN_INGOT, 9), LikeLikeOres.TIN_BLOCK);
            }

            if (LikeLikeOres.COPPER_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(LikeLikeOres.COPPER_INGOT, 9), LikeLikeOres.COPPER_BLOCK);
            }

            if (LikeLikeOres.SILVER_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(LikeLikeOres.SILVER_INGOT, 9), LikeLikeOres.SILVER_BLOCK);
            }

            if (LikeLikeOres.BRONZE_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(LikeLikeOres.BRONZE_INGOT, 9), LikeLikeOres.BRONZE_BLOCK);
            }

            if (LikeLikeOres.ELECTRUM_INGOT_SETTINGS.settingIngotBlockRecipe.getIsEnabled()) {
                CraftingRegistry.addShapelessRecipe(new ItemStack(LikeLikeOres.ELECTRUM_INGOT, 9), LikeLikeOres.ELECTRUM_BLOCK);
            }
        }
    }
}