package com.furryfemboy.entity;
import com.furryfemboy.registry.ModEntities; import com.furryfemboy.registry.ModItems; import net.minecraft.core.particles.ParticleTypes; import net.minecraft.nbt.CompoundTag; import net.minecraft.network.protocol.Packet; import net.minecraft.network.protocol.game.ClientGamePacketListener; import net.minecraft.world.entity.*; import net.minecraft.world.entity.projectile.ThrowableItemProjectile; import net.minecraft.world.item.Item; import net.minecraft.world.item.ItemStack; import net.minecraft.world.level.Level; import net.minecraft.world.phys.*; import net.minecraftforge.network.NetworkHooks; import net.minecraft.world.damagesource.DamageSource; import net.minecraft.world.entity.player.Player;
public class MilkProjectile extends ThrowableItemProjectile {
 public MilkProjectile(EntityType<? extends MilkProjectile> type,Level level){super(type,level);} public MilkProjectile(Level level,LivingEntity owner){super(ModEntities.MILK_PROJECTILE.get(),level);setOwner(owner);setPos(owner.getX(),owner.getEyeY()-0.1,owner.getZ());}
 @Override protected Item getDefaultItem(){return ModItems.GODZILLA_WEAPON.get();}
 @Override protected void onHitEntity(EntityHitResult hit){super.onHitEntity(hit); Entity e=hit.getEntity(); Entity o=getOwner(); if(e!=o){e.hurt(damageSources().thrown(this,o),6f); e.level().broadcastEntityEvent(this,(byte)3);} discard();}
 @Override protected void onHitBlock(BlockHitResult hit){super.onHitBlock(hit); burst(); discard();}
 @Override public void tick(){super.tick(); if(level().isClientSide) for(int i=0;i<2;i++) level().addParticle(ParticleTypes.SPLASH,getX(),getY(),getZ(),0,0,0);}
 private void burst(){if(level().isClientSide)for(int i=0;i<12;i++)level().addParticle(ParticleTypes.SPLASH,getX(),getY(),getZ(),random.nextGaussian()*.12,random.nextGaussian()*.12,random.nextGaussian()*.12);}
 @Override public Packet<ClientGamePacketListener> getAddEntityPacket(){return NetworkHooks.getEntitySpawningPacket(this);}
}
