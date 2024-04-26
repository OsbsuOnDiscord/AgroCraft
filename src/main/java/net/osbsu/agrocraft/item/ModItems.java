package net.osbsu.agrocraft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.osbsu.agrocraft.AgroCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AgroCraft.MOD_ID);

    public static final RegistryObject<Item> LEMON_SEEDS = ITEMS.register("lemon_seeds",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon",
            ()-> new Item(new Item.Properties().food(ModFoods.LEMON)));

    public static final RegistryObject<Item> FRESH_LEMONADE = ITEMS.register("fresh_lemonade",
            ()-> new Item(new Item.Properties().food(ModFoods.FRESH_LEMONADE)));

    public static final RegistryObject<Item> KITCHEN_KNIFE = ITEMS.register("kitchen_knife",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LEMON_HALF = ITEMS.register("lemon_half",
            ()-> new Item(new Item.Properties().food(ModFoods.LEMON_HALF)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }





}
