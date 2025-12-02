package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ct implements IMessage {
  boolean c = false;
  
  Vec3d b;
  
  UUID a;
  
  public ct(Vec3d paramVec3d, UUID paramUUID) {
    this.b = paramVec3d;
    this.a = paramUUID;
  }
  
  public ct() {}
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeDouble(this.b.field_72450_a);
    paramByteBuf.writeDouble(this.b.field_72448_b);
    paramByteBuf.writeDouble(this.b.field_72449_c);
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
  }
  
  public static class a implements IMessageHandler<ct, IMessage> {
    public IMessage a(ct param1ct, MessageContext param1MessageContext) {
      try {
        if (param1ct.c)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    em em = em.a(param1ct.a);
                    try {
                      if (!(em instanceof f_))
                        return; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    f_ f_ = (f_)em;
                    try {
                      if ((param1MessageContext.getServerHandler()).field_147369_b.equals(f_.ab()))
                        f_.d(param1ct.b); 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @UpdateVelocity :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @UpdateVelocity :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ct.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */