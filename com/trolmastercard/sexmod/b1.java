package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.UUID;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class b1 implements IMessage {
  boolean b = false;
  
  ItemStack[] d;
  
  UUID a;
  
  UUID c;
  
  public b1() {}
  
  public b1(UUID paramUUID1, UUID paramUUID2, ItemStack[] paramArrayOfItemStack) {
    this.a = paramUUID1;
    this.d = paramArrayOfItemStack;
    this.c = paramUUID2;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    this.c = UUID.fromString(ByteBufUtils.readUTF8String(paramByteBuf));
    int i = paramByteBuf.readInt();
    this.d = new ItemStack[i];
    byte b = 0;
    try {
      while (b < i) {
        this.d[b] = ByteBufUtils.readItemStack(paramByteBuf);
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    ByteBufUtils.writeUTF8String(paramByteBuf, this.a.toString());
    ByteBufUtils.writeUTF8String(paramByteBuf, this.c.toString());
    paramByteBuf.writeInt(this.d.length);
    for (ItemStack itemStack : this.d)
      ByteBufUtils.writeItemStack(paramByteBuf, itemStack); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<b1, IMessage> {
    public IMessage a(b1 param1b1, MessageContext param1MessageContext) {
      try {
        if (param1b1.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    ArrayList<em> arrayList = em.g(param1b1.a);
                    for (em em : arrayList) {
                      try {
                        if (em.field_70170_p.field_72995_K)
                          continue; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      EntityPlayer entityPlayer = em.field_70170_p.func_152378_a(param1b1.c);
                      try {
                        if (entityPlayer == null)
                          return; 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      InventoryPlayer inventoryPlayer = entityPlayer.field_71071_by;
                      byte b = 0;
                      try {
                        while (b < 36) {
                          inventoryPlayer.func_70299_a(b, param1b1.d[b]);
                          b++;
                        } 
                      } catch (RuntimeException runtimeException) {
                        throw a(null);
                      } 
                      if (em instanceof eb) {
                        e2 e2 = (e2)em;
                        e2.Q.setStackInSlot(0, param1b1.d[36]);
                        e2.Q.setStackInSlot(1, param1b1.d[37]);
                        e2.Q.setStackInSlot(2, param1b1.d[38]);
                        e2.Q.setStackInSlot(3, param1b1.d[39]);
                        e2.Q.setStackInSlot(4, param1b1.d[40]);
                        e2.Q.setStackInSlot(5, param1b1.d[41]);
                        e2.Q.setStackInSlot(6, param1b1.d[42]);
                      } else if (em instanceof e2) {
                        e2 e2 = (e2)em;
                        e2.Q.setStackInSlot(0, param1b1.d[36]);
                        e2.Q.setStackInSlot(1, param1b1.d[37]);
                        e2.Q.setStackInSlot(2, param1b1.d[38]);
                        e2.Q.setStackInSlot(3, param1b1.d[39]);
                        e2.Q.setStackInSlot(4, param1b1.d[40]);
                        e2.Q.setStackInSlot(5, param1b1.d[41]);
                      } 
                      if (em instanceof fo) {
                        fo fo = (fo)em;
                        byte b2 = 0;
                        try {
                          while (b2 < 27) {
                            fo.L.setStackInSlot(b2, param1b1.d[b2 + 36]);
                            b2++;
                          } 
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        } 
                      } 
                    } 
                  });
              return null;
            } 
            System.out.println("received an invalid message @UploadInventoryToServer :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @UploadInventoryToServer :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */