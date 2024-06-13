package lesson35._02_creation;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("Creating new thread from " + Thread.currentThread());
        var myThread = new MyTread();
        myThread.setName("New thread");
        //myThread.setPriority(10);
        //myThread.setDaemon(true);
        myThread.start();
        myThread.join();
        //myThread.start();
        System.out.println("Leaving from: " + Thread.currentThread());
        System.out.println("Creating new thread from " + Thread.currentThread());
        var myRunnable = new Thread(new MyRunnable());
        myRunnable.setName("New runnable");
        //myRunnable.setPriority(1);
        myRunnable.start();
        myRunnable.join();
        System.out.println("Leaving from: " + Thread.currentThread());

        var t1 = new Thread(() -> {
            System.out.println("Using Thread from " + Thread.currentThread());
        });

        var t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using Runnable from " + Thread.currentThread());
            }
        });
        t1.start();
        t2.start();
        System.out.println("Leaving from: " + Thread.currentThread());
    }
}
