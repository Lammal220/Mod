package com.trolmastercard.sexmod;

import java.util.Arrays;
import javax.vecmath.Tuple3f;
import javax.vecmath.Vector3f;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class cr extends cv {
  fp[] f = new fp[] { fp.STARTDOGGY, fp.DOGGYCUM, fp.DOGGYSLOW, fp.DOGGYFAST, fp.DOGGYCUM, fp.DOGGYSTART, fp.WAITDOGGY };
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/slime/nude.geo.json"), new ResourceLocation("sexmod", "geo/slime/armored.geo.json"), new ResourceLocation("sexmod", "geo/slime/dressed.geo.json") };
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
      if (paramem instanceof ec)
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
    return new ResourceLocation("sexmod", "textures/entity/slime/slime.png");
  }
  
  public ResourceLocation b(em paramem) {
    return new ResourceLocation("sexmod", "animations/slime/slime.animation.json");
  }
  
  public void a(em paramem, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    super.a(paramem, paramInteger, paramAnimationEvent);
    AnimationProcessor animationProcessor = getAnimationProcessor();
    try {
      if (!(paramem.field_70170_p instanceof gj))
        try {
          if (animationProcessor.getBone("bedSlime") != null)
            try {
              if (animationProcessor.getBone("bedSlimeLayer") != null) {
                try {
                
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                try {
                  animationProcessor.getBone("bedSlime").setHidden(!Arrays.<fp>asList(this.f).contains(paramem.y()));
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                } 
                animationProcessor.getBone("bedSlimeLayer").setHidden(!Arrays.<fp>asList(this.f).contains(paramem.y()));
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramem instanceof ei)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(new String[] { "head" }, "hat");
  }
  
  void a(String[] paramArrayOfString, String paramString) {
    AnimationProcessor animationProcessor = getAnimationProcessor();
    IBone iBone = animationProcessor.getBone(paramString);
    IBone[] arrayOfIBone = new IBone[paramArrayOfString.length];
    byte b = 0;
    try {
      while (b < arrayOfIBone.length) {
        arrayOfIBone[b] = animationProcessor.getBone(paramArrayOfString[b]);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vector3f vector3f1 = new Vector3f(0.0F, 0.0F, 0.0F);
    Vector3f vector3f2 = new Vector3f(0.0F, 0.0F, 0.0F);
    for (IBone iBone1 : arrayOfIBone) {
      vector3f1.add((Tuple3f)new Vector3f(iBone1.getRotationX(), iBone1.getRotationY(), iBone1.getRotationZ()));
      vector3f2.add((Tuple3f)new Vector3f(iBone1.getPositionX(), iBone1.getPositionY(), iBone1.getPositionZ()));
    } 
    iBone.setRotationX(vector3f1.x);
    iBone.setRotationY(vector3f1.y);
    iBone.setRotationZ(vector3f1.z);
    iBone.setPositionX(vector3f2.x);
    iBone.setPositionY(vector3f2.y);
    iBone.setPositionZ(vector3f2.z);
    iBone.setPositionZ(vector3f2.z);
  }
  
  public String[] c() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] g() {
    return new String[] { "bigblob" };
  }
  
  public String[] f() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "upperBodyL", "upperBodyR", "cloth" };
  }
  
  public String[] h() {
    return new String[] { "armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip" };
  }
  
  public String[] e() {
    return new String[] { "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR" };
  }
  
  public String[] b() {
    return new String[] { "armorShoesL", "armorShoesR" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */