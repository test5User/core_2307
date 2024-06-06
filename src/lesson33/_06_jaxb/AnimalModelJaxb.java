package lesson33._06_jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@ToString
public class AnimalModelJaxb {
    @XmlAttribute
    private int id;
    private String name;
    private int age;
}
