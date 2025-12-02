package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class au implements IMessage {
  boolean a = false;
  
  BlockPos b;
  
  public au() {}
  
  public au(BlockPos paramBlockPos) {
    this.b = paramBlockPos;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = new BlockPos(paramByteBuf.readInt(), paramByteBuf.readInt(), paramByteBuf.readInt());
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeInt(this.b.func_177958_n());
    paramByteBuf.writeInt(this.b.func_177956_o());
    paramByteBuf.writeInt(this.b.func_177952_p());
  }
  
  public static class a implements IMessageHandler<au, IMessage> {
    public IMessage a(au param1au, MessageContext param1MessageContext) {
      try {
        if (param1au.a)
          try {
            if (param1MessageContext.side.equals(Side.SERVER)) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    UUID uUID = ax.a((param1MessageContext.getServerHandler()).field_147369_b.getPersistentID());
                    try {
                      if (uUID == null)
                        return; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    HashSet<BlockPos> hashSet = ax.c(uUID, param1au.b);
                    try {
                      if (hashSet.isEmpty())
                        return; 
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    } 
                    ge.b.sendTo(new h6(hashSet, false), (param1MessageContext.getServerHandler()).field_147369_b);
                  });
              return null;
            } 
            System.out.println("received an invalid Message @CancelTask :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid Message @CancelTask :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\au.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */