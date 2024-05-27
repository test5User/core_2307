package lesson32._01_remaining;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static final String INPUT = "src/lesson32/_01_remaining/input.txt";
    public static final String OUTPUT = "src/lesson32/_01_remaining/output.txt";
    public static void main(String[] args) {
        try (var sc = new Scanner(new FileInputStream(INPUT));
            var os = new FileOutputStream(OUTPUT)){
            while (sc.hasNextLine()) {
                byte[] bytes = sc.nextLine().getBytes(StandardCharsets.UTF_8);
                os.write(bytes);
                os.write("\n".getBytes(StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
