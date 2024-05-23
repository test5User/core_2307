package lesson31._07_repeatable;

import java.lang.annotation.Repeatable;

@Repeatable(Games.class)
public @interface Game {
    String gameName() default "SomeThing";
    String dayOfWeek();
}
