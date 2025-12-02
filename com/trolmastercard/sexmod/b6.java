package com.trolmastercard.sexmod;

import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;

public class b6 {
  public static Vec3d a(Vec3d paramVec3d1, Vec3d paramVec3d2, int paramInt) {
    try {
      if (paramInt == 0)
        return paramVec3d2; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Vec3d vec3d = paramVec3d2.func_178788_d(paramVec3d1);
    return paramVec3d1.func_72441_c(vec3d.field_72450_a / paramInt, vec3d.field_72448_b / paramInt, vec3d.field_72449_c / paramInt);
  }
  
  public static double b(double paramDouble1, double paramDouble2, double paramDouble3) {
    return paramDouble1 + (paramDouble2 - paramDouble1) * paramDouble3;
  }
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return paramFloat1 + (paramFloat2 - paramFloat1) * paramFloat3;
  }
  
  public static float a(float paramFloat1, float paramFloat2, double paramDouble) {
    float f;
    for (f = paramFloat2 - paramFloat1; f < -3.141592653589793D; f = (float)(f + 6.283185307179586D));
    while (f >= Math.PI)
      f = (float)(f - 6.283185307179586D); 
    return (float)(paramFloat1 + f * paramDouble);
  }
  
  public static float b(float paramFloat1, float paramFloat2, double paramDouble) {
    double d1 = Math.toRadians(paramFloat1);
    double d2 = Math.toRadians(paramFloat2);
    return (float)Math.toDegrees(a((float)d1, (float)d2, paramDouble));
  }
  
  public static Vec3d a(Vec3d paramVec3d1, Vec3d paramVec3d2, double paramDouble) {
    Vec3d vec3d = paramVec3d2.func_178788_d(paramVec3d1);
    return paramVec3d1.func_178787_e(new Vec3d(vec3d.field_72450_a * paramDouble, vec3d.field_72448_b * paramDouble, vec3d.field_72449_c * paramDouble));
  }
  
  public static f7 a(f7 paramf71, f7 paramf72, double paramDouble) {
    f7 f71 = paramf72.b(paramf71);
    return paramf71.a(f71.a((float)paramDouble));
  }
  
  public static Vec3i a(Vec3i paramVec3i1, Vec3i paramVec3i2, double paramDouble) {
    Vec3d vec3d = new Vec3d((paramVec3i2.func_177958_n() - paramVec3i1.func_177958_n()), (paramVec3i2.func_177956_o() - paramVec3i1.func_177956_o()), (paramVec3i2.func_177952_p() - paramVec3i1.func_177952_p()));
    return new Vec3i(paramVec3i1.func_177958_n() + vec3d.field_72450_a * paramDouble, paramVec3i1.func_177956_o() + vec3d.field_72448_b * paramDouble, paramVec3i1.func_177952_p() + vec3d.field_72449_c * paramDouble);
  }
  
  public static gv a(gv paramgv1, gv paramgv2, double paramDouble) {
    gv gv1 = new gv(paramgv2.a - paramgv1.a, paramgv2.d - paramgv1.d, paramgv2.c - paramgv1.c, paramgv2.b - paramgv1.b);
    return new gv((int)(paramgv1.a + gv1.a * paramDouble), (int)(paramgv1.d + gv1.d * paramDouble), (int)(paramgv1.c + gv1.c * paramDouble), (int)(paramgv1.b + gv1.b * paramDouble));
  }
  
  public static double e(double paramDouble) {
    return 1.0D - Math.pow(1.0D - paramDouble, 4.0D);
  }
  
  public static double g(double paramDouble) {
    return 1.0D - Math.pow(1.0D - paramDouble, 3.0D);
  }
  
  public static double c(double paramDouble) {
    double d1 = 1.70158D;
    double d2 = d1 + 1.0D;
    return 1.0D + d2 * Math.pow(paramDouble - 1.0D, 3.0D) + d1 * Math.pow(paramDouble - 1.0D, 2.0D);
  }
  
  public static double d(double paramDouble) {
    double d1 = 1.70158D;
    double d2 = d1 + 1.0D;
    return d2 * paramDouble * paramDouble * paramDouble - d1 * paramDouble * paramDouble;
  }
  
  public static double b(double paramDouble) {
    return Math.sin(paramDouble * Math.PI / 2.0D);
  }
  
  public static double a(double paramDouble) {
    return paramDouble * paramDouble * paramDouble;
  }
  
  public static double h(double paramDouble) {
    return -(Math.cos(Math.PI * paramDouble) - 1.0D) / 2.0D;
  }
  
  public static double f(double paramDouble) {
    return 1.0D - Math.cos(Math.PI * paramDouble / 2.0D);
  }
  
  public static double a(double paramDouble1, double paramDouble2, double paramDouble3) {
    double d = (1.0D - Math.cos(paramDouble3 * Math.PI)) / 2.0D;
    return paramDouble1 * (1.0D - d) + paramDouble2 * d;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */