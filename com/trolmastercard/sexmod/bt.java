package com.trolmastercard.sexmod;

import java.util.List;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;

public class bt extends EntityAIAvoidEntity<EntityPlayer> {
  final f8 a;
  
  final float b;
  
  public bt(f8 paramf8, float paramFloat, double paramDouble1, double paramDouble2) {
    super(paramf8, EntityPlayer.class, paramFloat, paramDouble1, paramDouble2);
    this.a = paramf8;
    this.b = paramFloat;
  }
  
  boolean a() {
    try {
      if (this.a.v() != null)
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    BlockPos blockPos1 = this.a.func_180425_c();
    BlockPos blockPos2 = new BlockPos(this.b, this.b, this.b);
    List list = this.a.field_70170_p.func_72872_a(f_.class, new AxisAlignedBB(blockPos1.func_177971_a((Vec3i)blockPos2), blockPos1.func_177973_b((Vec3i)blockPos2)));
    for (f_ f_ : list) {
      try {
        if (f_.field_70170_p.field_72995_K)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (f_.field_70128_L)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (!f_.k())
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return true;
    } 
    return false;
  }
  
  public boolean func_75250_a() {
    try {
      if (a())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return super.func_75250_a();
  }
  
  public boolean func_75253_b() {
    try {
      if (a())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return super.func_75253_b();
  }
  
  public void func_75249_e() {
    this.a.func_184212_Q().func_187227_b(f8.ar, Boolean.valueOf(true));
    super.func_75249_e();
  }
  
  public void func_75251_c() {
    this.a.func_184212_Q().func_187227_b(f8.ar, Boolean.valueOf(false));
    super.func_75251_c();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */