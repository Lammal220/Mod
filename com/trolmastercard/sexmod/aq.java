package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class aq implements IMessage {
  boolean d = false;
  
  float a;
  
  float b;
  
  int c;
  
  public aq() {}
  
  public aq(float paramFloat1, float paramFloat2, int paramInt) {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramInt;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = paramByteBuf.readFloat();
    this.b = paramByteBuf.readFloat();
    this.c = paramByteBuf.readInt();
    this.d = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeFloat(this.a);
    paramByteBuf.writeFloat(this.b);
    paramByteBuf.writeInt(this.c);
  }
  
  public static class a implements IMessageHandler<aq, IMessage> {
    public IMessage a(aq param1aq, MessageContext param1MessageContext) {
      try {
        if (param1aq.d)
          try {
            if (param1MessageContext.side == Side.CLIENT) {
              System.out.println(Thread.currentThread().getName());
              Minecraft minecraft = Minecraft.func_71410_x();
              minecraft.func_152344_a(() -> {
                    param1Minecraft.field_71474_y.field_74320_O = param1aq.c;
                    EntityPlayerSP entityPlayerSP = param1Minecraft.field_71439_g;
                    entityPlayerSP.field_70177_z = param1aq.b;
                    entityPlayerSP.field_70126_B = param1aq.b;
                    entityPlayerSP.field_70758_at = param1aq.b;
                    entityPlayerSP.field_70759_as = param1aq.b;
                    entityPlayerSP.field_70761_aq = param1aq.b;
                    entityPlayerSP.field_70125_A = param1aq.a;
                    entityPlayerSP.field_70127_C = param1aq.a;
                  });
              return null;
            } 
            System.out.println("received an invalid message @SetPlayerCam :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SetPlayerCam :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\aq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */