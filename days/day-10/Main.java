package day10;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1_000_000);
        account.withdraw(250_000);
        System.out.println("Số dư: " + account.getBalance());
    }
}

class Account {
    private long balance;

    Account(long balance) {
        if (balance < 0) throw new IllegalArgumentException("Số dư âm");
        this.balance = balance;
    }

    void withdraw(long amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Số tiền không hợp lệ");
        }
        balance -= amount;
    }

    long getBalance() {
        return balance;
    }
}
