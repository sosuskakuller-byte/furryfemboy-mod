package com.furryfemboy.client;
import com.furryfemboy.registry.ModEntities; import net.minecraftforge.api.distmarker.Dist; import net.minecraftforge.client.event.EntityRenderersEvent; import net.minecraftforge.eventbus.api.SubscribeEvent; import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD,value=Dist.CLIENT)
public final class ClientSetup { @SubscribeEvent public static void register(EntityRenderersEvent.RegisterRenderers e){e.registerEntityRenderer(ModEntities.FURRY_FEMBOY.get(),FurryFemboyRenderer::new); e.registerEntityRenderer(ModEntities.MILK_PROJECTILE.get(),ctx->new net.minecraft.client.renderer.entity.ThrownItemRenderer<>(ctx,.75f,true));} }
