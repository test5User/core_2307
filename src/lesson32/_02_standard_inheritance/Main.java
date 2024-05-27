package lesson32._02_standard_inheritance;

import java.io.*;

public class Main {
    public static final String SAVE_FILE = "src/lesson32/_02_standard_inheritance/save.sav";
    public static void main(String[] args) {
        System.out.println("Creating");
        var child = new Child(1);
        System.out.println("Child object: " + child);
        try (//var fos = new FileOutputStream(SAVE_FILE);
            //var oos = new ObjectOutputStream(fos);
            var fis = new FileInputStream(SAVE_FILE);
            var ois = new ObjectInputStream(fis)) {
//            System.out.println("Serializing.....");
//            oos.writeObject(child);

            System.out.println("DeSerializing.....");
            var childFromFile = (Child)ois.readObject();
            System.out.println("Child object from file: " + childFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
