package lesson31._03_target;

import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var demoTargetObj = DemoTargetClass.class;
        readAndPrintAnnotation(demoTargetObj);
        var demoTargetObjMethod = demoTargetObj.getMethod("doSmth");
        readAndPrintAnnotation(demoTargetObjMethod);
    }

    static void readAndPrintAnnotation(AnnotatedElement element) {
        System.out.println("\nFind annotation in " + element.getClass().getName());
        var annotations = element.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof JavaFileInfo javaFileInfo) {
                System.out.println("Author :" + javaFileInfo.name());
                System.out.println("Version :" + javaFileInfo.value());
            }
        }
    }
}
