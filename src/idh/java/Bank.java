package idh.java;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Bank implements Iterable<Account> {
    private Map<String, Account> accountMap = new HashMap<>();

    public Bank() {
    }

    @Override
    public Iterator<Account> iterator() {
        return accountMap.values().iterator();
    }

    public Account getAccount(String number) {
        return accountMap.get(number);
    }

    public void createAccount(String id, int balance) {
        if (accountMap.containsKey(id)) {
            System.out.println("Account ID already exists. Please choose a different ID.");
        } else {
            Account newAccount = new Account(id, balance);
            accountMap.put(id, newAccount);
            System.out.println("Account created successfully.");
        }
    }
}
