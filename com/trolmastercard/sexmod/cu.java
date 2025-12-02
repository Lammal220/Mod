package com.trolmastercard.sexmod;

import io.netty.buffer.ByteBuf;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.FileUtils;

public class cu implements IMessage {
  boolean d;
  
  List<String> c = new ArrayList<>();
  
  byte[] b;
  
  b f;
  
  String e;
  
  int a = 0;
  
  public cu() {}
  
  public cu(List<String> paramList) {
    this.c = paramList;
  }
  
  public cu(byte[] paramArrayOfbyte, b paramb, String paramString) {
    this.b = paramArrayOfbyte;
    this.f = paramb;
    this.e = paramString;
  }
  
  public int a() {
    return this.a;
  }
  
  public void a(int paramInt) {
    this.a = paramInt;
  }
  
  public void fromBytes(ByteBuf paramByteBuf) {
    try {
      if (Main.proxy instanceof ClientProxy) {
        try {
          if (!br.b())
            return; 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.e = ByteBufUtils.readUTF8String(paramByteBuf);
        this.f = b.valueOf(ByteBufUtils.readUTF8String(paramByteBuf));
        this.a = paramByteBuf.readInt();
        int j = paramByteBuf.readInt();
        this.b = new byte[j];
        byte b2 = 0;
        try {
          while (b2 < j) {
            this.b[b2] = paramByteBuf.readByte();
            b2++;
          } 
        } catch (RuntimeException runtimeException) {
          throw a(null);
        } 
        this.d = true;
        return;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    int i = paramByteBuf.readInt();
    byte b1 = 0;
    try {
      while (b1 < i) {
        this.c.add(ByteBufUtils.readUTF8String(paramByteBuf));
        b1++;
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    this.d = true;
  }
  
  public void toBytes(ByteBuf paramByteBuf) {
    if (Main.proxy instanceof ClientProxy) {
      paramByteBuf.writeInt(this.c.size());
      for (String str : this.c)
        ByteBufUtils.writeUTF8String(paramByteBuf, str); 
      return;
    } 
    ByteBufUtils.writeUTF8String(paramByteBuf, this.e);
    ByteBufUtils.writeUTF8String(paramByteBuf, this.f.toString());
    paramByteBuf.writeInt(this.a);
    paramByteBuf.writeInt(this.b.length);
    for (byte b1 : this.b)
      paramByteBuf.writeByte(b1); 
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  public enum b {
    CFG(".cfg"),
    PNG(".png"),
    GEO(".geo.json");
    
    public String ending;
    
    b(String param1String1) {
      this.ending = param1String1;
    }
  }
  
  public static class a implements IMessageHandler<cu, IMessage> {
    static int a = 0;
    
    @SideOnly(Side.CLIENT)
    void a(String param1String) {
      (Minecraft.func_71410_x()).field_71439_g.func_145747_a((ITextComponent)new TextComponentString(param1String));
    }
    
    @SideOnly(Side.CLIENT)
    void a() {
      Minecraft.func_71410_x().func_152343_a(() -> Integer.valueOf(br.b(true)));
    }
    
    public IMessage a(cu param1cu, MessageContext param1MessageContext) {
      try {
        if (!param1cu.d) {
          System.out.println("received an invalid Message @DownloadServerModel :(");
          return null;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      try {
        if (param1MessageContext.side.isClient()) {
          try {
            if (!br.b())
              return null; 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          String str1 = param1cu.e;
          cu.b b = param1cu.f;
          byte[] arrayOfByte = param1cu.b;
          String str2 = br.h() + "/" + str1;
          File file1 = new File(str2);
          file1.mkdirs();
          File file2 = new File(str2 + "/" + str1 + b.ending);
          try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            Throwable throwable = null;
            try {
              fileOutputStream.write(arrayOfByte);
            } catch (Throwable throwable1) {
              throwable = throwable1;
              throw throwable1;
            } finally {
              try {
                if (fileOutputStream != null)
                  if (throwable != null) {
                    try {
                      fileOutputStream.close();
                    } catch (Throwable throwable1) {
                      throwable.addSuppressed(throwable1);
                    } 
                  } else {
                    fileOutputStream.close();
                  }  
              } catch (Throwable throwable1) {
                throw a(null);
              } 
            } 
          } catch (IOException iOException) {
            iOException.printStackTrace();
          } 
          byte b1 = 0;
          int i = (cu.b.values()).length;
          for (cu.b b2 : cu.b.values()) {
            try {
              if ((new File(str2 + "/" + str1 + b2.ending)).exists())
                b1++; 
            } catch (Throwable throwable) {
              throw a(null);
            } 
          } 
          try {
            if (b1 == i) {
              a(String.format("%sSuccessfully downloaded the custom model '%s%s%s'!", new Object[] { TextFormatting.GREEN, TextFormatting.YELLOW, str1, TextFormatting.GREEN }));
            } else {
              a(String.format("%sdownloading custom model '%s%s%s' (%s/%s)...", new Object[] { TextFormatting.GRAY, TextFormatting.YELLOW, str1, TextFormatting.GRAY, Integer.valueOf(b1), Integer.valueOf(i) }));
            } 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          try {
            if (++a < param1cu.a)
              return null; 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          a = 0;
          a();
          return null;
        } 
      } catch (Throwable throwable) {
        throw a(null);
      } 
      MinecraftServer minecraftServer = FMLCommonHandler.instance().getMinecraftServerInstance();
      minecraftServer.func_152344_a(() -> {
            List<String> list = param1cu.c;
            ArrayList<cu> arrayList = new ArrayList();
            for (String str1 : list) {
              String str2 = "sexmod_custom_models/" + str1;
              for (cu.b b : cu.b.values()) {
                File file = new File(str2 + "/" + str1 + b.ending);
                try {
                  if (!file.exists()) {
                    System.out.println(file.getAbsolutePath() + " doesnt exist lol");
                  } else {
                    byte[] arrayOfByte = null;
                    try {
                      arrayOfByte = FileUtils.readFileToByteArray(file);
                    } catch (IOException iOException) {
                      throw new RuntimeException(iOException);
                    } 
                    try {
                      if (arrayOfByte != null)
                        arrayList.add(new cu(arrayOfByte, b, str1)); 
                    } catch (IOException iOException) {
                      throw a(null);
                    } 
                  } 
                } catch (IOException iOException) {
                  throw a(null);
                } 
              } 
            } 
            int i = arrayList.size();
            for (cu cu1 : arrayList) {
              cu1.a(i);
              param1MinecraftServer.func_152344_a(());
            } 
          });
      return null;
    }
    
    private static Throwable a(Throwable param1Throwable) {
      return param1Throwable;
    }
  }
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\com\trolmastercard\sexmod\cu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */