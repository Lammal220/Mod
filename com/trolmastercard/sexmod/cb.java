package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.AnimationState;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.resource.GeckoLibCache;
import software.bernie.shadowed.eliotlash.molang.MolangParser;

public class cb extends cv {
  public static ResourceLocation h = new ResourceLocation("sexmod", "textures/entity/galath/galath.png");
  
  float g = 0.0F;
  
  long f = -1L;
  
  long i = -1L;
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/galath/galath.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath.geo.json"), new ResourceLocation("sexmod", "geo/galath/galath_con_mang.geo.json") };
  }
  
  public ResourceLocation a(em paramem) {
    try {
      if (paramem.field_70170_p instanceof gj)
        return this.c[0]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (((b7)paramem).b())
        return this.c[2]; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.c[((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue()];
  }
  
  public ResourceLocation b() {
    return h;
  }
  
  public ResourceLocation b(em paramem) {
    return new ResourceLocation("sexmod", "animations/galath/galath.animation.json");
  }
  
  protected boolean e(em paramem) {
    try {
      if (!(paramem instanceof f_))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = (f_)paramem;
    try {
      if (f_.k())
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f_.M() == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  public void a(em paramem, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    try {
      k(paramem);
      super.a(paramem, paramInteger, paramAnimationEvent);
      a(paramem);
      h(paramem);
      f(paramem);
      b(paramem);
      e(paramem);
      g(paramem);
      j(paramem);
      a();
      c(paramem);
      i(paramem);
      d(paramem);
      if (!(paramem instanceof f_))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = (f_)paramem;
    try {
      f_.aE = getAnimationProcessor().getBone("head").getRotationX();
      if (f_.b())
        ce.a(f_, getAnimationProcessor(), paramAnimationEvent.getPartialTick()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void i(em paramem) {
    // Byte code:
    //   0: aload_1
    //   1: iconst_1
    //   2: anewarray com/trolmastercard/sexmod/fp
    //   5: dup
    //   6: iconst_0
    //   7: getstatic com/trolmastercard/sexmod/fp.PUSSY_LICKING : Lcom/trolmastercard/sexmod/fp;
    //   10: aastore
    //   11: invokestatic a : (Lcom/trolmastercard/sexmod/em;[Lcom/trolmastercard/sexmod/fp;)Z
    //   14: ifne -> 22
    //   17: return
    //   18: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   21: athrow
    //   22: aload_1
    //   23: instanceof com/trolmastercard/sexmod/f_
    //   26: ifne -> 34
    //   29: return
    //   30: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   33: athrow
    //   34: aload_0
    //   35: getfield a : Lnet/minecraft/client/Minecraft;
    //   38: invokevirtual func_147113_T : ()Z
    //   41: ifeq -> 49
    //   44: return
    //   45: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   48: athrow
    //   49: aload_0
    //   50: invokevirtual getAnimationProcessor : ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
    //   53: astore_2
    //   54: aload_2
    //   55: ldc 'head'
    //   57: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   60: astore_3
    //   61: aload_0
    //   62: getfield a : Lnet/minecraft/client/Minecraft;
    //   65: invokevirtual func_184121_ak : ()F
    //   68: aload_0
    //   69: getfield a : Lnet/minecraft/client/Minecraft;
    //   72: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   75: getfield field_70173_aa : I
    //   78: i2f
    //   79: fadd
    //   80: fstore #4
    //   82: aload_0
    //   83: aload_1
    //   84: checkcast com/trolmastercard/sexmod/f_
    //   87: fload #4
    //   89: invokevirtual a : (Lcom/trolmastercard/sexmod/f_;F)Lcom/trolmastercard/sexmod/f7;
    //   92: astore #5
    //   94: aload_3
    //   95: aload_3
    //   96: invokeinterface getRotationX : ()F
    //   101: aload #5
    //   103: getfield a : F
    //   106: fadd
    //   107: invokeinterface setRotationX : (F)V
    //   112: aload_3
    //   113: aload_3
    //   114: invokeinterface getRotationY : ()F
    //   119: aload #5
    //   121: getfield c : F
    //   124: fadd
    //   125: invokeinterface setRotationY : (F)V
    //   130: aload_3
    //   131: aload_3
    //   132: invokeinterface getRotationZ : ()F
    //   137: aload #5
    //   139: getfield b : F
    //   142: fadd
    //   143: invokeinterface setRotationZ : (F)V
    //   148: aload_1
    //   149: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   152: getstatic com/trolmastercard/sexmod/fp.PUSSY_LICKING : Lcom/trolmastercard/sexmod/fp;
    //   155: if_acmpne -> 175
    //   158: aload_1
    //   159: checkcast com/trolmastercard/sexmod/f_
    //   162: getfield a5 : Z
    //   165: ifeq -> 180
    //   168: goto -> 175
    //   171: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   174: athrow
    //   175: return
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: fload #4
    //   182: ldc 0.3
    //   184: fmul
    //   185: f2d
    //   186: invokestatic sin : (D)D
    //   189: ldc2_w 10.0
    //   192: dmul
    //   193: d2f
    //   194: fstore #6
    //   196: fload #6
    //   198: fconst_0
    //   199: fcmpl
    //   200: ifle -> 219
    //   203: aload_0
    //   204: getfield g : F
    //   207: fconst_0
    //   208: fcmpg
    //   209: iflt -> 249
    //   212: goto -> 219
    //   215: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   218: athrow
    //   219: fload #6
    //   221: fconst_0
    //   222: fcmpg
    //   223: ifge -> 266
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   232: athrow
    //   233: aload_0
    //   234: getfield g : F
    //   237: fconst_0
    //   238: fcmpl
    //   239: ifle -> 266
    //   242: goto -> 249
    //   245: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   248: athrow
    //   249: aload_1
    //   250: getstatic com/trolmastercard/sexmod/c.GIRLS_ALLIE_LIPSOUND : [Lnet/minecraft/util/SoundEvent;
    //   253: invokestatic a : ([Lnet/minecraft/util/SoundEvent;)Lnet/minecraft/util/SoundEvent;
    //   256: invokevirtual a : (Lnet/minecraft/util/SoundEvent;)V
    //   259: goto -> 266
    //   262: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   265: athrow
    //   266: aload_0
    //   267: fload #6
    //   269: putfield g : F
    //   272: return
    // Exception table:
    //   from	to	target	type
    //   0	18	18	java/lang/RuntimeException
    //   22	30	30	java/lang/RuntimeException
    //   34	45	45	java/lang/RuntimeException
    //   94	168	171	java/lang/RuntimeException
    //   158	176	176	java/lang/RuntimeException
    //   196	212	215	java/lang/RuntimeException
    //   203	226	229	java/lang/RuntimeException
    //   219	242	245	java/lang/RuntimeException
    //   233	259	262	java/lang/RuntimeException
  }
  
  f7 a(f_ paramf_, float paramFloat) {
    return b6.a(a(paramFloat), f7.d, paramf_.b(this.a.func_184121_ak()));
  }
  
  f7 a(float paramFloat) {
    return new f7((float)Math.sin((paramFloat * 0.3F)) * gc.c(10.0F), (float)Math.sin((paramFloat * 0.15F)) * gc.c(7.0F), (float)Math.sin(paramFloat * -0.15D) * gc.c(7.0F));
  }
  
  void c(em paramem) {
    try {
      if (!(paramem instanceof f_))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = (f_)paramem;
    AnimationProcessor animationProcessor = getAnimationProcessor();
    IBone iBone = animationProcessor.getBone("body");
    f_.bw = iBone.getRotationY();
    f_.bm = iBone.getScaleY();
  }
  
  void d(em paramem) {
    try {
      if (paramem.C.getAnimationState() != AnimationState.Transitioning)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    AnimationProcessor animationProcessor = getAnimationProcessor();
    fp fp = paramem.y();
    if (fp == fp.HUG_MANG) {
      IBone iBone = animationProcessor.getBone("body2");
      try {
        if (iBone == null)
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      iBone.setPositionX(0.0F);
      iBone.setPositionY(-0.53F);
      iBone.setPositionZ(-40.05F);
    } 
  }
  
  void k(em paramem) {
    EntityPlayerSP entityPlayerSP;
    try {
      if (ClientProxy.IS_PRELOADING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramem.y() != fp.MASTERBATE)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = paramem.z();
    if (entityPlayer == null)
      entityPlayerSP = this.a.field_71439_g; 
    MolangParser molangParser = (GeckoLibCache.getInstance()).parser;
    Vec3d vec3d = ak.b((Entity)paramem, (EntityPlayer)entityPlayerSP, this.a.func_184121_ak()).func_178787_e(paramem.b("head"));
    float f1 = (float)gc.b(Math.atan2(vec3d.field_72449_c, vec3d.field_72450_a)) - paramem.I().floatValue();
    float f2 = (float)gc.b(Math.atan2(vec3d.field_72448_b, Math.sqrt(vec3d.field_72450_a * vec3d.field_72450_a + vec3d.field_72449_c * vec3d.field_72449_c)));
    double d1 = Math.abs(vec3d.field_72450_a) + Math.abs(vec3d.field_72448_b) + Math.abs(vec3d.field_72449_c);
    double d2 = d1 * 7.0D + -20.0D;
    double d3 = d1 * 5.0D + -20.0D;
    molangParser.setValue("pitch", d2 + f2 - 80.0D);
    molangParser.setValue("armpitch", d3 + f2 + -110.0D);
    molangParser.setValue("armyaw", (f1 + 80.0F));
    molangParser.setValue("yaw", (f1 + 90.0F));
  }
  
  void a() {
    try {
      if (ClientProxy.IS_PRELOADING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      getAnimationProcessor().getBone("futaCock").setHidden(!a_.e);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      getAnimationProcessor().getBone("futaBallLL").setHidden(!a_.e);
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    getAnimationProcessor().getBone("futaBallLR").setHidden(!a_.e);
  }
  
  void j(em paramem) {
    try {
      if (!(paramem instanceof ei))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    getAnimationProcessor().getBone("coin").setHidden(true);
  }
  
  void g(em paramem) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    getAnimationProcessor().getBone("wings").setHidden(!((b7)paramem).a());
  }
  
  void e(em paramem) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getAnimationProcessor : ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
    //   4: astore_2
    //   5: aload_2
    //   6: ldc 'nippleR'
    //   8: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   11: astore_3
    //   12: aload_2
    //   13: ldc 'nippleL'
    //   15: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   18: astore #4
    //   20: aload_2
    //   21: ldc 'braBoobL'
    //   23: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   26: astore #5
    //   28: aload_2
    //   29: ldc 'braBoobR'
    //   31: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   34: astore #6
    //   36: aload_2
    //   37: ldc 'slip'
    //   39: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   42: astore #7
    //   44: aload_1
    //   45: checkcast com/trolmastercard/sexmod/b7
    //   48: invokeinterface c : ()Z
    //   53: istore #8
    //   55: aload_1
    //   56: iconst_3
    //   57: anewarray com/trolmastercard/sexmod/fp
    //   60: dup
    //   61: iconst_0
    //   62: getstatic com/trolmastercard/sexmod/fp.PUSSY_LICKING : Lcom/trolmastercard/sexmod/fp;
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: getstatic com/trolmastercard/sexmod/fp.MASTERBATE_SITTING : Lcom/trolmastercard/sexmod/fp;
    //   71: aastore
    //   72: dup
    //   73: iconst_2
    //   74: getstatic com/trolmastercard/sexmod/fp.MASTERBATE_SITTING_CUM : Lcom/trolmastercard/sexmod/fp;
    //   77: aastore
    //   78: invokestatic a : (Lcom/trolmastercard/sexmod/em;[Lcom/trolmastercard/sexmod/fp;)Z
    //   81: istore #9
    //   83: aload_3
    //   84: ifnonnull -> 92
    //   87: return
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: aload #5
    //   94: ifnonnull -> 102
    //   97: return
    //   98: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   101: athrow
    //   102: aload_3
    //   103: iload #8
    //   105: ifne -> 116
    //   108: iconst_1
    //   109: goto -> 117
    //   112: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   115: athrow
    //   116: iconst_0
    //   117: invokeinterface setHidden : (Z)V
    //   122: aload #4
    //   124: iload #8
    //   126: ifne -> 137
    //   129: iconst_1
    //   130: goto -> 138
    //   133: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   136: athrow
    //   137: iconst_0
    //   138: invokeinterface setHidden : (Z)V
    //   143: aload #5
    //   145: iload #8
    //   147: invokeinterface setHidden : (Z)V
    //   152: aload #6
    //   154: iload #8
    //   156: invokeinterface setHidden : (Z)V
    //   161: aload #7
    //   163: iload #8
    //   165: ifne -> 180
    //   168: iload #9
    //   170: ifeq -> 188
    //   173: goto -> 180
    //   176: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   179: athrow
    //   180: iconst_1
    //   181: goto -> 189
    //   184: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: iconst_0
    //   189: invokeinterface setHidden : (Z)V
    //   194: return
    // Exception table:
    //   from	to	target	type
    //   83	88	88	java/lang/RuntimeException
    //   92	98	98	java/lang/RuntimeException
    //   102	112	112	java/lang/RuntimeException
    //   117	133	133	java/lang/RuntimeException
    //   138	173	176	java/lang/RuntimeException
    //   168	184	184	java/lang/RuntimeException
  }
  
  void b(em paramem) {
    try {
      if (!(paramem instanceof f_))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!((Boolean)paramem.func_184212_Q().func_187225_a(f_.bP)).booleanValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramem.y() != fp.KNOCK_OUT_FLY)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IBone iBone = getAnimationProcessor().getBone("body");
    Vec3d vec3d1 = new Vec3d(paramem.field_70142_S, paramem.field_70137_T, paramem.field_70136_U);
    Vec3d vec3d2 = paramem.func_174791_d().func_178788_d(vec3d1);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (Math.abs(vec3d2.field_72450_a) + Math.abs(vec3d2.field_72449_c) < 0.009999999776482582D) ? true : false;
    try {
      if (bool) {
        iBone.setRotationX(gc.c(-90.0F));
        iBone.setPositionY(0.0F);
        iBone.setPositionZ(0.0F);
      } else {
        Vec3d vec3d = d(paramem);
        iBone.setRotationX(-((float)vec3d.field_72450_a));
        iBone.setPositionY((float)vec3d.field_72448_b);
        iBone.setPositionZ((float)vec3d.field_72449_c);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void h(em paramem) {
    try {
      if (!(paramem instanceof f_))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramem.y() != fp.RAPE_CHARGE)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d = d(paramem);
    IBone iBone1 = getAnimationProcessor().getBone("body");
    IBone iBone2 = getAnimationProcessor().getBone("rotationTool");
    iBone2.setRotationX((float)vec3d.field_72450_a);
    iBone1.setPositionY((float)vec3d.field_72448_b);
    iBone1.setPositionZ((float)vec3d.field_72449_c);
    float f = ((Float)paramem.func_184212_Q().func_187225_a(f_.bO)).floatValue();
    iBone1.setRotationY(gc.c(f * 180.0F));
  }
  
  void f(em paramem) {
    try {
      if (!(paramem instanceof f_))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    f_ f_ = (f_)paramem;
    try {
      if (f_.y() != fp.ATTACK_SWORD) {
        this.f = -1L;
        this.i = -1L;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = f_.az();
    try {
      if (i == 24)
        try {
          if (this.f == -1L) {
            this.f = this.a.field_71441_e.func_82737_E();
            this.i = this.f + 8L;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!be.a(i, 24.0D, 32.0D))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IBone iBone = getAnimationProcessor().getBone("body");
    Vec3d vec3d = a(f_, f_.B());
    float f = ((float)(Minecraft.func_71410_x()).field_71441_e.func_82737_E() + this.a.func_184121_ak() - (float)this.f) / (float)(this.i - this.f);
    vec3d = b6.a(vec3d, Vec3d.field_186680_a, f);
    iBone.setRotationX((float)vec3d.field_72450_a);
    iBone.setPositionY((float)vec3d.field_72448_b);
    iBone.setPositionZ((float)vec3d.field_72449_c);
  }
  
  void a(em paramem) {
    float f1 = 0.0F;
    try {
      switch (a.a[paramem.y().ordinal()]) {
        case 1:
          try {
            if (fp.BOOST.ticksPlaying[1] > 13 && fp.BOOST.ticksPlaying[1] < 40)
              f1 = 45.0F; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          break;
        case 2:
        case 3:
          break;
        default:
          return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f2 = Minecraft.func_71410_x().func_184121_ak();
    IBone iBone = getAnimationProcessor().getBone("rotationTool");
    f2 f21 = ((b7)paramem).d();
    iBone.setRotationX((float)b6.b(f21.c + f1, f21.d + f1, f2));
    iBone.setRotationZ((float)b6.b(f21.b, f21.a, f2));
  }
  
  public String[] c() {
    return new String[] { "armorHelmet" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */