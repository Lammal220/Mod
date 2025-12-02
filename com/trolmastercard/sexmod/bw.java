package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class bw implements IMessage {
  boolean b;
  
  Vec3d a;
  
  public bw() {}
  
  public bw(Vec3d paramVec3d) {
    this.a = paramVec3d;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    this.a = new Vec3d(paramByteBuf.readDouble(), paramByteBuf.readDouble(), paramByteBuf.readDouble());
    this.b = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    paramByteBuf.writeDouble(this.a.field_72450_a);
    paramByteBuf.writeDouble(this.a.field_72448_b);
    paramByteBuf.writeDouble(this.a.field_72449_c);
  }
  
  public static class a implements IMessageHandler<bw, IMessage> {
    public IMessage a(bw param1bw, MessageContext param1MessageContext) {
      try {
        if (param1bw.b)
          try {
            if (param1MessageContext.side == Side.SERVER) {
              FMLCommonHandler.instance().getMinecraftServerInstance().func_152344_a(() -> {
                    World world = (param1MessageContext.getServerHandler()).field_147369_b.field_70170_p;
                    EntityItem entityItem1 = new EntityItem(world, param1bw.a.field_72450_a, param1bw.a.field_72448_b, param1bw.a.field_72449_c, new ItemStack(Items.field_151045_i, r.f.nextInt(2) + 1));
                    EntityItem entityItem2 = new EntityItem(world, param1bw.a.field_72450_a, param1bw.a.field_72448_b, param1bw.a.field_72449_c, new ItemStack(Items.field_151166_bC, r.f.nextInt(2) + 1));
                    EntityItem entityItem3 = new EntityItem(world, param1bw.a.field_72450_a, param1bw.a.field_72448_b, param1bw.a.field_72449_c, new ItemStack(Items.field_151043_k, r.f.nextInt(2) + 1));
                    world.func_72838_d((Entity)entityItem1);
                    world.func_72838_d((Entity)entityItem2);
                    world.func_72838_d((Entity)entityItem3);
                  });
              return null;
            } 
            System.out.println("received an invalid message @MakeRichWish :(");
            return null;
          } catch (RuntimeException runtimeException) {
            throw a(null);
          }  
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      System.out.println("received an invalid message @MakeRichWish :(");
      return null;
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */