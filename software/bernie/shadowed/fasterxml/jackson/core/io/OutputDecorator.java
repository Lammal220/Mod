package software.bernie.shadowed.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

public abstract class OutputDecorator implements Serializable {
  public abstract OutputStream decorate(IOContext paramIOContext, OutputStream paramOutputStream) throws IOException;
  
  public abstract Writer decorate(IOContext paramIOContext, Writer paramWriter) throws IOException;
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\software\bernie\shadowed\fasterxml\jackson\core\io\OutputDecorator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */