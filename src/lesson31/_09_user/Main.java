package lesson31._09_user;

public class Main {
    public static void main(String[] args) {
        var user = new User("Vasia Pupkin");
        System.out.println(user);

        var companyAnnotation = user.getClass().getAnnotation(Company.class);
        System.out.println(companyAnnotation.city());
        System.out.println(companyAnnotation.name());
    }
}
