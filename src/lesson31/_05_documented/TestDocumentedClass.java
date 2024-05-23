package lesson31._05_documented;

public class TestDocumentedClass {
    @TestDocumented(doTestDocument = "Hello Doc with annotation")
    public void doSmthDocumented() {
        System.out.println("Test for 'Documented' annotation");
    }

    @TestNotDocumented(doTestNotDocument = "Hello Doc without annotation")
    public void doSmthNotDocumented() {
        System.out.println("Test for annotation without 'Documented'");
    }
}
