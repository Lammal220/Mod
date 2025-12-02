package com.trolmastercard.sexmod;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public abstract class cv<T extends em> extends cm<T> implements gs {
  public static final List<String> b = Arrays.asList(new String[] { 
        "braStringMidStartR", "braStringMidMid1R", "braStringMidMid2R", "braStringMidMid3R", "braStringMidEndR", "braStringBackR", "braStringRightEndR", "braStringRightStartR", "braStringRightL", "braStringMidMid1L", 
        "braStringMidMid2L", "braStringMidMid3L", "braStringMidEndL", "braStringBackL", "braStringLeftEndL", "braStringLeftStartL", "braStringMidStartL", "braStringRightR" });
  
  public static final List<String> e = Arrays.asList(new String[] { "boyCam", "girlCam" });
  
  public static boolean d = true;
  
  protected ResourceLocation[] c = a();
  
  protected Minecraft a = Minecraft.func_71410_x();
  
  protected abstract ResourceLocation[] a();
  
  public abstract ResourceLocation b();
  
  public abstract ResourceLocation b(em paramem);
  
  public ResourceLocation c(em paramem) {
    return b(paramem);
  }
  
  public ResourceLocation a(em paramem) {
    try {
      if (paramem.field_70170_p instanceof gj)
        return this.c[0]; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue() > this.c.length) {
        System.out.println("Girl doesn't have an outfit Nr." + paramem.func_184212_Q().func_187225_a(em.D) + " so im just making her nude lol");
        return this.c[0];
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return this.c[((Integer)paramem.func_184212_Q().func_187225_a(em.D)).intValue()];
  }
  
  public ResourceLocation g(em paramem) {
    return b();
  }
  
  public void setMolangQueries(IAnimatable paramIAnimatable, double paramDouble) {
    try {
      if ((Minecraft.func_71410_x()).field_71441_e != null)
        super.setMolangQueries(paramIAnimatable, paramDouble); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  public void a(T paramT, Integer paramInteger, AnimationEvent paramAnimationEvent) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokespecial setLivingAnimations : (Lsoftware/bernie/geckolib3/core/IAnimatable;Ljava/lang/Integer;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   7: aload_0
    //   8: invokevirtual getAnimationProcessor : ()Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;
    //   11: astore #4
    //   13: aload_0
    //   14: aload_1
    //   15: aload #4
    //   17: invokevirtual a : (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)V
    //   20: aload_1
    //   21: getfield field_70170_p : Lnet/minecraft/world/World;
    //   24: instanceof com/trolmastercard/sexmod/gj
    //   27: ifeq -> 35
    //   30: return
    //   31: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   34: athrow
    //   35: aload_1
    //   36: invokevirtual func_184212_Q : ()Lnet/minecraft/network/datasync/EntityDataManager;
    //   39: getstatic com/trolmastercard/sexmod/em.G : Lnet/minecraft/network/datasync/DataParameter;
    //   42: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   45: checkcast java/lang/Boolean
    //   48: invokevirtual booleanValue : ()Z
    //   51: ifeq -> 96
    //   54: aload_1
    //   55: aload_1
    //   56: invokevirtual o : ()Lnet/minecraft/util/math/Vec3d;
    //   59: getfield field_72450_a : D
    //   62: aload_1
    //   63: invokevirtual o : ()Lnet/minecraft/util/math/Vec3d;
    //   66: getfield field_72448_b : D
    //   69: aload_1
    //   70: invokevirtual o : ()Lnet/minecraft/util/math/Vec3d;
    //   73: getfield field_72449_c : D
    //   76: aload_1
    //   77: invokevirtual I : ()Ljava/lang/Float;
    //   80: invokevirtual floatValue : ()F
    //   83: fconst_0
    //   84: iconst_3
    //   85: iconst_1
    //   86: invokevirtual func_180426_a : (DDDFFIZ)V
    //   89: goto -> 96
    //   92: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   95: athrow
    //   96: aload_1
    //   97: getfield C : Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   100: ifnull -> 159
    //   103: aload_1
    //   104: getfield C : Lsoftware/bernie/geckolib3/core/controller/AnimationController;
    //   107: aload_1
    //   108: getfield field_70170_p : Lnet/minecraft/world/World;
    //   111: instanceof com/trolmastercard/sexmod/gj
    //   114: ifne -> 138
    //   117: goto -> 124
    //   120: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   123: athrow
    //   124: aload_1
    //   125: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   128: ifnonnull -> 148
    //   131: goto -> 138
    //   134: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   137: athrow
    //   138: ldc2_w 5.0
    //   141: goto -> 156
    //   144: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   147: athrow
    //   148: aload_1
    //   149: invokevirtual y : ()Lcom/trolmastercard/sexmod/fp;
    //   152: getfield transitionTick : I
    //   155: i2d
    //   156: putfield transitionLengthTicks : D
    //   159: aload_0
    //   160: aload_1
    //   161: aload #4
    //   163: aload_3
    //   164: invokevirtual a : (Lcom/trolmastercard/sexmod/em;Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lsoftware/bernie/geckolib3/core/event/predicate/AnimationEvent;)V
    //   167: aload_1
    //   168: instanceof com/trolmastercard/sexmod/e2
    //   171: ifeq -> 202
    //   174: aload_1
    //   175: invokevirtual h : ()Z
    //   178: ifne -> 202
    //   181: goto -> 188
    //   184: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   187: athrow
    //   188: aload_1
    //   189: invokevirtual ah : ()I
    //   192: ifne -> 215
    //   195: goto -> 202
    //   198: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   201: athrow
    //   202: aload_0
    //   203: aload #4
    //   205: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;)V
    //   208: goto -> 273
    //   211: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   214: athrow
    //   215: aload_0
    //   216: aload #4
    //   218: aload_1
    //   219: getfield m : Lnet/minecraft/network/datasync/EntityDataManager;
    //   222: getstatic com/trolmastercard/sexmod/e2.X : Lnet/minecraft/network/datasync/DataParameter;
    //   225: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   228: checkcast net/minecraft/item/ItemStack
    //   231: aload_1
    //   232: getfield m : Lnet/minecraft/network/datasync/EntityDataManager;
    //   235: getstatic com/trolmastercard/sexmod/e2.T : Lnet/minecraft/network/datasync/DataParameter;
    //   238: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   241: checkcast net/minecraft/item/ItemStack
    //   244: aload_1
    //   245: getfield m : Lnet/minecraft/network/datasync/EntityDataManager;
    //   248: getstatic com/trolmastercard/sexmod/e2.U : Lnet/minecraft/network/datasync/DataParameter;
    //   251: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   254: checkcast net/minecraft/item/ItemStack
    //   257: aload_1
    //   258: getfield m : Lnet/minecraft/network/datasync/EntityDataManager;
    //   261: getstatic com/trolmastercard/sexmod/e2.W : Lnet/minecraft/network/datasync/DataParameter;
    //   264: invokevirtual func_187225_a : (Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;
    //   267: checkcast net/minecraft/item/ItemStack
    //   270: invokevirtual a : (Lsoftware/bernie/geckolib3/core/processor/AnimationProcessor;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)V
    //   273: return
    // Exception table:
    //   from	to	target	type
    //   13	31	31	java/lang/RuntimeException
    //   35	89	92	java/lang/RuntimeException
    //   96	117	120	java/lang/RuntimeException
    //   103	131	134	java/lang/RuntimeException
    //   124	144	144	java/lang/RuntimeException
    //   159	181	184	java/lang/RuntimeException
    //   174	195	198	java/lang/RuntimeException
    //   188	211	211	java/lang/RuntimeException
  }
  
  public static Vec3d d(em paramem) {
    return a(new Vec3d(paramem.field_70142_S, paramem.field_70137_T, paramem.field_70136_U), paramem.func_174791_d());
  }
  
  public static Vec3d a(em paramem, Vec3d paramVec3d) {
    return a(paramVec3d, paramem.func_174791_d());
  }
  
  public static Vec3d a(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    Vec3d vec3d1 = paramVec3d2.func_178788_d(paramVec3d1);
    Vec3d vec3d2 = new Vec3d(Math.abs(vec3d1.field_72450_a), Math.abs(vec3d1.field_72448_b), Math.abs(vec3d1.field_72449_c));
    double d1 = vec3d2.field_72450_a / (vec3d2.field_72450_a + vec3d2.field_72448_b + vec3d2.field_72449_c);
    double d2 = vec3d2.field_72448_b / (vec3d2.field_72450_a + vec3d2.field_72448_b + vec3d2.field_72449_c);
    double d3 = vec3d2.field_72449_c / (vec3d2.field_72450_a + vec3d2.field_72448_b + vec3d2.field_72449_c);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    Vec3d vec3d3 = new Vec3d(((vec3d1.field_72450_a > 0.0D) ? true : -1) * d1, ((vec3d1.field_72448_b > 0.0D) ? true : -1) * d2, ((vec3d1.field_72449_c > 0.0D) ? true : -1) * d3);
    double d4 = vec3d3.field_72448_b / 2.0D + 0.5D;
    float f1 = (float)b6.b(-180.0D, 0.0D, d4);
    if (Float.isNaN(f1))
      f1 = -90.0F; 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    float f2 = (d4 < 0.5D) ? 0.0F : (float)b6.b(0.0D, 16.0D, -d4);
    if (Float.isNaN(f2))
      f2 = 0.0F; 
    float f3 = (float)(4.0D - Math.sin(1.5707963267948966D + d4 * 2.0D * Math.PI) * 4.0D);
    if (Float.isNaN(f3))
      f3 = 8.0F; 
    return new Vec3d(gc.c(f1), f2, f3);
  }
  
  void a(AnimationProcessor<T> paramAnimationProcessor, ItemStack paramItemStack1, ItemStack paramItemStack2, ItemStack paramItemStack3, ItemStack paramItemStack4) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      c(paramAnimationProcessor, !paramItemStack1.func_190926_b());
      b(paramAnimationProcessor, paramItemStack2.func_77973_b() instanceof net.minecraft.item.ItemArmor);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      d(paramAnimationProcessor, !paramItemStack3.func_190926_b());
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    a(paramAnimationProcessor, !paramItemStack4.func_190926_b());
  }
  
  protected void a(AnimationProcessor<T> paramAnimationProcessor) {
    c(paramAnimationProcessor, false);
    b(paramAnimationProcessor, false);
    d(paramAnimationProcessor, false);
    a(paramAnimationProcessor, false);
  }
  
  void c(AnimationProcessor<T> paramAnimationProcessor, boolean paramBoolean) {
    try {
      a(c(), paramBoolean, paramAnimationProcessor);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    a(g(), !paramBoolean, paramAnimationProcessor);
  }
  
  void b(AnimationProcessor<T> paramAnimationProcessor, boolean paramBoolean) {
    try {
      a(f(), paramBoolean, paramAnimationProcessor);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    a(a(), !paramBoolean, paramAnimationProcessor);
  }
  
  void d(AnimationProcessor<T> paramAnimationProcessor, boolean paramBoolean) {
    try {
      a(h(), paramBoolean, paramAnimationProcessor);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    a(e(), !paramBoolean, paramAnimationProcessor);
  }
  
  void a(AnimationProcessor<T> paramAnimationProcessor, boolean paramBoolean) {
    try {
      a(b(), paramBoolean, paramAnimationProcessor);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    a(d(), !paramBoolean, paramAnimationProcessor);
  }
  
  void a(String[] paramArrayOfString, boolean paramBoolean, AnimationProcessor<T> paramAnimationProcessor) {
    for (String str : paramArrayOfString)
      a(str, paramBoolean, paramAnimationProcessor); 
  }
  
  void a(String paramString, boolean paramBoolean, AnimationProcessor<T> paramAnimationProcessor) {
    try {
      if (paramAnimationProcessor.getBone(paramString) == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramAnimationProcessor.getBone(paramString).setHidden(!paramBoolean);
  }
  
  protected boolean f(T paramT) {
    UUID uUID = paramT.ae();
    try {
      if (uUID == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    World world = ((em)paramT).field_70170_p;
    AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer)world.func_152378_a(uUID);
    try {
      if (abstractClientPlayer == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return "default".equals(abstractClientPlayer.func_175154_l());
  }
  
  void a(T paramT, AnimationProcessor<T> paramAnimationProcessor) {
    boolean bool = f(paramT);
    try {
      paramAnimationProcessor.getBone("rightArmAlex").setHidden(bool);
      paramAnimationProcessor.getBone("rightLowerArmAlex").setHidden(bool);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      paramAnimationProcessor.getBone("rightArmSteve").setHidden(!bool);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      paramAnimationProcessor.getBone("rightLowerArmSteve").setHidden(!bool);
      paramAnimationProcessor.getBone("leftArmAlex").setHidden(bool);
      paramAnimationProcessor.getBone("leftLowerArmAlex").setHidden(bool);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      paramAnimationProcessor.getBone("leftArmSteve").setHidden(!bool);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    paramAnimationProcessor.getBone("leftLowerArmSteve").setHidden(!bool);
    IBone iBone = paramAnimationProcessor.getBone("steve");
    try {
      if (iBone != null) {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw b(null);
        } 
        iBone.setHidden(!(paramT.y()).hasPlayer);
      } 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
  }
  
  protected boolean e(T paramT) {
    return true;
  }
  
  protected void a(T paramT, AnimationProcessor<T> paramAnimationProcessor, AnimationEvent paramAnimationEvent) {
    try {
      if (((em)paramT).field_70170_p instanceof gj)
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (!e(paramT))
        return; 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (paramT.y() != fp.NULL)
        try {
          if (paramT.y() != fp.ATTACK)
            try {
              if (paramT.y() != fp.BOW)
                return; 
            } catch (RuntimeException runtimeException) {
              throw b(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw b(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    EntityModelData entityModelData = paramAnimationEvent.getExtraDataOfType(EntityModelData.class).get(0);
    IBone iBone1 = paramAnimationProcessor.getBone("neck");
    iBone1.setRotationY(entityModelData.netHeadYaw * 0.5F * 0.017453292F);
    IBone iBone2 = paramAnimationProcessor.getBone("head");
    try {
      iBone2.setRotationY(entityModelData.netHeadYaw * 0.017453292F);
      iBone2.setRotationX(entityModelData.headPitch * 0.017453292F);
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    IBone iBone3 = (paramAnimationProcessor.getBone("body") == null) ? paramAnimationProcessor.getBone("dd") : paramAnimationProcessor.getBone("body");
    iBone3.setRotationY(0.0F);
  }
  
  public ItemStack a(em paramem, String paramString) {
    try {
      if (Arrays.<String>asList(c()).contains(paramString))
        return (ItemStack)paramem.m.func_187225_a(e2.X); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (Arrays.<String>asList(f()).contains(paramString))
        return (ItemStack)paramem.m.func_187225_a(e2.T); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (Arrays.<String>asList(h()).contains(paramString))
        return (ItemStack)paramem.m.func_187225_a(e2.U); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    try {
      if (Arrays.<String>asList(b()).contains(paramString))
        return (ItemStack)paramem.m.func_187225_a(e2.W); 
    } catch (RuntimeException runtimeException) {
      throw b(null);
    } 
    return ItemStack.field_190927_a;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */