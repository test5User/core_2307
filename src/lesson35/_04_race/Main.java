package lesson35._04_race;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        var account = new BankAccount(100);

        var t1 = new Thread(() -> {
           for (int i=0; i < 100000; i++) {
               account.deposit(100);
           }
        });

        var t2 = new Thread(() -> {
            for (int i=0; i < 100000; i++) {
                account.withdraw(100);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(account);
    }
}
