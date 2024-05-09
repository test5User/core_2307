package lesson25._03_var_usage;

import java.util.function.Predicate;

public class Main1 {
    public static void main(String[] args) {
        int x = 70;
        int y = 30;
        Operable operable = () -> {
            //x = 20;
            return x+10;
        };
        //x = 20;
        y = 100;
        System.out.println(operable.operate());
    }
}
