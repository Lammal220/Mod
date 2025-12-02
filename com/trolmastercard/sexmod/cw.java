package com.trolmastercard.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import net.minecraftforge.fml.common.eventhandler.Event;

public class cw extends EntityAIBase {
  private final EntityVillager c;
  
  private EntityVillager d;
  
  private final World a;
  
  private int b;
  
  public cw(EntityVillager paramEntityVillager) {
    this.c = paramEntityVillager;
    this.a = paramEntityVillager.field_70170_p;
    func_75248_a(3);
  }
  
  public boolean func_75250_a() {
    try {
      if (this.b != 0)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Entity entity = this.a.func_72857_a(EntityVillager.class, this.c.func_174813_aQ().func_72314_b(8.0D, 3.0D, 8.0D), (Entity)this.c);
    try {
      if (entity == null)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.d = (EntityVillager)entity;
    return true;
  }
  
  public void func_75249_e() {
    this.b = 300;
    this.c.func_70947_e(true);
  }
  
  public void func_75251_c() {}
  
  public boolean func_75253_b() {
    return true;
  }
  
  public void func_75246_d() {
    try {
      this.b--;
      this.c.func_70671_ap().func_75651_a((Entity)this.d, 10.0F, 30.0F);
      if (this.c.func_70068_e((Entity)this.d) > 2.25D)
        this.c.func_70661_as().func_75497_a((Entity)this.d, 0.25D); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.b <= 0) {
        a();
        this.c.field_70714_bg.func_85156_a(this);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (this.c.func_70681_au().nextInt(35) == 0)
        this.a.func_72960_a((Entity)this.c, (byte)12); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private void a() {
    EntityVillager entityVillager = this.c.func_90011_a((EntityAgeable)this.d);
    this.d.func_70873_a(6000);
    this.c.func_70873_a(6000);
    this.d.func_175549_o(false);
    this.c.func_175549_o(false);
    BabyEntitySpawnEvent babyEntitySpawnEvent = new BabyEntitySpawnEvent((EntityLiving)this.c, (EntityLiving)this.d, (EntityAgeable)entityVillager);
    try {
      if (!MinecraftForge.EVENT_BUS.post((Event)babyEntitySpawnEvent))
        try {
          if (babyEntitySpawnEvent.getChild() != null) {
            EntityAgeable entityAgeable = babyEntitySpawnEvent.getChild();
            entityAgeable.func_70873_a(-24000);
            entityAgeable.func_70012_b(this.c.field_70165_t, this.c.field_70163_u, this.c.field_70161_v, 0.0F, 0.0F);
            this.a.func_72838_d((Entity)entityAgeable);
            this.a.func_72960_a((Entity)entityAgeable, (byte)12);
            return;
          } 
          return;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */