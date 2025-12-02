package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class cd implements IMessage {
  boolean a = false;
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {}
  
  public static class a implements IMessageHandler<cd, IMessage> {
    public IMessage a(cd param1cd, MessageContext param1MessageContext) {
      try {
        if (param1cd.a)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    em em = em.a((param1MessageContext.getServerHandler()).field_147369_b.getPersistentID(), Boolean.valueOf(true));
                    try {
                      if (em instanceof f_)
                        ((f_)em).w(); 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid Message @GalathBackOffRape :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid Message @GalathBackOffRape :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */