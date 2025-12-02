package com.trolmastercard.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ah {
  @SubscribeEvent
  public void b(LivingAttackEvent paramLivingAttackEvent) {
    try {
      if (paramLivingAttackEvent.getSource() == DamageSource.field_76380_i)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (!(paramLivingAttackEvent.getEntity() instanceof em))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    em em = (em)paramLivingAttackEvent.getEntity();
    try {
      if (em instanceof ei) {
        paramLivingAttackEvent.setCanceled(true);
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        paramLivingAttackEvent.setCanceled((em.ae() != null));
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SubscribeEvent
  public void a(LivingAttackEvent paramLivingAttackEvent) {
    DamageSource damageSource = paramLivingAttackEvent.getSource();
    try {
      if (damageSource != DamageSource.field_76380_i)
        try {
          if (!(damageSource instanceof a3)) {
            try {
              if (!(paramLivingAttackEvent.getEntity() instanceof EntityPlayer))
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            EntityPlayer entityPlayer = (EntityPlayer)paramLivingAttackEvent.getEntity();
            em em = em.i(entityPlayer.getPersistentID());
            try {
              if (em == null)
                return; 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
            try {
              if (em.func_70032_d((Entity)entityPlayer) < 1.0F)
                paramLivingAttackEvent.setCanceled(true); 
            } catch (RuntimeException runtimeException) {
              throw a(null);
            } 
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


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */