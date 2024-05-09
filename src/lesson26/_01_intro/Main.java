package lesson26._01_intro;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var numbers = List.of(1,3,4,5,-3,-5,0);
        System.out.println(getNegativeQuantity(numbers));

        Predicate<Integer> negativePredicate = it -> it < 0;
        System.out.println(numbers.stream()
                .filter(negativePredicate)
                .count());

        // Нельзя
        /*
        Stream<Integer> stream = numbers.stream();
        stream.filter(negativePredicate);
        stream.count();
         */
    }

    private static int getNegativeQuantity(List<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number < 0) {
                count++;
            }
        }
        return count;
    }
}
