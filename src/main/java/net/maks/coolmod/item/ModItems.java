package net.maks.coolmod.item;

import net.maks.coolmod.MaksCoolMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MaksCoolMod.MODID);

    public static final RegistryObject<Item> OWO = ITEMS.register("owo",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_OWO = ITEMS.register("raw_owo",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
