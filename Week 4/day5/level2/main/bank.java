package week4.day5.level2.main;

public class bank {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot deposit negative amount");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
