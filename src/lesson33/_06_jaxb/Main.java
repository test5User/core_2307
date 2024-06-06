package lesson33._06_jaxb;

import jakarta.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {
        var animals = AnimalUtils.unmarshal();

        animals.forEach(System.out::println);

        AnimalUtils.marshal(animals);
    }
}
