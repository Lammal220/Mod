package com.trolmastercard.sexmod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoCube;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
import software.bernie.geckolib3.util.MatrixStack;

public class b extends GeoEntityRenderer<cy> {
  public static final float e = 1.876945F;
  
  public static final float i = 2.876945F;
  
  Minecraft a = Minecraft.func_71410_x();
  
  cy c = null;
  
  br.b b = null;
  
  HashMap<String, String> h = new HashMap<>();
  
  HashMap<String, String> f = new HashMap<>();
  
  HashMap<String, gt> g = new HashMap<>();
  
  public static boolean k = false;
  
  Vec3d d = new Vec3d(1.0D, 1.0D, 1.0D);
  
  Vec3d j;
  
  public b(RenderManager paramRenderManager, AnimatedGeoModel<cy> paramAnimatedGeoModel) {
    super(paramRenderManager, paramAnimatedGeoModel);
    a();
  }
  
  void a() {
    this.h.put("customLegL", "legL");
    this.h.put("customShinL", "shinL");
    this.h.put("customLegR", "legR");
    this.h.put("customShinR", "shinR");
    this.f.put("top", "upperBody");
    this.f.put("customArmL", "armL");
    this.f.put("customLowerArmL", "lowerArmL");
    this.f.put("customArmR", "armR");
    this.f.put("customLowerArmR", "lowerArmR");
    this.g.put("lowerArmR", paramem -> gc.c(paramem.ai()));
    this.g.put("lowerArmL", paramem -> gc.c(paramem.T()));
  }
  
  boolean d(cy paramcy) {
    String str1 = paramcy.a();
    try {
      if (paramcy.f)
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (br.f(str1))
        return false; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (br.g() != null)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    UUID uUID = paramcy.b();
    em em = em.b(uUID);
    try {
      if (em == null)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    HashSet<String> hashSet = em.Y();
    hashSet.remove(str1);
    String str2 = em.a(hashSet);
    ge.b.sendToServer(new fw(str2, paramcy.b()));
    return true;
  }
  
  @SideOnly(Side.CLIENT)
  public static void a(em paramem, float paramFloat) {
    try {
      if (paramem.field_70128_L)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!paramem.field_70170_p.field_72995_K)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (!paramem.H())
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    RenderManager renderManager = Minecraft.func_71410_x().func_175598_ae();
    for (String str : paramem.Y()) {
      cy cy1 = new cy(paramem.field_70170_p, paramem.f(), str);
      k = true;
      renderManager.func_188391_a((Entity)cy1, 0.0D, 0.0D, 0.0D, 0.0F, paramFloat, false);
    } 
  }
  
  public boolean a(cy paramcy, ICamera paramICamera, double paramDouble1, double paramDouble2, double paramDouble3) {
    return super.func_177071_a((Entity)paramcy, paramICamera, paramDouble1, paramDouble2, paramDouble3);
  }
  
  boolean a(float paramFloat) {
    try {
      if (paramFloat == 2.876945F)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (paramFloat == 1.876945F)
        return true; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (k) {
        k = false;
        return true;
      } 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return false;
  }
  
  void a(br.b paramb, cy paramcy, float paramFloat) {
    try {
      if (paramb != null)
        try {
          if (paramb.i() != c8.DEFAULT) {
            try {
              GL11.glDisable(2896);
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            this.j = (paramb.i() == c8.SEXMOD) ? cj.a(paramcy, paramFloat) : null;
            return;
          } 
          this.j = null;
          return;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.j = null;
  }
  
  public void a(cy paramcy, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2) {
    try {
      if (!a(paramFloat2))
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (br.d)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (d(paramcy))
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    paramcy.c = new MatrixStack();
    br.b b1 = br.b(paramcy.a());
    try {
      this.c = paramcy;
      this.b = b1;
      a(b1, paramcy, paramFloat2);
      if (paramFloat2 != 1.876945F)
        try {
          if (paramFloat2 != 2.876945F) {
            EntityLivingBase entityLivingBase;
            UUID uUID = paramcy.b();
            try {
              if (uUID == null)
                return; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            em em = em.b(uUID);
            try {
              if (em == null)
                return; 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            try {
              if (b1 != null)
                try {
                  if (!b1.a())
                    try {
                      if (em.ah() == 0)
                        return; 
                    } catch (IllegalStateException illegalStateException) {
                      throw a(null);
                    }  
                } catch (IllegalStateException illegalStateException) {
                  throw a(null);
                }  
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            if (!(em instanceof ei)) {
              entityLivingBase = (EntityLivingBase)em;
            } else {
              UUID uUID1 = ((ei)em).m();
              try {
                if (uUID1 == null)
                  return; 
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              EntityPlayer entityPlayer = paramcy.field_70170_p.func_152378_a(uUID1);
              try {
              
              } catch (IllegalStateException illegalStateException) {
                throw a(null);
              } 
              entityLivingBase = (EntityLivingBase)((entityPlayer == null) ? em : entityPlayer);
            } 
            Vec3d vec3d1 = em.a(this.a, paramcy, entityLivingBase, paramFloat2);
            BlockPos blockPos = new BlockPos(Math.floor(entityLivingBase.field_70165_t), Math.floor(entityLivingBase.field_70163_u), Math.floor(entityLivingBase.field_70161_v));
            int i = entityLivingBase.field_70170_p.func_175721_c(blockPos, true);
            Vec3d vec3d2 = new Vec3d(1.0D, 1.0D, 1.0D);
            float f = be.b(i, 10.0F, 15.0F) / 15.0F;
            try {
              this.d = new Vec3d(vec3d2.field_72450_a * f, vec3d2.field_72448_b * f, vec3d2.field_72449_c * f);
              GlStateManager.func_179094_E();
              GlStateManager.func_179137_b(vec3d1.field_72450_a, vec3d1.field_72448_b, vec3d1.field_72449_c);
              if (em.Q())
                GlStateManager.func_179114_b(em.I().floatValue(), 0.0F, 1.0F, 0.0F); 
            } catch (IllegalStateException illegalStateException) {
              throw a(null);
            } 
            super.doRender(paramcy, 0.0D, 0.0D, 0.0D, paramFloat1, paramFloat2);
            GlStateManager.func_179121_F();
            GL11.glEnable(2896);
            return;
          } 
          this.d = new Vec3d(1.0D, 1.0D, 1.0D);
          super.doRender(paramcy, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
          GL11.glEnable(2896);
          return;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    this.d = new Vec3d(1.0D, 1.0D, 1.0D);
    super.doRender(paramcy, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
    GL11.glEnable(2896);
  }
  
  public static Vec3d a(Minecraft paramMinecraft, cy paramcy, EntityLivingBase paramEntityLivingBase, em paramem, float paramFloat) {
    Vec3d vec3d1;
    if (paramem.Q()) {
      Vec3d vec3d = paramem.o();
      float f = paramem.I().floatValue();
      paramcy.field_70169_q = vec3d.field_72450_a;
      paramcy.field_70167_r = vec3d.field_72448_b;
      paramcy.field_70166_s = vec3d.field_72449_c;
      paramcy.field_70142_S = vec3d.field_72450_a;
      paramcy.field_70137_T = vec3d.field_72448_b;
      paramcy.field_70136_U = vec3d.field_72449_c;
      paramcy.field_70165_t = vec3d.field_72450_a;
      paramcy.field_70163_u = vec3d.field_72448_b;
      paramcy.field_70161_v = vec3d.field_72449_c;
      paramcy.field_70177_z = f;
      paramcy.field_70126_B = f;
      paramcy.field_70759_as = f;
      paramcy.field_70758_at = f;
      paramcy.field_70761_aq = f;
      paramcy.field_70760_ar = f;
      paramcy.field_70125_A = f;
      paramcy.field_70127_C = f;
      vec3d1 = vec3d;
    } else {
      paramcy.field_70177_z = paramEntityLivingBase.field_70177_z;
      paramcy.field_70126_B = paramEntityLivingBase.field_70126_B;
      paramcy.field_70759_as = paramEntityLivingBase.field_70759_as;
      paramcy.field_70758_at = paramEntityLivingBase.field_70758_at;
      paramcy.field_70761_aq = paramEntityLivingBase.field_70761_aq;
      paramcy.field_70760_ar = paramEntityLivingBase.field_70760_ar;
      paramcy.field_70125_A = paramEntityLivingBase.field_70125_A;
      paramcy.field_70127_C = paramEntityLivingBase.field_70127_C;
      paramcy.field_70169_q = paramEntityLivingBase.field_70169_q;
      paramcy.field_70167_r = paramEntityLivingBase.field_70167_r;
      paramcy.field_70166_s = paramEntityLivingBase.field_70166_s;
      paramcy.field_70142_S = paramEntityLivingBase.field_70142_S;
      paramcy.field_70137_T = paramEntityLivingBase.field_70137_T;
      paramcy.field_70136_U = paramEntityLivingBase.field_70136_U;
      paramcy.field_70165_t = paramEntityLivingBase.field_70165_t;
      paramcy.field_70163_u = paramEntityLivingBase.field_70163_u;
      paramcy.field_70161_v = paramEntityLivingBase.field_70161_v;
      vec3d1 = b6.a(new Vec3d(paramEntityLivingBase.field_70142_S, paramEntityLivingBase.field_70137_T, paramEntityLivingBase.field_70136_U), paramEntityLivingBase.func_174791_d(), paramFloat);
    } 
    EntityPlayerSP entityPlayerSP = paramMinecraft.field_71439_g;
    Vec3d vec3d2 = b6.a(new Vec3d(((EntityPlayer)entityPlayerSP).field_70142_S, ((EntityPlayer)entityPlayerSP).field_70137_T, ((EntityPlayer)entityPlayerSP).field_70136_U), entityPlayerSP.func_174791_d(), paramFloat);
    return vec3d1.func_178788_d(vec3d2);
  }
  
  public void a(GeoModel paramGeoModel, cy paramcy, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    GlStateManager.func_179129_p();
    GlStateManager.func_179091_B();
    BufferBuilder bufferBuilder = Tessellator.func_178181_a().func_178180_c();
    bufferBuilder.func_181668_a(7, DefaultVertexFormats.field_181712_l);
    for (GeoBone geoBone : paramGeoModel.topLevelBones) {
      try {
        if (paramFloat1 != 1.876945F)
          a(paramcy, geoBone, paramFloat1); 
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      paramcy.c.translate(-geoBone.getPivotX() / 16.0F, -geoBone.getPivotY() / 16.0F, -geoBone.getPivotZ() / 16.0F);
      renderRecursively(bufferBuilder, geoBone, paramFloat2, paramFloat3, paramFloat4, paramFloat5);
    } 
    Tessellator.func_178181_a().func_78381_a();
    GlStateManager.func_179101_C();
    GlStateManager.func_179089_o();
  }
  
  EntityLivingBase c(cy paramcy) {
    EntityLivingBase entityLivingBase;
    em em = b(paramcy);
    try {
      if (em == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    if (!(em instanceof ei)) {
      entityLivingBase = (EntityLivingBase)em;
    } else {
      EntityPlayer entityPlayer = paramcy.field_70170_p.func_152378_a(((ei)em).m());
      try {
      
      } catch (IllegalStateException illegalStateException) {
        throw a(null);
      } 
      entityLivingBase = (EntityLivingBase)((entityPlayer == null) ? em : entityPlayer);
    } 
    return entityLivingBase;
  }
  
  em b(cy paramcy) {
    UUID uUID = paramcy.b();
    em em = fs.a(uUID);
    try {
      if (em != null)
        return em; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return em.b(uUID);
  }
  
  void a(cy paramcy, GeoBone paramGeoBone, float paramFloat) {
    String str = a(paramcy);
    try {
      if (str == null)
        return; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    a(paramcy, paramGeoBone, paramFloat, str);
  }
  
  void a(cy paramcy, GeoBone paramGeoBone, float paramFloat, String paramString) {
    em em = b(paramcy);
    EntityLivingBase entityLivingBase = c(paramcy);
    try {
      paramcy.c = em.a(paramString, false);
      if (paramcy.f)
        try {
          if (paramFloat == 2.876945F) {
            paramcy.c.scale(0.5F, 0.5F, 0.5F);
            paramcy.c.rotateY((float)Math.toRadians(-a.b));
            return;
          } 
          return;
        } catch (IllegalStateException illegalStateException) {
          throw a(null);
        }  
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
  }
  
  String a(cy paramcy) {
    try {
      if (paramcy.f)
        return paramcy.d.boneName; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    br.b b1 = br.b(paramcy.a());
    try {
      if (b1 == null)
        return null; 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    try {
      if (gw.CUSTOM_BONE.equals(b1.j()))
        return b1.b(); 
    } catch (IllegalStateException illegalStateException) {
      throw a(null);
    } 
    return (b1.j()).boneName;
  }
  
  public void renderRecursively(BufferBuilder paramBufferBuilder, GeoBone paramGeoBone, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.c.c.push();
    this.c.c.translate(paramGeoBone);
    this.c.c.moveToPivot(paramGeoBone);
    this.c.c.rotate(paramGeoBone);
    this.c.c.scale(paramGeoBone);
    this.c.c.moveBackFromPivot(paramGeoBone);
    if (!paramGeoBone.isHidden())
      for (GeoCube geoCube : paramGeoBone.childCubes) {
        this.c.c.push();
        GlStateManager.func_179094_E();
        renderCube(paramBufferBuilder, geoCube, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
        GlStateManager.func_179121_F();
        this.c.c.pop();
      }  
    if (!paramGeoBone.childBonesAreHiddenToo())
      for (GeoBone geoBone : paramGeoBone.childBones)
        renderRecursively(paramBufferBuilder, geoBone, paramFloat1, paramFloat2, paramFloat3, paramFloat4);  
    try {
      this.c.c.pop();
    } catch (IllegalStateException illegalStateException) {}
  }
  
  public void renderCube(BufferBuilder paramBufferBuilder, GeoCube paramGeoCube, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/trolmastercard/sexmod/cy;
    //   4: getfield c : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   7: aload_2
    //   8: invokevirtual moveToPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   11: aload_0
    //   12: getfield c : Lcom/trolmastercard/sexmod/cy;
    //   15: getfield c : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   18: aload_2
    //   19: invokevirtual rotate : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   22: aload_0
    //   23: getfield c : Lcom/trolmastercard/sexmod/cy;
    //   26: getfield c : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   29: aload_2
    //   30: invokevirtual moveBackFromPivot : (Lsoftware/bernie/geckolib3/geo/render/built/GeoCube;)V
    //   33: aload_2
    //   34: getfield quads : [Lsoftware/bernie/geckolib3/geo/render/built/GeoQuad;
    //   37: astore #7
    //   39: aload #7
    //   41: arraylength
    //   42: istore #8
    //   44: iconst_0
    //   45: istore #9
    //   47: iload #9
    //   49: iload #8
    //   51: if_icmpge -> 533
    //   54: aload #7
    //   56: iload #9
    //   58: aaload
    //   59: astore #10
    //   61: aload #10
    //   63: ifnonnull -> 73
    //   66: goto -> 527
    //   69: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   72: athrow
    //   73: new javax/vecmath/Vector3f
    //   76: dup
    //   77: aload #10
    //   79: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   82: invokevirtual func_177958_n : ()I
    //   85: i2f
    //   86: aload #10
    //   88: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   91: invokevirtual func_177956_o : ()I
    //   94: i2f
    //   95: aload #10
    //   97: getfield normal : Lnet/minecraft/util/math/Vec3i;
    //   100: invokevirtual func_177952_p : ()I
    //   103: i2f
    //   104: invokespecial <init> : (FFF)V
    //   107: astore #11
    //   109: aload_0
    //   110: getfield c : Lcom/trolmastercard/sexmod/cy;
    //   113: getfield c : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   116: invokevirtual getNormalMatrix : ()Ljavax/vecmath/Matrix3f;
    //   119: aload #11
    //   121: invokevirtual transform : (Ljavax/vecmath/Tuple3f;)V
    //   124: aload_2
    //   125: getfield size : Ljavax/vecmath/Vector3f;
    //   128: getfield y : F
    //   131: fconst_0
    //   132: fcmpl
    //   133: ifeq -> 155
    //   136: aload_2
    //   137: getfield size : Ljavax/vecmath/Vector3f;
    //   140: getfield z : F
    //   143: fconst_0
    //   144: fcmpl
    //   145: ifne -> 191
    //   148: goto -> 155
    //   151: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   154: athrow
    //   155: aload #11
    //   157: invokevirtual getX : ()F
    //   160: fconst_0
    //   161: fcmpg
    //   162: ifge -> 191
    //   165: goto -> 172
    //   168: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   171: athrow
    //   172: aload #11
    //   174: dup
    //   175: getfield x : F
    //   178: ldc -1.0
    //   180: fmul
    //   181: putfield x : F
    //   184: goto -> 191
    //   187: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   190: athrow
    //   191: aload_2
    //   192: getfield size : Ljavax/vecmath/Vector3f;
    //   195: getfield x : F
    //   198: fconst_0
    //   199: fcmpl
    //   200: ifeq -> 222
    //   203: aload_2
    //   204: getfield size : Ljavax/vecmath/Vector3f;
    //   207: getfield z : F
    //   210: fconst_0
    //   211: fcmpl
    //   212: ifne -> 258
    //   215: goto -> 222
    //   218: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   221: athrow
    //   222: aload #11
    //   224: invokevirtual getY : ()F
    //   227: fconst_0
    //   228: fcmpg
    //   229: ifge -> 258
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   238: athrow
    //   239: aload #11
    //   241: dup
    //   242: getfield y : F
    //   245: ldc -1.0
    //   247: fmul
    //   248: putfield y : F
    //   251: goto -> 258
    //   254: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   257: athrow
    //   258: aload_2
    //   259: getfield size : Ljavax/vecmath/Vector3f;
    //   262: getfield x : F
    //   265: fconst_0
    //   266: fcmpl
    //   267: ifeq -> 289
    //   270: aload_2
    //   271: getfield size : Ljavax/vecmath/Vector3f;
    //   274: getfield y : F
    //   277: fconst_0
    //   278: fcmpl
    //   279: ifne -> 325
    //   282: goto -> 289
    //   285: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   288: athrow
    //   289: aload #11
    //   291: invokevirtual getZ : ()F
    //   294: fconst_0
    //   295: fcmpg
    //   296: ifge -> 325
    //   299: goto -> 306
    //   302: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   305: athrow
    //   306: aload #11
    //   308: dup
    //   309: getfield z : F
    //   312: ldc -1.0
    //   314: fmul
    //   315: putfield z : F
    //   318: goto -> 325
    //   321: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   324: athrow
    //   325: aload_0
    //   326: getfield j : Lnet/minecraft/util/math/Vec3d;
    //   329: ifnull -> 356
    //   332: aload_0
    //   333: aload_0
    //   334: getfield d : Lnet/minecraft/util/math/Vec3d;
    //   337: aload #11
    //   339: aload_0
    //   340: getfield j : Lnet/minecraft/util/math/Vec3d;
    //   343: invokestatic a : (Lnet/minecraft/util/math/Vec3d;Ljavax/vecmath/Vector3f;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;
    //   346: putfield d : Lnet/minecraft/util/math/Vec3d;
    //   349: goto -> 356
    //   352: invokestatic a : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
    //   355: athrow
    //   356: aload #10
    //   358: getfield vertices : [Lsoftware/bernie/geckolib3/geo/render/built/GeoVertex;
    //   361: astore #12
    //   363: aload #12
    //   365: arraylength
    //   366: istore #13
    //   368: iconst_0
    //   369: istore #14
    //   371: iload #14
    //   373: iload #13
    //   375: if_icmpge -> 527
    //   378: aload #12
    //   380: iload #14
    //   382: aaload
    //   383: astore #15
    //   385: new javax/vecmath/Vector4f
    //   388: dup
    //   389: aload #15
    //   391: getfield position : Ljavax/vecmath/Vector3f;
    //   394: invokevirtual getX : ()F
    //   397: aload #15
    //   399: getfield position : Ljavax/vecmath/Vector3f;
    //   402: invokevirtual getY : ()F
    //   405: aload #15
    //   407: getfield position : Ljavax/vecmath/Vector3f;
    //   410: invokevirtual getZ : ()F
    //   413: fconst_1
    //   414: invokespecial <init> : (FFFF)V
    //   417: astore #16
    //   419: aload_0
    //   420: getfield c : Lcom/trolmastercard/sexmod/cy;
    //   423: getfield c : Lsoftware/bernie/geckolib3/util/MatrixStack;
    //   426: invokevirtual getModelMatrix : ()Ljavax/vecmath/Matrix4f;
    //   429: aload #16
    //   431: invokevirtual transform : (Ljavax/vecmath/Tuple4f;)V
    //   434: aload_1
    //   435: aload #16
    //   437: invokevirtual getX : ()F
    //   440: f2d
    //   441: aload #16
    //   443: invokevirtual getY : ()F
    //   446: f2d
    //   447: aload #16
    //   449: invokevirtual getZ : ()F
    //   452: f2d
    //   453: invokevirtual func_181662_b : (DDD)Lnet/minecraft/client/renderer/BufferBuilder;
    //   456: aload #15
    //   458: getfield textureU : F
    //   461: f2d
    //   462: aload #15
    //   464: getfield textureV : F
    //   467: f2d
    //   468: invokevirtual func_187315_a : (DD)Lnet/minecraft/client/renderer/BufferBuilder;
    //   471: aload_0
    //   472: getfield d : Lnet/minecraft/util/math/Vec3d;
    //   475: getfield field_72450_a : D
    //   478: d2f
    //   479: aload_0
    //   480: getfield d : Lnet/minecraft/util/math/Vec3d;
    //   483: getfield field_72448_b : D
    //   486: d2f
    //   487: aload_0
    //   488: getfield d : Lnet/minecraft/util/math/Vec3d;
    //   491: getfield field_72449_c : D
    //   494: d2f
    //   495: fload #6
    //   497: invokevirtual func_181666_a : (FFFF)Lnet/minecraft/client/renderer/BufferBuilder;
    //   500: aload #11
    //   502: invokevirtual getX : ()F
    //   505: aload #11
    //   507: invokevirtual getY : ()F
    //   510: aload #11
    //   512: invokevirtual getZ : ()F
    //   515: invokevirtual func_181663_c : (FFF)Lnet/minecraft/client/renderer/BufferBuilder;
    //   518: invokevirtual func_181675_d : ()V
    //   521: iinc #14, 1
    //   524: goto -> 371
    //   527: iinc #9, 1
    //   530: goto -> 47
    //   533: return
    // Exception table:
    //   from	to	target	type
    //   61	69	69	java/lang/IllegalStateException
    //   109	148	151	java/lang/IllegalStateException
    //   136	165	168	java/lang/IllegalStateException
    //   155	184	187	java/lang/IllegalStateException
    //   191	215	218	java/lang/IllegalStateException
    //   203	232	235	java/lang/IllegalStateException
    //   222	251	254	java/lang/IllegalStateException
    //   258	282	285	java/lang/IllegalStateException
    //   270	299	302	java/lang/IllegalStateException
    //   289	318	321	java/lang/IllegalStateException
    //   325	349	352	java/lang/IllegalStateException
  }
  
  private static IllegalStateException a(IllegalStateException paramIllegalStateException) {
    return paramIllegalStateException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\b.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */