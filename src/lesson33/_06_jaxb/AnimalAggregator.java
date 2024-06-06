package lesson33._06_jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "animals")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class AnimalAggregator {
    @XmlElement(name = "animal")
    private List<AnimalModelJaxb> animals;
}
