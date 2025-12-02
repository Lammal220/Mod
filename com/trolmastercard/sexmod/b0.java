package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.management.PlayerList;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class b0 implements IMessage {
  boolean a;
  
  UUID c;
  
  UUID b;
  
  public b0() {
    this.a = false;
  }
  
  public b0(UUID paramUUID1, UUID paramUUID2) {
    this.c = paramUUID1;
    this.b = paramUUID2;
    this.a = true;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.b = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.b.toString());
  }
  
  public static class a implements IMessageHandler<b0, IMessage> {
    public IMessage a(b0 param1b0, MessageContext param1MessageContext) {
      try {
        if (param1b0.a)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<em> arrayList = em.g(param1b0.c);
                    for (em em : arrayList) {
                      PlayerList playerList = FMLCommonHandler.instance().getMinecraftServerInstance().func_184103_al();
                      try {
                        playerList.func_177451_a(param1b0.b).func_70005_c_();
                      } catch (NullPointerException nullPointerException) {
                        System.out.println("couldn't find player with UUID: " + param1b0.b);
                        System.out.println("could only find players with thsese UUID's:");
                        for (EntityPlayerMP entityPlayerMP : playerList.func_181057_v())
                          System.out.println(entityPlayerMP.func_70005_c_() + " " + entityPlayerMP.func_110124_au()); 
                        continue;
                      } 
                      try {
                        if (em instanceof ex)
                          ((ex)em).af = true; 
                      } catch (NullPointerException nullPointerException) {
                        throw a(null);
                      } 
                      em.e(param1b0.b);
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @SetPlayerForGirl :(");
            return null;
          } catch (NullPointerException nullPointerException) {
            throw a(null);
          }  
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @SetPlayerForGirl :(");
      return null;
    }
    
    private static NullPointerException a(NullPointerException param1NullPointerException) {
      return param1NullPointerException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */