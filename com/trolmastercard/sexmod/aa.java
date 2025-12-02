package com.trolmastercard.sexmod;

import com.google.common.base.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;

public class aa extends EntityAINearestAttackableTarget<ff> {
  private final int a;
  
  private final boolean b;
  
  public aa(EntityCreature paramEntityCreature, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramEntityCreature, paramBoolean1, false, paramBoolean2);
  }
  
  public aa(EntityCreature paramEntityCreature, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    this(paramEntityCreature, 10, paramBoolean1, paramBoolean2, (Predicate)null, paramBoolean3);
  }
  
  public aa(EntityCreature paramEntityCreature, int paramInt, boolean paramBoolean1, boolean paramBoolean2, @Nullable Predicate paramPredicate, boolean paramBoolean3) {
    super(paramEntityCreature, ff.class, paramInt, paramBoolean1, paramBoolean2, paramPredicate);
    this.a = paramInt;
    this.b = paramBoolean3;
  }
  
  public boolean func_75250_a() {
    if (this.b) {
      float f = this.field_75299_d.func_70013_c();
      try {
        if (f >= 0.5F)
          return false; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (this.a > 0)
        try {
          if (this.field_75299_d.func_70681_au().nextInt(this.a) != 0)
            return false; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    List list = this.field_75299_d.field_70170_p.func_175647_a(this.field_75307_b, func_188511_a(func_111175_f()), this.field_82643_g);
    try {
      if (list.isEmpty())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    ArrayList<ff> arrayList = new ArrayList();
    for (ff ff : list) {
      try {
        if (ff.J())
          arrayList.add(ff); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    try {
      if (arrayList.isEmpty())
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    arrayList.sort((Comparator<? super ff>)this.field_75306_g);
    this.field_75309_a = (EntityLivingBase)arrayList.get(0);
    return true;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */