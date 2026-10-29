package com.furryfemboy.client;
import com.furryfemboy.entity.FurryFemboyEntity; import software.bernie.geckolib.renderer.GeoEntityRenderer; import net.minecraft.client.renderer.entity.EntityRendererProvider;
public class FurryFemboyRenderer extends GeoEntityRenderer<FurryFemboyEntity>{ public FurryFemboyRenderer(EntityRendererProvider.Context c){super(c,new FurryFemboyModel()); shadowRadius=.45f;} }
