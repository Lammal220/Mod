package com.trolmastercard.sexmod;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class b4 extends WorldGenerator implements d7 {
  public String c;
  
  public b4(String paramString) {
    this.c = paramString;
  }
  
  public void a(World paramWorld, BlockPos paramBlockPos) {
    MinecraftServer minecraftServer = paramWorld.func_73046_m();
    TemplateManager templateManager = b.func_184163_y();
    ResourceLocation resourceLocation = new ResourceLocation("sexmod", this.c);
    Template template = templateManager.func_189942_b(minecraftServer, resourceLocation);
    if (template != null) {
      IBlockState iBlockState = paramWorld.func_180495_p(paramBlockPos);
      paramWorld.func_184138_a(paramBlockPos, iBlockState, iBlockState, 3);
      template.func_186253_b(paramWorld, paramBlockPos, a);
    } 
  }
  
  public void a(World paramWorld, BlockPos paramBlockPos, Rotation paramRotation) {
    MinecraftServer minecraftServer = paramWorld.func_73046_m();
    TemplateManager templateManager = b.func_184163_y();
    ResourceLocation resourceLocation = new ResourceLocation("sexmod", this.c);
    Template template = templateManager.func_189942_b(minecraftServer, resourceLocation);
    if (template != null) {
      IBlockState iBlockState = paramWorld.func_180495_p(paramBlockPos);
      paramWorld.func_184138_a(paramBlockPos, iBlockState, iBlockState, 2);
      template.func_186253_b(paramWorld, paramBlockPos, a.func_186220_a(paramRotation));
    } 
  }
  
  public boolean func_180709_b(World paramWorld, Random paramRandom, BlockPos paramBlockPos) {
    a(paramWorld, paramBlockPos);
    return true;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */