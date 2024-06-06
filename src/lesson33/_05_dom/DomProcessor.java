package lesson33._05_dom;

import lesson33._01_traning.AnimalModel;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DomProcessor {

    public static List<AnimalModel> processXml() {
        var animals = new ArrayList<AnimalModel>();
        try {
            var factory = DocumentBuilderFactory.newInstance();
            var builder = factory.newDocumentBuilder();
            var document = builder.parse(new FileInputStream("src/lesson33/_04_sax/animals.xml"));
            document.getDocumentElement().normalize();
//            var root = document.getDocumentElement();
//            System.out.println(root.getNodeName());
            var nodeList = document.getElementsByTagName("animal");
            for (int i=0; i < nodeList.getLength(); i++) {
                var node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    var element = (Element) node;
                    var animal = new AnimalModel();
                    animal.setId(Integer.parseInt(element.getAttribute("id")));
                    animal.setName(element.getElementsByTagName("name").item(0).getTextContent());
                    animal.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));
                    animals.add(animal);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return animals;
    }
}
