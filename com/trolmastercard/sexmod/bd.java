package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class bd implements IMessage {
  boolean c = false;
  
  EntityPlayer b;
  
  HashMap<fy, String> a = new HashMap<>();
  
  public bd() {}
  
  public bd(EntityPlayer paramEntityPlayer) {
    this.b = paramEntityPlayer;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    int i = paramByteBuf.readInt();
    byte b = 0;
    try {
      while (b < i) {
        this.a.put(fy.valueOf(ByteBufUtils.readUTF8String(paramByteBuf)), ByteBufUtils.readUTF8String(paramByteBuf));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.c = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    for (fy fy : fy.values()) {
      try {
        if (fy.hasSpecifics) {
          String str = this.b.getEntityData().func_74779_i("sexmod:GirlSpecific" + fy);
          try {
            if (!"".equals(str))
              this.a.put(fy, str); 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    paramByteBuf.writeInt(this.a.size());
    for (Map.Entry<fy, String> entry : this.a.entrySet()) {
      ByteBufUtils.writeUTF8String(paramByteBuf, ((fy)entry.getKey()).toString());
      ByteBufUtils.writeUTF8String(paramByteBuf, (String)entry.getValue());
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<bd, IMessage> {
    public IMessage a(bd param1bd, MessageContext param1MessageContext) {
      try {
        if (param1bd.c)
          try {
            if (param1MessageContext.side == Side.CLIENT) {
              a(param1bd.a);
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
    
    @SideOnly(Side.CLIENT)
    public void a(HashMap<fy, String> param1HashMap) {
      Minecraft minecraft = Minecraft.func_71410_x();
      minecraft.func_152344_a(() -> param1Minecraft.func_147108_a(new b5(param1HashMap)));
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */