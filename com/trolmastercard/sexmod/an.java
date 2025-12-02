package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class an {
  public static final float a = 9.81F;
  
  public static final float g = 0.05F;
  
  public static final float b = 0.05F;
  
  public static final float c = 0.03F;
  
  World h;
  
  Vec3d d;
  
  Vec3d f;
  
  Vec3d e;
  
  public an(World paramWorld, Vec3d paramVec3d1, Vec3d paramVec3d2) {
    this.h = paramWorld;
    this.f = paramVec3d1;
    this.d = paramVec3d1;
    this.e = paramVec3d2;
  }
  
  public void a() {
    try {
      if (Vec3d.field_186680_a.equals(this.e)) {
        this.d = this.f;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.e = new Vec3d(this.e.field_72450_a * 0.949999988079071D, (this.e.field_72448_b - 0.4905000329017639D) * 0.949999988079071D, this.e.field_72449_c * 0.949999988079071D);
    this.d = this.f;
    this.f = new Vec3d(this.f.field_72450_a + this.e.field_72450_a * 0.05000000074505806D, this.f.field_72448_b + this.e.field_72448_b * 0.05000000074505806D, this.f.field_72449_c + this.e.field_72449_c * 0.05000000074505806D);
    BlockPos blockPos1 = new BlockPos(this.d);
    BlockPos blockPos2 = null;
    for (BlockPos blockPos : a(new BlockPos(this.d), new BlockPos(this.f))) {
      if (this.h.func_180495_p(blockPos).func_177230_c() == Blocks.field_150350_a) {
        blockPos1 = blockPos;
        continue;
      } 
      blockPos2 = blockPos;
    } 
    try {
      if (blockPos2 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = blockPos2.func_177958_n();
    int j = blockPos1.func_177958_n();
    if (i - j != 0) {
      double d1 = Math.max(i, j);
      double d2 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72450_a - this.f.field_72450_a);
      double d3 = this.f.field_72448_b - d2 * this.f.field_72450_a;
      double d4 = d2 * d1 + d3;
      double d5 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72450_a - this.f.field_72450_a);
      double d6 = this.f.field_72449_c - d5 * this.f.field_72450_a;
      double d7 = d5 * d1 + d6;
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      this.f = new Vec3d(d1 + (0.03F * ((i > j) ? -1 : true)), d4, d7);
      this.e = new Vec3d(0.0D, 0.0D, 0.0D);
      return;
    } 
    int k = blockPos2.func_177956_o();
    int m = blockPos1.func_177956_o();
    if (k - m != 0) {
      double d1 = Math.max(k, m);
      double d2 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72448_b - this.f.field_72448_b);
      double d3 = this.f.field_72450_a - d2 * this.f.field_72448_b;
      double d4 = d2 * d1 + d3;
      double d5 = (this.d.field_72449_c - this.f.field_72449_c) / (this.d.field_72448_b - this.f.field_72448_b);
      double d6 = this.f.field_72449_c - d5 * this.f.field_72448_b;
      double d7 = d5 * d1 + d6;
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      this.f = new Vec3d(d4, d1 + (0.03F * ((k > m) ? -1 : true)), d7);
      this.e = new Vec3d(0.0D, 0.0D, 0.0D);
      return;
    } 
    int n = blockPos2.func_177952_p();
    int i1 = blockPos1.func_177952_p();
    if (n - i1 != 0) {
      double d1 = Math.max(n, i1);
      double d2 = (this.d.field_72448_b - this.f.field_72448_b) / (this.d.field_72449_c - this.f.field_72449_c);
      double d3 = this.f.field_72448_b - d2 * this.f.field_72449_c;
      double d4 = d2 * d1 + d3;
      double d5 = (this.d.field_72450_a - this.f.field_72450_a) / (this.d.field_72449_c - this.f.field_72449_c);
      double d6 = this.f.field_72450_a - d5 * this.f.field_72449_c;
      double d7 = d5 * d1 + d6;
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      this.f = new Vec3d(d7, d4, d1 + (0.03F * ((n > i1) ? -1 : true)));
      this.e = new Vec3d(0.0D, 0.0D, 0.0D);
      return;
    } 
  }
  
  static List<BlockPos> a(BlockPos paramBlockPos1, BlockPos paramBlockPos2) {
    ArrayList<BlockPos> arrayList = new ArrayList();
    arrayList.add(paramBlockPos1);
    int i = paramBlockPos1.func_177958_n();
    int j = paramBlockPos1.func_177956_o();
    int k = paramBlockPos1.func_177952_p();
    int m = paramBlockPos2.func_177958_n();
    int n = paramBlockPos2.func_177956_o();
    int i1 = paramBlockPos2.func_177952_p();
    int i2 = Math.abs(m - i);
    int i3 = Math.abs(n - j);
    int i4 = Math.abs(i1 - k);
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    byte b1 = (i < m) ? 1 : -1;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    byte b2 = (j < n) ? 1 : -1;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    byte b3 = (k < i1) ? 1 : -1;
    int i5 = Math.max(i2, Math.max(i3, i4));
    int i6 = i;
    int i7 = j;
    int i8 = k;
    int i9 = i5 / 2;
    int i10 = i5 / 2;
    int i11 = i5 / 2;
    for (byte b4 = 0; b4 < i5; b4++) {
      arrayList.add(new BlockPos(i6, i7, i8));
      i9 -= i2;
      i10 -= i3;
      i11 -= i4;
      if (i9 < 0) {
        i6 += b1;
        i9 += i5;
      } else if (i10 < 0) {
        i7 += b2;
        i10 += i5;
      } else if (i11 < 0) {
        i8 += b3;
        i11 += i5;
      } 
    } 
    arrayList.add(paramBlockPos2);
    return arrayList;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */