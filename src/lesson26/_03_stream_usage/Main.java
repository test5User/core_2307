package lesson26._03_stream_usage;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var cats = List.of(
            new Cat("Mur", 10),
            new Cat("Murka", 6),
            new Cat("Murzik", 50),
            new Cat("Mashka", 2),
            new Cat("Vaska", 14),
            new Cat("Murka", 6)
        );

        // Filter
        cats.stream()
                .filter(it -> it.getAge() >= 5)
                .filter(it -> it.getName().length() >= 4);
        //        .forEach(System.out::println);

        // map
        cats.stream()
                .map(Cat::getName);
        //        .forEach(System.out::println);

        // sort
        cats.stream()
                .sorted();
        //        .forEach(System.out::println);

        cats.stream()
                .sorted(new CatComparator());
        //        .forEach(System.out::println);

        // concat
        var st1 = cats.stream()
                .filter(it -> it.getAge() <= 5);
        var st2 = cats.stream()
                .filter(it -> it.getAge() > 5);
        Stream.concat(st1, st2);
        //        .forEach(System.out::println);

        // distinct
        cats.stream()
                .distinct();
        //        .forEach(System.out::println);

        // skip and limit
        cats.stream()
                .skip(2)
                .limit(3);
        //        .forEach(System.out::println);

        // Terminal operation

        // count
//        System.out.println(cats.stream()
//                .filter(it -> it.getName().startsWith("M")));
//                //.count());

        // findFirst, findAny
//        System.out.println(Optional.ofNullable(cats.stream()
//                .filter(it -> it.getName().startsWith("A"))
//                .findAny().orElse(new Cat("Default", 0))));

        //allMatch, anyMatch, noneMatch

        // min, max
        System.out.println(cats.stream()
                .max(new CatComparator()));

        // reduce
        System.out.println(cats.stream()
                .map(Cat::getAge)
                .reduce(Integer::sum).get());

        System.out.println(cats.stream()
                .map(Cat::getAge)
                .reduce(2, (x, y) -> x * y));

        // collect
        var list = cats.stream()
                .filter(it -> it.getAge() >= 6)
                .toList();
        list.forEach(System.out::println);
        System.out.println("__________________");
        var set = cats.stream()
                .filter(it -> it.getAge() >= 6)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("__________________");
        var map = cats.stream()
                .filter(it -> it.getAge() >= 6)
                .collect(Collectors.toMap(k -> k.getName(), v -> v, (ol, ne) -> ne));
        System.out.println(map);
        System.out.println("__________________");

        var linList = cats.stream()
                .filter(it -> it.getAge() >= 6)
                .collect(Collectors.toCollection(LinkedList::new));
    }

}
