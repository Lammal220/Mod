package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;

public class ay extends EntityLiving {
  public static int b = 8400;
  
  public static List<ay> g = new ArrayList<>();
  
  private static final DataParameter<Integer> d = EntityDataManager.func_187226_a(ay.class, DataSerializers.field_187192_b).func_187156_b().func_187161_a(111);
  
  private static final DataParameter<Integer> c = EntityDataManager.func_187226_a(ay.class, DataSerializers.field_187192_b).func_187156_b().func_187161_a(110);
  
  public float a;
  
  public float e;
  
  public float h;
  
  private boolean f;
  
  public ay(World paramWorld) {
    super(paramWorld);
  }
  
  protected void func_184651_r() {
    this.field_70714_bg.func_75776_a(1, new d(this));
    this.field_70714_bg.func_75776_a(5, new c(this));
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.field_70180_af.func_187214_a(c, Integer.valueOf(1));
    this.field_70180_af.func_187214_a(d, Integer.valueOf(0));
  }
  
  public void func_180430_e(float paramFloat1, float paramFloat2) {}
  
  protected boolean func_70692_ba() {
    return false;
  }
  
  protected void a(int paramInt, boolean paramBoolean) {
    try {
      this.field_70180_af.func_187227_b(c, Integer.valueOf(paramInt));
      func_70105_a(0.51000005F * paramInt, 0.51000005F * paramInt);
      func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
      func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a((paramInt * paramInt));
      func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a((0.2F + 0.1F * paramInt));
      if (paramBoolean)
        func_70606_j(func_110138_aP()); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.field_70728_aV = paramInt;
  }
  
  public int h() {
    return ((Integer)this.field_70180_af.func_187225_a(c)).intValue();
  }
  
  public static void a(DataFixer paramDataFixer) {
    EntityLiving.func_189752_a(paramDataFixer, ay.class);
  }
  
  public void func_70014_b(NBTTagCompound paramNBTTagCompound) {
    super.func_70014_b(paramNBTTagCompound);
    paramNBTTagCompound.func_74768_a("Size", h() - 1);
    paramNBTTagCompound.func_74757_a("wasOnGround", this.f);
    paramNBTTagCompound.func_74768_a("ageInTicks", ((Integer)this.field_70180_af.func_187225_a(d)).intValue());
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    super.func_70037_a(paramNBTTagCompound);
    int i = paramNBTTagCompound.func_74762_e("Size");
    if (i < 0)
      i = 0; 
    a(i + 1, false);
    this.f = paramNBTTagCompound.func_74767_n("wasOnGround");
    this.field_70180_af.func_187227_b(d, Integer.valueOf(paramNBTTagCompound.func_74762_e("ageInTicks")));
  }
  
  public boolean j() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (h() <= 1);
  }
  
  protected EnumParticleTypes g() {
    return EnumParticleTypes.SLIME;
  }
  
  public static ArrayList<ay> a(Vec3d paramVec3d) {
    ArrayList<ay> arrayList = a(paramVec3d, 0.1D);
    if (arrayList.isEmpty())
      arrayList = a(paramVec3d, 0.5D); 
    return arrayList;
  }
  
