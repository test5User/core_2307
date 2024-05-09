package lesson26._03_stream_usage;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getAge() - cat2.getAge();
    }
}
