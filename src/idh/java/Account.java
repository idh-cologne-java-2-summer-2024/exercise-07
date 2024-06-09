package idh.java;

/**
 * This class represents an account in our bank.
 */
public class Account {
    // the balance of the account
    int balance;
    
    // the id of the account
    String id;

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
    
    /**
     * Withdraws a sum of money from the account
     * @param sum
     */
    public void withdraw(int sum) {
        this.balance -= sum;
    }
}
