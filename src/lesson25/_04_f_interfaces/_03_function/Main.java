package lesson25._04_f_interfaces._03_function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // T -> R
        Function<Double, Long> function = Math::round;
        System.out.println(function.apply(125.789));
    }
}
