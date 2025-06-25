package chap1_3;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount bankAcc = new BankAccount();

        bankAcc.deposit(100);
        bankAcc.displayBalance();

        bankAcc.deposit(500);
        bankAcc.withdraw(400);
        bankAcc.displayBalance();
    }
}
