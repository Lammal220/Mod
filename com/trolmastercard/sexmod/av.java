package com.trolmastercard.sexmod;

import javax.vecmath.Tuple4f;
import javax.vecmath.Vector4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.geo.render.built.GeoQuad;
import software.bernie.geckolib3.geo.render.built.GeoVertex;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class av extends GeoItemRenderer<cc> {
  public static final f7 e = new f7(0.84705883F, 0.11764706F, 0.35686275F);
  
  public static final f7 f = new f7(0.44705883F, 0.44705883F, 0.44705883F);
  
  public static final float b = 240.0F;
  
  public static final float g = 120.0F;
  
  static final float h = 0.05F;
  
  static final Minecraft a = Minecraft.func_71410_x();
  
  boolean c = false;
  
  f7 d;
  
  public av() {
    super(new as());
  }
  
  public void a(GeoModel paramGeoModel, cc paramcc, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    GlStateManager.func_179129_p();
    GlStateManager.func_179091_B();
    BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
    GeoBone geoBone1 = null;
    this.c = false;
    GeoBone geoBone2 = paramGeoModel.topLevelBones.get(0);
    MATRIX_STACK.push();
    MATRIX_STACK.translate(geoBone2);
    MATRIX_STACK.moveToPivot(geoBone2);
    MATRIX_STACK.rotate(geoBone2);
    MATRIX_STACK.scale(geoBone2);
    MATRIX_STACK.moveBackFromPivot(geoBone2);
    for (GeoBone geoBone : geoBone2.childBones) {
      if ("pentagram".equals(geoBone.getName())) {
        geoBone1 = geoBone;
        continue;
      } 
      renderRecursively(bufferBuilder, geoBone, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
    } 
    Tessellator.func_178181_a().func_78381_a();
    float f = a(paramFloat1);
    try {
      this.d = a();
      if (!v.f) {
        OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, f, f);
        GL11.glDisable(2896);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181709_i);
    this.c = true;
    renderRecursively(bufferBuilder, geoBone1, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
    Tessellator.func_178181_a().func_78381_a();
    GL11.glEnable(2896);
    MATRIX_STACK.pop();
    GlStateManager.func_179101_C();
    GlStateManager.func_179089_o();
    GlStateManager.func_179117_G();
  }
  
  float a(float paramFloat) {
    try {
      if (a.field_71439_g.func_184614_ca() != this.currentItemStack)
        try {
          if (a.field_71439_g.func_184592_cb() != this.currentItemStack)
            return b(paramFloat); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l1 = System.currentTimeMillis();
    NBTTagCompound nBTTagCompound = a.field_71439_g.getEntityData();
    long l2 = nBTTagCompound.func_74763_f("sexmod:galath_coin_activation_time");
    long l3 = nBTTagCompound.func_74763_f("sexmod:galath_coin_deactivation_time");
    try {
      if (l2 != 0L)
        return a(l1, l2, paramFloat); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (l3 != 0L)
        return b(l1, l3, paramFloat); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (v.f)
        return 120.0F; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return b(paramFloat);
  }
  
  float b(long paramLong1, long paramLong2, float paramFloat) {
    float f = (float)(paramLong1 - paramLong2);
    try {
      if (f < 1000.0F)
        return 120.0F; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f <= 3000.0F)
        return b6.a(120.0F, 240.0F, (f - 1000.0F) / 2000.0F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 240.0F;
  }
  
  float a(long paramLong1, long paramLong2, float paramFloat) {
    float f = (float)(paramLong1 - paramLong2);
    try {
      if (f < 1000.0F)
        return 240.0F; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f <= 3000.0F)
        return b6.a(240.0F, 120.0F, (f - 1000.0F) / 2000.0F); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return 120.0F;
  }
  
  f7 a() {
    try {
      if (a.field_71439_g.func_184614_ca() != this.currentItemStack)
        try {
          if (a.field_71439_g.func_184592_cb() != this.currentItemStack)
            return e; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    long l1 = System.currentTimeMillis();
    NBTTagCompound nBTTagCompound = a.field_71439_g.getEntityData();
    long l2 = nBTTagCompound.func_74763_f("sexmod:galath_coin_activation_time");
    long l3 = nBTTagCompound.func_74763_f("sexmod:galath_coin_deactivation_time");
    try {
      if (l2 != 0L)
        return b(l2, l1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (l3 != 0L)
        return a(l3, l1); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (v.f)
        return f; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return e;
  }
  
  f7 a(long paramLong1, long paramLong2) {
    float f = (float)(paramLong2 - paramLong1);
    try {
      if (f < 1000.0F)
        return f; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f <= 3000.0F)
        return b6.a(f, e, ((f - 1000.0F) / 2000.0F)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return e;
  }
  
  f7 b(long paramLong1, long paramLong2) {
    float f = (float)(paramLong2 - paramLong1);
    try {
      if (f < 1000.0F)
        return e; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (f <= 3000.0F)
        return b6.a(e, f, ((f - 1000.0F) / 2000.0F)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return f;
  }
  
  float b(float paramFloat) {
    return (float)(60.0D * Math.sin(((a.field_71439_g.field_70173_aa + paramFloat) * 0.05F)) + 180.0D);
  }
  
  void a(BufferBuilder paramBufferBuilder, GeoCube paramGeoCube) {
    for (GeoQuad geoQuad : paramGeoCube.quads) {
      try {
        if (geoQuad != null)
          for (GeoVertex geoVertex : geoQuad.vertices) {
            Vector4f vector4f = new Vector4f(geoVertex.position.getX(), geoVertex.position.getY(), geoVertex.position.getZ(), 1.0F);
            MATRIX_STACK.getModelMatrix().transform((Tuple4f)vector4f);
            paramBufferBuilder.func_181662_b(vector4f.getX(), vector4f.getY(), vector4f.getZ()).func_187315_a(geoVertex.textureU, geoVertex.textureV).func_181666_a(this.d.a, this.d.c, this.d.b, 1.0F).func_181675_d();
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void renderCube(BufferBuilder paramBufferBuilder, GeoCube paramGeoCube, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   3: aload_2
    //   4: invokevirtual moveToPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   7: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   10: aload_2
    //   11: invokevirtual rotate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   14: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   17: aload_2
    //   18: invokevirtual moveBackFromPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   21: aload_0
    //   22: getfield c : Z
    //   25: ifeq -> 39
    //   28: aload_0
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual a : (Lnet/minecraft/client/renderer/BufferBuilder;Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   34: return
    //   35: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   38: athrow
    //   39: aload_2
    //   40: getfield quads : [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
    //   43: astore #7
    //   45: aload #7
    //   47: arraylength
    //   48: istore #8
    //   50: iconst_0
    //   51: istore #9
    //   53: iload #9
    //   55: iload #8
    //   57: if_icmpge -> 481
    //   60: aload #7
    //   62: iload #9
    //   64: aaload
    //   65: astore #10
    //   67: aload #10
    //   69: ifnonnull -> 79
    //   72: goto -> 475
    //   75: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   78: athrow
    //   79: new javax/vecmath/Vector3f
    //   82: dup
    //   83: aload #10
    //   85: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   88: invokevirtual func_177958_n : ()I
    //   91: i2f
    //   92: aload #10
    //   94: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   97: invokevirtual func_177956_o : ()I
    //   100: i2f
    //   101: aload #10
    //   103: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   106: invokevirtual func_177952_p : ()I
    //   109: i2f
    //   110: invokespecial <init> : (FFF)V
    //   113: astore #11
    //   115: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   118: invokevirtual getNormalMatrix : ()Ljavax/vecmath/Matrix3f;
    //   121: aload #11
    //   123: invokevirtual transform : (Ljavax/vecmath/Tuple3f;)V
    //   126: aload_2
    //   127: getfield size : Ljavax/vecmath/Vector3f;
    //   130: getfield y : F
    //   133: fconst_0
    //   134: fcmpl
    //   135: ifeq -> 157
    //   138: aload_2
    //   139: getfield size : Ljavax/vecmath/Vector3f;
    //   142: getfield z : F
    //   145: fconst_0
    //   146: fcmpl
    //   147: ifne -> 193
    //   150: goto -> 157
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: aload #11
    //   159: invokevirtual getX : ()F
    //   162: fconst_0
    //   163: fcmpg
    //   164: ifge -> 193
    //   167: goto -> 174
    //   170: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   173: athrow
    //   174: aload #11
    //   176: dup
    //   177: getfield x : F
    //   180: ldc -1.0
    //   182: fmul
    //   183: putfield x : F
    //   186: goto -> 193
    //   189: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   192: athrow
    //   193: aload_2
    //   194: getfield size : Ljavax/vecmath/Vector3f;
    //   197: getfield x : F
    //   200: fconst_0
    //   201: fcmpl
    //   202: ifeq -> 224
    //   205: aload_2
    //   206: getfield size : Ljavax/vecmath/Vector3f;
    //   209: getfield z : F
    //   212: fconst_0
    //   213: fcmpl
    //   214: ifne -> 260
    //   217: goto -> 224
    //   220: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   223: athrow
    //   224: aload #11
    //   226: invokevirtual getY : ()F
    //   229: fconst_0
    //   230: fcmpg
    //   231: ifge -> 260
    //   234: goto -> 241
    //   237: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   240: athrow
    //   241: aload #11
    //   243: dup
    //   244: getfield y : F
    //   247: ldc -1.0
    //   249: fmul
    //   250: putfield y : F
    //   253: goto -> 260
    //   256: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   259: athrow
    //   260: aload_2
    //   261: getfield size : Ljavax/vecmath/Vector3f;
    //   264: getfield x : F
    //   267: fconst_0
    //   268: fcmpl
    //   269: ifeq -> 291
    //   272: aload_2
    //   273: getfield size : Ljavax/vecmath/Vector3f;
    //   276: getfield y : F
    //   279: fconst_0
    //   280: fcmpl
    //   281: ifne -> 327
    //   284: goto -> 291
    //   287: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   290: athrow
    //   291: aload #11
    //   293: invokevirtual getZ : ()F
    //   296: fconst_0
    //   297: fcmpg
    //   298: ifge -> 327
    //   301: goto -> 308
    //   304: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   307: athrow
    //   308: aload #11
    //   310: dup
    //   311: getfield z : F
    //   314: ldc -1.0
    //   316: fmul
    //   317: putfield z : F
    //   320: goto -> 327
    //   323: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   326: athrow
    //   327: aload #10
    //   329: getfield vertices : [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
    //   332: astore #12
    //   334: aload #12
    //   336: arraylength
    //   337: istore #13
    //   339: iconst_0
    //   340: istore #14
    //   342: iload #14
    //   344: iload #13
    //   346: if_icmpge -> 475
    //   349: aload #12
    //   351: iload #14
    //   353: aaload
    //   354: astore #15
    //   356: new javax/vecmath/Vector4f
    //   359: dup
    //   360: aload #15
    //   362: getfield position : Ljavax/vecmath/Vector3f;
    //   365: invokevirtual getX : ()F
    //   368: aload #15
    //   370: getfield position : Ljavax/vecmath/Vector3f;
    //   373: invokevirtual getY : ()F
    //   376: aload #15
    //   378: getfield position : Ljavax/vecmath/Vector3f;
    //   381: invokevirtual getZ : ()F
    //   384: fconst_1
    //   385: invokespecial <init> : (FFFF)V
    //   388: astore #16
    //   390: getstatic com/trolmastercard/sexmod/av.MATRIX_STACK : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   393: invokevirtual getModelMatrix : ()Ljavax/vecmath/Matrix4f;
    //   396: aload #16
    //   398: invokevirtual transform : (Ljavax/vecmath/Tuple4f;)V
    //   401: aload_1
    //   402: aload #16
    //   404: invokevirtual getX : ()F
    //   407: f2d
    //   408: aload #16
    //   410: invokevirtual getY : ()F
    //   413: f2d
    //   414: aload #16
    //   416: invokevirtual getZ : ()F
    //   419: f2d
    //   420: invokevirtual func_181662_b : (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
    //   423: aload #15
    //   425: getfield textureU : F
    //   428: f2d
    //   429: aload #15
    //   431: getfield textureV : F
    //   434: f2d
    //   435: invokevirtual func_187315_a : (DD)Lnet/minecraft/client/renderer/BufferBuilder;
    //   438: fload_3
    //   439: fload #4
    //   441: fload #5
    //   443: fload #6
    //   445: invokevirtual func_181666_a : (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
    //   448: aload #11
    //   450: invokevirtual getX : ()F
    //   453: aload #11
    //   455: invokevirtual getY : ()F
    //   458: aload #11
    //   460: invokevirtual getZ : ()F
    //   463: invokevirtual func_181663_c : (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
    //   466: invokevirtual func_181675_d : ()V
    //   469: iinc #14, 1
    //   472: goto -> 342
    //   475: iinc #9, 1
    //   478: goto -> 53
    //   481: return
    // Exception table:
    //   from	to	target	type
    //   0	35	35	java/lang/RuntimeException
    //   67	75	75	java/lang/RuntimeException
    //   115	150	153	java/lang/RuntimeException
    //   138	167	170	java/lang/RuntimeException
    //   157	186	189	java/lang/RuntimeException
    //   193	217	220	java/lang/RuntimeException
    //   205	234	237	java/lang/RuntimeException
    //   224	253	256	java/lang/RuntimeException
    //   260	284	287	java/lang/RuntimeException
    //   272	301	304	java/lang/RuntimeException
    //   291	320	323	java/lang/RuntimeException
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\av.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */