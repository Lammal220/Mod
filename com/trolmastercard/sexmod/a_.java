package com.trolmastercard.sexmod;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Random;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.IClientCommand;

public class a_ extends CommandBase implements IClientCommand {
  static final String d = "sexmod/futa";
  
  static final int a = 10;
  
  static final float c = 0.025F;
  
  public static boolean e = true;
  
  public static final a_ b = new a_();
  
  public a_() {
    String str = "";
    try {
      str = (new BufferedReader(new FileReader("sexmod/futa"))).readLine().toLowerCase();
    } catch (Exception exception) {}
    try {
      if ("".equals(str))
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if ("true".equals(str))
        e = true; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if ("false".equals(str))
        e = false; 
    } catch (Exception exception) {
      throw a(null);
    } 
  }
  
  public String func_71517_b() {
    return "futa";
  }
  
  public String func_71518_a(ICommandSender paramICommandSender) {
    return "/futa <true|false>";
  }
  
  public void func_184881_a(MinecraftServer paramMinecraftServer, ICommandSender paramICommandSender, String[] paramArrayOfString) throws CommandException {
    try {
      if (paramArrayOfString.length < 1) {
        a(paramICommandSender);
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    String str = paramArrayOfString[0].toLowerCase();
    try {
      if ("true".equals(str)) {
        e = true;
      } else {
        try {
          if ("false".equals(str)) {
            e = false;
          } else {
            a(paramICommandSender);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      FileWriter fileWriter = new FileWriter("sexmod/futa");
      fileWriter.write(str);
      fileWriter.close();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
    try {
      for (em em : em.ad()) {
        try {
          if (em.field_70128_L)
            continue; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!em.field_70170_p.field_72995_K)
            continue; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        try {
          if (!(em instanceof f_))
            continue; 
        } catch (IOException iOException) {
          throw a(null);
        } 
        Vec3d vec3d = em.b("cockParticles").func_178787_e(em.func_174791_d());
        Random random = em.func_70681_au();
        byte b = 0;
        try {
          while (b < 10) {
            em.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, (random.nextFloat() * 0.025F * be.a()), (random.nextFloat() * 0.025F * be.a()), (random.nextFloat() * 0.025F * be.a()), new int[0]);
            b++;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
  }
  
  void a(ICommandSender paramICommandSender) {
    paramICommandSender.func_145747_a((ITextComponent)new TextComponentString(String.format("%sYou can either do %s/futa true %sor %s/futa false", new Object[] { TextFormatting.YELLOW, TextFormatting.GRAY, TextFormatting.YELLOW, TextFormatting.GRAY })));
  }
  
  public boolean allowUsageWithoutPrefix(ICommandSender paramICommandSender, String paramString) {
    return false;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */