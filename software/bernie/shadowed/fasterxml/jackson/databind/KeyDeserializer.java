package software.bernie.shadowed.fasterxml.jackson.databind;

import java.io.IOException;

public abstract class KeyDeserializer {
  public abstract Object deserializeKey(String paramString, DeserializationContext paramDeserializationContext) throws IOException;
  
  public static abstract class None extends KeyDeserializer {}
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\software\bernie\shadowed\fasterxml\jackson\databind\KeyDeserializer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */