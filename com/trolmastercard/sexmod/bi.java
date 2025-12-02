package com.trolmastercard.sexmod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class bi {
  public static void a() {
    a("jenny", (Class)ex.class, fy.JENNY.npcID, 3286592, 12655237);
    a("ellie", (Class)el.class, fy.ELLIE.npcID, 1447446, 9961472);
    a("slime", (Class)fn.class, fy.SLIME.npcID, 13167780, 8244330);
    a("bia", (Class)e0.class, fy.BIA.npcID, 7488816, 7254603);
    a("bee", (Class)fz.class, fy.BEE.npcID, 16701032, 4400155);
    a("luna", (Class)eb.class, fy.LUNA.npcID, 7881787, 7940422);
    a("allie", (Class)ev.class, fy.ALLIE.npcID);
    a("kobold", (Class)ff.class, fy.KOBOLD.npcID);
    a("kobold_egg", (Class)i.class, 4674237);
    a("goblin", (Class)e3.class, fy.GOBLIN.npcID, 39424, 19456);
    a("galath", (Class)f_.class, fy.GALATH.npcID, 16711680, 16711680);
    a("manglelie", (Class)f8.class, fy.MANGLELIE.npcID, 16382457, 8485574);
    a("custom_model", (Class)cy.class, 6281823);
    b("player_jenny", (Class)es.class, fy.JENNY.playerID);
    b("player_ellie", (Class)ee.class, fy.ELLIE.playerID);
    b("player_slime", (Class)ec.class, fy.SLIME.playerID);
    b("player_bia", (Class)eg.class, fy.BIA.playerID);
    b("player_bee", (Class)e9.class, fy.BEE.playerID);
    b("player_allie", (Class)e5.class, fy.ALLIE.playerID);
    b("player_kobold", (Class)e7.class, fy.KOBOLD.playerID);
    b("player_goblin", (Class)eq.class, fy.GOBLIN.playerID);
    b("player_luna", (Class)ed.class, fy.LUNA.playerID);
    b("player_galath", (Class)er.class, fy.GALATH.playerID);
    a("friendly_slime", (Class)ay.class, 5548484);
    a("luna_hook", (Class)gi.class, 4768742);
    a("energy_ball", (Class)c4.class, 2565153);
    a("pyrocinical", (Class)al.class, 515153);
    EntityRegistry.addSpawn(fn.class, 10, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.field_76780_h, Biomes.field_150599_m });
    EntityRegistry.addSpawn(fz.class, 5, 1, 1, EnumCreatureType.CREATURE, new Biome[] { Biomes.field_76767_f, Biomes.field_76785_t });
    EntityRegistry.addSpawn(al.class, 3, 1, 1, EnumCreatureType.AMBIENT, new Biome[] { Biomes.field_76778_j });
    EntityRegistry.addSpawn(f8.class, 5, 1, 1, EnumCreatureType.AMBIENT, new Biome[] { Biomes.field_76778_j });
  }
  
  private static void b(String paramString, Class<? extends Entity> paramClass, int paramInt) {
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + paramString), paramClass, paramString, paramInt, Main.instance, 100, 1, false);
  }
  
  private static void a(String paramString, Class<? extends Entity> paramClass, int paramInt1, int paramInt2, int paramInt3) {
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + paramString), paramClass, paramString, paramInt1, Main.instance, 50, 1, true, paramInt2, paramInt3);
  }
  
  private static void a(String paramString, Class<? extends Entity> paramClass, int paramInt) {
    EntityRegistry.registerModEntity(new ResourceLocation("sexmod:" + paramString), paramClass, paramString, paramInt, Main.instance, 50, 1, true);
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\bi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */