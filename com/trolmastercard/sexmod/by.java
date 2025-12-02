package com.trolmastercard.sexmod;

import net.minecraft.util.math.Vec3i;

public enum by {
  LIGHT_GREEN(213, 239, 150),
  MEDIUM_GREEN(189, 165, 91),
  DARK_GREEN(160, 183, 135),
  LIGHT_YELLOW(234, 176, 102),
  LIGHT_BLUE(187, 203, 252);
  
  private final Vec3i a;
  
  by(int paramInt1, int paramInt2, int paramInt3) {
    this.a = new Vec3i(paramInt1, paramInt2, paramInt3);
  }
  
  public Vec3i a() {
    return this.a;
  }
  
  public static int a(by paramby) {
    byte b = 0;
    for (by by1 : values()) {
      try {
        if (paramby == by1)
          return b; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b++;
    } 
    return b;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\by.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */