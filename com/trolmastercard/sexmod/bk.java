package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class bk implements IMessage {
  boolean a = false;
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {}
  
  public static class a implements IMessageHandler<bk, IMessage> {
    public IMessage a(bk param1bk, MessageContext param1MessageContext) {
      try {
        if (param1bk.a)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
              UUID uUID = v.b((EntityPlayer)entityPlayerMP);
              em em = em.a(uUID);
              try {
                if (em == null)
                  return null; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              entityPlayerMP.func_184205_a((Entity)em, true);
              em.b(fp.CONTROLLED_FLIGHT);
              em.a((EntityPlayer)entityPlayerMP);
              em.field_70181_x = 0.25D;
              ((EntityPlayer)entityPlayerMP).field_70170_p.func_175726_f(em.func_180425_c()).func_76622_b((Entity)em);
              return null;
            } 
            System.out.println("received an invalid message @RequestRiding :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @RequestRiding :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */