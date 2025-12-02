package com.trolmastercard.sexmod;

import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class bq {
  @SubscribeEvent
  public void a(GuiOpenEvent paramGuiOpenEvent) {
    try {
      if (!(paramGuiOpenEvent.getGui() instanceof net.minecraft.client.gui.GuiMainMenu)) {
        try {
          if (paramGuiOpenEvent.getGui() instanceof net.minecraft.client.gui.GuiMultiplayer) {
            ei.Z.clear();
            ei.al.clear();
            return;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ei.Z.clear();
    ei.al.clear();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */