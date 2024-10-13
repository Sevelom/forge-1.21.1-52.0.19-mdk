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

    public static final RegistryObject<Item> ADHESIVE = ITEMS.register("adhesive",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BABBA = ITEMS.register("babba",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BAT_ERIES = ITEMS.register("bat_eries",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAN_OF_BEANS = ITEMS.register("can_of_beans",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOYZ_WORLD = ITEMS.register("boyz_world",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FUN_MAZE = ITEMS.register("fun_maze",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