  private static ArrayList<ay> a(Vec3d paramVec3d, double paramDouble) {
    ArrayList<ay> arrayList = new ArrayList();
    try {
      for (ay ay1 : g) {
        try {
          if (ay1 == null)
            continue; 
        } catch (Exception exception) {
          throw a(null);
        } 
        double d = Math.abs(ay1.field_70169_q - paramVec3d.field_72450_a) + Math.abs(ay1.field_70167_r - paramVec3d.field_72448_b) + Math.abs(ay1.field_70166_s - paramVec3d.field_72449_c);
        try {
          if (ay1.field_70170_p != null)
            try {
              if (d < paramDouble)
                arrayList.add(ay1); 
            } catch (Exception exception) {
              throw a(null);
            }  
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
    } catch (Exception exception) {
      System.out.println("couldnt find slimes at distance " + paramDouble);
    } 
    return arrayList;
  }
  
  public Vec3d e() {
    return new Vec3d(this.field_70169_q, this.field_70167_r, this.field_70166_s);
  }
  
  void a(EnumParticleTypes paramEnumParticleTypes) {
    double d1 = r.f.nextGaussian() * 0.02D;
    double d2 = r.f.nextGaussian() * 0.02D;
    double d3 = r.f.nextGaussian() * 0.02D;
    this.field_70170_p.func_175688_a(paramEnumParticleTypes, this.field_70165_t + (r.f.nextFloat() * this.field_70130_N * 2.0F) - this.field_70130_N, this.field_70163_u + 0.15D + (r.f.nextFloat() * this.field_70131_O), this.field_70161_v + (r.f.nextFloat() * this.field_70130_N * 2.0F) - this.field_70130_N, d1, d2, d3, new int[0]);
  }
  
  public void func_70071_h_() {
    try {
      this.field_70180_af.func_187227_b(d, Integer.valueOf(((Integer)this.field_70180_af.func_187225_a(d)).intValue() + 1));
      if (this.field_70170_p.field_72995_K) {
        try {
          if (((Integer)this.field_70180_af.func_187225_a(d)).intValue() > b * 0.95D) {
            a(EnumParticleTypes.CLOUD);
          } else {
            try {
              if (((Integer)this.field_70180_af.func_187225_a(d)).intValue() > b * 0.7D)
                try {
                  if (this.field_70173_aa % 10 == 0)
                    a(EnumParticleTypes.VILLAGER_HAPPY); 
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
      } else if (((Integer)this.field_70180_af.func_187225_a(d)).intValue() > b) {
        fn fn = new fn(this.field_70170_p);
        fn.func_70080_a(this.field_70165_t, this.field_70163_u, this.field_70161_v, this.field_70177_z, this.field_70125_A);
        this.field_70170_p.func_72838_d((Entity)fn);
        fn.a(SoundEvents.field_187604_bf);
        this.field_70170_p.func_72900_e((Entity)this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.e += (this.a - this.e) * 0.5F;
      this.h = this.e;
      super.func_70071_h_();
      if (this.field_70122_E && !this.f) {
        int i = h();
        if (k())
          i = 0; 
        for (byte b = 0; b < i * 8; b++) {
          float f1 = this.field_70146_Z.nextFloat() * 6.2831855F;
          float f2 = this.field_70146_Z.nextFloat() * 0.5F + 0.5F;
          float f3 = MathHelper.func_76126_a(f1) * i * 0.5F * f2;
          float f4 = MathHelper.func_76134_b(f1) * i * 0.5F * f2;
          World world = this.field_70170_p;
          EnumParticleTypes enumParticleTypes = g();
          double d1 = this.field_70165_t + f3;
          double d2 = this.field_70161_v + f4;
          world.func_175688_a(enumParticleTypes, d1, (func_174813_aQ()).field_72338_b, d2, 0.0D, 0.0D, 0.0D, new int[0]);
        } 
        func_184185_a(f(), func_70599_aP(), ((this.field_70146_Z.nextFloat() - this.field_70146_Z.nextFloat()) * 0.2F + 1.0F) / 0.8F);
        this.a = -0.5F;
      } else {
        try {
          if (!this.field_70122_E)
            try {
              if (this.f)
                this.a = 1.0F; 
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
    this.f = this.field_70122_E;
    b();
  }
  
  protected void b() {
    this.a *= 0.6F;
  }
  
  protected int a() {
    return this.field_70146_Z.nextInt(100) + 50;
  }
  
  protected ay d() {
    return new ay(this.field_70170_p);
  }
  
  public void func_184206_a(DataParameter<?> paramDataParameter) {
    if (c.equals(paramDataParameter)) {
      int i = h();
      try {
        func_70105_a(0.51000005F * i, 0.51000005F * i);
        this.field_70177_z = this.field_70759_as;
        this.field_70761_aq = this.field_70759_as;
        if (func_70090_H())
          try {
            if (this.field_70146_Z.nextInt(20) == 0)
              func_71061_d_(); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    super.func_184206_a(paramDataParameter);
  }
  
  public void func_70106_y() {
    int i = h();
    try {
      if (!this.field_70170_p.field_72995_K)
        try {
          if (i > 1 && func_110143_aJ() <= 0.0F) {
            int j = 2 + this.field_70146_Z.nextInt(3);
            for (byte b = 0; b < j; b++) {
              float f1 = ((b % 2) - 0.5F) * i / 4.0F;
              float f2 = ((b / 2) - 0.5F) * i / 4.0F;
              ay ay1 = d();
              try {
                if (func_145818_k_())
                  ay1.func_96094_a(func_95999_t()); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (func_104002_bU())
                  ay1.func_110163_bv(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              ay1.a(i / 2, true);
              ay1.func_70012_b(this.field_70165_t + f1, this.field_70163_u + 0.5D, this.field_70161_v + f2, this.field_70146_Z.nextFloat() * 360.0F, 0.0F);
              this.field_70170_p.func_72838_d((Entity)ay1);
            } 
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    super.func_70106_y();
  }
  
  public float func_70047_e() {
    return 0.625F * this.field_70131_O;
  }
  
  protected SoundEvent func_184601_bQ(DamageSource paramDamageSource) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return j() ? SoundEvents.field_187898_fy : SoundEvents.field_187880_fp;
  }
  
  protected SoundEvent func_184615_bR() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return j() ? SoundEvents.field_187896_fx : SoundEvents.field_187874_fm;
  }
  
  protected SoundEvent f() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return j() ? SoundEvents.field_187900_fz : SoundEvents.field_187886_fs;
  }
  
  protected Item func_146068_u() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (h() == 1) ? Items.field_151123_aH : null;
  }
  
  @Nullable
  protected ResourceLocation func_184647_J() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (h() == 1) ? LootTableList.field_186378_ac : LootTableList.field_186419_a;
  }
  
  protected float func_70599_aP() {
    return 0.4F * h();
  }
  
  public int func_70646_bf() {
    return 0;
  }
  
  protected boolean i() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (h() > 0);
  }
  
  protected void func_70664_aZ() {
    this.field_70181_x = 0.41999998688697815D;
    this.field_70160_al = true;
  }
  
  @Nullable
  public IEntityLivingData func_180482_a(DifficultyInstance paramDifficultyInstance, @Nullable IEntityLivingData paramIEntityLivingData) {
    a(1, true);
    return super.func_180482_a(paramDifficultyInstance, paramIEntityLivingData);
  }
  
  protected SoundEvent c() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return j() ? SoundEvents.field_189110_fE : SoundEvents.field_187882_fq;
  }
  
  protected boolean k() {
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static class b extends EntityMoveHelper {
    private float b;
    
    private int c;
    
    private final ay d;
    
    private boolean a;
    
    public b(ay param1ay) {
      super(param1ay);
      this.d = param1ay;
      this.b = 180.0F * param1ay.field_70177_z / 3.1415927F;
    }
    
    public void a(float param1Float, boolean param1Boolean) {
      this.b = param1Float;
      this.a = param1Boolean;
    }
    
    public void a(double param1Double) {
      this.field_75645_e = param1Double;
      this.field_188491_h = EntityMoveHelper.Action.MOVE_TO;
    }
    
    public void func_75641_c() {
      try {
        this.field_75648_a.field_70177_z = func_75639_a(this.field_75648_a.field_70177_z, this.b, 90.0F);
        this.field_75648_a.field_70759_as = this.field_75648_a.field_70177_z;
        this.field_75648_a.field_70761_aq = this.field_75648_a.field_70177_z;
        if (this.field_188491_h != EntityMoveHelper.Action.MOVE_TO) {
          this.field_75648_a.func_191989_p(0.0F);
        } else {
          try {
            this.field_188491_h = EntityMoveHelper.Action.WAIT;
            if (this.field_75648_a.field_70122_E) {
              try {
                this.field_75648_a.func_70659_e((float)(this.field_75645_e * this.field_75648_a.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e()));
                if (this.c-- <= 0) {
                  try {
                    this.c = this.d.a();
                    if (this.a)
                      this.c /= 3; 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                  float f = r.f.nextInt(360);
                  try {
                    ((b)this.d.func_70605_aq()).a(f, false);
                    this.d.func_70683_ar().func_75660_a();
                    if (this.d.i())
                      this.d.func_184185_a(this.d.c(), this.d.func_70599_aP(), ((this.d.func_70681_au().nextFloat() - this.d.func_70681_au().nextFloat()) * 0.2F + 1.0F) * 0.8F); 
                  } catch (RuntimeException runtimeException) {
                    throw a(null);
                  } 
                } else {
                  this.d.field_70702_br = 0.0F;
                  this.d.field_191988_bg = 0.0F;
                  this.field_75648_a.func_70659_e(0.0F);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } else {
              this.field_75648_a.func_70659_e((float)(this.field_75645_e * this.field_75648_a.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111126_e()));
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
  
  static class c extends EntityAIBase {
    private final ay a;
    
    public c(ay param1ay) {
      this.a = param1ay;
      func_75248_a(5);
    }
    
    public boolean func_75250_a() {
      return true;
    }
    
    public void func_75246_d() {
      ((ay.b)this.a.func_70605_aq()).a(1.0D);
    }
  }
  
  static class d extends EntityAIBase {
    private final ay a;
    
    public d(ay param1ay) {
      this.a = param1ay;
      func_75248_a(5);
      ((PathNavigateGround)param1ay.func_70661_as()).func_179693_d(true);
    }
    
    public boolean func_75250_a() {
      try {
        if (!this.a.func_70090_H()) {
          try {
            if (this.a.func_180799_ab());
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          return false;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    }
    
    public void func_75246_d() {
      try {
        if (this.a.func_70681_au().nextFloat() < 0.8F)
          this.a.func_70683_ar().func_75660_a(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ((ay.b)this.a.func_70605_aq()).a(1.2D);
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
  
  static class a extends EntityAIBase {
    private final ay b;
    
    private float a;
    
    private int c;
    
    public a(ay param1ay) {
      this.b = param1ay;
      func_75248_a(2);
    }
    
    public boolean func_75250_a() {
      // Byte code:
      //   0: aload_0
      //   1: getfield b : Lcom/trolmastercard/sexmod/ay;
      //   4: invokevirtual func_70638_az : ()Lnet/minecraft/entity/EntityLivingBase;
      //   7: ifnonnull -> 89
      //   10: aload_0
      //   11: getfield b : Lcom/trolmastercard/sexmod/ay;
      //   14: getfield field_70122_E : Z
      //   17: ifne -> 81
      //   20: goto -> 27
      //   23: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   26: athrow
      //   27: aload_0
      //   28: getfield b : Lcom/trolmastercard/sexmod/ay;
      //   31: invokevirtual func_70090_H : ()Z
      //   34: ifne -> 81
      //   37: goto -> 44
      //   40: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   43: athrow
      //   44: aload_0
      //   45: getfield b : Lcom/trolmastercard/sexmod/ay;
      //   48: invokevirtual func_180799_ab : ()Z
      //   51: ifne -> 81
      //   54: goto -> 61
      //   57: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   60: athrow
      //   61: aload_0
      //   62: getfield b : Lcom/trolmastercard/sexmod/ay;
      //   65: getstatic net/minecraft/init/MobEffects.field_188424_y : Lnet/minecraft/potion/Potion;
      //   68: invokevirtual func_70644_a : (Lnet/minecraft/potion/Potion;)Z
      //   71: ifeq -> 89
      //   74: goto -> 81
      //   77: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   80: athrow
      //   81: iconst_1
      //   82: goto -> 90
      //   85: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      //   88: athrow
      //   89: iconst_0
      //   90: ireturn
      // Exception table:
      //   from	to	target	type
      //   0	20	23	java/lang/RuntimeException
      //   10	37	40	java/lang/RuntimeException
      //   27	54	57	java/lang/RuntimeException
      //   44	74	77	java/lang/RuntimeException
      //   61	85	85	java/lang/RuntimeException
    }
    
    public void func_75246_d() {
      try {
        if (--this.c <= 0) {
          this.c = 40 + this.b.func_70681_au().nextInt(60);
          this.a = this.b.func_70681_au().nextInt(360);
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      ((ay.b)this.b.func_70605_aq()).a(this.a, false);
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ay.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */