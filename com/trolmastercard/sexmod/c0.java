package com.trolmastercard.sexmod;

import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;

public class c0 extends cv {
  protected ResourceLocation[] a() {
    return new ResourceLocation[] { new ResourceLocation("sexmod", "geo/bee/bee.geo.json"), new ResourceLocation("sexmod", "geo/bee/armored.geo.json") };
  }
  
  public ResourceLocation b() {
    return new ResourceLocation("sexmod", "textures/entity/bee/bee.png");
  }
  
  public ResourceLocation b(em paramem) {
    return new ResourceLocation("sexmod", "animations/bee/bee.animation.json");
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
    //   28: aload #4
    //   30: ldc 'chest'
    //   32: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   35: astore #5
    //   37: aload #5
    //   39: ifnonnull -> 47
    //   42: return
    //   43: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   46: athrow
    //   47: aload #5
    //   49: aload_1
    //   50: getfield E : Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   53: invokevirtual getCurrentAnimation : ()Lsoftware/bernie/geckolib3/core/builder/Animation;
    //   56: ifnull -> 84
    //   59: aload_1
    //   60: getfield E : Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   63: invokevirtual getCurrentAnimation : ()Lsoftware/bernie/geckolib3/core/builder/Animation;
    //   66: getfield animationName : Ljava/lang/String;
    //   69: ldc 'chest'
    //   71: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   74: ifne -> 92
    //   77: goto -> 84
    //   80: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   83: athrow
    //   84: iconst_1
    //   85: goto -> 93
    //   88: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   91: athrow
    //   92: iconst_0
    //   93: invokeinterface setHidden : (Z)V
    //   98: return
    // Exception table:
    //   from	to	target	type
    //   0	18	18	java/lang/RuntimeException
    //   37	43	43	java/lang/RuntimeException
    //   47	77	80	java/lang/RuntimeException
    //   59	88	88	java/lang/RuntimeException
  }
  
  protected void a(em paramem, AnimationProcessor paramAnimationProcessor, AnimationEvent paramAnimationEvent) {
    // Byte code:
    //   0: aload_1
    //   1: getfield field_70170_p : Lnet/minecraft/world/World;
    //   4: instanceof com/trolmastercard/sexmod/gj
    //   7: ifne -> 182
    //   10: aload_1
    //   11: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   14: getstatic com/trolmastercard/sexmod/fp.NULL : Lcom/trolmastercard/sexmod/fp;
    //   17: if_acmpeq -> 61
    //   20: goto -> 27
    //   23: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   26: athrow
    //   27: aload_1
    //   28: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   31: getstatic com/trolmastercard/sexmod/fp.ATTACK : Lcom/trolmastercard/sexmod/fp;
    //   34: if_acmpeq -> 61
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   43: athrow
    //   44: aload_1
    //   45: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   48: getstatic com/trolmastercard/sexmod/fp.BOW : Lcom/trolmastercard/sexmod/fp;
    //   51: if_acmpne -> 182
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   60: athrow
    //   61: aload_3
    //   62: ldc software/bernie/geckolib3/model/provider/data/EntityModelData
    //   64: invokevirtual getExtraDataOfType : (Ljava/lang/Class;)Ljava/util/List;
    //   67: iconst_0
    //   68: invokeinterface get : (I)Ljava/lang/Object;
    //   73: checkcast software/bernie/geckolib3/model/provider/data/EntityModelData
    //   76: astore #4
    //   78: aload_2
    //   79: ldc 'neck'
    //   81: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   84: astore #5
    //   86: aload #5
    //   88: aload #4
    //   90: getfield netHeadYaw : F
    //   93: ldc 0.5
    //   95: fmul
    //   96: ldc 0.017453292
    //   98: fmul
    //   99: invokeinterface setRotationY : (F)V
    //   104: aload_2
    //   105: ldc 'head'
    //   107: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   110: astore #6
    //   112: aload #6
    //   114: aload #4
    //   116: getfield netHeadYaw : F
    //   119: ldc 0.017453292
    //   121: fmul
    //   122: invokeinterface setRotationY : (F)V
    //   127: aload #6
    //   129: fconst_1
    //   130: aload #4
    //   132: getfield headPitch : F
    //   135: ldc 0.017453292
    //   137: fmul
    //   138: fadd
    //   139: invokeinterface setRotationX : (F)V
    //   144: aload_2
    //   145: ldc 'body'
    //   147: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   150: ifnonnull -> 166
    //   153: aload_2
    //   154: ldc 'dd'
    //   156: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   159: goto -> 172
    //   162: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   165: athrow
    //   166: aload_2
    //   167: ldc 'body'
    //   169: invokevirtual getBone : (Ljava/lang/String;)Lsoftware/bernie/geckolib3/core/processor/IBone;
    //   172: astore #7
    //   174: aload #7
    //   176: fconst_0
    //   177: invokeinterface setRotationY : (F)V
    //   182: return
    // Exception table:
    //   from	to	target	type
    //   0	20	23	java/lang/RuntimeException
    //   10	37	40	java/lang/RuntimeException
    //   27	54	57	java/lang/RuntimeException
    //   112	162	162	java/lang/RuntimeException
  }
  
  public String[] c() {
    return new String[] { "armorHelmet" };
  }
  
  public String[] g() {
    return new String[] { "band", "feeler", "feeler2", "brow", "brow2", "brow3", "brow4" };
  }
  
  public String[] f() {
    return new String[] { "armorShoulderR", "armorShoulderL", "armorChest", "armorBoobs" };
  }
  
  public String[] a() {
    return new String[] { "boobsFlesh", "upperBodyL", "upperBodyR" };
  }
  
  public String[] h() {
    return new String[] { "armorBootyR", "armorBootyL", "armorPantsLowL", "armorPantsLowR", "armorPantsLowR", "armorPantsUpR", "armorPantsUpL", "armorHip" };
  }
  
  public String[] e() {
    return new String[] { "sideL", "sideR", "fleshL", "fleshR", "vagina", "curvesL", "curvesR", "kneeL", "kneeR" };
  }
  
  public String[] b() {
    return new String[] { "armorShoesL", "armorShoesR" };
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\c0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */