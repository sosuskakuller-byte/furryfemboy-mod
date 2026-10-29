package com.furryfemboy.registry;
import com.furryfemboy.FurryFemboyMod; import net.minecraft.resources.ResourceLocation; import net.minecraft.sounds.SoundEvent; import net.minecraftforge.registries.*;
public final class ModSounds { public static final DeferredRegister<SoundEvent> SOUNDS=DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,FurryFemboyMod.MOD_ID);
 public static final RegistryObject<SoundEvent> GODZILLA_SHOT=reg("godzilla_shot"); public static final RegistryObject<SoundEvent> FURRY_HURT=reg("furry_hurt"); public static final RegistryObject<SoundEvent> FURRY_HAPPY=reg("furry_happy");
 private static RegistryObject<SoundEvent> reg(String n){return SOUNDS.register(n,()->SoundEvent.createVariableRangeEvent(new ResourceLocation(FurryFemboyMod.MOD_ID,n)));}
}
