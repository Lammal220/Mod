package com.trolmastercard.sexmod;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
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

public class ap extends Item implements IAnimatable {
  static final String e = "sexmodAllieInUse";
  
  static final String d = "sexmodAllieInUseTicks";
  
  public static final String j = "sexmodUses";
  
  public static final String h = "sexmodAllieID";
  
  static final Integer c = Integer.valueOf(95);
  
  static final Integer k = Integer.valueOf(50);
  
  public static final int a = 150;
  
  public static final float f = 0.75F;
  
  public static final ap b = new ap();
  
  private final AnimationFactory i = new AnimationFactory(this);
  
  AnimationController<ap> g;
  
  public ap() {
    func_77637_a(CreativeTabs.field_78026_f);
    this.field_77777_bU = 1;
  }
  
  public static void a() {
    b.setRegistryName("sexmod", "allies_lamp");
    b.func_77655_b("allies_lamp");
    MinecraftForge.EVENT_BUS.register(ap.class);
  }
  
  @SubscribeEvent
  public static void a(RegistryEvent.Register<Item> paramRegister) {
    paramRegister.getRegistry().register((IForgeRegistryEntry)b);
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public static void a(ModelRegistryEvent paramModelRegistryEvent) {
    ModelLoader.setCustomModelResourceLocation(b, 0, new ModelResourceLocation("sexmod:allies_lamp"));
    b.setTileEntityItemStackRenderer((TileEntityItemStackRenderer)new f0());
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void a(RenderGameOverlayEvent.Pre paramPre) {
    NBTTagCompound nBTTagCompound = (Minecraft.func_71410_x()).field_71439_g.getEntityData();
    try {
      if (nBTTagCompound.func_74767_n("sexmodAllieInUse"))
        paramPre.setCanceled(true); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SubscribeEvent
  public void a(LootTableLoadEvent paramLootTableLoadEvent) {
    HashSet<ResourceLocation> hashSet = new HashSet();
    hashSet.add(LootTableList.field_186424_f);
    hashSet.add(LootTableList.field_186429_k);
    hashSet.add(LootTableList.field_186422_d);
    hashSet.add(LootTableList.field_191192_o);
    if (hashSet.contains(paramLootTableLoadEvent.getName())) {
      LootPool lootPool = paramLootTableLoadEvent.getTable().getPool("pool3");
      if (lootPool == null)
        lootPool = paramLootTableLoadEvent.getTable().getPool("pool2"); 
      try {
        if (lootPool != null)
          lootPool.addEntry((LootEntry)new LootEntryItem(b, 5, 0, new net.minecraft.world.storage.loot.functions.LootFunction[0], new net.minecraft.world.storage.loot.conditions.LootCondition[0], "sexmod:allies_lamp")); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
  }
  
  public void registerControllers(AnimationData paramAnimationData) {
    this.g = new AnimationController(this, "controller", 2.0F, this::a);
    paramAnimationData.addAnimationController(this.g);
  }
  
  @SideOnly(Side.CLIENT)
  public void func_77624_a(ItemStack paramItemStack, World paramWorld, List<String> paramList, ITooltipFlag paramITooltipFlag) {
    NBTTagCompound nBTTagCompound = paramItemStack.func_77978_p();
    try {
      if (nBTTagCompound == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = 3 - paramItemStack.func_77978_p().func_74762_e("sexmodUses");
    try {
      switch (i) {
        case 2:
          paramList.add("2 wishes left");
          break;
        case 1:
          paramList.add("1 wish left");
          break;
        case 0:
          paramList.add("no wishes left");
          break;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  protected <segs extends IAnimatable> PlayState a(AnimationEvent<segs> paramAnimationEvent) {
    EntityPlayerSP entityPlayerSP = (Minecraft.func_71410_x()).field_71439_g;
    NBTTagCompound nBTTagCompound = entityPlayerSP.getEntityData();
    boolean bool = nBTTagCompound.func_74767_n("sexmodAllieInUse");
    try {
      if (!bool) {
        paramAnimationEvent.getController().clearAnimationCache();
        return PlayState.STOP;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramAnimationEvent.getController().setAnimation((new AnimationBuilder()).addAnimation("animation.lamp.rub", (ILoopType)ILoopType.EDefaultLoopTypes.HOLD_ON_LAST_FRAME));
    return PlayState.CONTINUE;
  }
  
  public void func_77663_a(ItemStack paramItemStack, World paramWorld, Entity paramEntity, int paramInt, boolean paramBoolean) {
    try {
      if (!(paramEntity instanceof EntityPlayer))
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    EntityPlayer entityPlayer = (EntityPlayer)paramEntity;
    NBTTagCompound nBTTagCompound1 = paramEntity.getEntityData();
    try {
      if (!paramItemStack.equals(entityPlayer.func_184614_ca()))
        try {
          if (!paramItemStack.equals(entityPlayer.func_184592_cb()))
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    boolean bool = nBTTagCompound1.func_74767_n("sexmodAllieInUse");
    int i = nBTTagCompound1.func_74762_e("sexmodAllieInUseTicks");
    try {
      if (!bool)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      nBTTagCompound1.func_74768_a("sexmodAllieInUseTicks", i + 1);
      if (i > k.intValue() && i < c.intValue()) {
        double d = ((i - k.intValue()) / (c.intValue() - k.intValue()));
        d = b6.h(d);
        Vec3d vec3d1 = new Vec3d(0.0D, entityPlayer.eyeHeight * (1.0D - d), 0.0D);
        cj.a(paramWorld, EnumParticleTypes.CRIT_MAGIC, a(entityPlayer).func_178787_e(vec3d1), (int)(d * 150.0D), d * 0.75D, d);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (i < c.intValue())
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      cj.a(paramWorld, EnumParticleTypes.CRIT_MAGIC, a(entityPlayer), 150, 0.75D, 2.0D);
      nBTTagCompound1.func_74757_a("sexmodAllieInUse", false);
      nBTTagCompound1.func_74768_a("sexmodAllieInUseTicks", 0);
      if (paramWorld.field_72995_K) {
        d3.a(false);
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    NBTTagCompound nBTTagCompound2 = paramItemStack.func_77978_p();
    if (nBTTagCompound2 == null)
      nBTTagCompound2 = new NBTTagCompound(); 
    nBTTagCompound2.func_74768_a("sexmodUses", nBTTagCompound2.func_74762_e("sexmodUses") + 1);
    ev ev = new ev(entityPlayer.field_70170_p, entityPlayer.func_184614_ca());
    ev.e(entityPlayer.getPersistentID());
    Vec3d vec3d = a(entityPlayer);
    ev.func_70080_a(vec3d.field_72450_a, vec3d.field_72448_b, vec3d.field_72449_c, entityPlayer.field_70177_z + 180.0F, entityPlayer.field_70125_A);
    ev.c(ev.func_174791_d());
    ev.b(entityPlayer.field_70177_z + 180.0F);
    ev.a(true);
    ev.func_189654_d(true);
    ev.field_70145_X = true;
    entityPlayer.field_70170_p.func_72838_d((Entity)ev);
    BlockPos blockPos = ev.func_180425_c().func_177982_a(0, -1, 0);
    try {
      if (ev.field_70170_p.func_180495_p(blockPos).func_177230_c().equals(Blocks.field_150354_m)) {
        ev.b(fp.SUMMON_SAND);
      } else {
        try {
        
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        ev.b(ev.f() ? fp.SUMMON : fp.SUMMON_NORMAL);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    paramItemStack.func_77982_d(nBTTagCompound2);
  }
  
  Vec3d a(EntityPlayer paramEntityPlayer) {
    return paramEntityPlayer.func_174791_d().func_178787_e(ck.a(new Vec3d(0.0D, 0.0D, 2.0D), paramEntityPlayer.field_70759_as));
  }
  
  public AnimationFactory getFactory() {
    return this.i;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public static class a {
    @SubscribeEvent
    public void a(PlayerEvent.PlayerLoggedOutEvent param1PlayerLoggedOutEvent) {
      param1PlayerLoggedOutEvent.player.getEntityData().func_74757_a("sexmodAllieInUse", false);
    }
    
    @SubscribeEvent
    public void a(PlayerInteractEvent.RightClickItem param1RightClickItem) {
      EntityPlayer entityPlayer = param1RightClickItem.getEntityPlayer();
      EnumHand enumHand = param1RightClickItem.getHand();
      ItemStack itemStack = entityPlayer.func_184586_b(enumHand);
      try {
        if (ei.e(entityPlayer))
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      try {
        if (entityPlayer.field_70170_p.field_72995_K)
          try {
            if (!d3.b())
              return; 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          }  
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      if (!entityPlayer.field_70170_p.field_72995_K)
        try {
          for (em em : em.ad()) {
            try {
              if (em.field_70128_L)
                continue; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            try {
              if (!(em instanceof ev))
                continue; 
            } catch (ConcurrentModificationException concurrentModificationException) {
              throw a(null);
            } 
            ev ev = (ev)em;
            ItemStack itemStack1 = (ItemStack)ev.func_184212_Q().func_187225_a(ev.N);
            if (itemStack.equals(itemStack1))
              return; 
          } 
        } catch (ConcurrentModificationException concurrentModificationException) {} 
      try {
        if (itemStack.func_77973_b() != ap.b)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      NBTTagCompound nBTTagCompound1 = itemStack.func_77978_p();
      try {
        if (nBTTagCompound1 != null)
          try {
            if (nBTTagCompound1.func_74762_e("sexmodUses") >= 3)
              return; 
          } catch (ConcurrentModificationException concurrentModificationException) {
            throw a(null);
          }  
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      NBTTagCompound nBTTagCompound2 = entityPlayer.getEntityData();
      boolean bool = nBTTagCompound2.func_74767_n("sexmodAllieInUse");
      try {
        if (bool)
          return; 
      } catch (ConcurrentModificationException concurrentModificationException) {
        throw a(null);
      } 
      nBTTagCompound2.func_74757_a("sexmodAllieInUse", true);
      nBTTagCompound2.func_74768_a("sexmodAllieInUseTicks", 0);
    }
    
    private static ConcurrentModificationException a(ConcurrentModificationException param1ConcurrentModificationException) {
      return param1ConcurrentModificationException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */