package net.Sevelom.GravityFallsMod.item;

import net.Sevelom.GravityFallsMod.GravityFallsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GravityFallsMod.MODID);

    public static final RegistryObject<Item> THIRTY_EIGHT_SIDED_DIE = ITEMS.register("38-sided_die",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
