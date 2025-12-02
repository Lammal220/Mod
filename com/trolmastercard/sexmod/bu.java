package com.trolmastercard.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelElytra;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.renderers.geo.GeoLayerRenderer;
import software.bernie.geckolib3.renderers.geo.IGeoRenderer;

public class bu extends GeoLayerRenderer {
  private static final ResourceLocation b = new ResourceLocation("textures/entity/elytra.png");
  
  private final ModelElytra a = new ModelElytra();
  
  public bu(IGeoRenderer paramIGeoRenderer) {
    super(paramIGeoRenderer);
  }
  
  public void render(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, Color paramColor) {
    try {
      if (!(paramEntityLivingBase instanceof e2))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    e2 e2 = (e2)paramEntityLivingBase;
    ItemStack itemStack = (ItemStack)e2.func_184212_Q().func_187225_a(e2.T);
    EntityPlayer entityPlayer = null;
    if (e2 instanceof ei) {
      UUID uUID = ((ei)e2).m();
      if (uUID != null)
        entityPlayer = paramEntityLivingBase.field_70170_p.func_152378_a(uUID); 
    } 
    try {
      if (itemStack.func_77973_b() != Items.field_185160_cR)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
    GlStateManager.func_179147_l();
    GlStateManager.func_187401_a(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
    (Minecraft.func_71410_x().func_175598_ae()).field_78724_e.func_110577_a(b);
    GlStateManager.func_179094_E();
    GlStateManager.func_179109_b(0.0F, 0.0F, 0.125F);
    float f = a();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.a.func_78087_a(paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, f, (entityPlayer == null) ? (Entity)paramEntityLivingBase : (Entity)entityPlayer);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.a.func_78088_a((entityPlayer == null) ? (Entity)paramEntityLivingBase : (Entity)entityPlayer, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, f);
    GlStateManager.func_179084_k();
    GlStateManager.func_179121_F();
  }
  
  public float a() {
    GlStateManager.func_179091_B();
    GlStateManager.func_179152_a(-1.0F, -1.0F, 1.0F);
    GlStateManager.func_179109_b(0.0F, -1.501F, 0.0F);
    return 0.0625F;
  }
  
  public void func_177141_a(EntityLivingBase paramEntityLivingBase, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7) {}
  
  public boolean func_177142_b() {
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */