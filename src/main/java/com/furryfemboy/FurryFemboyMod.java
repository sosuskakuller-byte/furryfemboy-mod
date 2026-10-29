package com.furryfemboy;

import com.furryfemboy.registry.ModEntities;
import com.furryfemboy.registry.ModItems;
import com.furryfemboy.registry.ModSounds;
import com.furryfemboy.config.ModConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FurryFemboyMod.MOD_ID)
public final class FurryFemboyMod {
    public static final String MOD_ID = "furryfemboy";
    public FurryFemboyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus); ModEntities.ENTITIES.register(bus); ModSounds.SOUNDS.register(bus);
        ModLoadingContext.get().registerConfig(Type.COMMON, ModConfig.SPEC);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
