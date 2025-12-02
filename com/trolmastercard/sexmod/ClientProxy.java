package com.trolmastercard.sexmod;

import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.command.ICommand;
import net.minecraft.world.World;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {
  public static boolean IS_PRELOADING = false;
  
  public static KeyBinding[] keyBindings;
  
  public void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent) throws IOException {}
  
  public void preInitRegistries(FMLPreInitializationEvent paramFMLPreInitializationEvent) {
    super.preInitRegistries(paramFMLPreInitializationEvent);
    fk.a();
  }
  
  public void initRegistries(FMLInitializationEvent paramFMLInitializationEvent) throws IOException {
    keyBindings = new KeyBinding[2];
    keyBindings[0] = new KeyBinding("Interact with your goblin", 34, "Sex mod");
    keyBindings[1] = new KeyBinding("open character customisation menu", 76, "Sex mod");
    for (KeyBinding keyBinding : keyBindings)
      ClientRegistry.registerKeyBinding(keyBinding); 
    Main.setConfigs();
    c.a();
    NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new et(true));
    bn.a(true);
    ge.a();
    Minecraft minecraft = Minecraft.func_71410_x();
    RenderManager renderManager = minecraft.func_175598_ae();
    gj gj = new gj();
    IS_PRELOADING = true;
    try {
      for (fy fy : fy.values()) {
        renderManager.func_188391_a(fy.npcClass.getDeclaredConstructor(new Class[] { World.class }, ).newInstance(new Object[] { gj }, ), 0.0D, 0.0D, 0.0D, 0.0F, 0.0F, false);
      } 
    } catch (Exception exception) {
      System.out.println("error while preloading:");
      exception.printStackTrace();
    } 
    IS_PRELOADING = false;
    w.a = new w();
    ClientCommandHandler.instance.func_71560_a((ICommand)fd.a);
    ClientCommandHandler.instance.func_71560_a((ICommand)fx.a);
    ClientCommandHandler.instance.func_71560_a((ICommand)a_.b);
    (Minecraft.func_71410_x()).field_71452_i.func_178929_a(625115, (paramInt, paramWorld, paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5, paramDouble6, paramArrayOfint) -> new ez(paramWorld, paramDouble1, paramDouble2, paramDouble3));
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ClientProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */