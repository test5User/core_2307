package lesson25._01_base;

import java.io.FilenameFilter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
              new Cat("cat1", Breed.SIBERIAN, 2),
              new Cat("cat2", Breed.SIAM, 1),
              new Cat("cat3", Breed.GARBAGE, 3),
              new Cat("cat4", Breed.SIBERIAN, 2),
              new Cat("cat5", Breed.SIAM, 1),
              new Cat("cat1", Breed.SIBERIAN, 1)

        );
        System.out.println(getByBreedNumber(cats, Breed.GARBAGE));
        System.out.println(getByAgeNumber(cats, 2));
        System.out.println("_____________________________________");
        System.out.println(getByCondition(cats, new BreedSearchable(), Breed.GARBAGE));
        System.out.println(getByCondition(cats, new AgeSearchable(), 2));
        System.out.println("_____________________________________");
        System.out.println(getByCondition(cats,
                new Searchable<Breed>() {
                    @Override
                    public boolean test(Cat cat, Breed value) {
                        return cat.getType().equals(value);
                    }
                },
                Breed.GARBAGE));
        System.out.println(getByCondition(cats,
                new Searchable<Integer>() {
                    @Override
                    public boolean test(Cat cat, Integer value) {
                        return cat.getAge() == value;
                    }
                },
                2));
        System.out.println("_____________________________________");
        System.out.println(getByCondition(cats, (cat, value) -> cat.getType().equals(value), Breed.GARBAGE));
        System.out.println(getByCondition(cats, (cat, value) -> cat.getAge() == value, 2));
        System.out.println("_____________________________________");
        Searchable<Breed> breedSearchable = (cat, value) -> cat.getType().equals(value);
        Searchable<Integer> ageSearchable = (cat, value) -> cat.getAge() == value;

        System.out.println(getByCondition(cats, breedSearchable, Breed.GARBAGE));
        System.out.println(getByCondition(cats, ageSearchable, 2));
    }

    private static int getByBreedNumber(List<Cat> cats, Breed breed) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getType().equals(breed)) {
                result++;
            }
        }
        return result;
    }

    private static int getByAgeNumber(List<Cat> cats, int age) {
        int result = 0;
        for (Cat cat : cats) {
            if (cat.getAge() == age) {
                result++;
            }
        }
        return result;
    }

    private static <T> int getByCondition(List<Cat> cats, Searchable<T> function, T value) {
        int result = 0;
        for (Cat cat : cats) {
            if (function.test(cat, value)) {
                result++;
            }
        }
        return result;
    }
}
