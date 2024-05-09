package lesson25._01_base;

public class AgeSearchable implements Searchable<Integer> {
    @Override
    public boolean test(Cat cat, Integer value) {
        return cat.getAge() == value;
    }
}
