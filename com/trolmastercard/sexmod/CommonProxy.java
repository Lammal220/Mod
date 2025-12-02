package com.trolmastercard.sexmod;

import java.io.IOException;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
  public void preInitRegistries(FMLPreInitializationEvent paramFMLPreInitializationEvent) {
    GameRegistry.registerWorldGenerator(g3.b(), 0);
    bi.a();
    f9.a();
  }
  
  public void initRegistries(FMLInitializationEvent paramFMLInitializationEvent) throws IOException {
    Main.setConfigs();
    c.a();
    NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new et());
    bn.a(false);
    ge.a();
  }
  
  public void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent) throws IOException {
    setUpCustomModelsOnServer();
  }
  
  void setUpCustomModelsOnServer() {
    try {
      if (!FMLCommonHandler.instance().getMinecraftServerInstance().func_71262_S())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    br.c(false);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\CommonProxy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */