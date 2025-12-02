package com.trolmastercard.sexmod;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ad {
  static final int a = 60;
  
  public static float[] b;
  
  public ad() {
    if (a())
      b = new float[60]; 
  }
  
  public static boolean a() {
    return ((Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment")).booleanValue();
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(ClientChatEvent paramClientChatEvent) {
    try {
      if (!a())
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    try {
      if (!"resetcolor".equalsIgnoreCase(paramClientChatEvent.getMessage()))
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    dj.c();
    de.e();
    dy.c();
    dg.e();
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void c(ClientChatEvent paramClientChatEvent) {
    int i;
    float f;
    try {
      if (!a())
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    String str = paramClientChatEvent.getOriginalMessage();
    String[] arrayOfString = str.split(" ");
    try {
      if (arrayOfString.length != 3)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (!"set".equalsIgnoreCase(arrayOfString[0]))
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      i = Integer.parseInt(arrayOfString[1]);
      f = Float.parseFloat(arrayOfString[2]);
      if (b.length - 1 < i)
        return; 
    } catch (Exception exception) {
      return;
    } 
    (Minecraft.func_71410_x()).field_71439_g.func_145747_a((ITextComponent)new TextComponentString(String.format("%sSet dev float N.%s from %s to %s", new Object[] { TextFormatting.GRAY, Integer.valueOf(i), Float.valueOf(b[i]), Float.valueOf(f) })));
    b[i] = f;
    paramClientChatEvent.setCanceled(true);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void b(ClientChatEvent paramClientChatEvent) {
    int i;
    try {
      if (!a())
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    String str = paramClientChatEvent.getOriginalMessage();
    String[] arrayOfString = str.split(" ");
    try {
      if (arrayOfString.length != 2)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (!"get".equalsIgnoreCase(arrayOfString[0]))
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      i = Integer.parseInt(arrayOfString[1]);
      if (b.length - 1 < i)
        return; 
    } catch (Exception exception) {
      return;
    } 
    (Minecraft.func_71410_x()).field_71439_g.func_145747_a((ITextComponent)new TextComponentString(String.format("%sdev float N.%s is %s", new Object[] { TextFormatting.YELLOW, Integer.valueOf(i), Float.valueOf(b[i]) })));
    paramClientChatEvent.setCanceled(true);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(LivingHurtEvent paramLivingHurtEvent) {
    try {
      if (!a())
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
    EntityLivingBase entityLivingBase = paramLivingHurtEvent.getEntityLiving();
    try {
      if (!(entityLivingBase instanceof ff))
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    ff ff = (ff)entityLivingBase;
    UUID uUID = ax.a(entityPlayerSP.getPersistentID());
    Collection<bs> collection = ax.p(uUID);
    for (bs bs : collection) {
      a("task: " + bs.d().name());
      a("workers involved: ");
      for (ff ff1 : bs.c())
        a(ff1.c() + " " + ff1.f()); 
    } 
    a("tribe contains my exact reference: " + ax.n(uUID).contains(ff));
    a("tribe contains my ID: ");
    boolean bool1 = false;
    for (ff ff1 : ax.n(uUID)) {
      if (ff1.f().equals(ff.f()))
        bool1 = true; 
    } 
    boolean bool2 = false;
    for (Map.Entry<UUID, BlockPos> entry : ax.a(uUID, ((EntityPlayer)entityPlayerSP).field_70170_p).entrySet()) {
      if (((UUID)entry.getKey()).equals(ff.f()))
        bool2 = true; 
    } 
    a("loaded : " + bool1);
    a("saved : " + bool2);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void d(ClientChatEvent paramClientChatEvent) {
    try {
      if (!a())
        return; 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    String str = paramClientChatEvent.getOriginalMessage().toLowerCase();
    EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
    try {
      if ("time".equals(str))
        entityPlayerSP.func_145747_a((ITextComponent)new TextComponentString(String.valueOf(((EntityPlayer)entityPlayerSP).field_70170_p.func_82737_E()))); 
    } catch (NullPointerException nullPointerException) {
      throw a(null);
    } 
    if ("girls".equals(str)) {
      List list = ((EntityPlayer)entityPlayerSP).field_70170_p.func_175644_a(em.class, paramem -> true);
      entityPlayerSP.func_145747_a((ITextComponent)new TextComponentString(String.valueOf(list.size())));
      for (em em : list) {
        System.out.printf("%s at %s %s %s\n", new Object[] { em, Double.valueOf(em.field_70165_t), Double.valueOf(em.field_70163_u), Double.valueOf(em.field_70161_v) });
      } 
    } 
    if ("kobs".equals(str)) {
      UUID uUID = ax.a(entityPlayerSP.getPersistentID());
      int i = ax.h(uUID);
      List<ff> list = ax.n(uUID);
      for (ff ff : list) {
        try {
          a(String.format("alive member %s at %s world.isremote? %s isdead %s girlID %s entityID %s", new Object[] { ff.c(), ff.func_180425_c(), Boolean.valueOf(ff.field_70170_p.field_72995_K), Boolean.valueOf(ff.field_70128_L), ff.f(), Integer.valueOf(ff.func_145782_y()) }));
        } catch (NullPointerException nullPointerException) {
          throw a(null);
        } 
        a(((EntityPlayer)entityPlayerSP).field_70170_p.func_72872_a(ff.class, new AxisAlignedBB(ff.func_180425_c())).isEmpty() ? "couldn't be located" : "appears to actually exist");
      } 
      HashMap<UUID, BlockPos> hashMap = ax.a(uUID, ((EntityPlayer)entityPlayerSP).field_70170_p);
      for (Map.Entry<UUID, BlockPos> entry : hashMap.entrySet()) {
        a(String.format("saved pos of %s at %s", new Object[] { ((UUID)entry.getKey()).toString(), ((BlockPos)entry.getValue()).toString() }));
      } 
      a("total amount members: " + i);
    } 
    if (str.startsWith("setcumtime ")) {
      long l;
      String[] arrayOfString = str.split(" ");
      try {
        l = Long.parseLong(arrayOfString[1]);
      } catch (NullPointerException nullPointerException) {
        System.out.println("long: " + arrayOfString[1]);
        nullPointerException.printStackTrace();
        return;
      } 
      v.a(entityPlayerSP.getPersistentID(), Long.valueOf(l));
      entityPlayerSP.func_145747_a((ITextComponent)new TextComponentString("set to: " + l));
    } 
  }
  
  @SideOnly(Side.CLIENT)
  void a(String paramString) {
    (Minecraft.func_71410_x()).field_71439_g.func_145747_a((ITextComponent)new TextComponentString(paramString));
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */