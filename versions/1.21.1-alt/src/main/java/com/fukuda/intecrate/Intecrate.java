package com.fukuda.intecrate;

import com.fukuda.intecrate.common.block.registry.*;
import com.fukuda.intecrate.common.block.registry.food.DecoCakeBlocks;
import com.fukuda.intecrate.common.item.registry.CakeItems;
import com.fukuda.intecrate.common.item.registry.IntecrateItems;
import com.fukuda.intecrate.common.item.registry.SlicedCake;
import com.fukuda.intecrate.common.util.IntecrateCreativeModeTabs;
import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Intecrate.MOD_ID)
public class Intecrate {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "intecrate";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Intecrate(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered

        IntecrateItems.register(modEventBus);
        CakeItems.register(modEventBus);
        SlicedCake.register(modEventBus);

        DecoCrates.register(modEventBus);
        DecoBuckets.register(modEventBus);
        DecoBaskets.register(modEventBus);
        DecoBarrels.register(modEventBus);
        DecoBags.register(modEventBus);
        DecoBoxes.register(modEventBus);
        DecoCakeBlocks.register(modEventBus);

        IntecrateCreativeModeTabs.register(modEventBus);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
//    private void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
//        }
//    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.remove(new ItemStack(Items.CAKE), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    @SubscribeEvent
    public void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            var masterTrades = event.getTrades().get(5);
            if (masterTrades != null) {
                masterTrades.removeIf(listing -> {
                    if (listing instanceof VillagerTrades.ItemsForEmeralds itemsForEmeralds) {
                        try {
                            var field = VillagerTrades.ItemsForEmeralds.class.getDeclaredField("itemStack");
                            field.setAccessible(true);
                            ItemStack stack = (ItemStack) field.get(itemsForEmeralds);
                            return stack.is(Items.CAKE);
                        } catch (ReflectiveOperationException e) {
                            return false;
                        }
                    }
                    return false;
                });
            }
        }
    }

}
