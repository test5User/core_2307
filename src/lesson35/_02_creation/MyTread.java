package lesson35._02_creation;

public class MyTread extends Thread {
    @Override
    public void run() {
        System.out.println("Executing in: " + Thread.currentThread());
        System.out.println("Hello from MyThread");
    }
}
