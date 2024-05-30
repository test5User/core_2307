package lesson32._04_extended;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (var fos = new FileOutputStream("src/lesson32/_02_standard_inheritance/save.sav");
            var oos = new ObjectOutputStream(fos);
            var fis = new FileInputStream("src/lesson32/_02_standard_inheritance/save.sav");
            var ois = new ObjectInputStream(fis)) {

            var extObject = new ExtendedClass("Vasia", "Pupkin", "Thi$MyP@ss");
            System.out.println(extObject);

            oos.writeObject(extObject);
            System.out.println("-----------------------------------");

            var fromFile = (ExtendedClass)ois.readObject();
            System.out.println(fromFile);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
