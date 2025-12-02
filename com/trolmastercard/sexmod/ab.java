package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ab implements IMessage {
  boolean c = false;
  
  UUID a;
  
  UUID b;
  
  public ab() {}
  
  public ab(UUID paramUUID1, UUID paramUUID2) {
    this.a = paramUUID1;
    this.b = paramUUID2;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    try {
      this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    } catch (Exception exception) {
      this.a = null;
    } 
    try {
      this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    } catch (Exception exception) {
      this.b = null;
    } 
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      ByteBufUtils.writeUTF8String(paramByteBuf, (this.a == null) ? "trol was here" : this.a.toString());
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ByteBufUtils.writeUTF8String(paramByteBuf, (this.b == null) ? "trol was here" : this.b.toString());
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<ab, IMessage> {
    public IMessage a(ab param1ab, MessageContext param1MessageContext) {
      try {
        if (param1ab.c)
          try {
            if (param1MessageContext.side.equals(Side.CLIENT)) {
              em em = em.b(param1ab.a);
              try {
                if (!(em instanceof f_)) {
                  System.out.println("doesnt exit");
                  return null;
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              cc.a(param1ab.b, (f_)em);
              return null;
            } 
            System.out.println("received an invalid message @SpawnEnergyBallParticles :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SpawnEnergyBallParticles :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ab.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */