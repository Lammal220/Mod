package com.trolmastercard.sexmod;

import com.google.common.base.Optional;
import io.netty.buffer.ByteBuf;
import java.lang.reflect.Constructor;
import java.util.ConcurrentModificationException;
import java.util.UUID;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class b_ implements IMessage {
  boolean b = false;
  
  fy a;
  
  public b_() {}
  
  public b_(fy paramfy) {
    this.a = paramfy;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    String str = ByteBufUtils.readUTF8String(paramByteBuf);
    try {
      if ("player".equals(str)) {
        this.a = null;
      } else {
        this.a = fy.valueOf(str);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    try {
      if (this.a == null) {
        ByteBufUtils.writeUTF8String(paramByteBuf, "player");
      } else {
        ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<b_, IMessage> {
    public IMessage a(b_ param1b_, MessageContext param1MessageContext) {
      try {
        if (param1b_.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ei ei2;
                    EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
                    World world = ((EntityPlayer)entityPlayerMP).field_70170_p;
                    UUID uUID = (param1MessageContext.getServerHandler()).field_147369_b.getPersistentID();
                    ei ei1 = ei.d(uUID);
                    if (ei1 != null) {
                      try {
                        for (em em : em.ad()) {
                          try {
                            if (!em.field_70170_p.field_72995_K)
                              try {
                                if (em.f().equals(ei1.f()))
                                  world.func_72900_e((Entity)em); 
                              } catch (ConcurrentModificationException concurrentModificationException) {
                                throw a(null);
                              }  
                          } catch (ConcurrentModificationException concurrentModificationException) {
                            throw a(null);
                          } 
                        } 
                      } catch (ConcurrentModificationException concurrentModificationException) {}
                      ei1.y();
                      ei.al.remove(uUID);
                      em.ad().remove(ei1);
                      ei1.a(Optional.absent());
                    } 
                    fy fy = param1b_.a;
                    try {
                      if (fy == null)
                        return; 
                    } catch (ConcurrentModificationException concurrentModificationException) {
                      throw a(null);
                    } 
                    try {
                      Constructor<? extends ei> constructor = fy.playerClass.getConstructor(new Class[] { World.class, UUID.class });
                      ei2 = constructor.newInstance(new Object[] { world, (param1MessageContext.getServerHandler()).field_147369_b.getPersistentID() });
                    } catch (Exception exception) {
                      exception.printStackTrace();
                      return;
                    } 
                    ei2.func_189654_d(true);
                    ei2.field_70145_X = true;
                    ei2.field_70159_w = 0.0D;
                    ei2.field_70181_x = 0.0D;
                    ei2.field_70179_y = 0.0D;
                    ei2.func_70107_b(((EntityPlayer)entityPlayerMP).field_70165_t, ((EntityPlayer)entityPlayerMP).field_70163_u + 69.0D, ((EntityPlayer)entityPlayerMP).field_70161_v);
                    world.func_72838_d((Entity)ei2);
                    ei2.B();
                  });
              return null;
            } 
            System.out.println("received an invalid message @UpdatePlayerModel :(");
            return null;
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          }  
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @UpdatePlayerModel :(");
      return null;
    }
    
    private static ConcurrentModificationException a(ConcurrentModificationException param1ConcurrentModificationException) {
      return param1ConcurrentModificationException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */