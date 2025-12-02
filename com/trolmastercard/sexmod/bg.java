package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class bg implements IMessage {
  boolean a = false;
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {}
  
  public static class a implements IMessageHandler<bg, IMessage> {
    public IMessage a(bg param1bg, MessageContext param1MessageContext) {
      try {
        if (param1bg.a)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
                    Vec3d vec3d = entityPlayerMP.func_174791_d().func_72441_c(-Math.sin(((EntityPlayer)entityPlayerMP).field_70759_as * 0.017453292519943295D) * 2.0D, 0.0D, Math.cos(((EntityPlayer)entityPlayerMP).field_70759_as * 0.017453292519943295D) * 2.0D);
                    ev ev = new ev(((EntityPlayer)entityPlayerMP).field_70170_p, entityPlayerMP.func_184614_ca());
                    ev.e(entityPlayerMP.getPersistentID());
                    ev.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, ((EntityPlayer)entityPlayerMP).field_70759_as + 180.0F, ((EntityPlayer)entityPlayerMP).field_70125_A);
                    ev.c(ev.func_174791_d());
                    ev.b(((EntityPlayer)entityPlayerMP).field_70759_as + 180.0F);
                    ev.func_189654_d(true);
                    ev.field_70145_X = true;
                    ((EntityPlayer)entityPlayerMP).field_70170_p.func_72838_d((Entity)ev);
                    BlockPos blockPos = ev.func_180425_c().func_177982_a(0, -1, 0);
                    try {
                      if (ev.field_70170_p.func_180495_p(blockPos).func_177230_c().equals(Blocks.field_150354_m)) {
                        ev.b(fp.SUMMON_SAND);
                      } else {
                        try {
                        
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                        ev.b(ev.f() ? fp.SUMMON : fp.SUMMON_NORMAL);
                      } 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @SummonAllie :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SummonAllie :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */