package com.beroende.lighterway.item;

import com.beroende.lighterway.LighterWay;
import com.beroende.lighterway.entity.ModEntityTypes;
import com.beroende.lighterway.item.custom.ModSpawnEggItem;
import com.beroende.lighterway.item.custom.woodscissors.*;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LighterWay.MOD_ID);

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP).maxStackSize(16)));

    public static final RegistryObject<Item> OAKSCISSORS = ITEMS.register("oakscissors",
            () -> new OakScissors(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP_INSTRUMENTS).maxDamage(30)));

    public static final RegistryObject<Item> SPRUCESCISSORS = ITEMS.register("sprucescissors",
            () -> new SpruceScissors(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP_INSTRUMENTS).maxDamage(30)));

    public static final RegistryObject<Item> BIRCHSCISSORS = ITEMS.register("birchscissors",
            () -> new BirchScissors(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP_INSTRUMENTS).maxDamage(30)));

    public static final RegistryObject<Item> JUNGLESCISSORS = ITEMS.register("junglescissors",
            () -> new JungleScissors(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP_INSTRUMENTS).maxDamage(30)));

    public static final RegistryObject<Item> ACACIASCISSORS = ITEMS.register("acaciascissors",
            () -> new AcaciaScissors(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP_INSTRUMENTS).maxDamage(30)));

    public static final RegistryObject<Item> DARKOAKSCISSORS = ITEMS.register("darkoakscissors",
            () -> new DarkOakScissors(new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP_INSTRUMENTS).maxDamage(30)));

    public static final RegistryObject<ModSpawnEggItem> HAMSTER_SPAWN_EGG = ITEMS.register("hamster_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.HAMSTER, 0x169365, 0x276ABC,
                    new Item.Properties().group(ModItemGroup.LIGHTER_WAY_GROUP)));

    public static void register(IEventBus modEventBus)
    {
        ITEMS.register(modEventBus);
    }
}
