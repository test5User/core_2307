package lesson33._06_jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.experimental.UtilityClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@UtilityClass
public class AnimalUtils {
    public static final String INPUT = "src/lesson33/_04_sax/animals.xml";
    public static final String OUTPUT = "src/lesson33/_06_jaxb/output.xml";

    public static List<AnimalModelJaxb> unmarshal() throws JAXBException, FileNotFoundException {
        var context = JAXBContext.newInstance(AnimalAggregator.class);
        var unmarshaller = context.createUnmarshaller();
        var aggregator = (AnimalAggregator) unmarshaller.unmarshal(new FileReader(INPUT));
        return aggregator.getAnimals();
    }

    public static void marshal(List<AnimalModelJaxb> animals) throws JAXBException, IOException {
        var aggregator = new AnimalAggregator();
        aggregator.setAnimals(animals);
        var context = JAXBContext.newInstance(AnimalAggregator.class);
        var marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(aggregator, new FileWriter(OUTPUT));
    }
}
