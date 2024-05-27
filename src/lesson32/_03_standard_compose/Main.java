package lesson32._03_standard_compose;

import lesson32._02_standard_inheritance.Child;

import java.io.*;
import java.util.List;

public class Main {
    public static final String SAVE_FILE = "src/lesson32/_02_standard_inheritance/save.sav";

    public static void main(String[] args) {
        var vaska = new StandardCat("Vaska", new StandardBox(List.of("Mouse", "Ball")));

        try (var fos = new FileOutputStream(SAVE_FILE);
             var oos = new ObjectOutputStream(fos);
             var fis = new FileInputStream(SAVE_FILE);
             var ois = new ObjectInputStream(fis)) {

            oos.writeObject(vaska);
            System.out.println(vaska);

            //StandardCat.STATIC_FIELD = "New static value";

            var vaskaFromFile = (StandardCat) ois.readObject();
            System.out.println(vaskaFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
