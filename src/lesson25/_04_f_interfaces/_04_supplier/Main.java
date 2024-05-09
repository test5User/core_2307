package lesson25._04_f_interfaces._04_supplier;

import lesson25._01_base.Breed;
import lesson25._01_base.Cat;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // () -> T
        Supplier<Cat> catSupplier = () -> new Cat("Cat1", Breed.SIBERIAN, 10);

        System.out.println(catSupplier.get());
    }
}
