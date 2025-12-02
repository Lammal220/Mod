package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class a8 implements IMessage {
  boolean b;
  
  String c;
  
  Vec3d e;
  
  float a;
  
  float d;
  
  public a8() {
    this.b = false;
  }
  
  public a8(String paramString, Vec3d paramVec3d) {
    this.c = paramString;
    this.e = paramVec3d;
    this.a = 0.0F;
    this.d = 0.0F;
    this.b = true;
  }
  
  public a8(String paramString, Vec3d paramVec3d, float paramFloat1, float paramFloat2) {
    this.c = paramString;
    this.e = paramVec3d;
    this.a = paramFloat1;
    this.d = paramFloat2;
    this.b = true;
  }
  
  public a8(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    this.c = paramString;
    this.e = new Vec3d(paramDouble1, paramDouble2, paramDouble3);
    this.a = paramFloat1;
    this.d = paramFloat2;
    this.b = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.c = ByteBufUtils.readUTF8String(paramByteBuf);
    this.e = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.a = paramByteBuf.readFloat();
    this.d = paramByteBuf.readFloat();
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c);
    paramByteBuf.writeDouble(this.e.field_72450_a);
    paramByteBuf.writeDouble(this.e.field_72448_b);
    paramByteBuf.writeDouble(this.e.field_72449_c);
    paramByteBuf.writeFloat(this.a);
    paramByteBuf.writeFloat(this.d);
    this.b = true;
  }
  
  public static class a implements IMessageHandler<a8, IMessage> {
    public IMessage a(a8 param1a8, MessageContext param1MessageContext) {
      try {
        if (param1a8.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    try {
                      System.out.println("teleporting player " + param1a8.c + " to " + param1a8.e);
                      EntityPlayerMP entityPlayerMP = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_177451_a(UUID.fromString(param1a8.c));
                      param1a8.a = MathHelper.func_76142_g(param1a8.a);
                      param1a8.d = MathHelper.func_76142_g(param1a8.d);
                      entityPlayerMP.func_70012_b(param1a8.e.field_72450_a, param1a8.e.field_72448_b, param1a8.e.field_72449_c, param1a8.a, param1a8.d);
                      entityPlayerMP.func_70034_d(param1a8.a);
                      entityPlayerMP.field_70159_w = 0.0D;
                      entityPlayerMP.field_70181_x = 0.0D;
                      entityPlayerMP.field_70179_y = 0.0D;
                      entityPlayerMP.field_71135_a.func_175089_a(param1a8.e.field_72450_a, param1a8.e.field_72448_b, param1a8.e.field_72449_c, param1a8.a, param1a8.d, EnumSet.noneOf(SPacketPlayerPosLook.EnumFlags.class));
                    } catch (Exception exception) {
                      System.out.println("couldn't find player with UUID: " + param1a8.c);
                      System.out.println("could only find the following players:");
                      System.out.println(FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al().func_181058_b(true));
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @TeleportPlayer :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @TeleportPlayer :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */