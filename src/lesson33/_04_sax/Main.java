package lesson33._04_sax;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            var factory = SAXParserFactory.newInstance();
            var parser = factory.newSAXParser();
            var handler = new SaxHandler();
            parser.parse(new FileInputStream("src/lesson33/_04_sax/animals.xml"), handler);

            var animals = handler.getAnimals();

            animals.forEach(System.out::println);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
