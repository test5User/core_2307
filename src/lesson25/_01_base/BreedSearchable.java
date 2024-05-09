package lesson25._01_base;

public class BreedSearchable implements Searchable<Breed>{
    @Override
    public boolean test(Cat cat, Breed value) {
        return cat.getType().equals(value);
    }
}
