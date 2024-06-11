package com.beroende.lighterway.events;

import com.beroende.lighterway.entity.custom.HamsterEntity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.beroende.lighterway.LighterWay;
import com.beroende.lighterway.entity.ModEntityTypes;
import com.beroende.lighterway.item.custom.ModSpawnEggItem;

@Mod.EventBusSubscriber(modid = LighterWay.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.HAMSTER.get(), HamsterEntity.setCustomAttributes().create());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
