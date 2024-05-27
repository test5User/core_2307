package lesson31._08_owerride;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings({"rawtypes", "unused"})
    public static void main(String... args) throws NoSuchMethodException {
        new Child().display();
        System.out.println(((Deprecated) new Child().getClass()
                .getDeclaredMethod("display").getAnnotations()[0]).since());
        List list = new ArrayList();

        new Child().varArgDemo("first", "second", "third");

    }
}
