package lesson25._04_f_interfaces._05_unary_operator;

import lesson25._01_base.Breed;
import lesson25._01_base.Cat;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // T -> T

        UnaryOperator<Cat> ageIncrement = cat -> {cat.setAge(cat.getAge() + 1);
            return cat;};

        var cat = new Cat("Cat1", Breed.SIBERIAN, 5);

        System.out.println(ageIncrement.apply(cat));
    }
}
