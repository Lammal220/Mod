package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistryEntry;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.builder.ILoopType;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class cc extends Item implements IAnimatable {
  public static final cc r = new cc();
  
  public static final long c = 4000L;
  
  public static final long g = 1000L;
  
  public static final long j = 3000L;
  
  public static final float q = 0.1F;
  
  public static final float p = -0.01F;
  
  public static final float e = 0.0015F;
  
  public static final float k = 2.0F;
  
  public static final float h = 1.5F;
  
  public static final float d = 0.03F;
  
  public static final float s = 100.0F;
  
  public static final float l = 0.2F;
  
  public static final float o = 1.5F;
  
  public static final String b = "sexmod:galath_coin_activation_time";
  
  public static final String m = "sexmod:galath_coin_deactivation_time";
  
  public static final String n = "sexmod:galath_coin_de_summoning_animation_time";
  
  public static final String f = "Defeating a succubus makes her accept the victor as her master, granting him a coin to which her soul is bound. Using the coin summons her, offering services on demand. If her master uses the coin on her or goes too far, she returns to the coin";
  
  private final AnimationFactory i = new AnimationFactory(this);
  
  AnimationController<cc> a;
  
  public static void a() {
    r.setRegistryName("sexmod", "galath_coin");
    r.func_77655_b("galath_coin");
    MinecraftForge.EVENT_BUS.register(cc.class);
  }
  
  @SubscribeEvent
  public static void a(RegistryEvent.Register<Item> paramRegister) {
    paramRegister.getRegistry().register((IForgeRegistryEntry)r);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public static void a(ModelRegistryEvent paramModelRegistryEvent) {
    ModelLoader.setCustomModelResourceLocation(r, 0, new ModelResourceLocation("sexmod:galath_coin"));
    r.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)new av());
  }
  
  public ActionResult<ItemStack> func_77659_a(World paramWorld, EntityPlayer paramEntityPlayer, EnumHand paramEnumHand) {
    NBTTagCompound nBTTagCompound = paramEntityPlayer.getEntityData();
    ActionResult<ItemStack> actionResult = new ActionResult(EnumActionResult.FAIL, paramEntityPlayer.func_184586_b(paramEnumHand));
    try {
      if (nBTTagCompound.func_74763_f("sexmod:galath_coin_deactivation_time") != 0L)
        return actionResult; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (nBTTagCompound.func_74763_f("sexmod:galath_coin_activation_time") != 0L)
        return actionResult; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!a(paramWorld, paramEntityPlayer)) {
        paramWorld.func_184134_a(paramEntityPlayer.field_70165_t, paramEntityPlayer.field_70163_u, paramEntityPlayer.field_70161_v, c.MISC_BEEW[0], SoundCategory.PLAYERS, 1.0F, 1.0F, false);
        return new ActionResult(EnumActionResult.SUCCESS, paramEntityPlayer.func_184586_b(paramEnumHand));
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    paramWorld.func_184134_a(paramEntityPlayer.field_70165_t, paramEntityPlayer.field_70163_u, paramEntityPlayer.field_70161_v, c.MISC_WEOWEO[1], SoundCategory.PLAYERS, 1.0F, 1.0F, false);
    nBTTagCompound.func_74772_a("sexmod:galath_coin_activation_time", System.currentTimeMillis());
    return new ActionResult(EnumActionResult.SUCCESS, paramEntityPlayer.func_184586_b(paramEnumHand));
  }
  
  boolean a(World paramWorld, EntityPlayer paramEntityPlayer) {
    try {
      if (!paramWorld.field_72995_K) {
        try {
        
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        return !v.c(paramEntityPlayer.getPersistentID());
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
    
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    return !v.f;
  }
  
  @SubscribeEvent
  public void a(PlayerInteractEvent.EntityInteract paramEntityInteract) {
    EntityPlayer entityPlayer = paramEntityInteract.getEntityPlayer();
    ItemStack itemStack = entityPlayer.func_184586_b(paramEntityInteract.getHand());
    try {
      if (!r.equals(itemStack.func_77973_b()))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Entity entity = paramEntityInteract.getTarget();
    try {
      if (!(entity instanceof f_))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    f_ f_ = (f_)entity;
    try {
      if (!entityPlayer.getPersistentID().equals(f_.O()))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    entityPlayer.field_70170_p.func_184134_a(entityPlayer.field_70165_t, entityPlayer.field_70163_u, entityPlayer.field_70161_v, c.MISC_WEOWEO[0], SoundCategory.PLAYERS, 1.0F, 1.0F, false);
    entityPlayer.getEntityData().func_74772_a("sexmod:galath_coin_deactivation_time", System.currentTimeMillis());
    paramEntityInteract.setCanceled(true);
  }
  
  public void func_77663_a(ItemStack paramItemStack, World paramWorld, Entity paramEntity, int paramInt, boolean paramBoolean) {
    try {
      super.func_77663_a(paramItemStack, paramWorld, paramEntity, paramInt, paramBoolean);
      if (!(paramEntity instanceof EntityPlayer))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = (EntityPlayer)paramEntity;
    NBTTagCompound nBTTagCompound = entityPlayer.getEntityData();
    long l1 = nBTTagCompound.func_74763_f("sexmod:galath_coin_activation_time");
    long l2 = nBTTagCompound.func_74763_f("sexmod:galath_coin_deactivation_time");
    long l3 = System.currentTimeMillis();
    try {
      b(entityPlayer, nBTTagCompound, l3, l1);
      a(entityPlayer, nBTTagCompound, l3, l2);
      if (l2 != 0L)
        try {
          if (l3 > l2 + 4000L) {
            nBTTagCompound.func_74772_a("sexmod:galath_coin_deactivation_time", 0L);
            nBTTagCompound.func_74757_a("sexmod:galath_coin_de_summoning_animation_time", false);
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (!paramWorld.field_72995_K)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    a(entityPlayer, l3, l1);
    b(entityPlayer, l3, l2);
  }
  
  @SideOnly(Side.CLIENT)
  void b(EntityPlayer paramEntityPlayer, long paramLong1, long paramLong2) {
    try {
      if (paramLong2 == 0L)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramLong1 > paramLong2 + 1000L)
        try {
          if (paramLong1 < paramLong2 + 3000L) {
            f_ f_ = null;
            try {
              for (em em : em.ad()) {
                try {
                  if (em.field_70128_L)
                    continue; 
                } catch (ConcurrentModificationException concurrentModificationException) {
                  throw a(null);
                } 
                try {
                  if (!em.field_70170_p.field_72995_K)
                    continue; 
                } catch (ConcurrentModificationException concurrentModificationException) {
                  throw a(null);
                } 
                try {
                  if (!(em instanceof f_))
                    continue; 
                } catch (ConcurrentModificationException concurrentModificationException) {
                  throw a(null);
                } 
                try {
                  if (!paramEntityPlayer.equals(em.z()))
                    continue; 
                } catch (ConcurrentModificationException concurrentModificationException) {
                  throw a(null);
                } 
                f_ = (f_)em;
              } 
            } catch (ConcurrentModificationException concurrentModificationException) {}
            try {
              if (f_ == null)
                return; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            Vec3d vec3d1 = f_.o().func_72441_c(0.0D, 1.5D, 0.0D);
            Vec3d vec3d2 = paramEntityPlayer.func_174791_d().func_72441_c(0.0D, paramEntityPlayer.func_70047_e(), 0.0D);
            try {
            
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            Vec3d vec3d3 = vec3d2.func_178787_e(ck.a(((paramEntityPlayer.func_184614_ca().func_77973_b().equals(r) ? true : -1) * 0.1F), (-0.01F + paramEntityPlayer.field_70125_A * 0.0015F), 0.0D, paramEntityPlayer.field_70761_aq));
            float f = (float)(paramLong1 - paramLong2 - 1000L) / 2000.0F;
            Vec3d vec3d4 = b6.a(vec3d1, vec3d3, f);
            ez.b = 0.2F;
            (Minecraft.func_71410_x()).field_71452_i.func_78873_a((Particle)new ez(paramEntityPlayer.field_70170_p, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c));
            return;
          } 
          return;
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  void a(EntityPlayer paramEntityPlayer) {
    try {
      if (!(Minecraft.func_71410_x()).field_71439_g.getPersistentID().equals(paramEntityPlayer.getPersistentID()))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    v.f = true;
  }
  
  @SideOnly(Side.CLIENT)
  void a(EntityPlayer paramEntityPlayer, long paramLong1, long paramLong2) {
    try {
      if (paramLong1 > paramLong2 + 1000L)
        try {
          if (paramLong1 < paramLong2 + 3000L) {
            Vec3d vec3d1 = paramEntityPlayer.func_174791_d().func_72441_c(0.0D, paramEntityPlayer.func_70047_e(), 0.0D);
            try {
            
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            Vec3d vec3d2 = vec3d1.func_178787_e(ck.a(((paramEntityPlayer.func_184614_ca().func_77973_b().equals(r) ? true : -1) * 0.1F), (-0.01F + paramEntityPlayer.field_70125_A * 0.0015F), 0.0D, paramEntityPlayer.field_70761_aq));
            Vec3d vec3d3 = vec3d1.func_178787_e(paramEntityPlayer.func_70040_Z().func_72432_b().func_186678_a(2.0D));
            float f = (float)(paramLong1 - paramLong2 - 1000L) / 2000.0F;
            Vec3d vec3d4 = b6.a(vec3d2, vec3d3, f);
            ez.b = 0.2F;
            (Minecraft.func_71410_x()).field_71452_i.func_78873_a((Particle)new ez(paramEntityPlayer.field_70170_p, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c));
            return;
          } 
          return;
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  @SubscribeEvent
  public void a(PlayerEvent.PlayerChangedDimensionEvent paramPlayerChangedDimensionEvent) {
    EntityPlayer entityPlayer = paramPlayerChangedDimensionEvent.player;
    try {
      if (entityPlayer.field_70170_p.field_72995_K)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = v.b(entityPlayer);
    em em = em.a(uUID);
    try {
      if (em == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    v.a((f_)em);
    ge.b.sendTo(new gf(false), (EntityPlayerMP)entityPlayer);
  }
  
  void b(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound, long paramLong1, long paramLong2) {
    try {
      if (paramLong2 == 0L)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramLong1 - paramLong2 <= 4000L)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    paramNBTTagCompound.func_74772_a("sexmod:galath_coin_activation_time", 0L);
    Vec3d vec3d1 = paramEntityPlayer.func_174791_d().func_72441_c(0.0D, paramEntityPlayer.func_70047_e(), 0.0D);
    Vec3d vec3d2 = vec3d1.func_178787_e(paramEntityPlayer.func_70040_Z().func_72432_b().func_186678_a(2.0D));
    Random random = paramEntityPlayer.func_70681_au();
    byte b = 0;
    try {
      while (b < 100.0F) {
        paramEntityPlayer.field_70170_p.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c, ((2.0F * random.nextFloat() - 1.0F) * 0.2F), ((2.0F * random.nextFloat() - 1.0F) * 0.2F), ((2.0F * random.nextFloat() - 1.0F) * 0.2F), new int[0]);
        b++;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    World world = paramEntityPlayer.field_70170_p;
    try {
      if (world.field_72995_K) {
        a(paramEntityPlayer);
        return;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    f_ f_ = new f_(paramEntityPlayer.field_70170_p, paramEntityPlayer, vec3d2);
    try {
      f_.func_70634_a(vec3d2.field_72450_a, vec3d2.field_72448_b, vec3d2.field_72449_c);
      v.a(paramEntityPlayer, f_);
      paramEntityPlayer.field_70170_p.func_72838_d((Entity)f_);
      if (v.b(paramEntityPlayer.getPersistentID()))
        f_.v(); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void d(EntityPlayer paramEntityPlayer) {
    try {
      if (paramEntityPlayer.field_70170_p.field_72995_K) {
        b(paramEntityPlayer);
      } else {
        c(paramEntityPlayer);
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  void c(EntityPlayer paramEntityPlayer) {
    UUID uUID = v.b(paramEntityPlayer);
    em em = em.a(uUID);
    try {
      if (em instanceof f_)
        a((f_)em); 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  public static void a(f_ paramf_) {
    paramf_.b(fp.GALATH_DE_SUMMON);
    paramf_.aC();
    paramf_.a(true);
    paramf_.c(paramf_.func_174791_d());
    paramf_.b(paramf_.field_70177_z);
  }
  
  @SideOnly(Side.CLIENT)
  void b(EntityPlayer paramEntityPlayer) {
    f_ f_ = null;
    try {
      for (em em : em.ad()) {
        try {
          if (em.field_70128_L)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!em.field_70170_p.field_72995_K)
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!(em instanceof f_))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (!paramEntityPlayer.equals(em.z()))
            continue; 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        f_ = (f_)em;
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {}
    try {
      if (f_ == null)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    a(paramEntityPlayer, f_);
  }
  
  @SideOnly(Side.CLIENT)
  public static void a(UUID paramUUID, f_ paramf_) {
    World world = paramf_.field_70170_p;
    try {
    
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    Vec3d vec3d1 = paramf_.Q() ? paramf_.o() : paramf_.func_174791_d();
    Vec3d vec3d2 = vec3d1.func_72441_c(0.0D, 1.5D, 0.0D);
    Random random = paramf_.func_70681_au();
    for (byte b = 0; b < 100.0F; b++) {
      Vec3d vec3d3 = new Vec3d(((random.nextFloat() * 2.0F - 1.0F) * 1.5F), ((random.nextFloat() * 2.0F - 1.0F) * 1.5F), ((random.nextFloat() * 2.0F - 1.0F) * 1.5F));
      Vec3d vec3d4 = vec3d2.func_178787_e(vec3d3);
      Vec3d vec3d5 = vec3d3.func_186678_a(-0.029999999329447746D);
      world.func_175688_a(EnumParticleTypes.DRAGON_BREATH, vec3d4.field_72450_a, vec3d4.field_72448_b, vec3d4.field_72449_c, vec3d5.field_72450_a, vec3d5.field_72448_b, vec3d5.field_72449_c, new int[0]);
    } 
    try {
      if ((Minecraft.func_71410_x()).field_71439_g.getPersistentID().equals(paramUUID))
        v.f = false; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
  }
  
  public static void a(EntityPlayer paramEntityPlayer, f_ paramf_) {
    a(paramEntityPlayer.getPersistentID(), paramf_);
  }
  
  void a(EntityPlayer paramEntityPlayer, NBTTagCompound paramNBTTagCompound, long paramLong1, long paramLong2) {
    try {
      if (paramLong2 == 0L)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    long l = paramLong1 - paramLong2;
    World world = paramEntityPlayer.field_70170_p;
    boolean bool = paramNBTTagCompound.func_74767_n("sexmod:galath_coin_de_summoning_animation_time");
    try {
      if (!bool) {
        try {
        
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
        try {
          if (l > 1000L - (world.field_72995_K ? 0L : 150L)) {
            paramNBTTagCompound.func_74757_a("sexmod:galath_coin_de_summoning_animation_time", true);
            d(paramEntityPlayer);
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        } 
      } 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (world.field_72995_K)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    try {
      if (paramLong1 - paramLong2 <= 3000L)
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    UUID uUID = v.b(paramEntityPlayer);
    em em = em.a(uUID);
    try {
      if (!(em instanceof f_))
        return; 
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    v.a((f_)em);
  }
  
  public void registerControllers(AnimationData paramAnimationData) {
    this.a = new AnimationController(this, "controller", 0.0F, this::a);
    paramAnimationData.addAnimationController(this.a);
  }
  
  @SideOnly(Side.CLIENT)
  protected <segs extends IAnimatable> PlayState a(AnimationEvent<segs> paramAnimationEvent) {
    NBTTagCompound nBTTagCompound = (Minecraft.func_71410_x()).field_71439_g.getEntityData();
    try {
      if (nBTTagCompound.func_74763_f("sexmod:galath_coin_activation_time") == 0L)
        try {
          if (nBTTagCompound.func_74763_f("sexmod:galath_coin_deactivation_time") == 0L) {
            paramAnimationEvent.getController().clearAnimationCache();
            return PlayState.STOP;
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {
          throw a(null);
        }  
    } catch (ConcurrentModificationException concurrentModificationException) {
      throw a(null);
    } 
    this.a.setAnimation((new AnimationBuilder()).addAnimation("animation.galath_coin.summon", (ILoopType)ILoopType.EDefaultLoopTypes.PLAY_ONCE));
    return PlayState.CONTINUE;
  }
  
  public AnimationFactory getFactory() {
    return this.i;
  }
  
  private static ConcurrentModificationException a(ConcurrentModificationException paramConcurrentModificationException) {
    return paramConcurrentModificationException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */