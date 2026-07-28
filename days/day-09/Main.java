package day09;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("An", 500_000);
        account.deposit(200_000);
        System.out.println(account);
    }
}

class BankAccount {
    String owner;
    long balance;

    BankAccount(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(long amount) {
        balance += amount;
    }

    public String toString() {
        return owner + ": " + balance + " VND";
    }
}
