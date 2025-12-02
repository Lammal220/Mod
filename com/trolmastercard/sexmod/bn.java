package com.trolmastercard.sexmod;

import java.io.File;
import java.io.IOException;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class bn {
  public static void a(boolean paramBoolean) throws IOException {
    try {
      MinecraftForge.EVENT_BUS.register(new ah());
      MinecraftForge.EVENT_BUS.register(new eo());
      MinecraftForge.EVENT_BUS.register(new q());
      MinecraftForge.EVENT_BUS.register(new co());
      MinecraftForge.EVENT_BUS.register(new gu());
      MinecraftForge.EVENT_BUS.register(new ho.a());
      MinecraftForge.EVENT_BUS.register(new g.a());
      MinecraftForge.EVENT_BUS.register(ap.b);
      MinecraftForge.EVENT_BUS.register(hy.b);
      MinecraftForge.EVENT_BUS.register(hj.a);
      MinecraftForge.EVENT_BUS.register(new gp());
      MinecraftForge.EVENT_BUS.register(new fu());
      MinecraftForge.EVENT_BUS.register(new eb.a());
      MinecraftForge.EVENT_BUS.register(new ey());
      MinecraftForge.EVENT_BUS.register(dw.a);
      MinecraftForge.EVENT_BUS.register(new ff.c());
      MinecraftForge.EVENT_BUS.register(new hy.a());
      MinecraftForge.EVENT_BUS.register(new ax.b("tribes"));
      MinecraftForge.EVENT_BUS.register(new c7());
      MinecraftForge.EVENT_BUS.register(new am());
      MinecraftForge.EVENT_BUS.register(new e3.c());
      MinecraftForge.EVENT_BUS.register(new eq.a());
      MinecraftForge.EVENT_BUS.register(new ap.a());
      MinecraftForge.EVENT_BUS.register(new ad());
      MinecraftForge.EVENT_BUS.register(new f_.a());
      MinecraftForge.EVENT_BUS.register(new v());
      MinecraftForge.EVENT_BUS.register(cc.r);
      MinecraftForge.EVENT_BUS.register(aj.b);
      MinecraftForge.EVENT_BUS.register(new fq());
      MinecraftForge.EVENT_BUS.register(new gy());
      MinecraftForge.EVENT_BUS.register(new bj());
      MinecraftForge.EVENT_BUS.register(g3.b());
      MinecraftForge.EVENT_BUS.register(new f8.b());
      MinecraftForge.EVENT_BUS.register(new f4());
      if (paramBoolean)
        b(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  @SideOnly(Side.CLIENT)
  static void b() {
    try {
      if (a()) {
        MinecraftForge.EVENT_BUS.register(new fr());
      } else {
        g2.a = false;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    MinecraftForge.EVENT_BUS.register(new ds());
    MinecraftForge.EVENT_BUS.register(new fh());
    MinecraftForge.EVENT_BUS.register(new d3());
    MinecraftForge.EVENT_BUS.register(new l());
    MinecraftForge.EVENT_BUS.register(new bq());
    MinecraftForge.EVENT_BUS.register(new cn());
    MinecraftForge.EVENT_BUS.register(new e_());
    MinecraftForge.EVENT_BUS.register(new w());
    MinecraftForge.EVENT_BUS.register(new dv.a());
    MinecraftForge.EVENT_BUS.register(new gm());
    MinecraftForge.EVENT_BUS.register(new c6());
    MinecraftForge.EVENT_BUS.register(new a.b());
    MinecraftForge.EVENT_BUS.register(new br.a());
    MinecraftForge.EVENT_BUS.register(new gb());
    MinecraftForge.EVENT_BUS.register(new ga());
    MinecraftForge.EVENT_BUS.register(new hf());
  }
  
  static boolean a() {
    File file = new File("sexmod/dontAskAgain");
    try {
      file.getParentFile().mkdirs();
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return !file.exists();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */