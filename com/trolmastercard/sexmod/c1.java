package com.trolmastercard.sexmod;

import java.util.HashMap;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.IAnimatableModel;
import software.bernie.geckolib3.core.processor.AnimationProcessor;
import software.bernie.geckolib3.core.processor.IBone;

public class c1<T extends IAnimatable> extends AnimationProcessor<T> {
  HashMap<String, IBone> a = new HashMap<>();
  
  public c1(IAnimatableModel paramIAnimatableModel) {
    super(paramIAnimatableModel);
  }
  
  public IBone getBone(String paramString) {
    return this.a.get(paramString);
  }
  
  public void registerModelRenderer(IBone paramIBone) {
    super.registerModelRenderer(paramIBone);
    this.a.put(paramIBone.getName(), paramIBone);
  }
  
  public void clearModelRendererList() {
    super.clearModelRendererList();
    this.a.clear();
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\c1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */