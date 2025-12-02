package software.bernie.shadowed.fasterxml.jackson.databind.jsonschema;

import java.lang.reflect.Type;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonMappingException;
import software.bernie.shadowed.fasterxml.jackson.databind.JsonNode;
import software.bernie.shadowed.fasterxml.jackson.databind.SerializerProvider;

public interface SchemaAware {
  JsonNode getSchema(SerializerProvider paramSerializerProvider, Type paramType) throws JsonMappingException;
  
  JsonNode getSchema(SerializerProvider paramSerializerProvider, Type paramType, boolean paramBoolean) throws JsonMappingException;
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\software\bernie\shadowed\fasterxml\jackson\databind\jsonschema\SchemaAware.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */