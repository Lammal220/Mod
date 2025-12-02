package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class a6 implements IMessage {
  boolean b;
  
  UUID c;
  
  Vec3d a;
  
  public a6() {}
  
  public a6(UUID paramUUID, Vec3d paramVec3d) {
    this.c = paramUUID;
    this.a = paramVec3d;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.a = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
    paramByteBuf.writeDouble(this.a.field_72450_a);
    paramByteBuf.writeDouble(this.a.field_72448_b);
    paramByteBuf.writeDouble(this.a.field_72449_c);
  }
  
  public static class a implements IMessageHandler<a6, IMessage> {
    public IMessage a(a6 param1a6, MessageContext param1MessageContext) {
      try {
        if (!param1a6.b) {
          System.out.println("received an invalid message @SetNewHome :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            ArrayList<em> arrayList = em.g(param1a6.c);
            try {
              if (arrayList.isEmpty())
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            for (em em : arrayList)
              em.l = new Vec3d(param1a6.a.field_72450_a, Math.floor(param1a6.a.field_72448_b), param1a6.a.field_72449_c); 
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */