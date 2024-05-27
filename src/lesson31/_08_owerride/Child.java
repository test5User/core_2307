package lesson31._08_owerride;

import java.util.Arrays;

public class Child extends Parent{
    @Override
    @Deprecated(since = "15", forRemoval = true)
    public void display() {
        System.out.println("Method from child");
    }

    @SuppressWarnings("unused")
    public void doSmth() {
        System.out.println("Bla-bla-bla");
    }

    public void varArgDemo(String param, String... arrayParam) {
        System.out.println(param);
        Arrays.stream(arrayParam).forEach(System.out::println);
    }
}
