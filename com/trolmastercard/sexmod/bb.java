package com.trolmastercard.sexmod;

import net.minecraft.entity.IEntityMultiPart;
import net.minecraft.entity.MultiPartEntityPart;
import net.minecraft.world.World;

public class bb extends MultiPartEntityPart {
  public boolean a = false;
  
  public bb(World paramWorld) {
    super(null, "", 0.0F, 0.0F);
  }
  
  public bb(IEntityMultiPart paramIEntityMultiPart, String paramString, float paramFloat1, float paramFloat2) {
    super(paramIEntityMultiPart, paramString, paramFloat1, paramFloat2);
  }
  
  public boolean func_70067_L() {
    return this.a;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */