package com.trolmastercard.sexmod;

import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class ci extends cv {
  final float g = 60.0F;
  
  Minecraft f = Minecraft.func_71410_x();
  
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/goblin/goblin.geo.json"), new ResourceLocation("sexmod", "geo/goblin/armored.geo.json") };
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/goblin/goblin.png");
  }
  
  public ResourceLocation b(em paramem) {
    return new ResourceLocation("sexmod", "animations/goblin/goblin.animation.json");
  }
  
  protected boolean f(em paramem) {
    try {
      if (!(paramem instanceof e3))
        return super.f(paramem); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    e3 e3 = (e3)paramem;
    UUID uUID = e3.ae();
    if (uUID == null)
      uUID = e3.e(); 
    try {
      if (uUID == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    World world = e3.field_70170_p;
    AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.func_152378_a(uUID);
    try {
      if (abstractClientPlayer == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return "default".equals(abstractClientPlayer.func_175154_l());
  }
  
  public void a(em paramem, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokespecial a : (Lcom/trolmastercard/sexmod/em;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   7: aload_1
    //   8: getfield field_70170_p : Lnet/minecraft/world/World;
    //   11: instanceof com/trolmastercard/sexmod/gj
    //   14: ifeq -> 22
    //   17: return
    //   18: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   21: athrow
    //   22: aload_0
    //   23: invokevirtual getAnimationProcessor : ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
    //   26: astore #4
    //   28: aload_1
    //   29: instanceof com/trolmastercard/sexmod/e3
    //   32: istore #5
    //   34: aload #4
    //   36: ldc 'preggy'
    //   38: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   41: astore #6
    //   43: aload #6
    //   45: aload_1
    //   46: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   49: getstatic com/trolmastercard/sexmod/e3.aV : Lnet/minecraft/network/datasync/DataParameter;
    //   52: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   55: checkcast java/lang/Boolean
    //   58: invokevirtual booleanValue : ()Z
    //   61: ifne -> 72
    //   64: iconst_1
    //   65: goto -> 73
    //   68: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   71: athrow
    //   72: iconst_0
    //   73: invokeinterface setHidden : (Z)V
    //   78: aload #4
    //   80: ldc 'body'
    //   82: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   85: astore #7
    //   87: aload #4
    //   89: ldc 'head'
    //   91: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   94: astore #8
    //   96: aload_1
    //   97: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   100: astore #9
    //   102: aload #9
    //   104: getstatic com/trolmastercard/sexmod/fp.BREEDING_SLOW_2 : Lcom/trolmastercard/sexmod/fp;
    //   107: if_acmpeq -> 140
    //   110: aload #9
    //   112: getstatic com/trolmastercard/sexmod/fp.BREEDING_FAST_2 : Lcom/trolmastercard/sexmod/fp;
    //   115: if_acmpeq -> 140
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   124: athrow
    //   125: aload #9
    //   127: getstatic com/trolmastercard/sexmod/fp.BREEDING_CUM_2 : Lcom/trolmastercard/sexmod/fp;
    //   130: if_acmpne -> 184
    //   133: goto -> 140
    //   136: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   139: athrow
    //   140: aload_0
    //   141: getfield f : Lnet/minecraft/client/Minecraft;
    //   144: getfield field_71474_y : Lnet/minecraft/client/settings/GameSettings;
    //   147: getfield field_74320_O : I
    //   150: ifne -> 184
    //   153: goto -> 160
    //   156: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   159: athrow
    //   160: aload #7
    //   162: aload #7
    //   164: invokeinterface getPositionY : ()F
    //   169: ldc 1.5
    //   171: fadd
    //   172: invokeinterface setPositionY : (F)V
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   183: athrow
    //   184: aload_1
    //   185: checkcast com/trolmastercard/sexmod/ai
    //   188: astore #10
    //   190: iload #5
    //   192: ifeq -> 210
    //   195: aload #9
    //   197: getstatic com/trolmastercard/sexmod/fp.AWAIT_PICK_UP : Lcom/trolmastercard/sexmod/fp;
    //   200: if_acmpeq -> 225
    //   203: goto -> 210
    //   206: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   209: athrow
    //   210: aload #9
    //   212: getstatic com/trolmastercard/sexmod/fp.VANISH : Lcom/trolmastercard/sexmod/fp;
    //   215: if_acmpne -> 241
    //   218: goto -> 225
    //   221: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   224: athrow
    //   225: aload_0
    //   226: aload_1
    //   227: aload #7
    //   229: aload #8
    //   231: invokevirtual a : (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: iload #5
    //   243: ifeq -> 275
    //   246: aload #9
    //   248: getstatic com/trolmastercard/sexmod/fp.SIT : Lcom/trolmastercard/sexmod/fp;
    //   251: if_acmpne -> 275
    //   254: goto -> 261
    //   257: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   260: athrow
    //   261: aload_0
    //   262: aload_1
    //   263: aload #8
    //   265: invokevirtual a : (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/IBone;)V
    //   268: goto -> 275
    //   271: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   274: athrow
    //   275: aload #9
    //   277: getstatic com/trolmastercard/sexmod/fp.START_THROWING : Lcom/trolmastercard/sexmod/fp;
    //   280: if_acmpne -> 343
    //   283: aload_0
    //   284: getfield f : Lnet/minecraft/client/Minecraft;
    //   287: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   290: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   293: aload #10
    //   295: invokeinterface e : ()Ljava/util/UUID;
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 331
    //   306: goto -> 313
    //   309: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   312: athrow
    //   313: aload_0
    //   314: aload #7
    //   316: aload #4
    //   318: aload_1
    //   319: aload #10
    //   321: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;Lcom/trolmastercard/sexmod/ai;)V
    //   324: goto -> 351
    //   327: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   330: athrow
    //   331: aload_0
    //   332: aload #7
    //   334: aload #4
    //   336: aload_1
    //   337: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/IBone;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;)V
    //   340: goto -> 351
    //   343: aload #7
    //   345: iconst_0
    //   346: invokeinterface setHidden : (Z)V
    //   351: aload #7
    //   353: invokeinterface isHidden : ()Z
    //   358: ifne -> 376
    //   361: aload #9
    //   363: getstatic com/trolmastercard/sexmod/fp.START_THROWING : Lcom/trolmastercard/sexmod/fp;
    //   366: if_acmpeq -> 391
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   375: athrow
    //   376: aload #9
    //   378: getstatic com/trolmastercard/sexmod/fp.THROWN : Lcom/trolmastercard/sexmod/fp;
    //   381: if_acmpne -> 436
    //   384: goto -> 391
    //   387: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   390: athrow
    //   391: aload_1
    //   392: invokestatic d : (Lcom/trolmastercard/sexmod/em;)Lnet/minecraft/util/math/Vec3d;
    //   395: astore #11
    //   397: aload #7
    //   399: aload #11
    //   401: getfield field_72450_a : D
    //   404: d2f
    //   405: invokeinterface setRotationX : (F)V
    //   410: aload #7
    //   412: aload #11
    //   414: getfield field_72448_b : D
    //   417: d2f
    //   418: invokeinterface setPositionY : (F)V
    //   423: aload #7
    //   425: aload #11
    //   427: getfield field_72449_c : D
    //   430: d2f
    //   431: invokeinterface setPositionZ : (F)V
    //   436: aload #9
    //   438: getstatic com/trolmastercard/sexmod/fp.START_THROWING : Lcom/trolmastercard/sexmod/fp;
    //   441: if_acmpeq -> 459
    //   444: aload #9
    //   446: getstatic com/trolmastercard/sexmod/fp.PICK_UP : Lcom/trolmastercard/sexmod/fp;
    //   449: if_acmpne -> 475
    //   452: goto -> 459
    //   455: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   458: athrow
    //   459: aload_0
    //   460: aload #4
    //   462: aload #10
    //   464: aload_1
    //   465: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/ai;Lcom/trolmastercard/sexmod/em;)V
    //   468: goto -> 475
    //   471: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   474: athrow
    //   475: iload #5
    //   477: ifne -> 501
    //   480: aload_0
    //   481: aload #4
    //   483: aload_1
    //   484: invokevirtual b : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;)V
    //   487: aload_0
    //   488: aload #4
    //   490: aload_1
    //   491: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lcom/trolmastercard/sexmod/em;)V
    //   494: goto -> 501
    //   497: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   500: athrow
    //   501: return
    // Exception table:
    //   from	to	target	type
    //   0	18	18	java/lang/RuntimeException
    //   43	68	68	java/lang/RuntimeException
    //   102	118	121	java/lang/RuntimeException
    //   110	133	136	java/lang/RuntimeException
    //   125	153	156	java/lang/RuntimeException
    //   140	177	180	java/lang/RuntimeException
    //   190	203	206	java/lang/RuntimeException
    //   195	218	221	java/lang/RuntimeException
    //   210	234	237	java/lang/RuntimeException
    //   241	254	257	java/lang/RuntimeException
    //   246	268	271	java/lang/RuntimeException
    //   275	306	309	java/lang/RuntimeException
    //   283	327	327	java/lang/RuntimeException
    //   351	369	372	java/lang/RuntimeException
    //   361	384	387	java/lang/RuntimeException
    //   436	452	455	java/lang/RuntimeException
    //   444	468	471	java/lang/RuntimeException
    //   475	494	497	java/lang/RuntimeException
  }
  
  void a(AnimationProcessor paramAnimationProcessor, em paramem) {
    try {
      if (paramem.y() != fp.START_THROWING)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.f.field_71474_y.field_74320_O == 0)
        try {
          if (this.f.field_71439_g.getPersistentID().equals(((ei)paramem).m())) {
            IBone iBone = paramAnimationProcessor.getBone("body");
            try {
              if (iBone == null)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            iBone.setHidden(true);
            return;
          } 
          return;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void b(AnimationProcessor paramAnimationProcessor, em paramem) {
    try {
      if (paramem.y() != fp.PICK_UP)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.f.field_71474_y.field_74320_O == 0)
        try {
          if (this.f.field_71439_g.getPersistentID().equals(((ai)paramem).e()))
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IBone iBone1 = paramAnimationProcessor.getBone("body");
    try {
      if (iBone1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    IBone iBone2 = paramAnimationProcessor.getBone("steve");
    try {
      if (iBone2 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    iBone1.setPositionY(iBone1.getPositionY() - 32.0F);
    iBone2.setPositionY(iBone2.getPositionY() - 32.0F);
  }
  
  void a(AnimationProcessor paramAnimationProcessor, ai paramai, em paramem) {
    UUID uUID = paramai.e();
    try {
      if (uUID == null)
        paramem.ae(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (uUID == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = paramem.field_70170_p.func_152378_a(uUID);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f1 = b6.a(entityPlayer.field_184618_aE, entityPlayer.field_70721_aZ, this.f.func_184121_ak());
    float f2 = entityPlayer.field_184619_aG;
    float f3 = (float)Math.sin(f2);
    IBone iBone1 = paramAnimationProcessor.getBone("LeftLeg");
    IBone iBone2 = paramAnimationProcessor.getBone("RightLeg");
    float f4 = gc.c(60.0F * f3 * f1);
    iBone1.setRotationX(f4);
    iBone2.setRotationX(-f4);
  }
  
  void a(em paramem, IBone paramIBone) {
    EntityPlayer entityPlayer = paramem.field_70170_p.func_72890_a((Entity)paramem, 15.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = entityPlayer.func_174791_d();
    Vec3d vec3d2 = paramem.func_174791_d();
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    float f1 = paramem.field_70177_z;
    boolean bool = false;
    try {
      switch ((int)f1) {
        case 0:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72449_c > vec3d2.field_72449_c) ? true : false;
          break;
        case 180:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72449_c < vec3d2.field_72449_c) ? true : false;
          break;
        case 90:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72450_a < vec3d2.field_72450_a) ? true : false;
          break;
        case -90:
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          bool = (vec3d1.field_72450_a > vec3d2.field_72450_a) ? true : false;
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!bool) {
        paramIBone.setRotationY(0.0F);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f2 = 0.0F;
    switch ((int)f1) {
      case 180:
        f2 = 90.0F;
        break;
      case 90:
        f2 = 180.0F;
        break;
      case 0:
        f2 = -90.0F;
        break;
    } 
    float f3 = (float)-(MathHelper.func_181159_b(vec3d3.field_72449_c, vec3d3.field_72450_a) * 57.29577951308232D + f2);
    float f4 = be.b((float)(entityPlayer.func_70047_e() + vec3d1.field_72448_b - paramem.func_70047_e() + vec3d2.field_72448_b), -0.75F, 0.75F);
    paramIBone.setRotationY(gc.c(f3));
    paramIBone.setRotationX(f4);
  }
  
  void a(em paramem, IBone paramIBone1, IBone paramIBone2) {
    EntityPlayer entityPlayer = paramem.field_70170_p.func_72890_a((Entity)paramem, 15.0D);
    try {
      if (entityPlayer == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = entityPlayer.func_174791_d();
    Vec3d vec3d2 = paramem.func_174791_d();
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    float f1 = (float)-(Math.atan2(vec3d3.field_72449_c, vec3d3.field_72450_a) * 57.29577951308232D) + 90.0F;
    float f2 = be.b((float)(entityPlayer.func_70047_e() + vec3d1.field_72448_b - paramem.func_70047_e() + vec3d2.field_72448_b), -0.75F, 0.75F);
    paramIBone1.setRotationY(gc.c(f1));
    paramIBone2.setRotationX(f2);
  }
  
  void a(IBone paramIBone, AnimationProcessor paramAnimationProcessor, em paramem) {
    try {
      if (paramem.h()) {
        paramIBone.setHidden(true);
      } else {
        paramIBone.setHidden(false);
        paramAnimationProcessor.getBone("steve").setHidden(true);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void a(IBone paramIBone, AnimationProcessor paramAnimationProcessor, em paramem, ai paramai) {
    try {
      if (paramem.h()) {
        paramIBone.setHidden(true);
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        paramIBone.setHidden((paramai.a() < 15));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!paramem.h())
        paramAnimationProcessor.getBone("steve").setHidden(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public String[] c() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] f() {
    return new String[] { "armorBoobL", "armorBoobR" };
  }
  
  public String[] a() {
    return new String[] { "nippleL", "nippleR" };
  }
  
  public String[] h() {
    return new String[] { "armorCheekR", "armorCheekL", "armorLegL", "armorLegR", "armorShinL", "armorShinR", "armorTorso" };
  }
  
  public String[] e() {
    return new String[] { "fuckhole", "vagina", "meatCheekR", "meatCheekL", "meatLegL", "meatLegR", "meatShinL", "meatShinR" };
  }
  
  public String[] b() {
    return new String[] { "armorFootL", "armorFootR" };
  }
  
  public String[] d() {
    return new String[] { "meatFootL", "meatFootR" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */