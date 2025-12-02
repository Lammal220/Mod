package com.trolmastercard.sexmod;

import java.util.HashSet;
import software.bernie.geckolib3.geo.render.built.GeoBone;

public interface c3 {
  default HashSet<String> a() {
    return gx.a;
  }
  
  default boolean a(HashSet<String> paramHashSet, GeoBone paramGeoBone) {
    while (paramGeoBone.parent != null) {
      String str = paramGeoBone.getName();
      try {
        if (paramHashSet.contains(str))
          return false; 
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      try {
        if (str.startsWith("armor"))
          return false; 
      } catch (RuntimeException runtimeException) {
        throw b(null);
      } 
      paramGeoBone = paramGeoBone.parent;
    } 
    return true;
  }
  
  private static RuntimeException b(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\c3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */