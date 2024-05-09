package lesson26._04_parallel;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var people= List.of(
                "Tom", "Bob", "Sam", "Kate", "Tim", "Dug"
        );
        people.stream()
                .filter(it -> it.length()==3)
                .forEach(System.out::println);
        System.out.println("____________________");
        people.parallelStream()
                .filter(it -> it.length()==3)
                .forEach(System.out::println);
    }
}
