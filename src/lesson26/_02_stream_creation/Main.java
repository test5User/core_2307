package lesson26._02_stream_creation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Пустой стрим
        Stream.empty();
        //Из коллекции (лист, сет)
        List.of(1,2,3).stream();
        Set.of(1,2,3).stream();
        //Из Map
        new HashMap<>().entrySet().stream();
        //Из массива
        Arrays.stream(new int[]{1,2,3,4});
        //Из конкретных элементов
        Stream.of(1,2,3);
    }
}
