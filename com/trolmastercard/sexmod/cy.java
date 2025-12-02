package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.util.MatrixStack;

public class cy extends EntityLivingBase implements IAnimatable {
  static final float e = 11000.0F;
  
  public static final DataParameter<String> a = EntityDataManager.func_187226_a(cy.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(101);
  
  public static final DataParameter<String> b = EntityDataManager.func_187226_a(cy.class, DataSerializers.field_187194_d).func_187156_b().func_187161_a(102);
  
  AnimationFactory g = new AnimationFactory(this);
  
  public boolean f = false;
  
  public MatrixStack c = new MatrixStack();
  
  gw d = null;
  
  public cy(World paramWorld) {
    super(paramWorld);
  }
  
  public cy(World paramWorld, UUID paramUUID, String paramString) {
    this(paramWorld);
    this.field_70180_af.func_187227_b(a, paramUUID.toString());
    this.field_70180_af.func_187227_b(b, paramString);
  }
  
  public static cy a(World paramWorld, UUID paramUUID, gw paramgw) {
    cy cy1 = new cy(paramWorld);
    cy1.func_184212_Q().func_187227_b(a, paramUUID.toString());
    cy1.f = true;
    cy1.d = paramgw;
    return cy1;
  }
  
  protected void func_70088_a() {
    super.func_70088_a();
    this.field_70180_af.func_187214_a(a, "");
    this.field_70180_af.func_187214_a(b, "");
  }
  
  public AxisAlignedBB func_184177_bl() {
    BlockPos blockPos = func_180425_c();
    Vec3i vec3i = new Vec3i(0.5D, 0.5D, 0.5D);
    return new AxisAlignedBB(blockPos.func_177973_b(vec3i), blockPos.func_177971_a(vec3i));
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_145770_h(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d1 = this.field_70165_t - paramDouble1;
    double d2 = this.field_70163_u - paramDouble2;
    double d3 = this.field_70161_v - paramDouble3;
    double d4 = d1 * d1 + d2 * d2 + d3 * d3;
    return func_70112_a(d4);
  }
  
  @SideOnly(Side.CLIENT)
  public boolean func_70112_a(double paramDouble) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (paramDouble < 11000.0D);
  }
  
  @Nullable
  public UUID b() {
    String str = (String)this.field_70180_af.func_187225_a(a);
    try {
      if ("".equals(str))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return UUID.fromString(str);
  }
  
  public boolean func_70097_a(DamageSource paramDamageSource, float paramFloat) {
    try {
      if (paramDamageSource != DamageSource.field_76380_i)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return super.func_70097_a(paramDamageSource, paramFloat);
  }
  
  @Nullable
  public String a() {
    String str = (String)this.field_70180_af.func_187225_a(b);
    try {
      if ("".equals(str))
        return null; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str;
  }
  
  public boolean func_70104_M() {
    return false;
  }
  
  public boolean func_70067_L() {
    return false;
  }
  
  public void func_70645_a(DamageSource paramDamageSource) {
    super.func_70645_a(paramDamageSource);
  }
  
  public AnimationFactory getFactory() {
    return this.g;
  }
  
  public void registerControllers(AnimationData paramAnimationData) {}
  
  public Iterable<ItemStack> func_184193_aE() {
    return new ArrayList<>();
  }
  
  public ItemStack func_184582_a(EntityEquipmentSlot paramEntityEquipmentSlot) {
    return ItemStack.field_190927_a;
  }
  
  public void func_184201_a(EntityEquipmentSlot paramEntityEquipmentSlot, ItemStack paramItemStack) {}
  
  public EnumHandSide func_184591_cq() {
    return EnumHandSide.LEFT;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */