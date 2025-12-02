package com.trolmastercard.sexmod;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class cj {
  public static float a(float paramFloat1, float paramFloat2) {
    paramFloat1 = gc.b(paramFloat1);
    paramFloat2 = gc.b(paramFloat2);
    float f1 = Math.abs(paramFloat1 - paramFloat2);
    float f2 = 360.0F - f1;
    float f3 = Math.min(f1, f2);
    try {
      if (paramFloat1 > paramFloat2)
        return -f3; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return f3;
  }
  
  public static Vec3d a(EntityLivingBase paramEntityLivingBase, float paramFloat) {
    World world = paramEntityLivingBase.field_70170_p;
    try {
      if (world instanceof gj)
        return new Vec3d(0.0D, 1.0D, 0.0D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    BlockPos blockPos = new BlockPos(Math.floor(paramEntityLivingBase.field_70165_t), Math.floor(paramEntityLivingBase.field_70163_u), Math.floor(paramEntityLivingBase.field_70161_v));
    HashMap<Object, Object> hashMap = new HashMap<>();
    int i = 0;
    for (byte b = -1; b < 2; b++) {
      for (byte b1 = -1; b1 < 2; b1++) {
        for (byte b2 = -1; b2 < 2; b2++) {
          int j = world.func_175721_c(blockPos.func_177982_a(b, b1, b2), false);
          hashMap.put(new Vec3d(b, b1, b2), Integer.valueOf(j));
          if (j > i)
            i = j; 
        } 
      } 
    } 
    Vec3d vec3d = null;
    for (Map.Entry<Object, Object> entry : hashMap.entrySet()) {
      try {
        if (((Integer)entry.getValue()).intValue() != i)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (vec3d == null) {
        vec3d = (Vec3d)entry.getKey();
        continue;
      } 
      vec3d = null;
    } 
    if (vec3d == null) {
      vec3d = new Vec3d(0.2D, 0.8D, 0.0D);
    } else {
      vec3d = new Vec3d(vec3d.field_72450_a, vec3d.field_72448_b, -vec3d.field_72449_c);
      float f = -b6.a(paramEntityLivingBase.field_70760_ar, paramEntityLivingBase.field_70761_aq, paramFloat);
      vec3d = ck.a(vec3d, f);
    } 
    return vec3d.func_72432_b();
  }
  
  public static int a(World paramWorld, int paramInt1, int paramInt2) {
    HashSet hashSet = Sets.newHashSet((Object[])new Block[] { (Block)Blocks.field_150349_c, (Block)Blocks.field_150354_m, Blocks.field_180395_cM, (Block)Blocks.field_150355_j, Blocks.field_150348_b, Blocks.field_150347_e });
    int i = paramWorld.func_72800_K();
    boolean bool = false;
    while (true) {
      try {
        if (!bool && i-- >= 0) {
          Block block = paramWorld.func_180495_p(new BlockPos(paramInt1, i, paramInt2)).func_177230_c();
          bool = hashSet.contains(block);
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      break;
    } 
    return i;
  }
  
  public static BlockPos a(World paramWorld, BlockPos paramBlockPos) {
    return new BlockPos(paramBlockPos.func_177958_n(), a(paramWorld, paramBlockPos.func_177958_n(), paramBlockPos.func_177952_p()), paramBlockPos.func_177952_p());
  }
  
  public static boolean b(World paramWorld, BlockPos paramBlockPos) {
    return a(paramWorld, paramBlockPos, null, null, null);
  }
  
  public static boolean a(World paramWorld, BlockPos paramBlockPos, Vec3d paramVec3d, EnumFacing paramEnumFacing, EntityPlayer paramEntityPlayer) {
    IBlockState iBlockState = paramWorld.func_180495_p(paramBlockPos);
    Block block = iBlockState.func_177230_c();
    try {
      if (block.isBed(iBlockState, (IBlockAccess)paramWorld, paramBlockPos, null))
        return true; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    TileEntity tileEntity = paramWorld.func_175625_s(paramBlockPos);
    if (tileEntity != null) {
      ITextComponent iTextComponent = tileEntity.func_145748_c_();
      try {
        if (iTextComponent != null)
          try {
            if (!iTextComponent.toString().contains(" bed")) {
              try {
                if (iTextComponent.toString().contains("bed "))
                  return true; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } else {
              return true;
            } 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (paramEnumFacing != null) {
        try {
          if (paramVec3d == null)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    String str = block.getPickBlock(iBlockState, new RayTraceResult(paramVec3d, paramEnumFacing), paramWorld, paramBlockPos, paramEntityPlayer).func_82833_r().toLowerCase();
    try {
      if (!str.contains(" bed"))
        try {
          return !!str.contains("bed ");
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public static void a(World paramWorld, EnumParticleTypes paramEnumParticleTypes, Vec3d paramVec3d, int paramInt, double paramDouble1, double paramDouble2) {
    for (byte b = 0; b < paramInt; b++) {
      float f = b / paramInt;
      double d1 = 6.283185307179586D * f;
      double d2 = Math.sin(d1);
      double d3 = Math.cos(d1);
      d2 *= paramDouble1;
      d3 *= paramDouble1;
      paramWorld.func_175688_a(paramEnumParticleTypes, paramVec3d.field_72450_a + d2, paramVec3d.field_72448_b, paramVec3d.field_72449_c + d3, 0.0D, r.f.nextFloat() * paramDouble2, 0.0D, new int[0]);
    } 
  }
  
  public static BlockPos a(BlockPos paramBlockPos, IBlockState paramIBlockState) {
    BlockPos blockPos;
    ImmutableMap immutableMap = paramIBlockState.func_177228_b();
    EnumFacing enumFacing = null;
    BlockBed.EnumPartType enumPartType = null;
    UnmodifiableIterator<Map.Entry> unmodifiableIterator = immutableMap.entrySet().iterator();
    while (unmodifiableIterator.hasNext()) {
      Map.Entry entry = unmodifiableIterator.next();
      if (entry.getKey() instanceof net.minecraft.block.properties.PropertyDirection) {
        enumFacing = (EnumFacing)entry.getValue();
        continue;
      } 
      if (entry.getKey() instanceof net.minecraft.block.properties.PropertyEnum)
        enumPartType = (BlockBed.EnumPartType)entry.getValue(); 
    } 
    try {
      if (enumFacing == null) {
        System.out.println("bed is fucked up - it has no facing value");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (enumPartType == null) {
        System.out.println("bed is fucked up - it has no partType value");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    unmodifiableIterator = null;
    try {
      if (enumPartType == BlockBed.EnumPartType.FOOT) {
        if (enumFacing == EnumFacing.NORTH)
          blockPos = paramBlockPos.func_177978_c(); 
        if (enumFacing == EnumFacing.EAST)
          blockPos = paramBlockPos.func_177974_f(); 
        if (enumFacing == EnumFacing.SOUTH)
          blockPos = paramBlockPos.func_177968_d(); 
        if (enumFacing == EnumFacing.WEST)
          blockPos = paramBlockPos.func_177976_e(); 
      } else {
        if (enumFacing == EnumFacing.NORTH)
          blockPos = paramBlockPos.func_177968_d(); 
        if (enumFacing == EnumFacing.EAST)
          blockPos = paramBlockPos.func_177976_e(); 
        if (enumFacing == EnumFacing.SOUTH)
          blockPos = paramBlockPos.func_177978_c(); 
        if (enumFacing == EnumFacing.WEST)
          blockPos = paramBlockPos.func_177974_f(); 
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (blockPos == null) {
        System.out.println("bed is fucked up - it appears to be positioned vertically (wtf?)");
        return null;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return blockPos;
  }
  
  public static Set<? extends EntityPlayer> a(Entity paramEntity) {
    try {
      if (paramEntity == null)
        return Collections.emptySet(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return FMLCommonHandler.instance().getMinecraftServerInstance().func_71218_a(paramEntity.field_71093_bK).func_73039_n().getTrackingPlayers(paramEntity);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */