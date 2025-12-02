package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class bo implements IMessage {
  boolean c;
  
  UUID a;
  
  UUID b;
  
  public bo() {}
  
  public bo(UUID paramUUID1, UUID paramUUID2) {
    this.a = paramUUID1;
    this.b = paramUUID2;
    this.c = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
  }
  
  public static class a implements IMessageHandler<bo, IMessage> {
    public IMessage a(bo param1bo, MessageContext param1MessageContext) {
      try {
        if (param1bo.c)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    for (em em : em.ad()) {
                      try {
                        if (!em.field_70170_p.field_72995_K)
                          try {
                            if (em.f().equals(param1bo.a))
                              ((EntityPlayerMP)em.field_70170_p.func_152378_a(param1bo.b)).openGui(Main.instance, 0, em.field_70170_p, em.func_180425_c().func_177958_n(), em.func_180425_c().func_177956_o(), em.func_180425_c().func_177952_p()); 
                          } catch (RuntimeException runtimeException) {
                            throw a(null);
                          }  
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                    } 
                  });
              return null;
            } 
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
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


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */