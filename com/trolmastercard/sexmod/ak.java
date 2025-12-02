package com.trolmastercard.sexmod;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;

public class ak {
  public static Vec3d b(Entity paramEntity, EntityPlayer paramEntityPlayer, float paramFloat) {
    Vec3d vec3d1 = b6.a(new Vec3d(paramEntity.field_70142_S, paramEntity.field_70137_T + paramEntityPlayer.func_70047_e(), paramEntity.field_70136_U), paramEntity.func_174791_d().func_72441_c(0.0D, paramEntityPlayer.func_70047_e(), 0.0D), paramFloat);
    Vec3d vec3d2 = b6.a(new Vec3d(paramEntityPlayer.field_70142_S, paramEntityPlayer.field_70137_T, paramEntityPlayer.field_70136_U), paramEntityPlayer.func_174791_d(), paramFloat);
    return vec3d1.func_178788_d(vec3d2);
  }
  
  public static Vec3d a(Entity paramEntity, EntityPlayer paramEntityPlayer, float paramFloat) {
    Vec3d vec3d1 = a(paramEntity, paramFloat);
    try {
      if (paramEntityPlayer == null)
        return vec3d1; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d2 = a((Entity)paramEntityPlayer, paramFloat);
    return vec3d1.func_178788_d(vec3d2);
  }
  
  public static Vec3d a(Entity paramEntity, float paramFloat) {
    try {
      if (!(paramEntity instanceof em))
        return b(paramEntity, paramFloat); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    em em = (em)paramEntity;
    try {
      if (!em.Q())
        return b(paramEntity, paramFloat); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return em.o();
  }
  
  static Vec3d b(Entity paramEntity, float paramFloat) {
    return b6.a(new Vec3d(paramEntity.field_70142_S, paramEntity.field_70137_T, paramEntity.field_70136_U), paramEntity.func_174791_d(), paramFloat);
  }
  
  public static void a() {
    OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, 240.0F, 240.0F);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */