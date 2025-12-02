package com.trolmastercard.sexmod;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class a4 implements LayerRenderer<ay> {
  private final bp b;
  
  private final ModelBase a = (ModelBase)new ModelSlime(0);
  
  public a4(bp parambp) {
    this.b = parambp;
  }
  
  public void a(ay paramay, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7) {
    try {
      if (!paramay.func_82150_aj()) {
        GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.func_179108_z();
        GlStateManager.func_179147_l();
        GlStateManager.func_187401_a(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.a.func_178686_a(this.b.func_177087_b());
        this.a.func_78088_a((Entity)paramay, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
        GlStateManager.func_179084_k();
        GlStateManager.func_179133_A();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean func_177142_b() {
    return true;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */