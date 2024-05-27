package lesson32._02_standard_inheritance;

import java.io.Serializable;
import java.util.StringJoiner;

public class Child extends Parent implements Serializable {

    private static final long serialVersionUID = 25L;
    int childField;
    String aaa;

    public Child(int childField) {
        //super(0);
        System.out.println("Inside child constructor");
        this.childField = childField;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Child.class.getSimpleName() + "[", "]")
                .add("childField=" + childField)
                .add("parentField=" + parentField)
                .toString();
    }
}
