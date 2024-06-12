package com.beroende.lighterway.entity;

import com.beroende.lighterway.LighterWay;
import com.beroende.lighterway.entity.custom.HamsterEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, LighterWay.MOD_ID);

    public static final RegistryObject<EntityType<HamsterEntity>> HAMSTER =
            ENTITY_TYPES.register("hamster",
                    () -> EntityType.Builder.create(HamsterEntity::new,
                                    EntityClassification.CREATURE).size(0.4f, 0.3f)
                            .build(new ResourceLocation(LighterWay.MOD_ID, "hamster").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
