package com.trolmastercard.sexmod;

import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class ag extends Render<c4> {
  public static ag a;
  
  static final gv e = new gv(0, 255, 251, 255);
  
  static final gv b = new gv(255, 0, 236, 255);
  
  static final gv d = new gv(255, 255, 255, 0);
  
  Minecraft c = Minecraft.func_71410_x();
  
  public ag(RenderManager paramRenderManager) {
    super(paramRenderManager);
    a = this;
  }
  
  @Nullable
  protected ResourceLocation a(c4 paramc4) {
    return new ResourceLocation("sexmod", "textures/entity/galath/energy_ball.png");
  }
  
  public void a(c4 paramc4, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    gv gv1;
    gv gv2;
    GL11.glDisable(2896);
    GlStateManager.func_179141_d();
    GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 0.5F);
    OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, 240.0F, 240.0F);
    EntityPlayerSP entityPlayerSP = this.c.field_71439_g;
    Vec3d vec3d1 = b6.a(new Vec3d(paramc4.field_70142_S, paramc4.field_70137_T, paramc4.field_70136_U), paramc4.func_174791_d(), paramFloat2);
    Vec3d vec3d2 = b6.a(new Vec3d(((EntityPlayer)entityPlayerSP).field_70142_S, ((EntityPlayer)entityPlayerSP).field_70137_T, ((EntityPlayer)entityPlayerSP).field_70136_U), entityPlayerSP.func_174791_d(), paramFloat2);
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    try {
      GlStateManager.func_179094_E();
      GlStateManager.func_179137_b(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
      GlStateManager.func_179114_b(180.0F - this.field_76990_c.field_78735_i, 0.0F, 1.0F, 0.0F);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179114_b(((this.field_76990_c.field_78733_k.field_74320_O == 2) ? -1 : true) * -this.field_76990_c.field_78732_j, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179139_a(paramc4.g, paramc4.g, paramc4.g);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferBuilder = tessellator.func_178180_c();
    this.c.field_71446_o.func_110577_a(a(paramc4));
    if (paramc4.g == 1.0D) {
      float f = (float)this.c.field_71441_e.func_82737_E() + this.c.func_184121_ak();
      double d = 0.5D * Math.sin(f * 0.5D) + 0.5D;
      gv1 = b6.a(e, b, d);
      gv2 = b6.a(b, e, d);
    } else {
      gv1 = b6.a(d, e, paramc4.g);
      gv2 = b6.a(d, e, paramc4.g);
    } 
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
    a(bufferBuilder, gv1, 0.0F);
    tessellator.func_78381_a();
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
    GlStateManager.func_179152_a(0.75F, 0.75F, 0.75F);
    GlStateManager.func_179109_b(0.0F, 0.075F, 0.0F);
    a(bufferBuilder, gv2, 0.001F);
    tessellator.func_78381_a();
    GlStateManager.func_179121_F();
    GlStateManager.func_179118_c();
    GL11.glEnable(2896);
    OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, OpenGlHelper.lastBrightnessX, OpenGlHelper.lastBrightnessY);
  }
  
  void a(BufferBuilder paramBufferBuilder, gv paramgv, float paramFloat) {
    paramBufferBuilder.func_181662_b(-0.25D, 0.0D, paramFloat).func_187315_a(0.0D, 0.0D).func_181669_b(paramgv.a, paramgv.d, paramgv.c, paramgv.b).func_181675_d();
    paramBufferBuilder.func_181662_b(0.25D, 0.0D, paramFloat).func_187315_a(1.0D, 0.0D).func_181669_b(paramgv.a, paramgv.d, paramgv.c, paramgv.b).func_181675_d();
    paramBufferBuilder.func_181662_b(0.25D, 0.5D, paramFloat).func_187315_a(1.0D, 1.0D).func_181669_b(paramgv.a, paramgv.d, paramgv.c, paramgv.b).func_181675_d();
    paramBufferBuilder.func_181662_b(-0.25D, 0.5D, paramFloat).func_187315_a(0.0D, 1.0D).func_181669_b(paramgv.a, paramgv.d, paramgv.c, paramgv.b).func_181675_d();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ag.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */