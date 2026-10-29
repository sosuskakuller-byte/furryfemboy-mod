package com.furryfemboy.registry;
import com.furryfemboy.FurryFemboyMod; import com.furryfemboy.entity.*; import net.minecraft.world.entity.*; import net.minecraft.world.entity.player.Player; import net.minecraft.world.entity.projectile.ThrowableItemProjectile; import net.minecraft.world.level.Level; import net.minecraft.world.entity.EntityType; import net.minecraftforge.registries.*;
public final class ModEntities { public static final DeferredRegister<EntityType<?>> ENTITIES=DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,FurryFemboyMod.MOD_ID);
 public static final RegistryObject<EntityType<FurryFemboyEntity>> FURRY_FEMBOY=ENTITIES.register("furry_femboy",()->EntityType.Builder.of(FurryFemboyEntity::new,MobCategory.CREATURE).sized(.65f,1.8f).clientTrackingRange(8).build("furry_femboy"));
 public static final RegistryObject<EntityType<MilkProjectile>> MILK_PROJECTILE=ENTITIES.register("milk_projectile",()->EntityType.Builder.<MilkProjectile>of(MilkProjectile::new,MobCategory.MISC).sized(.18f,.18f).clientTrackingRange(8).updateInterval(10).build("milk_projectile"));
}
