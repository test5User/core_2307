package lesson32._03_standard_compose;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@ToString
public class StandardBox {
    List<String> things;
}
