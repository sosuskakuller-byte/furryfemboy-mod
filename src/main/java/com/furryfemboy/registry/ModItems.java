package com.furryfemboy.registry;
import com.furryfemboy.FurryFemboyMod; import com.furryfemboy.item.GodzillaWeaponItem; import net.minecraft.world.item.*; import net.minecraftforge.registries.*;
public final class ModItems { public static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,FurryFemboyMod.MOD_ID);
 public static final RegistryObject<Item> GODZILLA_WEAPON=ITEMS.register("godzilla_weapon",()->new GodzillaWeaponItem(new Item.Properties().stacksTo(1).durability(512)));
 public static final RegistryObject<Item> FURRY_SPAWN_EGG=ITEMS.register("furry_femboy_spawn_egg",()->new SpawnEggItem(ModEntities.FURRY_FEMBOY,0xE7A5C7,0x4C2942,new Item.Properties()));
}
