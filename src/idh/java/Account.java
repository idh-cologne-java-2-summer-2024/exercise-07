package idh.java;

public class Account {
    int balance; // Kontostand des Kontos
    String id; // Kontonummer als String

    public Account(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int sum) {
        if (balance >= sum) {
            balance -= sum;
        }
    }
}

