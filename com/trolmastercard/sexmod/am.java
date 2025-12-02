package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class am {
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(RenderWorldLastEvent paramRenderWorldLastEvent) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (minecraft.field_71474_y.field_74320_O != 0)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = minecraft.field_71439_g.getPersistentID();
    em em = null;
    try {
      for (em em1 : em.ad()) {
        try {
          if (em1 == null)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (em1.field_70128_L)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!em1.field_70170_p.field_72995_K)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!(em1 instanceof ai))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        ai ai = (ai)em1;
        if (uUID.equals(ai.e())) {
          em = em1;
          break;
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    try {
      if (em == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Render render = minecraft.func_175598_ae().func_78713_a((Entity)em);
    try {
      if (render == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    float f1 = minecraft.field_71439_g.field_70177_z;
    dy.N = (float)(minecraft.field_71439_g.field_71158_b.field_78902_a * dy.G.field_72450_a);
    dy.N += -(f1 - dy.H) * 3.0F;
    dy.N = b6.a(dy.I, dy.N, 0.1F);
    float f2 = -minecraft.field_71439_g.field_70125_A;
    dy.x = (float)(minecraft.field_71439_g.field_71158_b.field_192832_b * dy.G.field_72449_c + (float)minecraft.field_71439_g.field_70181_x * dy.G.field_72448_b);
    dy.x += -(f2 - dy.t) * 3.0F;
    dy.x = b6.a(dy.E, dy.x, 0.1F);
    dy.a(em, paramRenderWorldLastEvent.getPartialTicks());
    dy.H = f1;
    dy.I = dy.N;
    dy.t = f2;
    dy.E = dy.x;
    GlStateManager.func_179145_e();
    GlStateManager.func_179126_j();
    GlStateManager.func_179141_d();
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void b(RenderWorldLastEvent paramRenderWorldLastEvent) {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (minecraft.field_71439_g == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = minecraft.field_71439_g.getPersistentID();
    try {
      for (em em : em.ad()) {
        try {
          if (!em.field_70170_p.field_72995_K)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (em.field_70128_L)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!(em instanceof ai))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        ai ai = (ai)em;
        try {
          if (em.y() == fp.START_THROWING) {
            try {
              em.b(true);
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            minecraft.func_175598_ae().func_188391_a((Entity)em, 0.0D, 0.0D, 0.0D, uUID.equals(ai.e()) ? -420.69F : 0.0F, minecraft.func_184121_ak(), false);
            em.b(false);
            return;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    GlStateManager.func_179145_e();
    GlStateManager.func_179126_j();
    GlStateManager.func_179141_d();
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(RenderHandEvent paramRenderHandEvent) {
    Minecraft minecraft = Minecraft.func_71410_x();
    UUID uUID = minecraft.field_71439_g.getPersistentID();
    try {
      for (em em : em.ad()) {
        try {
          if (!(em instanceof ai))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        fp fp = em.y();
        try {
          if (fp != fp.PICK_UP)
            try {
              if (fp != fp.START_THROWING)
                continue; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            }  
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        ai ai = (ai)em;
        UUID uUID1 = ai.e();
        try {
          if (uUID.equals(uUID1)) {
            paramRenderHandEvent.setCanceled(true);
            break;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(RenderPlayerEvent.Pre paramPre) {
    UUID uUID = paramPre.getEntityPlayer().getPersistentID();
    try {
      for (em em : em.ad()) {
        try {
          if (!(em instanceof ai))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        ai ai = (ai)em;
        fp fp = em.y();
        try {
          if (fp != fp.PICK_UP)
            try {
              if (fp != fp.START_THROWING)
                continue; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            }  
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (uUID.equals(ai.e())) {
            paramPre.setCanceled(true);
            break;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
  }
  
  private static ConcurrentModificationException a(ConcurrentModificationException paramConcurrentModificationException) {
    return paramConcurrentModificationException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\am.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */