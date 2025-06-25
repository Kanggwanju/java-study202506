package chap1_3;

public class BankAccount {

    // 속성(필드)
    String accountNumber;
    String owner;
    double balance;

    //기능(메서드)
    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance < amount) return;
        balance -= amount;
    }

    void displayBalance() {
        System.out.println("현재 잔고: " + balance);
    }
}
