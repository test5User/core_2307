package lesson33._05_dom;

public class Main {
    public static void main(String[] args) {
        var animals = DomProcessor.processXml();
        animals.forEach(System.out::println);
    }
}
