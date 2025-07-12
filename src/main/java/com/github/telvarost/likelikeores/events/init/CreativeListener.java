package com.github.telvarost.likelikeores.events.init;

import com.github.telvarost.likelikeores.LikeLikeOres;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import paulevs.bhcreative.api.CreativeTab;
import paulevs.bhcreative.api.SimpleTab;
import paulevs.bhcreative.registry.TabRegistryEvent;

public class CreativeListener {
    public static CreativeTab tabLikeLikeOres;

    @EventListener
    public void onTabInit(TabRegistryEvent event){
        tabLikeLikeOres = new SimpleTab(LikeLikeOres.LIKE_LIKE_ORES.id("copper_ore"), LikeLikeOres.COPPER_ORE.asItem());
        event.register(tabLikeLikeOres);

        for (Block block : LikeLikeOres.blocks){
            tabLikeLikeOres.addItem(new ItemStack(block.asItem(), 1));
        }

        for (Item item : LikeLikeOres.items){
            tabLikeLikeOres.addItem(new ItemStack(item, 1));
        }
    }
}