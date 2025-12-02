package com.trolmastercard.sexmod;

import net.minecraft.util.ResourceLocation;

public class c2 extends cv {
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/allie/allie.geo.json"), new ResourceLocation("sexmod", "geo/allie/armored.geo.json"), new ResourceLocation("sexmod", "geo/allie/allie.geo.json") };
  }
  
  public ResourceLocation a(em paramem) {
    try {
      if (paramem.field_70170_p instanceof gj)
        return this.c[0]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue() > this.c.length) {
        System.out.println("Girl doesn't have an outfit Nr." + paramem.func_184212_Q().func_187225_a(em.D) + " so im just making her nude lol");
        return this.c[0];
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramem instanceof e5)
        return this.c[((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue()]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue() == 1)
        return this.c[2]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.c[0];
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/allie/allie.png");
  }
  
  public ResourceLocation b(em paramem) {
    return new ResourceLocation("sexmod", "animations/allie/allie.animation.json");
  }
  
  public String[] c() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] f() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "clothes", "clothesR", "clothesL" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\c2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */