package com.trolmastercard.sexmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class al extends EntityLiving {
  public static final long b = 60000L;
  
  public static final float g = 3.0F;
  
  static final float c = 30.0F;
  
  static final int h = 175;
  
  static final int i = 10;
  
  BlockPos f = null;
  
  int d = 0;
  
  boolean e = false;
  
  public int a = -1;
  
  public al(World paramWorld) {
    super(paramWorld);
  }
  
  protected void func_70619_bc() {
    super.func_70619_bc();
    a();
  }
  
  void a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Z
    //   4: ifeq -> 19
    //   7: aload_0
    //   8: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   11: invokevirtual func_75499_g : ()V
    //   14: return
    //   15: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   18: athrow
    //   19: aload_0
    //   20: getfield field_70170_p : Lnet/minecraft/world/World;
    //   23: aload_0
    //   24: ldc2_w 15.0
    //   27: invokevirtual func_72890_a : (Lnet/minecraft/entity/Entity;D)Lnet/minecraft/entity/player/EntityPlayer;
    //   30: astore_1
    //   31: aload_1
    //   32: ifnull -> 65
    //   35: aload_1
    //   36: aload_0
    //   37: invokevirtual func_70032_d : (Lnet/minecraft/entity/Entity;)F
    //   40: ldc 3.0
    //   42: fcmpg
    //   43: ifge -> 65
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   52: athrow
    //   53: aload_0
    //   54: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   57: invokevirtual func_75499_g : ()V
    //   60: return
    //   61: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   64: athrow
    //   65: aload_0
    //   66: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   69: ifnull -> 132
    //   72: aload_0
    //   73: aload_0
    //   74: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   77: invokevirtual func_177958_n : ()I
    //   80: i2d
    //   81: aload_0
    //   82: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   85: invokevirtual func_177956_o : ()I
    //   88: i2d
    //   89: aload_0
    //   90: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   93: invokevirtual func_177952_p : ()I
    //   96: i2d
    //   97: invokevirtual func_70011_f : (DDD)D
    //   100: aload_0
    //   101: invokevirtual c : ()D
    //   104: dcmpl
    //   105: ifgt -> 132
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   114: athrow
    //   115: aload_0
    //   116: getfield d : I
    //   119: sipush #175
    //   122: if_icmple -> 293
    //   125: goto -> 132
    //   128: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   131: athrow
    //   132: aload_0
    //   133: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   136: invokevirtual nextBoolean : ()Z
    //   139: ifeq -> 157
    //   142: goto -> 149
    //   145: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   148: athrow
    //   149: iconst_1
    //   150: goto -> 158
    //   153: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   156: athrow
    //   157: iconst_m1
    //   158: aload_0
    //   159: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   162: bipush #10
    //   164: invokevirtual nextInt : (I)I
    //   167: imul
    //   168: istore_2
    //   169: aload_0
    //   170: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   173: invokevirtual nextBoolean : ()Z
    //   176: ifeq -> 187
    //   179: iconst_1
    //   180: goto -> 188
    //   183: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   186: athrow
    //   187: iconst_m1
    //   188: aload_0
    //   189: invokevirtual func_70681_au : ()Ljava/util/Random;
    //   192: bipush #10
    //   194: invokevirtual nextInt : (I)I
    //   197: imul
    //   198: istore_3
    //   199: aload_0
    //   200: getfield field_70170_p : Lnet/minecraft/world/World;
    //   203: getfield field_73011_w : Lnet/minecraft/world/WorldProvider;
    //   206: invokevirtual func_186058_p : ()Lnet/minecraft/world/DimensionType;
    //   209: getstatic net/minecraft/world/DimensionType.NETHER : Lnet/minecraft/world/DimensionType;
    //   212: if_acmpne -> 230
    //   215: aload_0
    //   216: getfield field_70163_u : D
    //   219: invokestatic ceil : (D)D
    //   222: d2i
    //   223: goto -> 255
    //   226: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   229: athrow
    //   230: aload_0
    //   231: getfield field_70170_p : Lnet/minecraft/world/World;
    //   234: aload_0
    //   235: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   238: invokevirtual func_177958_n : ()I
    //   241: iload_2
    //   242: iadd
    //   243: aload_0
    //   244: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   247: invokevirtual func_177952_p : ()I
    //   250: iload_3
    //   251: iadd
    //   252: invokestatic a : (Lnet/minecraft/world/World;II)I
    //   255: istore #4
    //   257: aload_0
    //   258: new net/minecraft/util/math/BlockPos
    //   261: dup
    //   262: aload_0
    //   263: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   266: invokevirtual func_177958_n : ()I
    //   269: iload_2
    //   270: iadd
    //   271: iload #4
    //   273: aload_0
    //   274: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   277: invokevirtual func_177952_p : ()I
    //   280: iload_3
    //   281: iadd
    //   282: invokespecial <init> : (III)V
    //   285: putfield f : Lnet/minecraft/util/math/BlockPos;
    //   288: aload_0
    //   289: iconst_0
    //   290: putfield d : I
    //   293: aload_0
    //   294: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   297: aload_0
    //   298: invokevirtual func_180425_c : ()Lnet/minecraft/util/math/BlockPos;
    //   301: invokevirtual func_177951_i : (Lnet/minecraft/util/math/Vec3i;)D
    //   304: invokestatic sqrt : (D)D
    //   307: ldc2_w 2.0
    //   310: dcmpl
    //   311: ifle -> 360
    //   314: aload_0
    //   315: invokevirtual func_70661_as : ()Lnet/minecraft/pathfinding/PathNavigate;
    //   318: aload_0
    //   319: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   322: invokevirtual func_177958_n : ()I
    //   325: i2d
    //   326: aload_0
    //   327: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   330: invokevirtual func_177956_o : ()I
    //   333: i2d
    //   334: aload_0
    //   335: getfield f : Lnet/minecraft/util/math/BlockPos;
    //   338: invokevirtual func_177952_p : ()I
    //   341: i2d
    //   342: ldc2_w 0.3499999940395355
    //   345: invokevirtual func_75492_a : (DDDD)Z
    //   348: pop
    //   349: aload_0
    //   350: invokevirtual d : ()V
    //   353: goto -> 370
    //   356: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   359: athrow
    //   360: aload_0
    //   361: dup
    //   362: getfield d : I
    //   365: iconst_1
    //   366: iadd
    //   367: putfield d : I
    //   370: return
    // Exception table:
    //   from	to	target	type
    //   0	15	15	java/lang/RuntimeException
    //   31	46	49	java/lang/RuntimeException
    //   35	61	61	java/lang/RuntimeException
    //   65	108	111	java/lang/RuntimeException
    //   72	125	128	java/lang/RuntimeException
    //   115	142	145	java/lang/RuntimeException
    //   132	153	153	java/lang/RuntimeException
    //   169	183	183	java/lang/RuntimeException
    //   199	226	226	java/lang/RuntimeException
    //   293	356	356	java/lang/RuntimeException
  }
  
  protected void d() {
    Path path = func_70661_as().func_75505_d();
    try {
      if (path == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!this.field_70122_E) {
        try {
          if (func_70090_H())
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = path.func_75873_e();
    int j = path.func_75874_d();
    try {
      if (j != i)
        try {
          if (j - 1 != i) {
            PathPoint pathPoint1 = path.func_75877_a(i);
            PathPoint pathPoint2 = path.func_75877_a(i + 1);
            Vec3d vec3d = new Vec3d((pathPoint2.field_75839_a - pathPoint1.field_75839_a), (pathPoint2.field_75837_b - pathPoint1.field_75837_b), (pathPoint2.field_75838_c - pathPoint1.field_75838_c));
            this.field_70159_w = vec3d.field_72450_a / 7.0D;
            this.field_70179_y = vec3d.field_72449_c / 7.0D;
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
  
  public boolean func_70097_a(DamageSource paramDamageSource, float paramFloat) {
    try {
      if (paramDamageSource == DamageSource.field_76380_i) {
        this.field_70170_p.func_72900_e((Entity)this);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramDamageSource.func_76346_g() instanceof EntityPlayer))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70170_p.field_72995_K)
        b(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.e = true;
    be.a(6250, () -> this.field_70170_p.func_72900_e((Entity)this));
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  void b() {
    EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
    this.a = ((EntityPlayer)entityPlayerSP).field_70173_aa;
    entityPlayerSP.func_184185_a(c.MISC_WEOWEO[3], 1.0F, 1.0F);
  }
  
  double c() {
    return Math.sqrt(1800.0D);
  }
  
  public boolean func_70601_bi() {
    try {
      if (func_70681_au().nextInt(100) < 1)
        try {
          if (func_70681_au().nextInt(100) < 10)
            return true; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.field_70170_p.func_72900_e((Entity)this);
    return false;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\al.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */