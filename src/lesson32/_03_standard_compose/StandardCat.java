package lesson32._03_standard_compose;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.StringJoiner;

@AllArgsConstructor
public class StandardCat implements Serializable {
    private static final long serialVersionUID = 125L;

    static String STATIC_FIELD = "static";
    final String name;
    transient StandardBox box;

    @Override
    public String toString() {
        return new StringJoiner(", ", StandardCat.class.getSimpleName() + "[", "]")
                .add("static='" + STATIC_FIELD + "'")
                .add("name='" + name + "'")
                .add("box=" + box)
                .toString();
    }
}
