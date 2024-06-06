package lesson33._07_json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lesson33._01_traning.AnimalModel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Main {

    private static final Gson GSON = new Gson();

    public static void main(String[] args) throws IOException {
        var animals = List.of(
                new AnimalModel(1, "Barsik", 2),
                new AnimalModel(2, "Pushok", 4),
                new AnimalModel(3, "Murzik", 5)
        );

        var str = GSON.toJson(animals);
        var os = new FileOutputStream("src/lesson33/_07_json/output.json");
        os.write(str.getBytes(StandardCharsets.UTF_8));

        List<AnimalModel> animalsFromFile = GSON.fromJson(
                new FileReader("src/lesson33/_07_json/output.json"),
                new TypeToken<List<AnimalModel>>(){}.getType());
        animalsFromFile.forEach(System.out::println);
    }
}
