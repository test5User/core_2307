package lesson32._02_standard_inheritance;

import java.io.Serializable;

public class Parent {
    int parentField;

    public Parent() {
        System.out.println("Inside parent constructor");
        parentField = 5;
    }

//    public Parent(int parentField) {
//        this.parentField = parentField;
//    }
}
