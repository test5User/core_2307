package lesson31._01_base;

import lombok.Getter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
    String name() default "";
    int value();
}
