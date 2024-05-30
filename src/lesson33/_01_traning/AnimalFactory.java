package lesson33._01_traning;

import java.util.Arrays;

public class AnimalFactory {
    public static AnimalModel getInstance(String str) throws TrainingException {
        var split = str.split(",");
        try {
            validateByLength(split.length);
            validateByNumber(split[0], split[2]);
            var id = validateByNegative(Integer.parseInt(split[0]));
            var name = validateByEmpty(split[1]);
            var age = validateByNegative(Integer.parseInt(split[2]));
            return new AnimalModel(id, name, age);
        } catch (IllegalStateException e) {
            throw new TrainingException(str, e);
        }
    }

    private static void validateByLength(int length) {
        if (length != 3) {
            throw new IllegalStateException("Wrong line format");
        }
    }

    private static void validateByNumber(String... strings) {
        try {
            Arrays.stream(strings).forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Id or age not a number");
        }
    }

    private static String validateByEmpty(String value) {
        if(value.isEmpty()) {
            throw new IllegalStateException("Name is empty");
        }
        return value;
    }

    private static int validateByNegative(int value) {
        if (value < 0) {
            throw new IllegalStateException("Negative id or age");
        }
        return value;
    }
}
