package com.trolmastercard.sexmod;

import javax.vecmath.Vector3f;
import net.minecraft.util.math.Vec3d;

public class ck {
  public static Vec3d a(Vec3d paramVec3d, double paramDouble) {
    return new Vec3d(paramVec3d.field_72450_a * paramDouble, paramVec3d.field_72448_b * paramDouble, paramVec3d.field_72449_c * paramDouble);
  }
  
  public static double a(Vector3f paramVector3f, Vec3d paramVec3d) {
    return paramVector3f.x * paramVec3d.field_72450_a + paramVector3f.y * paramVec3d.field_72448_b + paramVector3f.z * paramVec3d.field_72449_c;
  }
  
  public static double a(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    return paramVec3d1.field_72450_a * paramVec3d2.field_72450_a + paramVec3d1.field_72448_b * paramVec3d2.field_72448_b + paramVec3d1.field_72449_c * paramVec3d2.field_72449_c;
  }
  
  public static Vec3d b(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    return new Vec3d(paramVec3d1.field_72448_b * paramVec3d2.field_72449_c - paramVec3d1.field_72449_c * paramVec3d2.field_72448_b, paramVec3d1.field_72449_c * paramVec3d2.field_72450_a - paramVec3d1.field_72450_a * paramVec3d2.field_72449_c, paramVec3d1.field_72450_a * paramVec3d2.field_72448_b - paramVec3d1.field_72448_b * paramVec3d2.field_72450_a);
  }
  
  public static Vec3d a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat) {
    return a(new Vec3d(paramDouble1, paramDouble2, paramDouble3), paramFloat);
  }
  
  public static Vec3d a(Vec3d paramVec3d, float paramFloat) {
    return a(paramVec3d, 0.0F, paramFloat);
  }
  
  public static Vec3d a(Vec3d paramVec3d, float paramFloat1, float paramFloat2) {
    Vec3d vec3d = new Vec3d(paramVec3d.field_72450_a, paramVec3d.field_72448_b * Math.cos(paramFloat1 * 0.017453292519943295D) - paramVec3d.field_72449_c * Math.sin(paramFloat1 * 0.017453292519943295D), paramVec3d.field_72448_b * Math.sin(paramFloat1 * 0.017453292519943295D) + paramVec3d.field_72449_c * Math.cos(paramFloat1 * 0.017453292519943295D));
    return new Vec3d(-Math.sin((paramFloat2 + 90.0F) * 0.017453292519943295D) * vec3d.field_72450_a - Math.sin(paramFloat2 * 0.017453292519943295D) * vec3d.field_72449_c, vec3d.field_72448_b, Math.cos((paramFloat2 + 90.0F) * 0.017453292519943295D) * vec3d.field_72450_a + Math.cos(paramFloat2 * 0.017453292519943295D) * vec3d.field_72449_c);
  }
  
  public static Vec3d a(double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    return a(new Vec3d(paramDouble1, paramDouble2, paramDouble3), paramFloat1, paramFloat2);
  }
  
  public static Vec3d a(Vec3d paramVec3d, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramFloat1 = gc.c(paramFloat1);
    paramFloat2 = gc.c(paramFloat2);
    paramFloat3 = gc.c(paramFloat3);
    double d1 = (float)Math.sin(paramFloat1);
    double d2 = (float)Math.cos(paramFloat1);
    double d3 = (float)Math.sin(paramFloat2);
    double d4 = (float)Math.cos(paramFloat2);
    double d5 = (float)Math.sin(paramFloat3);
    double d6 = (float)Math.cos(paramFloat3);
    double d7 = paramVec3d.field_72448_b * d2 - paramVec3d.field_72449_c * d1;
    double d8 = paramVec3d.field_72448_b * d1 + paramVec3d.field_72449_c * d2;
    paramVec3d = new Vec3d(paramVec3d.field_72450_a, d7, d8);
    double d9 = paramVec3d.field_72450_a * d4 + paramVec3d.field_72449_c * d3;
    d8 = -paramVec3d.field_72450_a * d3 + paramVec3d.field_72449_c * d4;
    paramVec3d = new Vec3d(d9, paramVec3d.field_72448_b, d8);
    d9 = paramVec3d.field_72450_a * d6 - paramVec3d.field_72448_b * d5;
    d7 = paramVec3d.field_72450_a * d5 + paramVec3d.field_72448_b * d6;
    return new Vec3d(d9, d7, paramVec3d.field_72449_c);
  }
  
  public static Vec3d c(Vec3d paramVec3d) {
    return new Vec3d(-paramVec3d.field_72450_a, paramVec3d.field_72448_b, -paramVec3d.field_72449_c);
  }
  
  public static Vec3d a(Vec3d paramVec3d) {
    return new Vec3d(-paramVec3d.field_72450_a, -paramVec3d.field_72448_b, paramVec3d.field_72449_c);
  }
  
  public static Vec3d b(Vec3d paramVec3d) {
    return new Vec3d(paramVec3d.field_72450_a, -paramVec3d.field_72448_b, -paramVec3d.field_72449_c);
  }
  
  static double a(double paramDouble1, double paramDouble2, double paramDouble3) {
    return (paramDouble3 - paramDouble1) / (paramDouble2 - paramDouble1);
  }
  
  public static double a(Vec3d paramVec3d1, Vec3d paramVec3d2, Vec3d paramVec3d3) {
    return a(paramVec3d1.field_72450_a, paramVec3d2.field_72450_a, paramVec3d3.field_72450_a);
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ck.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */