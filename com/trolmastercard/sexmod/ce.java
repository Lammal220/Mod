package com.trolmastercard.sexmod;

import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class ce extends cv {
  public static final float h = 7.0F;
  
  public static final float k = 0.75F;
  
  static final float l = gc.c(140.0F);
  
  static final float m = gc.c(35.0F);
  
  static final float i = 90.0F;
  
  static final float g = gc.c(45.0F);
  
  static final float f = gc.c(-45.0F);
  
  public static final ResourceLocation j = new ResourceLocation("sexmod", "textures/entity/manglelie/manglelie.png");
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/manglelie/manglelie.geo.json"), new ResourceLocation("sexmod", "geo/manglelie/manglelie.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath_con_mang.geo.json") };
  }
  
  public ResourceLocation a(em paramem) {
    try {
      if (paramem.field_70170_p instanceof gj)
        return this.c[0]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (c(paramem))
        return this.c[2]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.c[((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue()];
  }
  
  public static boolean c(em paramem) {
    return fp.a(paramem, new fp[] { fp.THREESOME_SLOW, fp.THREESOME_FAST, fp.THREESOME_CUM });
  }
  
  public ResourceLocation b() {
    return j;
  }
  
  public ResourceLocation b(em paramem) {
    return new ResourceLocation("sexmod", "animations/manglelie/manglelie.animation.json");
  }
  
  public void a(em paramem, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    super.a(paramem, paramInteger, paramAnimationEvent);
    a(paramem, getAnimationProcessor(), paramAnimationEvent.getPartialTick());
    b(paramem);
    d(paramem);
    a(paramem);
    e(paramem);
  }
  
  void e(em paramem) {
    try {
      if (this.a.func_147113_T())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (c(paramem))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = f8.a(paramem, false);
    try {
      if (f_ == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!fp.a(f_.y(), new fp[] { fp.CORRUPT_CUM, fp.CARRY_FAST, fp.CORRUPT_INTRO, fp.CORRUPT_SLOW }))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AnimationProcessor animationProcessor = getAnimationProcessor();
    IBone iBone1 = animationProcessor.getBone("legR");
    iBone1.setRotationY(iBone1.getRotationY() + f);
    IBone iBone2 = animationProcessor.getBone("lowerArmR");
    IBone iBone3 = animationProcessor.getBone("lowerArmL");
    iBone2.setRotationX(iBone2.getRotationX() + f);
    iBone3.setRotationX(iBone3.getRotationX() + f);
  }
  
  void a(em paramem) {
    try {
      if (!(paramem instanceof f8))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (c(paramem))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f8 f8 = (f8)paramem;
    f_ f_ = f8.a(false);
    try {
      if (f_ == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IBone iBone = getAnimationProcessor().getBone("body");
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    iBone.setRotationY(f_.bw + (this.a.func_147113_T() ? 0.0F : iBone.getRotationY()));
    iBone.setScaleX(f_.bm);
    iBone.setScaleY(f_.bm);
    iBone.setScaleZ(f_.bm);
  }
  
  Vec3d a(@Nonnull Entity paramEntity) {
    return ak.a(paramEntity, this.a.func_184121_ak()).func_72441_c(0.0D, paramEntity.func_70047_e(), 0.0D);
  }
  
  void d(em paramem) {
    a a;
    try {
      if (ClientProxy.IS_PRELOADING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (c(paramem))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.a.func_147113_T())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f8 f8 = (f8)paramem;
    try {
      if (!f8.r())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = f8.a(false);
    try {
      if (f_ == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AnimationProcessor animationProcessor = getAnimationProcessor();
    IBone iBone1 = animationProcessor.getBone("armL");
    IBone iBone2 = animationProcessor.getBone("armR");
    IBone iBone3 = animationProcessor.getBone("lowerArmL");
    IBone iBone4 = animationProcessor.getBone("lowerArmR");
    IBone iBone5 = animationProcessor.getBone("elbowR");
    IBone iBone6 = animationProcessor.getBone("elbowL");
    Entity entity = f8.b();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (entity == null);
    try {
      if (!bool)
        f8.R = a(entity); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = Minecraft.func_175610_ah();
    if (f == 0.0F)
      f = 1.0F; 
    try {
      if (f8.aj == bool) {
        f8.V = 0.0F;
      } else {
        f8.V += 1.5F / f;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f8.V >= 1.0F) {
        f8.V = 0.0F;
        f8.aj = bool;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f8.V == 0.0F) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        a = bool ? a(f_, iBone2, iBone1, iBone3, iBone4) : a(f8, f_, iBone4, iBone3, animationProcessor);
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        a = a.a(a(f_, iBone2, iBone1, iBone3, iBone4), a(f8, f_, iBone4, iBone3, animationProcessor), (float)(f8.aj ? b6.c(f8.V) : (1.0D - b6.c(f8.V))));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    iBone2.setRotationX(a.c.a);
    iBone2.setRotationY(a.c.c);
    iBone2.setRotationZ(a.c.b);
    iBone1.setRotationX(a.g.a);
    iBone1.setRotationY(a.g.c);
    iBone1.setRotationZ(a.g.b);
    iBone3.setRotationX(a.b.a);
    iBone3.setRotationY(a.b.c);
    iBone3.setRotationZ(a.b.b);
    iBone4.setRotationX(a.h.a);
    iBone4.setRotationY(a.h.c);
    iBone4.setRotationZ(a.h.b);
    iBone1.setScaleY(a.a);
    iBone2.setScaleY(a.f);
    iBone5.setRotationY(a.d);
    iBone6.setRotationY(a.e);
  }
  
  a a(@Nonnull f8 paramf8, @Nonnull f_ paramf_, IBone paramIBone1, IBone paramIBone2, AnimationProcessor paramAnimationProcessor) {
    float f7;
    a a = new a(null);
    a.b = new f7(m, 0.0F, paramIBone1.getRotationZ());
    a.h = new f7(l, 0.0F, paramIBone2.getRotationZ());
    float f1 = paramf_.aE + paramAnimationProcessor.getBone("upperBody").getRotationX();
    float f2 = this.a.func_184121_ak();
    Vec3d vec3d1 = dh.a(paramf_, f2);
    Vec3d vec3d2 = paramf8.b("armR").func_178787_e(vec3d1);
    Vec3d vec3d3 = paramf8.b("armL").func_178787_e(vec3d1);
    bm bm1 = be.a(vec3d2, paramf8.R);
    bm bm2 = be.a(vec3d3, paramf8.R);
    Float float_ = f_.a(paramf_, f2);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f3 = (float_ == null) ? b6.b(paramf_.field_70758_at, paramf_.field_70759_as, f2) : float_.floatValue();
    float f4 = gc.c(f3);
    float f5 = paramf8.b(f2);
    float f6 = (float)b6.e(Math.min(1.0F, f5));
    if (f6 != 1.0F) {
      f7 = 0.0F;
    } else {
      f7 = (f5 * 28.0F - 28.0F) / 32.0F;
      f7 = Math.max(0.0F, f7 - 0.5F) * 2.0F;
    } 
    float f9 = (float)b6.h(f7);
    float f10 = gc.c(b6.a(0.0F, 90.0F, f6));
    boolean bool = paramf8.a(paramf8.R, f2);
    try {
      if (bool) {
        try {
          a.c = new f7(-f1 + bm1.a + gc.c(90.0F), bm1.c, 0.0F);
          a.g = new f7(-f1 + bm2.a + gc.c(90.0F), (float)(bm2.c + gc.c(-20.0F) * Math.cos((bm1.c + f4 * 1.0F)) + b6.a(f10 / 2.0F, 0.0F, f9)), 0.0F);
          a.a = 1.0F + Math.abs(Math.abs(bm1.c) - Math.abs(f4)) * 0.1909F;
          a.e = gc.c(90.0F);
          a.b.b = b6.a(f10, 0.0F, f9);
          if (f7 > 0.5D) {
            a.b.a = m + (float)b6.b(g, 0.0D, b6.h(((f7 - 0.5F) * 2.0F)));
          } else {
            try {
              if (f7 != 0.0F)
                try {
                  if (f7 < 0.5D)
                    a.b.a = m + (float)b6.b(0.0D, g, b6.h((f7 * 2.0F))); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        try {
          a.g = new f7(-f1 + bm2.a + gc.c(90.0F), bm2.c, 0.0F);
          a.c = new f7(-f1 + bm1.a + gc.c(90.0F), (float)(bm1.c + gc.c(20.0F) * Math.cos((bm2.c + f4 * 1.0F))) - b6.a(f10 / 2.0F, 0.0F, f9), 0.0F);
          a.f = 1.0F + Math.abs(Math.abs(bm2.c) - Math.abs(f4)) * 0.1909F;
          a.d = gc.c(90.0F);
          a.h.b = -b6.a(f10, 0.0F, f9);
          if (f7 > 0.5D) {
            a.h.a = l + (float)b6.b(g, 0.0D, b6.h(((f7 - 0.5F) * 2.0F)));
          } else {
            try {
              if (f7 != 0.0F)
                try {
                  if (f7 < 0.5D)
                    a.h.a = l + (float)b6.b(0.0D, g, b6.h((f7 * 2.0F))); 
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a.c.c += f4;
    a.g.c += f4;
    return a;
  }
  
  a a(f_ paramf_, IBone paramIBone1, IBone paramIBone2, IBone paramIBone3, IBone paramIBone4) {
    float f = paramf_.aE;
    a a = new a(null);
    try {
      if (f > 0.0F) {
        a.c = new f7(paramIBone1.getRotationX() - f, paramIBone1.getRotationY() - f * -25.0F / 45.0F, paramIBone1.getRotationZ() + f * 12.5F / 45.0F);
        a.g = new f7(paramIBone2.getRotationX() - f, paramIBone2.getRotationY() + f * 15.0F / 45.0F, paramIBone2.getRotationZ());
        a.b = new f7(paramIBone3.getRotationX(), paramIBone3.getRotationY(), paramIBone3.getRotationZ());
        a.h = new f7(paramIBone4.getRotationX(), paramIBone4.getRotationY(), paramIBone4.getRotationZ());
        return a;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a.h = new f7(paramIBone4.getRotationX() + 2.0F * f, paramIBone4.getRotationY(), paramIBone4.getRotationZ());
    a.b = new f7(paramIBone3.getRotationX() + 2.2222223F * f, paramIBone3.getRotationY(), paramIBone3.getRotationZ());
    a.c = new f7(paramIBone1.getRotationX() - f, paramIBone1.getRotationY(), paramIBone1.getRotationZ() + f * 5.0F / 45.0F);
    a.g = new f7(paramIBone2.getRotationX() - f, paramIBone2.getRotationY(), paramIBone2.getRotationZ() - f * 5.0F / 45.0F);
    return a;
  }
  
  void b(em paramem) {
    try {
      if (ClientProxy.IS_PRELOADING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.a.func_147113_T())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f8 f8 = (f8)paramem;
    try {
      if (!dh.b(f8))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = f8.a(false);
    try {
      if (f_ == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AnimationProcessor animationProcessor = getAnimationProcessor();
    float f1 = f_.aE;
    animationProcessor.getBone("rotationTool").setRotationX(f1);
    IBone iBone1 = animationProcessor.getBone("head");
    IBone iBone2 = animationProcessor.getBone("upperBody");
    IBone iBone3 = animationProcessor.getBone("boobs");
    try {
      if (f1 > 0.0F) {
        iBone2.setRotationX(-1.1111112F * f1);
        iBone1.setRotationX(0.1333F * f1);
        iBone3.setRotationX(f1 * 22.5F / 45.0F);
      } else {
        iBone2.setRotationX(-1.6666666F * f1);
        iBone1.setRotationX(f1 * 0.666F);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f2 = be.a(f8.T, f8.af);
    float f3 = be.a(f8.ai, f8.W);
    float f4 = Minecraft.func_175610_ah();
    if (f4 == 0.0F)
      f4 = 1.0F; 
    try {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f5 = 7.0F * ((Math.abs(f2) < 7.0F) ? f2 : ((f2 > 0.0F) ? 7.0F : -7.0F)) * 1.0F / f4;
    try {
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f6 = 7.0F * ((Math.abs(f3) < 7.0F) ? f3 : ((f3 > 0.0F) ? 7.0F : -7.0F)) * 1.0F / f4;
    float f7 = f8.T + f5;
    float f9 = f8.ai + f6;
    iBone1.setRotationY(iBone1.getRotationY() + f7);
    iBone1.setRotationX(iBone1.getRotationX() + f9);
    f8.T = f7;
    f8.ai = f9;
  }
  
  public static void a(em paramem, AnimationProcessor paramAnimationProcessor, float paramFloat) {
    try {
      if (ClientProxy.IS_PRELOADING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = dh.a(paramem);
    e(paramAnimationProcessor, bool);
    f(paramAnimationProcessor, bool);
    b(paramem, paramAnimationProcessor, paramFloat);
  }
  
  static void b(em paramem, AnimationProcessor paramAnimationProcessor, float paramFloat) {
    try {
      if (!(paramem instanceof f8))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    for (byte b = 0; b < 3; b++) {
      IBone iBone = paramAnimationProcessor.getBone("cockStage" + b);
      try {
        if (iBone != null) {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          iBone.setHidden((b > ((f8)paramem).an));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  static void f(AnimationProcessor paramAnimationProcessor, boolean paramBoolean) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramAnimationProcessor.getBone("skirt").setHidden(!paramBoolean);
  }
  
  static void e(AnimationProcessor paramAnimationProcessor, boolean paramBoolean) {
    try {
      paramAnimationProcessor.getBone("cheekRBelowSkirt").setHidden(paramBoolean);
      paramAnimationProcessor.getBone("cheekLBelowSkirt").setHidden(paramBoolean);
      paramAnimationProcessor.getBone("sideRNoSkirt").setHidden(paramBoolean);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      paramAnimationProcessor.getBone("sideRSkirt").setHidden(!paramBoolean);
      paramAnimationProcessor.getBone("sideLNoSkirt").setHidden(paramBoolean);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramAnimationProcessor.getBone("sideLSkirt").setHidden(!paramBoolean);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  private static class a {
    private f7 c;
    
    private f7 g;
    
    private f7 h;
    
    private f7 b;
    
    private float f = 1.0F;
    
    private float a = 1.0F;
    
    private float e = 0.0F;
    
    private float d = 0.0F;
    
    private a() {}
    
    static a a(a param1a1, a param1a2, float param1Float) {
      a a1 = new a();
      a1.c = b6.a(param1a1.c, param1a2.c, param1Float);
      a1.g = b6.a(param1a1.g, param1a2.g, param1Float);
      a1.h = b6.a(param1a1.h, param1a2.h, param1Float);
      a1.b = b6.a(param1a1.b, param1a2.b, param1Float);
      a1.f = b6.a(param1a1.f, param1a2.f, param1Float);
      a1.a = b6.a(param1a1.a, param1a2.a, param1Float);
      a1.e = b6.a(param1a1.e, param1a2.e, param1Float);
      a1.d = b6.a(param1a1.d, param1a2.d, param1Float);
      return a1;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ce.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */