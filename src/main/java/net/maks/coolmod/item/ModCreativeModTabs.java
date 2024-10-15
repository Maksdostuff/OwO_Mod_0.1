package net.maks.coolmod.item;

import net.maks.coolmod.MaksCoolMod;
import net.maks.coolmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MaksCoolMod.MODID);

    public static final RegistryObject<CreativeModeTab> COOL_MOD_TAB = CREATIVE_MODE_TABS.register("cool_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OWO.get()))
                    .title(Component.translatable("creativetab.cool_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OWO.get());
                        pOutput.accept(ModItems.RAW_OWO.get());
                        pOutput.accept(Items.COMMAND_BLOCK);
                        pOutput.accept(ModBlocks.OWO_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_OWO_BLOCK.get());
                        pOutput.accept(ModBlocks.OWO_ORE.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
