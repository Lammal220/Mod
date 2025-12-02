package software.bernie.shadowed.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JsonUnwrapped {
  boolean enabled() default true;
  
  String prefix() default "";
  
  String suffix() default "";
}


/* Location:              C:\Users\00773\Downloads\Fapcraft 1.12.2 v1.1.jar!\software\bernie\shadowed\fasterxml\jackson\annotation\JsonUnwrapped.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */