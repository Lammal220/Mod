package software.bernie.shadowed.fasterxml.jackson.core.async;

public interface NonBlockingInputFeeder {
  boolean needMoreInput();
  
  void endOfInput();
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\software\bernie\shadowed\fasterxml\jackson\core\async\NonBlockingInputFeeder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */