package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ac implements IMessage {
  boolean a;
  
  UUID b;
  
  public ac() {
    this.a = false;
  }
  
  public ac(UUID paramUUID) {
    this.b = paramUUID;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
  }
  
  public static class a implements IMessageHandler<ac, IMessage> {
    public IMessage a(ac param1ac, MessageContext param1MessageContext) {
      try {
        if (!param1ac.a) {
          System.out.println("received an invalid message @SendGirlToSex :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(param1ac.b);
            for (em em : arrayList) {
              try {
                if (em.field_70170_p.field_72995_K)
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              try {
                if (em instanceof fg)
                  ((fg)em).a(); 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
            } 
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ac.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */