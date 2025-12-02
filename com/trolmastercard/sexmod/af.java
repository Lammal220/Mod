package com.trolmastercard.sexmod;

import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import software.bernie.geckolib3.core.processor.IBone;

public class af {
  public static Vec3d[][] a(em paramem, float paramFloat1, String paramString1, String paramString2, String paramString3, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, String paramString4) {
    Vec3d[] arrayOfVec3d = b(paramem, paramFloat1, paramString1, paramString2, paramString3, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramString4);
    return a(arrayOfVec3d);
  }
  
  public static Vec3d[][] a(em paramem, float paramFloat, String paramString1, String paramString2, f7 paramf71, f7 paramf72) {
    Vec3d[] arrayOfVec3d = b(paramem, paramFloat, paramString1, paramString2, paramf71, paramf72);
    return b(arrayOfVec3d);
  }
  
  static Vec3d[] b(em paramem, float paramFloat, String paramString1, String paramString2, f7 paramf71, f7 paramf72) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: invokevirtual b : (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
    //   5: astore #6
    //   7: aload_0
    //   8: aload_3
    //   9: invokevirtual b : (Ljava/lang/String;)Lnet/minecraft/util/math/Vec3d;
    //   12: astore #7
    //   14: bipush #8
    //   16: anewarray net/minecraft/util/math/Vec3d
    //   19: astore #8
    //   21: aload #4
    //   23: getfield a : F
    //   26: fconst_0
    //   27: fcmpl
    //   28: ifne -> 257
    //   31: aload #5
    //   33: getfield a : F
    //   36: fconst_0
    //   37: fcmpl
    //   38: ifne -> 257
    //   41: goto -> 48
    //   44: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   47: athrow
    //   48: aload #8
    //   50: iconst_0
    //   51: new net/minecraft/util/math/Vec3d
    //   54: dup
    //   55: dconst_0
    //   56: aload #4
    //   58: getfield c : F
    //   61: f2d
    //   62: aload #4
    //   64: getfield b : F
    //   67: f2d
    //   68: invokespecial <init> : (DDD)V
    //   71: aastore
    //   72: aload #8
    //   74: iconst_1
    //   75: new net/minecraft/util/math/Vec3d
    //   78: dup
    //   79: dconst_0
    //   80: aload #4
    //   82: getfield c : F
    //   85: fneg
    //   86: f2d
    //   87: aload #4
    //   89: getfield b : F
    //   92: f2d
    //   93: invokespecial <init> : (DDD)V
    //   96: aastore
    //   97: aload #8
    //   99: iconst_2
    //   100: new net/minecraft/util/math/Vec3d
    //   103: dup
    //   104: dconst_0
    //   105: aload #4
    //   107: getfield c : F
    //   110: fneg
    //   111: f2d
    //   112: aload #4
    //   114: getfield b : F
    //   117: fneg
    //   118: f2d
    //   119: invokespecial <init> : (DDD)V
    //   122: aastore
    //   123: aload #8
    //   125: iconst_3
    //   126: new net/minecraft/util/math/Vec3d
    //   129: dup
    //   130: dconst_0
    //   131: aload #4
    //   133: getfield c : F
    //   136: f2d
    //   137: aload #4
    //   139: getfield b : F
    //   142: fneg
    //   143: f2d
    //   144: invokespecial <init> : (DDD)V
    //   147: aastore
    //   148: aload #8
    //   150: iconst_4
    //   151: new net/minecraft/util/math/Vec3d
    //   154: dup
    //   155: dconst_0
    //   156: aload #5
    //   158: getfield c : F
    //   161: f2d
    //   162: aload #5
    //   164: getfield b : F
    //   167: f2d
    //   168: invokespecial <init> : (DDD)V
    //   171: aastore
    //   172: aload #8
    //   174: iconst_5
    //   175: new net/minecraft/util/math/Vec3d
    //   178: dup
    //   179: dconst_0
    //   180: aload #5
    //   182: getfield c : F
    //   185: fneg
    //   186: f2d
    //   187: aload #5
    //   189: getfield b : F
    //   192: f2d
    //   193: invokespecial <init> : (DDD)V
    //   196: aastore
    //   197: aload #8
    //   199: bipush #6
    //   201: new net/minecraft/util/math/Vec3d
    //   204: dup
    //   205: dconst_0
    //   206: aload #5
    //   208: getfield c : F
    //   211: fneg
    //   212: f2d
    //   213: aload #5
    //   215: getfield b : F
    //   218: fneg
    //   219: f2d
    //   220: invokespecial <init> : (DDD)V
    //   223: aastore
    //   224: aload #8
    //   226: bipush #7
    //   228: new net/minecraft/util/math/Vec3d
    //   231: dup
    //   232: dconst_0
    //   233: aload #5
    //   235: getfield c : F
    //   238: f2d
    //   239: aload #5
    //   241: getfield b : F
    //   244: fneg
    //   245: f2d
    //   246: invokespecial <init> : (DDD)V
    //   249: aastore
    //   250: goto -> 459
    //   253: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   256: athrow
    //   257: aload #8
    //   259: iconst_0
    //   260: new net/minecraft/util/math/Vec3d
    //   263: dup
    //   264: aload #4
    //   266: getfield a : F
    //   269: f2d
    //   270: aload #4
    //   272: getfield c : F
    //   275: f2d
    //   276: dconst_0
    //   277: invokespecial <init> : (DDD)V
    //   280: aastore
    //   281: aload #8
    //   283: iconst_1
    //   284: new net/minecraft/util/math/Vec3d
    //   287: dup
    //   288: aload #4
    //   290: getfield a : F
    //   293: fneg
    //   294: f2d
    //   295: aload #4
    //   297: getfield c : F
    //   300: f2d
    //   301: dconst_0
    //   302: invokespecial <init> : (DDD)V
    //   305: aastore
    //   306: aload #8
    //   308: iconst_2
    //   309: new net/minecraft/util/math/Vec3d
    //   312: dup
    //   313: aload #4
    //   315: getfield a : F
    //   318: fneg
    //   319: f2d
    //   320: aload #4
    //   322: getfield c : F
    //   325: fneg
    //   326: f2d
    //   327: dconst_0
    //   328: invokespecial <init> : (DDD)V
    //   331: aastore
    //   332: aload #8
    //   334: iconst_3
    //   335: new net/minecraft/util/math/Vec3d
    //   338: dup
    //   339: aload #4
    //   341: getfield a : F
    //   344: f2d
    //   345: aload #4
    //   347: getfield c : F
    //   350: fneg
    //   351: f2d
    //   352: dconst_0
    //   353: invokespecial <init> : (DDD)V
    //   356: aastore
    //   357: aload #8
    //   359: iconst_4
    //   360: new net/minecraft/util/math/Vec3d
    //   363: dup
    //   364: aload #5
    //   366: getfield a : F
    //   369: f2d
    //   370: aload #5
    //   372: getfield c : F
    //   375: f2d
    //   376: dconst_0
    //   377: invokespecial <init> : (DDD)V
    //   380: aastore
    //   381: aload #8
    //   383: iconst_5
    //   384: new net/minecraft/util/math/Vec3d
    //   387: dup
    //   388: aload #5
    //   390: getfield a : F
    //   393: fneg
    //   394: f2d
    //   395: aload #5
    //   397: getfield c : F
    //   400: f2d
    //   401: dconst_0
    //   402: invokespecial <init> : (DDD)V
    //   405: aastore
    //   406: aload #8
    //   408: bipush #6
    //   410: new net/minecraft/util/math/Vec3d
    //   413: dup
    //   414: aload #5
    //   416: getfield a : F
    //   419: fneg
    //   420: f2d
    //   421: aload #5
    //   423: getfield c : F
    //   426: fneg
    //   427: f2d
    //   428: dconst_0
    //   429: invokespecial <init> : (DDD)V
    //   432: aastore
    //   433: aload #8
    //   435: bipush #7
    //   437: new net/minecraft/util/math/Vec3d
    //   440: dup
    //   441: aload #5
    //   443: getfield a : F
    //   446: f2d
    //   447: aload #5
    //   449: getfield c : F
    //   452: fneg
    //   453: f2d
    //   454: dconst_0
    //   455: invokespecial <init> : (DDD)V
    //   458: aastore
    //   459: iconst_0
    //   460: istore #9
    //   462: iload #9
    //   464: aload #8
    //   466: arraylength
    //   467: if_icmpge -> 494
    //   470: aload #8
    //   472: iload #9
    //   474: aload #8
    //   476: iload #9
    //   478: aaload
    //   479: fload_1
    //   480: invokestatic a : (Lnet/minecraft/util/math/Vec3d;F)Lnet/minecraft/util/math/Vec3d;
    //   483: aastore
    //   484: iinc #9, 1
    //   487: goto -> 462
    //   490: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   493: athrow
    //   494: iconst_0
    //   495: istore #9
    //   497: iload #9
    //   499: iconst_4
    //   500: if_icmpge -> 528
    //   503: aload #8
    //   505: iload #9
    //   507: aload #8
    //   509: iload #9
    //   511: aaload
    //   512: aload #6
    //   514: invokevirtual func_178787_e : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   517: aastore
    //   518: iinc #9, 1
    //   521: goto -> 497
    //   524: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   527: athrow
    //   528: iconst_4
    //   529: istore #9
    //   531: iload #9
    //   533: bipush #8
    //   535: if_icmpge -> 563
    //   538: aload #8
    //   540: iload #9
    //   542: aload #8
    //   544: iload #9
    //   546: aaload
    //   547: aload #7
    //   549: invokevirtual func_178787_e : (Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   552: aastore
    //   553: iinc #9, 1
    //   556: goto -> 531
    //   559: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   562: athrow
    //   563: aload #8
    //   565: areturn
    // Exception table:
    //   from	to	target	type
    //   21	41	44	java/lang/RuntimeException
    //   31	253	253	java/lang/RuntimeException
    //   462	490	490	java/lang/RuntimeException
    //   497	524	524	java/lang/RuntimeException
    //   531	559	559	java/lang/RuntimeException
  }
  
  static Vec3d[][] b(Vec3d[] paramArrayOfVec3d) {
    Vec3d[][] arrayOfVec3d = new Vec3d[6][4];
    arrayOfVec3d[0][0] = paramArrayOfVec3d[0];
    arrayOfVec3d[0][1] = paramArrayOfVec3d[1];
    arrayOfVec3d[0][2] = paramArrayOfVec3d[2];
    arrayOfVec3d[0][3] = paramArrayOfVec3d[3];
    arrayOfVec3d[1][0] = paramArrayOfVec3d[4];
    arrayOfVec3d[1][1] = paramArrayOfVec3d[5];
    arrayOfVec3d[1][2] = paramArrayOfVec3d[6];
    arrayOfVec3d[1][3] = paramArrayOfVec3d[7];
    arrayOfVec3d[2][0] = paramArrayOfVec3d[1];
    arrayOfVec3d[2][1] = paramArrayOfVec3d[2];
    arrayOfVec3d[2][2] = paramArrayOfVec3d[6];
    arrayOfVec3d[2][3] = paramArrayOfVec3d[5];
    arrayOfVec3d[3][0] = paramArrayOfVec3d[3];
    arrayOfVec3d[3][1] = paramArrayOfVec3d[7];
    arrayOfVec3d[3][2] = paramArrayOfVec3d[4];
    arrayOfVec3d[3][3] = paramArrayOfVec3d[0];
    arrayOfVec3d[4][0] = paramArrayOfVec3d[1];
    arrayOfVec3d[4][1] = paramArrayOfVec3d[0];
    arrayOfVec3d[4][2] = paramArrayOfVec3d[4];
    arrayOfVec3d[4][3] = paramArrayOfVec3d[5];
    arrayOfVec3d[5][0] = paramArrayOfVec3d[2];
    arrayOfVec3d[5][1] = paramArrayOfVec3d[3];
    arrayOfVec3d[5][2] = paramArrayOfVec3d[7];
    arrayOfVec3d[5][3] = paramArrayOfVec3d[6];
    return arrayOfVec3d;
  }
  
  static Vec3d[] b(em paramem, float paramFloat1, String paramString1, String paramString2, String paramString3, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, String paramString4) {
    IBone iBone = paramem.b().getBone(paramString4);
    if (iBone == null) {
      Vec3d[] arrayOfVec3d1 = new Vec3d[12];
      Arrays.fill((Object[])arrayOfVec3d1, Vec3d.field_186680_a);
      return arrayOfVec3d1;
    } 
    float f1 = gc.d(iBone.getRotationY());
    float f2 = gc.d(iBone.getRotationZ());
    Vec3d vec3d1 = paramem.b(paramString1);
    Vec3d vec3d2 = paramem.b(paramString2);
    Vec3d vec3d3 = paramem.b(paramString3);
    Vec3d[] arrayOfVec3d = new Vec3d[12];
    arrayOfVec3d[0] = new Vec3d(paramFloat2, 0.0D, -paramFloat3);
    arrayOfVec3d[1] = new Vec3d(-paramFloat2, 0.0D, -paramFloat3);
    arrayOfVec3d[2] = new Vec3d(-paramFloat2, 0.0D, paramFloat3);
    arrayOfVec3d[3] = new Vec3d(paramFloat2, 0.0D, paramFloat3);
    arrayOfVec3d[4] = new Vec3d(paramFloat2, paramFloat3, 0.0D);
    arrayOfVec3d[5] = new Vec3d(-paramFloat2, paramFloat3, 0.0D);
    arrayOfVec3d[6] = new Vec3d(-paramFloat2, -paramFloat3, 0.0D);
    arrayOfVec3d[7] = new Vec3d(paramFloat2, -paramFloat3, 0.0D);
    arrayOfVec3d[8] = new Vec3d(paramFloat4, 0.0D, -paramFloat5);
    arrayOfVec3d[9] = new Vec3d(-paramFloat4, 0.0D, -paramFloat5);
    arrayOfVec3d[10] = new Vec3d(-paramFloat4, 0.0D, paramFloat5);
    arrayOfVec3d[11] = new Vec3d(paramFloat4, 0.0D, paramFloat5);
    byte b = 0;
    try {
      while (b < arrayOfVec3d.length) {
        arrayOfVec3d[b] = ck.a(arrayOfVec3d[b], paramFloat1);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b = 0;
    try {
      while (b < 4) {
        arrayOfVec3d[b] = ck.a(arrayOfVec3d[b], 0.0F, f1, f2);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b = 0;
    try {
      while (b < 4) {
        arrayOfVec3d[b] = arrayOfVec3d[b].func_178787_e(vec3d1);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b = 4;
    try {
      while (b < 8) {
        arrayOfVec3d[b] = arrayOfVec3d[b].func_178787_e(vec3d2);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b = 8;
    try {
      while (b < 12) {
        arrayOfVec3d[b] = arrayOfVec3d[b].func_178787_e(vec3d3);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return arrayOfVec3d;
  }
  
  static Vec3d[][] a(Vec3d[] paramArrayOfVec3d) {
    Vec3d[][] arrayOfVec3d = new Vec3d[10][4];
    arrayOfVec3d[0][0] = paramArrayOfVec3d[0];
    arrayOfVec3d[0][1] = paramArrayOfVec3d[1];
    arrayOfVec3d[0][2] = paramArrayOfVec3d[5];
    arrayOfVec3d[0][3] = paramArrayOfVec3d[4];
    arrayOfVec3d[1][0] = paramArrayOfVec3d[1];
    arrayOfVec3d[1][1] = paramArrayOfVec3d[2];
    arrayOfVec3d[1][2] = paramArrayOfVec3d[6];
    arrayOfVec3d[1][3] = paramArrayOfVec3d[5];
    arrayOfVec3d[2][0] = paramArrayOfVec3d[3];
    arrayOfVec3d[2][1] = paramArrayOfVec3d[2];
    arrayOfVec3d[2][2] = paramArrayOfVec3d[6];
    arrayOfVec3d[2][3] = paramArrayOfVec3d[7];
    arrayOfVec3d[3][0] = paramArrayOfVec3d[0];
    arrayOfVec3d[3][1] = paramArrayOfVec3d[4];
    arrayOfVec3d[3][2] = paramArrayOfVec3d[7];
    arrayOfVec3d[3][3] = paramArrayOfVec3d[3];
    arrayOfVec3d[4][0] = paramArrayOfVec3d[0];
    arrayOfVec3d[4][1] = paramArrayOfVec3d[1];
    arrayOfVec3d[4][2] = paramArrayOfVec3d[2];
    arrayOfVec3d[4][3] = paramArrayOfVec3d[3];
    arrayOfVec3d[5][0] = paramArrayOfVec3d[4];
    arrayOfVec3d[5][1] = paramArrayOfVec3d[5];
    arrayOfVec3d[5][2] = paramArrayOfVec3d[9];
    arrayOfVec3d[5][3] = paramArrayOfVec3d[8];
    arrayOfVec3d[6][0] = paramArrayOfVec3d[9];
    arrayOfVec3d[6][1] = paramArrayOfVec3d[10];
    arrayOfVec3d[6][2] = paramArrayOfVec3d[6];
    arrayOfVec3d[6][3] = paramArrayOfVec3d[5];
    arrayOfVec3d[7][0] = paramArrayOfVec3d[10];
    arrayOfVec3d[7][1] = paramArrayOfVec3d[11];
    arrayOfVec3d[7][2] = paramArrayOfVec3d[7];
    arrayOfVec3d[7][3] = paramArrayOfVec3d[6];
    arrayOfVec3d[8][0] = paramArrayOfVec3d[4];
    arrayOfVec3d[8][1] = paramArrayOfVec3d[7];
    arrayOfVec3d[8][2] = paramArrayOfVec3d[11];
    arrayOfVec3d[8][3] = paramArrayOfVec3d[8];
    arrayOfVec3d[9][0] = paramArrayOfVec3d[8];
    arrayOfVec3d[9][1] = paramArrayOfVec3d[9];
    arrayOfVec3d[9][2] = paramArrayOfVec3d[10];
    arrayOfVec3d[9][3] = paramArrayOfVec3d[11];
    return arrayOfVec3d;
  }
  
  public static void a(BufferBuilder paramBufferBuilder, Vec3d[][] paramArrayOfVec3d, gv paramgv) {
    for (Vec3d[] arrayOfVec3d : paramArrayOfVec3d) {
      for (Vec3d vec3d : arrayOfVec3d)
        paramBufferBuilder.func_181662_b(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c).func_187315_a(0.0D, 0.0D).func_181669_b(paramgv.a, paramgv.d, paramgv.c, paramgv.b).func_181675_d(); 
    } 
  }
  
  public static void a(Minecraft paramMinecraft, em paramem, float paramFloat) {
    EntityPlayerSP entityPlayerSP = paramMinecraft.field_71439_g;
    try {
      if (entityPlayerSP == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    GlStateManager.func_179137_b(0.0D, 0.01D, 0.0D);
    Entity entity = ((d_)paramMinecraft.func_175598_ae().func_78713_a((Entity)paramem)).c(paramem);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = paramem.Q() ? paramem.o() : b6.a(new Vec3d(entity.field_70142_S, entity.field_70137_T, entity.field_70136_U), entity.func_174791_d(), paramFloat);
    Vec3d vec3d2 = b6.a(new Vec3d(((EntityPlayer)entityPlayerSP).field_70142_S, ((EntityPlayer)entityPlayerSP).field_70137_T, ((EntityPlayer)entityPlayerSP).field_70136_U), entityPlayerSP.func_174791_d(), paramFloat);
    Vec3d vec3d3 = vec3d1.func_178788_d(vec3d2);
    vec3d3 = paramem.a(vec3d3, paramFloat);
    GlStateManager.func_179137_b(vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\af.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */