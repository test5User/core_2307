package lesson35._02_creation;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in: " + Thread.currentThread());
        System.out.println("Hello from Runnable");
    }
}
