package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.item.ItemMap;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.storage.MapData;
import net.minecraftforge.client.event.RenderSpecificHandEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class cn {
  Minecraft f;
  
  float g = 2.0F;
  
  boolean c = false;
  
  private static final ResourceLocation e = new ResourceLocation("textures/map/map_background.png");
  
  at d;
  
  ResourceLocation h;
  
  Vec3i b;
  
  float a = 0.0F;
  
  @SubscribeEvent
  public void a(RenderSpecificHandEvent paramRenderSpecificHandEvent) {
    // Byte code:
    //   0: invokestatic C : ()V
    //   3: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   6: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   9: invokevirtual getPersistentID : ()Ljava/util/UUID;
    //   12: invokestatic d : (Ljava/util/UUID;)Lcom/trolmastercard/sexmod/ei;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnonnull -> 25
    //   20: return
    //   21: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   24: athrow
    //   25: aload_2
    //   26: invokevirtual ah : ()I
    //   29: istore_3
    //   30: aload_0
    //   31: aload_2
    //   32: iload_3
    //   33: invokevirtual a : (I)Lcom/trolmastercard/sexmod/at;
    //   36: putfield d : Lcom/trolmastercard/sexmod/at;
    //   39: aload_0
    //   40: new net/minecraft/util/ResourceLocation
    //   43: dup
    //   44: ldc 'sexmod'
    //   46: aload_2
    //   47: iload_3
    //   48: invokevirtual c : (I)Ljava/lang/String;
    //   51: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   54: putfield h : Lnet/minecraft/util/ResourceLocation;
    //   57: aload_0
    //   58: aload_2
    //   59: iload_3
    //   60: invokevirtual b : (I)Lnet/minecraft/util/math/Vec3i;
    //   63: putfield b : Lnet/minecraft/util/math/Vec3i;
    //   66: aload_0
    //   67: getfield d : Lcom/trolmastercard/sexmod/at;
    //   70: ifnonnull -> 86
    //   73: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   76: ldc 'HAND IS NULL uwu did you forget to assign this girl a hand owo?'
    //   78: invokevirtual println : (Ljava/lang/String;)V
    //   81: return
    //   82: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   85: athrow
    //   86: aload_0
    //   87: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   90: putfield f : Lnet/minecraft/client/Minecraft;
    //   93: fconst_0
    //   94: fstore #4
    //   96: fconst_0
    //   97: fstore #5
    //   99: aload_0
    //   100: getfield f : Lnet/minecraft/client/Minecraft;
    //   103: invokevirtual func_175597_ag : ()Lnet/minecraft/client/renderer/ItemRenderer;
    //   106: astore #6
    //   108: invokestatic a : ()Z
    //   111: ifeq -> 151
    //   114: ldc net/minecraft/client/renderer/ItemRenderer
    //   116: aload #6
    //   118: ldc 'prevEquippedProgressMainHand'
    //   120: invokestatic getPrivateValue : (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   123: checkcast java/lang/Float
    //   126: invokevirtual floatValue : ()F
    //   129: fstore #4
    //   131: ldc net/minecraft/client/renderer/ItemRenderer
    //   133: aload #6
    //   135: ldc 'equippedProgressMainHand'
    //   137: invokestatic getPrivateValue : (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   140: checkcast java/lang/Float
    //   143: invokevirtual floatValue : ()F
    //   146: fstore #5
    //   148: goto -> 185
    //   151: ldc net/minecraft/client/renderer/ItemRenderer
    //   153: aload #6
    //   155: ldc 'field_187470_g'
    //   157: invokestatic getPrivateValue : (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   160: checkcast java/lang/Float
    //   163: invokevirtual floatValue : ()F
    //   166: fstore #4
    //   168: ldc net/minecraft/client/renderer/ItemRenderer
    //   170: aload #6
    //   172: ldc 'field_187469_f'
    //   174: invokestatic getPrivateValue : (Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    //   177: checkcast java/lang/Float
    //   180: invokevirtual floatValue : ()F
    //   183: fstore #5
    //   185: aload_0
    //   186: fconst_2
    //   187: fload #4
    //   189: fload #5
    //   191: fload #4
    //   193: fsub
    //   194: aload_1
    //   195: invokevirtual getPartialTicks : ()F
    //   198: fmul
    //   199: fadd
    //   200: fsub
    //   201: putfield g : F
    //   204: goto -> 254
    //   207: astore #6
    //   209: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   212: ldc 'couldnt do the reflection thingy'
    //   214: invokevirtual println : (Ljava/lang/String;)V
    //   217: new java/io/StringWriter
    //   220: dup
    //   221: invokespecial <init> : ()V
    //   224: astore #7
    //   226: aload #6
    //   228: new java/io/PrintWriter
    //   231: dup
    //   232: aload #7
    //   234: invokespecial <init> : (Ljava/io/Writer;)V
    //   237: invokevirtual printStackTrace : (Ljava/io/PrintWriter;)V
    //   240: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   243: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   246: aload #7
    //   248: invokevirtual toString : ()Ljava/lang/String;
    //   251: invokevirtual func_71165_d : (Ljava/lang/String;)V
    //   254: aload_0
    //   255: getfield f : Lnet/minecraft/client/Minecraft;
    //   258: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   261: astore #6
    //   263: aload #6
    //   265: aload_1
    //   266: invokevirtual getPartialTicks : ()F
    //   269: invokevirtual func_70678_g : (F)F
    //   272: fstore #7
    //   274: aload_0
    //   275: getfield f : Lnet/minecraft/client/Minecraft;
    //   278: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   281: invokevirtual func_184614_ca : ()Lnet/minecraft/item/ItemStack;
    //   284: astore #8
    //   286: aload_0
    //   287: getfield b : Lnet/minecraft/util/math/Vec3i;
    //   290: invokevirtual func_177958_n : ()I
    //   293: i2f
    //   294: ldc 255.0
    //   296: fdiv
    //   297: aload_0
    //   298: getfield b : Lnet/minecraft/util/math/Vec3i;
    //   301: invokevirtual func_177956_o : ()I
    //   304: i2f
    //   305: ldc 255.0
    //   307: fdiv
    //   308: aload_0
    //   309: getfield b : Lnet/minecraft/util/math/Vec3i;
    //   312: invokevirtual func_177952_p : ()I
    //   315: i2f
    //   316: ldc 255.0
    //   318: fdiv
    //   319: invokestatic func_179124_c : (FFF)V
    //   322: aload_1
    //   323: invokevirtual getHand : ()Lnet/minecraft/util/EnumHand;
    //   326: getstatic net/minecraft/util/EnumHand.MAIN_HAND : Lnet/minecraft/util/EnumHand;
    //   329: if_acmpne -> 460
    //   332: aload #8
    //   334: invokevirtual func_190926_b : ()Z
    //   337: ifne -> 365
    //   340: goto -> 347
    //   343: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   346: athrow
    //   347: aload #8
    //   349: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   352: instanceof net/minecraft/item/ItemMap
    //   355: ifeq -> 400
    //   358: goto -> 365
    //   361: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   364: athrow
    //   365: aload_1
    //   366: iconst_1
    //   367: invokevirtual setCanceled : (Z)V
    //   370: aload_0
    //   371: aload #8
    //   373: aload_1
    //   374: invokevirtual getPartialTicks : ()F
    //   377: aload #6
    //   379: aload_0
    //   380: getfield g : F
    //   383: fload #7
    //   385: invokevirtual a : (Lnet/minecraft/item/ItemStack;FLnet/minecraft/client/entity/AbstractClientPlayer;FF)V
    //   388: aload_0
    //   389: iconst_1
    //   390: putfield c : Z
    //   393: goto -> 516
    //   396: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   399: athrow
    //   400: fload #5
    //   402: fload #4
    //   404: fcmpg
    //   405: ifge -> 452
    //   408: aload_0
    //   409: getfield c : Z
    //   412: ifeq -> 516
    //   415: goto -> 422
    //   418: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   421: athrow
    //   422: aload_1
    //   423: iconst_1
    //   424: invokevirtual setCanceled : (Z)V
    //   427: aload_0
    //   428: aload #8
    //   430: aload_1
    //   431: invokevirtual getPartialTicks : ()F
    //   434: aload #6
    //   436: aload_0
    //   437: getfield g : F
    //   440: fload #7
    //   442: invokevirtual a : (Lnet/minecraft/item/ItemStack;FLnet/minecraft/client/entity/AbstractClientPlayer;FF)V
    //   445: goto -> 516
    //   448: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   451: athrow
    //   452: aload_0
    //   453: iconst_0
    //   454: putfield c : Z
    //   457: goto -> 516
    //   460: aload_0
    //   461: getfield f : Lnet/minecraft/client/Minecraft;
    //   464: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   467: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   470: invokevirtual func_77973_b : ()Lnet/minecraft/item/Item;
    //   473: instanceof net/minecraft/item/ItemMap
    //   476: ifeq -> 516
    //   479: aload_1
    //   480: iconst_1
    //   481: invokevirtual setCanceled : (Z)V
    //   484: aload_0
    //   485: getstatic net/minecraft/util/EnumHandSide.LEFT : Lnet/minecraft/util/EnumHandSide;
    //   488: aload_0
    //   489: getfield g : F
    //   492: fconst_1
    //   493: fsub
    //   494: fload #7
    //   496: aload_0
    //   497: getfield f : Lnet/minecraft/client/Minecraft;
    //   500: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   503: invokevirtual func_184592_cb : ()Lnet/minecraft/item/ItemStack;
    //   506: invokevirtual a : (Lnet/minecraft/util/EnumHandSide;FFLnet/minecraft/item/ItemStack;)V
    //   509: goto -> 516
    //   512: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   515: athrow
    //   516: invokestatic func_179117_G : ()V
    //   519: return
    // Exception table:
    //   from	to	target	type
    //   16	21	21	java/lang/Exception
    //   30	82	82	java/lang/Exception
    //   99	204	207	java/lang/Exception
    //   286	340	343	java/lang/Exception
    //   332	358	361	java/lang/Exception
    //   347	396	396	java/lang/Exception
    //   400	415	418	java/lang/Exception
    //   408	448	448	java/lang/Exception
    //   460	509	512	java/lang/Exception
  }
  
  void a(ItemStack paramItemStack, float paramFloat1, AbstractClientPlayer paramAbstractClientPlayer, float paramFloat2, float paramFloat3) {
    try {
      if (paramItemStack.func_77973_b() instanceof ItemMap) {
        try {
          if (paramAbstractClientPlayer.func_184592_cb().func_190926_b()) {
            a(paramItemStack, paramAbstractClientPlayer, paramFloat3, paramFloat1);
          } else {
            a(EnumHandSide.RIGHT, paramFloat2 - 1.0F, paramFloat3, paramItemStack);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        a(paramFloat3, paramFloat1);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  void a(EnumHandSide paramEnumHandSide, float paramFloat1, float paramFloat2, ItemStack paramItemStack) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f1 = (paramEnumHandSide == EnumHandSide.RIGHT) ? 1.0F : -1.0F;
    try {
      GlStateManager.func_179109_b(f1 * 0.125F, -0.125F, 0.0F);
      if (!this.f.field_71439_g.func_82150_aj()) {
        try {
          GlStateManager.func_179094_E();
          GlStateManager.func_179114_b(f1 * 10.0F, 0.0F, 0.0F, 1.0F);
          a(paramFloat1, paramFloat2, paramEnumHandSide);
          GlStateManager.func_179109_b(-0.5F, -1.1F, 0.0F);
          if (paramEnumHandSide == EnumHandSide.RIGHT) {
            GlStateManager.func_179109_b(0.48F, 0.15F, 0.0F);
          } else {
            GlStateManager.func_179109_b(0.44F, 1.3F, 1.0F);
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
        this.d.a().func_78785_a(0.175F);
        GlStateManager.func_179121_F();
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179094_E();
    GlStateManager.func_179109_b(f1 * 0.51F, -0.08F + paramFloat1 * -1.2F, -0.75F);
    float f2 = MathHelper.func_76129_c(paramFloat2);
    float f3 = MathHelper.func_76126_a(f2 * 3.1415927F);
    float f4 = -0.5F * f3;
    float f5 = 0.4F * MathHelper.func_76126_a(f2 * 6.2831855F);
    float f6 = -0.3F * MathHelper.func_76126_a(paramFloat2 * 3.1415927F);
    GlStateManager.func_179109_b(f1 * f4, f5 - 0.3F * f3, f6);
    GlStateManager.func_179114_b(f3 * -45.0F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179114_b(f1 * f3 * -30.0F, 0.0F, 1.0F, 0.0F);
    a(paramItemStack);
    GlStateManager.func_179121_F();
  }
  
  void a(ItemStack paramItemStack, AbstractClientPlayer paramAbstractClientPlayer, float paramFloat1, float paramFloat2) {
    float f1 = paramAbstractClientPlayer.field_70127_C + (paramAbstractClientPlayer.field_70125_A - paramAbstractClientPlayer.field_70127_C) * paramFloat2;
    float f2 = MathHelper.func_76129_c(paramFloat1);
    float f3 = -0.2F * MathHelper.func_76126_a(paramFloat1 * 3.1415927F);
    float f4 = -0.4F * MathHelper.func_76126_a(f2 * 3.1415927F);
    GlStateManager.func_179109_b(0.0F, -f3 / 2.0F, f4);
    float f5 = a(f1);
    GlStateManager.func_179109_b(0.0F, 0.04F + (this.g - 1.0F) * -1.2F + f5 * -0.5F, -0.72F);
    GlStateManager.func_179114_b(f5 * -85.0F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179129_p();
    GlStateManager.func_179094_E();
    GlStateManager.func_179114_b(90.0F, 0.0F, 1.0F, 0.0F);
    a(EnumHandSide.RIGHT);
    a(EnumHandSide.LEFT);
    GlStateManager.func_179121_F();
    GlStateManager.func_179089_o();
    float f6 = MathHelper.func_76126_a(f2 * 3.1415927F);
    GlStateManager.func_179114_b(f6 * 20.0F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179152_a(2.0F, 2.0F, 2.0F);
    a(paramItemStack);
    GlStateManager.func_179145_e();
  }
  
  void a(ItemStack paramItemStack) {
    GlStateManager.func_179117_G();
    GlStateManager.func_179114_b(180.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
    GlStateManager.func_179152_a(0.38F, 0.38F, 0.38F);
    GlStateManager.func_179140_f();
    this.f.func_110434_K().func_110577_a(e);
    Tessellator tessellator = Tessellator.func_178181_a();
    BufferBuilder bufferBuilder = tessellator.func_178180_c();
    GlStateManager.func_179109_b(-0.5F, -0.5F, 0.0F);
    GlStateManager.func_179152_a(0.0078125F, 0.0078125F, 0.0078125F);
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181707_g);
    bufferBuilder.func_181662_b(-7.0D, 135.0D, 0.0D).func_187315_a(0.0D, 1.0D).func_181675_d();
    bufferBuilder.func_181662_b(135.0D, 135.0D, 0.0D).func_187315_a(1.0D, 1.0D).func_181675_d();
    bufferBuilder.func_181662_b(135.0D, -7.0D, 0.0D).func_187315_a(1.0D, 0.0D).func_181675_d();
    bufferBuilder.func_181662_b(-7.0D, -7.0D, 0.0D).func_187315_a(0.0D, 0.0D).func_181675_d();
    tessellator.func_78381_a();
    MapData mapData = ((ItemMap)paramItemStack.func_77973_b()).func_77873_a(paramItemStack, (World)this.f.field_71441_e);
    try {
      if (mapData != null)
        this.f.field_71460_t.func_147701_i().func_148250_a(mapData, false); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179124_c(this.b.func_177958_n() / 255.0F, this.b.func_177956_o() / 255.0F, this.b.func_177952_p() / 255.0F);
  }
  
  private void a(EnumHandSide paramEnumHandSide) {
    try {
      GlStateManager.func_179094_E();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = (paramEnumHandSide == EnumHandSide.RIGHT) ? 1.0F : -1.0F;
    try {
      GlStateManager.func_179114_b(92.0F, 0.0F, 1.0F, 0.0F);
      GlStateManager.func_179114_b(45.0F, 1.0F, 0.0F, 0.0F);
      GlStateManager.func_179114_b(f * -41.0F, 0.0F, 0.0F, 1.0F);
      GlStateManager.func_179109_b(f * 0.3F, -1.1F, 0.45F);
      if (paramEnumHandSide == EnumHandSide.RIGHT) {
        GlStateManager.func_179109_b(0.63F, 0.36F, 0.0F);
      } else {
        GlStateManager.func_179109_b(1.6F, 0.35F, 0.0F);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
    this.d.a().func_78785_a(0.175F);
    GlStateManager.func_179121_F();
  }
  
  private float a(float paramFloat) {
    null = 1.0F - paramFloat / 45.0F + 0.1F;
    null = MathHelper.func_76131_a(null, 0.0F, 1.0F);
    return -MathHelper.func_76134_b(null * 3.1415927F) * 0.5F + 0.5F;
  }
  
  void a(float paramFloat1, float paramFloat2) {
    GlStateManager.func_179129_p();
    GlStateManager.func_179094_E();
    a(this.g, paramFloat1, EnumHandSide.RIGHT);
    Minecraft.func_71410_x().func_110434_K().func_110577_a(this.h);
    this.d.a().func_78785_a(0.175F);
    GlStateManager.func_179084_k();
    GlStateManager.func_179089_o();
    GlStateManager.func_179121_F();
  }
  
  private void a(float paramFloat1, float paramFloat2, EnumHandSide paramEnumHandSide) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = (paramEnumHandSide != EnumHandSide.LEFT) ? true : false;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f1 = bool ? 1.0F : -1.0F;
    float f2 = MathHelper.func_76129_c(paramFloat2);
    float f3 = -0.3F * MathHelper.func_76126_a(f2 * 3.1415927F);
    float f4 = 0.4F * MathHelper.func_76126_a(f2 * 6.2831855F);
    float f5 = -0.4F * MathHelper.func_76126_a(paramFloat2 * 3.1415927F);
    GlStateManager.func_179109_b(f1 * (f3 + 0.64000005F), f4 + -0.6F + paramFloat1 * -0.6F, f5 + -0.71999997F);
    GlStateManager.func_179114_b(f1 * 45.0F, 0.0F, 1.0F, 0.0F);
    float f6 = MathHelper.func_76126_a(paramFloat2 * paramFloat2 * 3.1415927F);
    float f7 = MathHelper.func_76126_a(f2 * 3.1415927F);
    GlStateManager.func_179114_b(f1 * f7 * 70.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179114_b(f1 * f6 * -20.0F, 0.0F, 0.0F, 1.0F);
    GlStateManager.func_179109_b(f1 * -1.0F, 3.6F, 3.5F);
    GlStateManager.func_179114_b(f1 * 120.0F, 0.0F, 0.0F, 1.0F);
    GlStateManager.func_179114_b(200.0F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179114_b(f1 * -135.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179109_b(f1 * 5.6F, 0.0F, 0.0F);
    GlStateManager.func_179109_b(0.5F, 1.1F, 0.0F);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */