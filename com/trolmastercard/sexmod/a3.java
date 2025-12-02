package com.trolmastercard.sexmod;

import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class a3 extends DamageSource {
  f_ a;
  
  Vec3d b;
  
  public a3(f_ paramf_) {
    super("galath");
    this.a = paramf_;
    this.b = paramf_.func_174791_d();
  }
  
  public ITextComponent func_151519_b(EntityLivingBase paramEntityLivingBase) {
    return (ITextComponent)new TextComponentString(paramEntityLivingBase.func_70005_c_() + " got his cum drained by a Succubus");
  }
  
  public boolean func_76363_c() {
    return true;
  }
  
  public boolean func_76357_e() {
    return true;
  }
  
  @Nullable
  public Entity func_76364_f() {
    return (Entity)this.a;
  }
  
  @Nullable
  public Entity func_76346_g() {
    return (Entity)this.a;
  }
  
  @Nullable
  public Vec3d func_188404_v() {
    return this.b;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */