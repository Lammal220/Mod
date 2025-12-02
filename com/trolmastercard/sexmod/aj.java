package com.trolmastercard.sexmod;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class aj extends Item implements IAnimatable {
  public static final aj b = new aj();
  
  private final AnimationFactory a = new AnimationFactory(this);
  
  public static void a() {
    b.setRegistryName("sexmod", "winchester");
    b.func_77655_b("winchester");
    MinecraftForge.EVENT_BUS.register(aj.class);
  }
  
  public void registerControllers(AnimationData paramAnimationData) {}
  
  public AnimationFactory getFactory() {
    return this.a;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\aj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */