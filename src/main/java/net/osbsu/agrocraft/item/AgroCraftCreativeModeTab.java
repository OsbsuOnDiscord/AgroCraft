package net.osbsu.agrocraft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.osbsu.agrocraft.AgroCraft;

import java.util.zip.GZIPOutputStream;

public class AgroCraftCreativeModeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AgroCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AGROCRAFT_TAB = CREATIVE_MODE_TABS.register("agrocraft_tab",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEMON.get()))
                    .title(Component.translatable("creativetab.agrocraft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.LEMON_SEEDS.get());
                        pOutput.accept(ModItems.LEMON.get());
                        pOutput.accept(ModItems.FRESH_LEMONADE.get());
                        pOutput.accept(ModItems.KITCHEN_KNIFE.get());
                        pOutput.accept(ModItems.LEMON_HALF.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }


}
