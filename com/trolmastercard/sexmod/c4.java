package com.trolmastercard.sexmod;

import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityWitherSkeleton;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class c4 extends EntityLiving {
  public static final float d = 0.4F;
  
  public static final float e = 0.3F;
  
  static final int b = 200;
  
  static final int k = 100;
  
  static final float a = 0.5F;
  
  static final float l = 0.15F;
  
  public static final float j = 0.75F;
  
  public double g = 1.0D;
  
  Vec3d h = Vec3d.field_186680_a;
  
  boolean c = false;
  
  boolean i = true;
  
  f_ f;
  
  public c4(World paramWorld) {
    super(paramWorld);
    func_70105_a(0.5F, 0.5F);
  }
  
  public c4(World paramWorld, f_ paramf_) {
    super(paramWorld);
    func_70105_a(0.5F, 0.5F);
    this.f = paramf_;
  }
  
  public c4(World paramWorld, f_ paramf_, Vec3d paramVec3d) {
    this(paramWorld);
    this.h = paramVec3d;
    this.f = paramf_;
  }
  
  protected boolean func_70041_e_() {
    return false;
  }
  
  protected void func_82167_n(Entity paramEntity) {}
  
  public void func_70071_h_() {
    try {
      if (this.field_70128_L)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      this.field_70145_X = true;
      func_189654_d(true);
      this.field_70159_w = this.h.field_72450_a;
      this.field_70181_x = this.h.field_72448_b;
      this.field_70179_y = this.h.field_72449_c;
      super.func_70071_h_();
      if (this.field_70170_p.field_72995_K)
        a(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      c();
      if (this.field_70170_p.func_175623_d(func_180425_c()))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    b();
    this.field_70170_p.func_72900_e((Entity)this);
  }
  
  void c() {
    try {
      if (this.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!this.c)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d1 = func_174791_d();
    Vec3d vec3d2 = vec3d1.func_178786_a(0.75D, 0.75D, 0.75D);
    Vec3d vec3d3 = vec3d1.func_72441_c(0.75D, 0.75D, 0.75D);
    AxisAlignedBB axisAlignedBB = new AxisAlignedBB(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, vec3d3.field_72450_a, vec3d3.field_72448_b, vec3d3.field_72449_c);
    List list = this.field_70170_p.func_72872_a(f_.class, axisAlignedBB);
    try {
      if (list.isEmpty())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 1.0F, true);
    for (f_ f_1 : list)
      f_1.f(func_174791_d()); 
    this.field_70170_p.func_72900_e((Entity)this);
  }
  
  void a() {
    a(b6.b(this.field_70142_S, this.field_70165_t, 0.5D), b6.b(this.field_70137_T, this.field_70163_u, 0.5D), b6.b(this.field_70136_U, this.field_70161_v, 0.5D));
    a(this.field_70165_t, this.field_70163_u, this.field_70161_v);
  }
  
  void a(double paramDouble1, double paramDouble2, double paramDouble3) {
    Random random = func_70681_au();
    this.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, paramDouble1 + random.nextDouble() * 0.30000001192092896D, paramDouble2 + 0.25D + random.nextDouble() * 0.30000001192092896D, paramDouble3 + random.nextDouble() * 0.30000001192092896D, 0.0D, 0.0D, 0.0D, new int[0]);
  }
  
  void b() {
    try {
      if (this.field_70170_p.field_72995_K)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.field_70128_L)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!this.i)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d = new Vec3d(this.field_70165_t, (func_180425_c().func_177956_o() + 1), this.field_70161_v);
    try {
      if (!b(vec3d)) {
        this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 2.0F, true);
        this.i = false;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityWitherSkeleton entityWitherSkeleton = new EntityWitherSkeleton(this.field_70170_p);
    entityWitherSkeleton.func_184611_a(EnumHand.MAIN_HAND, new ItemStack(Items.field_151052_q));
    entityWitherSkeleton.func_70634_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c);
    this.field_70170_p.func_72838_d((Entity)entityWitherSkeleton);
    ge.b.sendToAllTracking(new bv(vec3d, true), (Entity)this);
    this.f.bI.add(entityWitherSkeleton);
  }
  
  boolean b(Vec3d paramVec3d) {
    try {
      if (this.f == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityLivingBase entityLivingBase = this.f.M();
    try {
      if (entityLivingBase == null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (entityLivingBase.func_70011_f(paramVec3d.field_72450_a, paramVec3d.field_72448_b, paramVec3d.field_72449_c) < 15.0D);
  }
  
  @SideOnly(Side.CLIENT)
  public static void a(Vec3d paramVec3d) {
    WorldClient worldClient = (Minecraft.func_71410_x()).field_71441_e;
    float f1 = gc.c(1.8F);
    Random random = r.f;
    float f2;
    for (f2 = 0.0F; f2 < 6.283185307179586D; f2 += f1) {
      double d1 = Math.sin(f2);
      double d2 = Math.cos(f2);
      double d3 = paramVec3d.field_72450_a + d1 * 0.5D;
      double d4 = d1 * 0.15000000596046448D;
      double d5 = paramVec3d.field_72449_c + d2 * 0.5D;
      double d6 = d2 * 0.15000000596046448D;
      double d7 = paramVec3d.field_72448_b;
      double d8 = random.nextDouble() * 0.15000000596046448D;
      worldClient.func_175688_a(EnumParticleTypes.SMOKE_NORMAL, d3, d7, d5, d4, d8, d6, new int[0]);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  public static void c(Vec3d paramVec3d) {
    WorldClient worldClient = (Minecraft.func_71410_x()).field_71441_e;
    Random random = r.f;
    byte b = 0;
    try {
      while (b < 100) {
        worldClient.func_175688_a(EnumParticleTypes.DRAGON_BREATH, paramVec3d.field_72450_a, paramVec3d.field_72448_b, paramVec3d.field_72449_c, random.nextDouble() * 0.15000000596046448D, random.nextDouble() * 0.15000000596046448D, random.nextDouble() * 0.15000000596046448D, new int[0]);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    worldClient.func_184134_a(paramVec3d.field_72450_a, paramVec3d.field_72448_b, paramVec3d.field_72449_c, c.MISC_SHATTER[0], SoundCategory.AMBIENT, 0.7F, 1.0F, false);
  }
  
  public boolean func_70097_a(DamageSource paramDamageSource, float paramFloat) {
    try {
      if (DamageSource.field_76380_i.equals(paramDamageSource)) {
        func_70606_j(0.0F);
        this.i = false;
        this.field_70170_p.func_72900_e((Entity)this);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!this.field_70170_p.field_72995_K && "arrow".equals(paramDamageSource.field_76373_n)) {
        func_70606_j(0.0F);
        this.i = false;
        ge.b.sendToAllTracking(new bv(func_174791_d(), false), (Entity)this);
        Entity entity1 = paramDamageSource.func_76364_f();
        try {
          if (entity1 != null)
            this.field_70170_p.func_72900_e(entity1); 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.field_70170_p.func_72900_e((Entity)this);
        return true;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Entity entity = paramDamageSource.func_76346_g();
    try {
      if (!(entity instanceof net.minecraft.entity.player.EntityPlayer))
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.h = entity.func_70040_Z();
    this.c = true;
    return true;
  }
  
  public void func_70037_a(NBTTagCompound paramNBTTagCompound) {
    this.field_70170_p.func_72900_e((Entity)this);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\c4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */