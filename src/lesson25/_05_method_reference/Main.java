package lesson25._05_method_reference;

import lesson25._01_base.Breed;
import lesson25._01_base.Cat;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // Ссылка на статический метод
        //Function<String, Boolean> function = str -> Boolean.valueOf(str);
        Function<String, Boolean> function = Boolean::valueOf;
        System.out.println(function.apply("True"));

        // Ссылка на нестатический метод конкретного объекта
        var cat = new Cat("Cat1", Breed.SIAM, 5);
        //Function<Cat, String> catFunction = c -> c.getName();
        Function<Cat, String> catFunction = Cat::getName;
        System.out.println(catFunction.apply(cat));

        // Ссылка на нестатический метод любого объекта конкретного типа
        //Function<String, String> strFunction = str -> str.toUpperCase();
        UnaryOperator<String> strFunction = String::toUpperCase;
        System.out.println(strFunction.apply("bla-bla-bla"));

        //Ссылка на конструктор
        //Supplier<Cat> catSupplier = () -> new Cat();
        Supplier<Cat> catSupplier = Cat::new;
        System.out.println(catSupplier.get());

        Function<String, Cat> catBuilder = Cat::new;
        System.out.println(catBuilder.apply("Cat2"));
    }
}
