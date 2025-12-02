package com.trolmastercard.sexmod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

public class aw extends CommandBase {
  public static final aw a = new aw();
  
  public String func_71517_b() {
    return "reloadcustommodels";
  }
  
  public String func_71518_a(ICommandSender paramICommandSender) {
    return "/reloadcustommodels";
  }
  
  public int func_82362_a() {
    return 2;
  }
  
  public void func_184881_a(MinecraftServer paramMinecraftServer, ICommandSender paramICommandSender, String[] paramArrayOfString) throws CommandException {
    br.b(false);
    for (EntityPlayerMP entityPlayerMP : paramMinecraftServer.func_184103_al().func_181057_v())
      paramMinecraftServer.func_152344_a(() -> ge.b.sendTo(new g6(br.e()), paramEntityPlayerMP)); 
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */