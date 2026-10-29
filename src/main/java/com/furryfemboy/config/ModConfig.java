package com.furryfemboy.config;
import net.minecraftforge.common.ForgeConfigSpec;
public final class ModConfig {
  public static final ForgeConfigSpec SPEC;
  public static final ForgeConfigSpec.DoubleValue HEALTH, DAMAGE, SPEED, TAME_CHANCE;
  static { ForgeConfigSpec.Builder b=new ForgeConfigSpec.Builder(); b.push("furry_femboy");
    HEALTH=b.defineInRange("health", thirty(30), 1, 200); DAMAGE=b.defineInRange("milk_damage",6.0,0,100); SPEED=b.defineInRange("speed",0.30,0.05,2); TAME_CHANCE=b.defineInRange("tame_chance",0.35,0,1); b.pop(); SPEC=b.build(); }
  private static double thirty(double v){return v;}
}
