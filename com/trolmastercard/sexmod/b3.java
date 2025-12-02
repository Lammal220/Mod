package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.vecmath.Vector4d;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class b3 implements IMessage {
  boolean a = false;
  
  boolean b = false;
  
  List<Vector4d> c = new ArrayList<>();
  
  public b3() {}
  
  public b3(boolean paramBoolean, List<Vector4d> paramList) {}
  
  static b3 a() {
    return new b3(false, new ArrayList<>());
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.b = paramByteBuf.readBoolean();
    int i = paramByteBuf.readInt();
    byte b = 0;
    try {
      while (b < i) {
        this.c.add(new Vector4d(paramByteBuf.readInt(), paramByteBuf.readInt(), paramByteBuf.readInt(), paramByteBuf.readInt()));
        b++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.a = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeBoolean(this.b);
    paramByteBuf.writeInt(this.c.size());
    for (Vector4d vector4d : this.c) {
      paramByteBuf.writeInt((int)vector4d.getX());
      paramByteBuf.writeInt((int)vector4d.getY());
      paramByteBuf.writeInt((int)vector4d.getZ());
      paramByteBuf.writeInt((int)vector4d.getW());
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a implements IMessageHandler<b3, IMessage> {
    public IMessage a(b3 param1b3, MessageContext param1MessageContext) {
      try {
        if (!param1b3.a) {
          System.out.println("received an invalid message @GetTribeUIValues :(");
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.isClient()) {
          j.d = param1b3.b;
          ff.aY = param1b3.c;
          return null;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
            UUID uUID = ax.a((param1MessageContext.getServerHandler()).field_147369_b.getPersistentID());
            try {
              if (uUID == null) {
                ge.b.sendTo(b3.a(), (param1MessageContext.getServerHandler()).field_147369_b);
                return;
              } 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            boolean bool = ax.c(uUID);
            EntityPlayerMP entityPlayerMP = (param1MessageContext.getServerHandler()).field_147369_b;
            HashMap<UUID, BlockPos> hashMap = ax.a(uUID, entityPlayerMP.field_70170_p);
            List<ff> list = ax.n(uUID);
            ArrayList<Vector4d> arrayList = new ArrayList();
            int i = ax.l(uUID).getWoolMeta();
            HashSet<UUID> hashSet = new HashSet();
            for (ff ff : list) {
              try {
                if (ff.field_70128_L)
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              UUID uUID1 = ff.f();
              try {
                if (hashSet.contains(uUID1))
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              if (ff.aA)
                i = EyeAndKoboldColor.safeValueOf((String)ff.func_184212_Q().func_187225_a(e4.N)).getWoolMeta(); 
              arrayList.add(new Vector4d(ff.field_70165_t, ff.field_70163_u, ff.field_70161_v, i));
              hashSet.add(uUID1);
            } 
            for (Map.Entry<UUID, BlockPos> entry : hashMap.entrySet()) {
              try {
                if (hashSet.contains(entry.getKey()))
                  continue; 
              } catch (RuntimeException runtimeException) {
                throw a(null);
              } 
              BlockPos blockPos = (BlockPos)entry.getValue();
              arrayList.add(new Vector4d(blockPos.func_177958_n(), blockPos.func_177956_o(), blockPos.func_177952_p(), i));
            } 
            ge.b.sendTo(new b3(bool, arrayList), entityPlayerMP);
          });
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */