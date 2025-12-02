package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class bv implements IMessage {
  Vec3d a;
  
  boolean c;
  
  boolean b = false;
  
  public bv() {}
  
  public bv(Vec3d paramVec3d, boolean paramBoolean) {
    this.a = paramVec3d;
    this.c = paramBoolean;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.c = paramByteBuf.readBoolean();
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeDouble(this.a.field_72450_a);
    paramByteBuf.writeDouble(this.a.field_72448_b);
    paramByteBuf.writeDouble(this.a.field_72449_c);
    paramByteBuf.writeBoolean(this.c);
  }
  
  public static class a implements IMessageHandler<bv, IMessage> {
    public IMessage a(bv param1bv, MessageContext param1MessageContext) {
      try {
        if (param1bv.b)
          try {
            if (param1MessageContext.side.equals(Side.CLIENT)) {
              try {
                if (param1bv.c) {
                  c4.a(param1bv.a);
                } else {
                  c4.c(param1bv.a);
                } 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
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


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */