package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class a1 implements IMessage {
  public static final int b = 100;
  
  boolean d;
  
  UUID a;
  
  UUID c;
  
  public a1() {
    this.d = false;
  }
  
  public a1(UUID paramUUID) {
    this.a = paramUUID;
    this.d = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.d = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<a1, IMessage> {
    public IMessage a(a1 param1a1, MessageContext param1MessageContext) {
      try {
        if (!param1a1.d) {
          System.out.println("received an invalid message @ResetController :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      if (param1MessageContext.side.isServer()) {
        em em1 = em.a(param1a1.a);
        try {
          if (em1 == null)
            return null; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        UUID uUID = (param1MessageContext.getServerHandler()).field_147369_b.getPersistentID();
        (em1.y()).ticksPlaying = new int[] { 0, 0 };
        for (EntityPlayerMP entityPlayerMP : FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_181057_v()) {
          try {
            if (!uUID.equals(entityPlayerMP.getPersistentID()))
              try {
                if (entityPlayerMP.func_70032_d((Entity)em1) < 100.0F)
                  ge.b.sendTo(new a1(param1a1.a), entityPlayerMP); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              }  
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
        return null;
      } 
      em em = em.b(param1a1.a);
      try {
        if (em != null)
          em.ag(); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */