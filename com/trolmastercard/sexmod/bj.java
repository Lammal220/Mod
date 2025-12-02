package com.trolmastercard.sexmod;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.storage.WorldSavedData;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class bj extends WorldSavedData {
  static final String a = "sexmod:static_custom_model_manager";
  
  static final String d = "sexmod:static_custom_model_manager";
  
  public static HashMap<UUID, String> c = new HashMap<>();
  
  public static HashMap<UUID, String> b = new HashMap<>();
  
  public bj() {
    super("sexmod:static_custom_model_manager");
  }
  
  public bj(String paramString) {
    super("sexmod:static_custom_model_manager");
  }
  
  public static String c(em paramem) {
    String str = b(paramem);
    try {
      if (str == null)
        return ""; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return str;
  }
  
  private static String b(em paramem) {
    if (paramem instanceof f_) {
      UUID uUID1 = paramem.f();
      UUID uUID2 = v.f(uUID1);
      if (uUID2 == null)
        uUID2 = uUID1; 
      return c.get(uUID2);
    } 
    if (paramem instanceof f8) {
      UUID uUID = v.f(((f8)paramem).v());
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      return b.get((uUID == null) ? paramem.f() : uUID);
    } 
    return null;
  }
  
  public static void a(em paramem) {
    if (paramem instanceof f_) {
      UUID uUID1 = paramem.f();
      UUID uUID2 = v.f(uUID1);
      if (uUID2 == null)
        uUID2 = uUID1; 
      c.put(uUID2, paramem.C());
      return;
    } 
    if (paramem instanceof f8) {
      UUID uUID = v.f(((f8)paramem).v());
      try {
      
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b.put((uUID == null) ? paramem.f() : uUID, paramem.C());
    } 
  }
  
  @SubscribeEvent
  public void a(WorldEvent.Save paramSave) {
    World world = paramSave.getWorld();
    world.func_175693_T().func_75745_a("sexmod:static_custom_model_manager", this);
    func_76185_a();
  }
  
  @SubscribeEvent
  public void a(WorldEvent.Load paramLoad) {
    World world = paramLoad.getWorld();
    world.func_175693_T().func_75742_a(bj.class, "sexmod:static_custom_model_manager");
  }
  
  public void func_76184_a(NBTTagCompound paramNBTTagCompound) {
    NBTTagCompound nBTTagCompound = paramNBTTagCompound.func_74775_l("sexmod:static_custom_model_manager");
    a(nBTTagCompound.func_74775_l("galath"), c);
    a(nBTTagCompound.func_74775_l("mang"), b);
  }
  
  public NBTTagCompound func_189551_b(NBTTagCompound paramNBTTagCompound) {
    NBTTagCompound nBTTagCompound = new NBTTagCompound();
    nBTTagCompound.func_74782_a("galath", (NBTBase)a(c));
    nBTTagCompound.func_74782_a("mang", (NBTBase)a(b));
    paramNBTTagCompound.func_74782_a("sexmod:static_custom_model_manager", (NBTBase)nBTTagCompound);
    return paramNBTTagCompound;
  }
  
  NBTTagCompound a(HashMap<UUID, String> paramHashMap) {
    NBTTagCompound nBTTagCompound = new NBTTagCompound();
    byte b = 0;
    for (Map.Entry<UUID, String> entry : paramHashMap.entrySet()) {
      UUID uUID = (UUID)entry.getKey();
      nBTTagCompound.func_74778_a("UUID" + b, uUID.toString());
      nBTTagCompound.func_74778_a("MODEL" + b, (String)entry.getValue());
      b++;
    } 
    return nBTTagCompound;
  }
  
  void a(NBTTagCompound paramNBTTagCompound, HashMap<UUID, String> paramHashMap) {
    for (byte b = 0;; b++) {
      String str = paramNBTTagCompound.func_74779_i("UUID" + b);
      try {
        if ("".equals(str))
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      paramHashMap.put(UUID.fromString(str), paramNBTTagCompound.func_74779_i("MODEL" + b));
    } 
  }
  
  public static void a() {
    c.clear();
    b.clear();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */