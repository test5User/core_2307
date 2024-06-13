package lesson35._04_race;

import lombok.AllArgsConstructor;

import java.util.StringJoiner;

@AllArgsConstructor
public class BankAccount {
    private long balance;

    //private final Object lock = new Object();

    public synchronized void  withdraw(long amount) {
        //synchronized (lock) {
            var newBalance = balance - amount;
            balance = newBalance;
        //}
    }

    public synchronized void deposit(long amount) {
        //synchronized (lock) {
            var newBalance = balance + amount;
            balance = newBalance;
        //}
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
