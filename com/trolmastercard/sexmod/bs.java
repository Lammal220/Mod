package com.trolmastercard.sexmod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class bs {
  public static final int d = 30;
  
  BlockPos a;
  
  a c;
  
  HashSet<BlockPos> b;
  
  List<ff> f = new ArrayList<>();
  
  EnumFacing e = EnumFacing.NORTH;
  
  public bs(BlockPos paramBlockPos, a parama, HashSet<BlockPos> paramHashSet) {
    this.a = paramBlockPos;
    this.c = parama;
    this.b = paramHashSet;
  }
  
  public bs(BlockPos paramBlockPos, a parama, HashSet<BlockPos> paramHashSet, EnumFacing paramEnumFacing) {
    this.a = paramBlockPos;
    this.c = parama;
    this.b = paramHashSet;
    this.e = paramEnumFacing;
  }
  
  public EnumFacing f() {
    return this.e;
  }
  
  public BlockPos b() {
    return this.a;
  }
  
  public a d() {
    return this.c;
  }
  
  public HashSet<BlockPos> g() {
    return this.b;
  }
  
  public void b(BlockPos paramBlockPos) {
    this.b.add(paramBlockPos);
  }
  
  public void a(HashSet<BlockPos> paramHashSet) {
    this.b.addAll(paramHashSet);
  }
  
  public void a(BlockPos paramBlockPos) {
    this.b.remove(paramBlockPos);
  }
  
  public void b(HashSet<BlockPos> paramHashSet) {
    try {
      if (!paramHashSet.isEmpty())
        this.b.removeAll(paramHashSet); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public boolean c(BlockPos paramBlockPos) {
    return this.b.contains(paramBlockPos);
  }
  
  public boolean a(ff paramff) {
    try {
      if (this.c.a <= this.f.size())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.f.add(paramff);
    return true;
  }
  
  public List<ff> c() {
    return this.f;
  }
  
  public void a() {
    for (ff ff : this.f) {
      try {
        if (ff.ae() == null) {
          ff.func_189654_d(false);
          ff.field_70145_X = false;
          ff.b(fp.NULL);
          ff.func_184212_Q().func_187227_b(em.G, Boolean.valueOf(false));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.f.clear();
  }
  
  public void c(ff paramff) {
    this.f.remove(paramff);
  }
  
  public boolean e() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return (this.c.a <= this.f.size());
  }
  
  public boolean b(ff paramff) {
    return this.f.contains(paramff);
  }
  
  public static HashSet<BlockPos> a(World paramWorld, BlockPos paramBlockPos, UUID paramUUID) {
    BlockPos blockPos1;
    for (blockPos1 = paramBlockPos; !c(paramWorld, blockPos1); blockPos1 = paramBlockPos.func_177977_b());
    BlockPos blockPos2;
    for (blockPos2 = paramBlockPos; !b(paramWorld, blockPos2); blockPos2 = blockPos2.func_177984_a());
    HashSet<BlockPos> hashSet1 = new HashSet();
    int i = blockPos2.func_177956_o() - blockPos1.func_177956_o();
    byte b = 0;
    try {
      while (b <= i) {
        hashSet1.add(blockPos1.func_177982_a(0, b, 0));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    HashSet<BlockPos> hashSet2 = a(paramWorld, blockPos1);
    HashSet<BlockPos> hashSet3 = new HashSet();
    for (BlockPos blockPos : hashSet2) {
      try {
        if (blockPos.func_177958_n() == blockPos1.func_177958_n())
          try {
            if (blockPos.func_177952_p() == blockPos1.func_177952_p())
              hashSet3.add(blockPos); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (BlockPos blockPos : hashSet3)
      hashSet2.remove(blockPos); 
    hashSet1.addAll(hashSet2);
    HashSet<BlockPos> hashSet4 = new HashSet();
    for (BlockPos blockPos : hashSet1) {
      for (bs bs2 : ax.p(paramUUID)) {
        HashSet<BlockPos> hashSet = bs2.g();
        try {
          if (hashSet.contains(blockPos)) {
            hashSet4.add(blockPos);
            break;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } 
    } 
    hashSet1.removeAll(hashSet4);
    bs bs1 = new bs(blockPos1, a.FALL_TREE, hashSet1);
    ax.b(paramUUID, bs1);
    return hashSet1;
  }
  
  static boolean b(World paramWorld, BlockPos paramBlockPos) {
    Block block = paramWorld.func_180495_p(paramBlockPos.func_177984_a()).func_177230_c();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !(block instanceof net.minecraft.block.BlockLog);
  }
  
  static boolean c(World paramWorld, BlockPos paramBlockPos) {
    IBlockState iBlockState = paramWorld.func_180495_p(paramBlockPos.func_177977_b());
    try {
      if (!(iBlockState instanceof net.minecraft.block.BlockLog))
        try {
          if (iBlockState.func_185904_a() != Material.field_151579_a);
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return false;
  }
  
  static HashSet<BlockPos> a(World paramWorld, BlockPos paramBlockPos) {
    return a(paramWorld, paramBlockPos, new HashSet<>());
  }
  
  static HashSet<BlockPos> a(World paramWorld, BlockPos paramBlockPos, HashSet<BlockPos> paramHashSet) {
    try {
      if (paramHashSet.contains(paramBlockPos))
        return new HashSet<>(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      paramHashSet.add(paramBlockPos);
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 0, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 0, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 0, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 0, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 0, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 0, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 0, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 0, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 0, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 0, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 0, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 0, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 0, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 0, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 0, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 0, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 1, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 1, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 1, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 1, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 1, 0)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 1, 0), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 1, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 1, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(0, 1, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(0, 1, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 1, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 1, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 1, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 1, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(-1, 1, 1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(-1, 1, 1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramWorld.func_180495_p(paramBlockPos.func_177982_a(1, 1, -1)).func_177230_c() instanceof net.minecraft.block.BlockLog)
        paramHashSet.addAll(a(paramWorld, paramBlockPos.func_177982_a(1, 1, -1), paramHashSet)); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramHashSet;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public enum a {
    FALL_TREE(1),
    MINE(3);
    
    int a;
    
    a(int param1Int1) {
      this.a = param1Int1;
    }
    
    int a() {
      return this.a;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */