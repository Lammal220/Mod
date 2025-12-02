package com.trolmastercard.sexmod;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class a extends GuiScreen {
  public static final ResourceLocation k = new ResourceLocation("sexmod", "textures/gui/clothing_icons.png");
  
  static final int r = 20;
  
  static final float j = 0.25F;
  
  int n = 0;
  
  int l = 0;
  
  float o = 0.0F;
  
  public static float b = 0.0F;
  
  protected static List<Integer> a = new ArrayList<>();
  
  protected static int s = 0;
  
  protected static int h = 0;
  
  em c;
  
  boolean p = false;
  
  gq q;
  
  public static List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> m = new ArrayList<>();
  
  final UUID g;
  
  int i;
  
  int t;
  
  public boolean f = false;
  
  int d = 0;
  
  int e = 1;
  
  public a(@Nonnull em paramem) {
    this.g = paramem.f();
    fy fy = fy.a((Entity)paramem);
    if (fy == null)
      fy = fy.JENNY; 
    try {
      Constructor<? extends em> constructor = fy.npcClass.getConstructor(new Class[] { World.class });
      this.c = constructor.newInstance(new Object[] { this.field_146297_k.field_71441_e });
      this.c.b(true);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    e();
    String str = paramem.C();
    this.c.func_184212_Q().func_187227_b(em.b, str);
    byte b = 0;
    for (String str1 : this.c.Y()) {
      gw gw = br.e(str1);
      try {
        if (gw.CUSTOM_BONE.equals(gw))
          b++; 
      } catch (Exception exception) {
        throw a(null);
      } 
      Map.Entry<gw, Map.Entry<List<String>, Integer>> entry = null;
      try {
        if (gw.CUSTOM_BONE.equals(gw) && b > 1) {
          entry = b(this.c);
        } else {
          for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry1 : m) {
            if (((gw)entry1.getKey()).equals(gw))
              entry = entry1; 
          } 
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      try {
        if (entry == null)
          continue; 
      } catch (Exception exception) {
        throw a(null);
      } 
      m.remove(entry);
      int i = ((List)((Map.Entry)entry.getValue()).getKey()).indexOf(str1);
      if (i == -1)
        i = 0; 
      ((Map.Entry)entry.getValue()).setValue(Integer.valueOf(i));
      m.add(entry);
    } 
  }
  
  public void func_146274_d() throws IOException {
    super.func_146274_d();
    this.q.func_178039_p();
  }
  
  public static HashSet<String> b() {
    HashSet<String> hashSet = new HashSet();
    for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
      try {
        if (((List)((Map.Entry)entry.getValue()).getKey()).size() == 1)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Map.Entry entry1 = (Map.Entry)entry.getValue();
      List list = (List)entry1.getKey();
      Integer integer = (Integer)entry1.getValue();
      hashSet.add(list.get(integer.intValue()));
    } 
    return hashSet;
  }
  
  public static Map.Entry<gw, Map.Entry<List<String>, Integer>> b(em paramem) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add("cross");
    arrayList.addAll(br.a(paramem).get(gw.CUSTOM_BONE));
    return new AbstractMap.SimpleEntry<>(gw.CUSTOM_BONE, new AbstractMap.SimpleEntry<>(arrayList, Integer.valueOf(0)));
  }
  
  void e() {
    m.clear();
    List<Map.Entry<gw, Map.Entry<List<String>, Integer>>> list = this.c.d(this.g);
    this.i = list.size();
    m.addAll(list);
    for (gw gw : gw.values()) {
      try {
        if (gw != gw.GIRL_SPECIFIC) {
          ArrayList<String> arrayList = new ArrayList();
          arrayList.add("cross");
          m.add(new AbstractMap.SimpleEntry<>(gw, new AbstractMap.SimpleEntry<>(arrayList, Integer.valueOf(0))));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    for (Map.Entry<gw, List<String>> entry : br.a(this.c).entrySet()) {
      Map.Entry<gw, Map.Entry<List<String>, Integer>> entry1 = null;
      for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry2 : m) {
        if (((gw)entry.getKey()).equals(entry2.getKey()))
          entry1 = entry2; 
      } 
      try {
        if (entry1 == null)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      int i = m.indexOf(entry1);
      m.remove(entry1);
      ((List)((Map.Entry)entry1.getValue()).getKey()).addAll((Collection)entry.getValue());
      m.add(i, entry1);
    } 
  }
  
  public void func_73866_w_() {
    this.q = new gq(this.field_146297_k, this);
  }
  
  public void func_146280_a(Minecraft paramMinecraft, int paramInt1, int paramInt2) {
    super.func_146280_a(paramMinecraft, paramInt1, paramInt2);
    this.n = a(76.0F);
    this.l = b(89.0F);
    this.o = 90.0F;
  }
  
  boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    try {
      if (paramInt1 < paramInt3)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt1 > paramInt5)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt2 < paramInt4)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt2 > paramInt6)
        return false; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return true;
  }
  
  public void func_73863_a(int paramInt1, int paramInt2, float paramFloat) {
    try {
      super.func_73863_a(paramInt1, paramInt2, paramFloat);
      if (this.p)
        b += b6.a(h, s, paramFloat); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a();
    this.field_146297_k.field_71446_o.func_110577_a(k);
    int i = this.n - a(15.0F);
    int j = this.l - 20;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      func_73729_b(i, j, 100, a(paramInt1, paramInt2, i, j, i + 20, j + 20) ? 40 : 20, 20, 20);
      if (br.g() == null)
        b(i, paramInt1, paramInt2); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(this.n, this.l, this.o, (EntityLivingBase)this.c, 1.2345679F);
    this.c.func_70071_h_();
    this.q.func_148128_a(paramInt1, paramInt2, paramFloat);
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3) {
    int i = this.l - 40;
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      func_73729_b(paramInt1, i, 120, a(paramInt2, paramInt3, paramInt1, i, paramInt1 + 20, i + 20) ? 40 : 20, 20, 20);
      i -= 20;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      func_73729_b(paramInt1, i, 20, a(paramInt2, paramInt3, paramInt1, i, paramInt1 + 20, i + 20) ? 170 : 150, 20, 20);
      i -= 20;
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    func_73729_b(paramInt1, i, 0, a(paramInt2, paramInt3, paramInt1, i, paramInt1 + 20, i + 20) ? 170 : 150, 20, 20);
  }
  
  public boolean func_73868_f() {
    return false;
  }
  
  void c() {
    this.field_146297_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
    HashSet<String> hashSet = new HashSet();
    ArrayList<Integer> arrayList = new ArrayList();
    for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
      try {
        if (entry.getKey() == gw.GIRL_SPECIFIC) {
          arrayList.add(((Map.Entry)entry.getValue()).getValue());
          continue;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Map.Entry entry1 = (Map.Entry)entry.getValue();
      Integer integer = (Integer)entry1.getValue();
      try {
        if (integer.intValue() == 0)
          continue; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      String str = ((List<String>)entry1.getKey()).get(integer.intValue());
      hashSet.add(str);
    } 
    ge.b.sendToServer(new fw(em.a(hashSet), this.g, arrayList));
    this.field_146297_k.field_71439_g.func_71053_j();
  }
  
  public void a(gw paramgw, boolean paramBoolean, int paramInt) {
    Map.Entry entry1;
    int i;
    this.field_146297_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
    ArrayList<Map.Entry> arrayList1 = new ArrayList();
    ArrayList<Integer> arrayList = new ArrayList();
    byte b = 0;
    for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
      try {
        if (((gw)entry.getKey()).equals(paramgw)) {
          arrayList1.add(entry);
          arrayList.add(Integer.valueOf(b));
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      b++;
    } 
    try {
      if (arrayList1.size() == 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (arrayList1.size() == 1) {
      entry1 = arrayList1.get(0);
      i = ((Integer)arrayList.get(0)).intValue();
    } else {
      int m;
      try {
        if (this.i == 0 || paramInt > this.i - 1 + gw.a()) {
          m = paramInt - this.i + gw.a();
        } else {
          m = paramInt;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      entry1 = arrayList1.get(m);
      i = ((Integer)arrayList.get(m)).intValue();
    } 
    try {
      if (entry1 == null)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Map.Entry entry2 = (Map.Entry)entry1.getValue();
    int j = ((Integer)entry2.getValue()).intValue();
    int k = ((List)entry2.getKey()).size();
    try {
      if (paramBoolean) {
        if (++j >= k)
          j = 0; 
      } else if (--j < 0) {
        j = k - 1;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    m.set(i, new AbstractMap.SimpleEntry<>((gw)entry1.getKey(), new AbstractMap.SimpleEntry<>((List<String>)((Map.Entry)entry1.getValue()).getKey(), Integer.valueOf(j))));
    ArrayList<Map.Entry> arrayList2 = new ArrayList();
    for (Map.Entry<gw, Map.Entry<List<String>, Integer>> entry : m) {
      try {
        if (entry.getKey() == gw.GIRL_SPECIFIC)
          arrayList2.add(entry); 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
    } 
    this.c.b((List)arrayList2);
  }
  
  public void a(int paramInt1, int paramInt2, float paramFloat, cy paramcy) {
    a(paramInt1, paramInt2, paramFloat, paramcy, 1.876945F);
  }
  
  public void a(cy paramcy) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    a(this.n, this.l, this.o, paramcy, 2.876945F, paramcy.f ? 1 : 0);
  }
  
  public void a(String paramString, int paramInt1, int paramInt2) {
    func_146279_a(paramString, paramInt1, paramInt2);
  }
  
  protected void func_146273_a(int paramInt1, int paramInt2, int paramInt3, long paramLong) {
    try {
      super.func_146273_a(paramInt1, paramInt2, paramInt3, paramLong);
      if (paramInt3 != 0)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramInt1 < this.field_146294_l / 2)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramInt1 - this.t;
    a.add(Integer.valueOf(i));
    this.t = paramInt1;
  }
  
  protected void func_73864_a(int paramInt1, int paramInt2, int paramInt3) throws IOException {
    try {
      super.func_73864_a(paramInt1, paramInt2, paramInt3);
      this.q.func_148179_a(paramInt1, paramInt2, paramInt3);
      if (paramInt3 != 0)
        return; 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    this.f = true;
    this.p = true;
    this.t = paramInt1;
    int i = this.n - a(15.0F);
    int j = this.l - 20;
    try {
      if (a(paramInt1, paramInt2, i, j, i + 20, j + 20))
        c(); 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      if (br.g() != null)
        return; 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    j = this.l - 40;
    if (a(paramInt1, paramInt2, i, j, i + 20, j + 20)) {
      this.field_146297_k.func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_184371_a(SoundEvents.field_187909_gi, 1.0F));
      this.field_146297_k.field_71439_g.func_71053_j();
      int k = br.b(true);
      try {
        if (k != 0) {
          br.d = true;
          return;
        } 
      } catch (URISyntaxException uRISyntaxException) {
        throw a(null);
      } 
      em em1 = em.b(this.g);
      try {
        if (em1 != null)
          a(em1); 
      } catch (URISyntaxException uRISyntaxException) {
        throw a(null);
      } 
      return;
    } 
    try {
      j -= 20;
      if (a(paramInt1, paramInt2, i, j, i + 20, j + 20)) {
        Desktop.getDesktop().open(new File(br.d()));
        return;
      } 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      j -= 20;
      if (a(paramInt1, paramInt2, i, j, i + 20, j + 20))
        try {
          Desktop.getDesktop().browse(new URI("http://fapcraft.org/assets/video/tutorial/girl_wand.mp4"));
        } catch (URISyntaxException uRISyntaxException) {
          throw new RuntimeException(uRISyntaxException);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  protected void func_146286_b(int paramInt1, int paramInt2, int paramInt3) {
    try {
      super.func_146286_b(paramInt1, paramInt2, paramInt3);
      if (paramInt3 == 0) {
        this.p = false;
        this.f = false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.d = h;
  }
  
  int a(float paramFloat) {
    return Math.round(this.field_146294_l * paramFloat / 100.0F);
  }
  
  int b(float paramFloat) {
    return Math.round(this.field_146295_m * paramFloat / 100.0F);
  }
  
  public void func_146281_b() {
    super.func_146281_b();
    this.c.field_70170_p.func_72973_f((Entity)this.c);
    a.clear();
    m.clear();
  }
  
  public em d() {
    return this.c;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.field_146297_k.field_71446_o.func_110577_a(k);
    func_73729_b(paramInt1, paramInt2, paramInt3, paramInt4, 20, 20);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3) {
    a(paramInt1, paramInt2, paramInt3, 0);
  }
  
  public void a(int paramInt1, int paramInt2, e1 parame1) {
    a(paramInt1, paramInt2, parame1.c, parame1.b);
  }
  
  void a(int paramInt1, int paramInt2, float paramFloat1, EntityLivingBase paramEntityLivingBase, float paramFloat2) {
    a(paramInt1, paramInt2, paramFloat1, paramEntityLivingBase, paramFloat2, 0);
  }
  
  void a(int paramInt1, int paramInt2, float paramFloat1, EntityLivingBase paramEntityLivingBase, float paramFloat2, int paramInt3) {
    float f1 = paramEntityLivingBase.field_70761_aq;
    float f2 = paramEntityLivingBase.field_70177_z;
    float f3 = paramEntityLivingBase.field_70125_A;
    float f4 = paramEntityLivingBase.field_70758_at;
    float f5 = paramEntityLivingBase.field_70759_as;
    paramEntityLivingBase.field_70761_aq = 0.0F;
    paramEntityLivingBase.field_70177_z = 0.0F;
    paramEntityLivingBase.field_70125_A = 0.0F;
    paramEntityLivingBase.field_70758_at = 0.0F;
    paramEntityLivingBase.field_70759_as = 0.0F;
    GlStateManager.func_179142_g();
    GlStateManager.func_179094_E();
    GlStateManager.func_179109_b(paramInt1, paramInt2, 50.0F);
    GlStateManager.func_179152_a(-paramFloat1, paramFloat1, paramFloat1);
    GlStateManager.func_179114_b(180.0F, 0.0F, 0.0F, 1.0F);
    GlStateManager.func_179114_b(135.0F, 0.0F, 1.0F, 0.0F);
    RenderHelper.func_74519_b();
    GlStateManager.func_179114_b(-135.0F, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179109_b(0.0F, 0.0F, paramInt3);
    GlStateManager.func_179114_b(b, 0.0F, 1.0F, 0.0F);
    GlStateManager.func_179114_b(0.25F, 1.0F, 0.0F, 0.0F);
    GlStateManager.func_179109_b(0.0F, 0.0F, 0.0F);
    RenderManager renderManager = Minecraft.func_71410_x().func_175598_ae();
    renderManager.func_178631_a(180.0F);
    renderManager.func_178633_a(false);
    renderManager.func_188391_a((Entity)paramEntityLivingBase, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat2, false);
    renderManager.func_178633_a(true);
    GlStateManager.func_179121_F();
    RenderHelper.func_74518_a();
    GlStateManager.func_179101_C();
    GlStateManager.func_179138_g(OpenGlHelper.field_77476_b);
    GlStateManager.func_179090_x();
    GlStateManager.func_179138_g(OpenGlHelper.field_77478_a);
    paramEntityLivingBase.field_70761_aq = f1;
    paramEntityLivingBase.field_70177_z = f2;
    paramEntityLivingBase.field_70125_A = f3;
    paramEntityLivingBase.field_70758_at = f4;
    paramEntityLivingBase.field_70759_as = f5;
  }
  
  void a() {
    try {
      if (this.p)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    float f = Minecraft.func_175610_ah();
    if (f == 0.0F)
      f = 0.1F; 
    try {
      if (this.d == 0) {
        b += (this.e * 10) / f;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      b += this.d / f;
      this.d = (int)(this.d * (1.0F - 0.25F / f));
      if (Math.abs(this.d) > 10)
        return; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.e = (this.d > 0) ? 1 : -1;
    this.d = 0;
  }
  
  @SideOnly(Side.CLIENT)
  public static void a(@Nonnull em paramem) {
    // Byte code:
    //   0: invokestatic func_71410_x : ()Lnet/minecraft/client/Minecraft;
    //   3: astore_1
    //   4: aload_1
    //   5: getfield field_71462_r : Lnet/minecraft/client/gui/GuiScreen;
    //   8: instanceof com/trolmastercard/sexmod/a
    //   11: ifeq -> 19
    //   14: return
    //   15: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   18: athrow
    //   19: invokestatic g : ()Ljava/lang/String;
    //   22: ifnull -> 38
    //   25: invokestatic b : ()Z
    //   28: ifeq -> 46
    //   31: goto -> 38
    //   34: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   37: athrow
    //   38: iconst_1
    //   39: goto -> 47
    //   42: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: iconst_0
    //   47: istore_2
    //   48: iload_2
    //   49: ifne -> 98
    //   52: aload_1
    //   53: getfield field_71439_g : Lnet/minecraft/client/entity/EntityPlayerSP;
    //   56: new net/minecraft/util/text/TextComponentString
    //   59: dup
    //   60: new java/lang/StringBuilder
    //   63: dup
    //   64: invokespecial <init> : ()V
    //   67: ldc 'You have to whitelist the server to use its custom models. '
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: getstatic net/minecraft/util/text/TextFormatting.YELLOW : Lnet/minecraft/util/text/TextFormatting;
    //   75: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   78: ldc '/whitelistserver'
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: invokevirtual toString : ()Ljava/lang/String;
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: iconst_1
    //   90: invokevirtual func_146105_b : (Lnet/minecraft/util/text/ITextComponent;Z)V
    //   93: return
    //   94: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   97: athrow
    //   98: aload_1
    //   99: aload_1
    //   100: aload_0
    //   101: <illegal opcode> run : (Lnet/minecraft/client/Minecraft;Lcom/trolmastercard/sexmod/em;)Ljava/lang/Runnable;
    //   106: invokevirtual func_152344_a : (Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;
    //   109: pop
    //   110: return
    // Exception table:
    //   from	to	target	type
    //   4	15	15	java/lang/RuntimeException
    //   19	31	34	java/lang/RuntimeException
    //   25	42	42	java/lang/RuntimeException
    //   48	94	94	java/lang/RuntimeException
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  @SideOnly(Side.CLIENT)
  public static class b {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void a(InputEvent.KeyInputEvent param1KeyInputEvent) {
      try {
        if (!ClientProxy.keyBindings[1].func_151468_f())
          return; 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      try {
        if (br.d) {
          try {
          
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
          try {
            br.d = (0 != br.b(true));
            if (br.d)
              return; 
          } catch (RuntimeException runtimeException) {
            throw a(null);
          } 
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      Minecraft minecraft = Minecraft.func_71410_x();
      ei ei = ei.d(minecraft.field_71439_g.getPersistentID());
      try {
        if (ei == null) {
          minecraft.field_71439_g.func_146105_b((ITextComponent)new TextComponentString("You have to turn into the girl you want to customize"), true);
          return;
        } 
      } catch (RuntimeException runtimeException) {
        throw a(null);
      } 
      a.a(ei);
    }
    
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void a(TickEvent.ClientTickEvent param1ClientTickEvent) {
      a.h = a.s;
      a.s = 0;
      for (Integer integer : a.a)
        a.s += integer.intValue(); 
      a.a.clear();
    }
    
    private static RuntimeException a(RuntimeException param1RuntimeException) {
      return param1RuntimeException;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */