package com.trolmastercard.sexmod;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ae {
  public static ShaderGroup b;
  
  static final ResourceLocation a = new ResourceLocation("sexmod", "shaders/post/outline.json");
  
  static Framebuffer c;
  
  public static void a() {
    Minecraft minecraft = Minecraft.func_71410_x();
    try {
      if (!OpenGlHelper.field_148824_g) {
        Main.LOGGER.warn("Shaders not supported");
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (ShaderLinkHelper.func_148074_b() == null)
        ShaderLinkHelper.func_148076_a(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      b = new ShaderGroup(minecraft.func_110434_K(), minecraft.func_110442_L(), minecraft.func_147110_a(), a);
      b.func_148026_a(minecraft.field_71443_c, minecraft.field_71440_d);
      c = b.func_177066_a("final");
      ClientRegistry.registerEntityShader(em.class, a);
      System.out.println("succ registered the outline shader :)");
    } catch (IOException iOException) {
      Main.LOGGER.warn("Failed to load shader: {}", a, iOException);
    } catch (JsonSyntaxException jsonSyntaxException) {
      Main.LOGGER.warn("Failed to load shader: {}", a, jsonSyntaxException);
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\ae.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */