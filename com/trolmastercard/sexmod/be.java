package com.trolmastercard.sexmod;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import java.util.UUID;
import net.minecraft.util.math.Vec3d;

public class be {
  public static float a(double paramDouble1, double paramDouble2) {
    paramDouble1 = (paramDouble1 + 6.283185307179586D) % 6.283185307179586D;
    paramDouble2 = (paramDouble2 + 6.283185307179586D) % 6.283185307179586D;
    double d;
    for (d = paramDouble2 - paramDouble1; d < -3.141592653589793D; d += 6.283185307179586D);
    while (d >= Math.PI)
      d -= 6.283185307179586D; 
    return (float)d;
  }
  
  public static bm a(Vec3d paramVec3d1, Vec3d paramVec3d2) {
    Vec3d vec3d = paramVec3d2.func_178788_d(paramVec3d1).func_72432_b();
    return new bm((float)Math.atan2(vec3d.field_72450_a, vec3d.field_72449_c), (float)Math.atan2(vec3d.field_72448_b, Math.sqrt(vec3d.field_72450_a * vec3d.field_72450_a + vec3d.field_72449_c * vec3d.field_72449_c)));
  }
  
  public static void a(String paramString) {
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    StringSelection stringSelection = new StringSelection(paramString);
    clipboard.setContents(stringSelection, null);
  }
  
  public static String b(String paramString) {
    try {
      if (paramString != null)
        try {
          return !paramString.isEmpty() ? (Character.toUpperCase(paramString.charAt(0)) + paramString.substring(1).toLowerCase()) : paramString;
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramString;
  }
  
  public static boolean a(double paramDouble1, double paramDouble2, double paramDouble3) {
    try {
      if (paramDouble1 < paramDouble2)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramDouble1 >= paramDouble3)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public static int a(int paramInt) {
    try {
      if (paramInt <= 0)
        return paramInt; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Random random = new Random();
    int i = 0;
    int j;
    for (j = 0; j <= paramInt; j++)
      i += j; 
    j = random.nextInt(i) + 1;
    int k = 0;
    for (byte b = 0; b <= paramInt; b++) {
      k += b;
      try {
        if (k >= j)
          return b; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    return paramInt;
  }
  
  public static int a() {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return r.f.nextBoolean() ? 1 : -1;
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3) {
    return Math.max(paramFloat2, Math.min(paramFloat3, paramFloat1));
  }
  
  public static double b(double paramDouble1, double paramDouble2, double paramDouble3) {
    return Math.max(paramDouble2, Math.min(paramDouble3, paramDouble1));
  }
  
  public static float a(float paramFloat, boolean paramBoolean) {
    Random random = new Random();
    try {
      if (paramBoolean)
        try {
          if (random.nextBoolean());
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return random.nextFloat() * paramFloat * true;
  }
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    try {
      if (Math.abs(paramFloat1 - paramFloat2) <= paramFloat3)
        return paramFloat1; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (Math.abs(paramFloat1) < Math.abs(paramFloat2)) {
        try {
          if (paramFloat2 > 0.0F)
            return paramFloat2 - paramFloat3; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        return paramFloat2 + paramFloat3;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramFloat1 > 0.0F)
        return paramFloat1 - paramFloat3; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return paramFloat1 + paramFloat3;
  }
  
  public static int a(double paramDouble) {
    return Math.round((float)paramDouble);
  }
  
  public static void a(int paramInt, Runnable paramRunnable) {
    String str = UUID.randomUUID().toString();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    (new Thread(() -> {
          try {
            Thread.sleep(paramInt);
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          paramRunnable.run();
        }(g0.a() ? "server sexmod thread " : "client sexmod thread ") + str)).start();
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\be.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */