package com.trolmastercard.sexmod;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class bp extends RenderLiving<ay> {
  private static final ResourceLocation a = new ResourceLocation("textures/entity/slime/slime.png");
  
  public bp(RenderManager paramRenderManager) {
    super(paramRenderManager, new c_(), 0.25F);
    func_177094_a(new a4(this));
  }
  
  public void a(ay paramay, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.field_76989_e = 0.25F * paramay.h();
    super.func_76986_a(paramay, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
  }
  
  protected void a(ay paramay, float paramFloat) {
    float f1 = 0.999F;
    GlStateManager.func_179152_a(0.999F, 0.999F, 0.999F);
    float f2 = paramay.h();
    float f3 = (paramay.h + (paramay.e - paramay.h) * paramFloat) / (f2 * 0.5F + 1.0F);
    float f4 = 1.0F / (f3 + 1.0F);
    GlStateManager.func_179152_a(f4 * f2, 1.0F / f4 * f2, f4 * f2);
  }
  
  protected ResourceLocation a(ay paramay) {
    return a;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */