package lesson25._04_f_interfaces._01_predicate;

import lesson25._01_base.Cat;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // T -> boolean
        Predicate<Integer> negative = i -> i < 0;
        System.out.println(negative.test(-6));
        System.out.println(negative.test(6));
        System.out.println("__________________________________");
        Predicate<String> containsA = str -> str.contains("A");
        Predicate<String> containsB = str -> str.contains("B");

        System.out.println(containsA.or(containsB).test("ACRI"));
        System.out.println(containsA.and(containsB).test("ACRI"));

        Predicate<Cat> agePredicate = cat -> cat.getAge() > 2;
    }
}
