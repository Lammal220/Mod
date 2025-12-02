package com.trolmastercard.sexmod;

import java.util.function.Function;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.easing.EasingType;

public class bz<T extends IAnimatable> extends AnimationController<T> {
  public bz(T paramT, String paramString, float paramFloat, AnimationController.IAnimationPredicate<T> paramIAnimationPredicate) {
    super((IAnimatable)paramT, paramString, paramFloat, paramIAnimationPredicate);
  }
  
  public bz(T paramT, String paramString, float paramFloat, EasingType paramEasingType, AnimationController.IAnimationPredicate<T> paramIAnimationPredicate) {
    super((IAnimatable)paramT, paramString, paramFloat, paramEasingType, paramIAnimationPredicate);
  }
  
  public bz(T paramT, String paramString, float paramFloat, Function<Double, Double> paramFunction, AnimationController.IAnimationPredicate<T> paramIAnimationPredicate) {
    super((IAnimatable)paramT, paramString, paramFloat, paramFunction, paramIAnimationPredicate);
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */