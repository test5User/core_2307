package lesson33._04_sax;

import lesson33._01_traning.AnimalModel;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    @Getter
    private List<AnimalModel> animals;
    private AnimalModel animal;
    private String tagName;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("animals")) {
            animals = new ArrayList<>();
        } else if (qName.equals("animal")) {
            animal = new AnimalModel();
            var id = Integer.parseInt(attributes.getValue("id"));
            animal.setId(id);
        } else {
            tagName = qName;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("animal")) {
            animals.add(animal);
            animal = null;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        var value = new String(ch, start, length).trim();
        if (!value.isEmpty()) {
            switch (tagName) {
                case "name" -> animal.setName(value);
                case "age" -> animal.setAge(Integer.parseInt(value));
            }
            tagName = null;
        }
    }
}
