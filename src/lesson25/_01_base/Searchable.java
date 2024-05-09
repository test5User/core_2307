package lesson25._01_base;

@FunctionalInterface
public interface Searchable<T> {
    boolean test(Cat cat, T value);
}
