package net.Sevelom.GravityFallsMod.item;

import net.Sevelom.GravityFallsMod.GravityFallsMod;
import net.Sevelom.GravityFallsMod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GravityFallsMod.MODID);

    public static final RegistryObject<CreativeModeTab> GRAVITY_FALLS_TAB =
            CREATIVE_MODE_TABS.register("gravity_falls_tab", () ->
                    CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ADHESIVE.get()))
                            .title(Component.translatable("creativetab.gravityfalls_tab"))
                            .displayItems((itemDisplayParameters, output) ->
                            {
                                output.accept(ModItems.ADHESIVE.get());
                                output.accept(ModItems.BABBA.get());
                                output.accept(ModItems.BAT_ERIES.get());
                                output.accept(ModItems.BOYZ_WORLD.get());
                                output.accept(ModItems.FUN_MAZE.get());

                                output.accept(ModBlocks.PINE_WOOD.get());
                                output.accept(ModBlocks.PINE_LEAVES.get());
                                output.accept(ModBlocks.PINE_LOG.get());
                                output.accept(ModBlocks.PINE_PLANKS.get());
                            })
                            .build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
