package lesson31._04_retention;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var annotatedClass = new AnnotatedClass();
        var annotations = annotatedClass.getClass().getAnnotations();
        System.out.println("Runtime annotations amount : " + annotations.length);
        Arrays.stream(annotations)
                .forEach(System.out::println);
    }
}
