package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
    private Account[] accounts;
    private HashMap<String, Account> accountMap = new HashMap<>();

    public Bank() {
        // Initialize accounts with some example account numbers and balances
        accounts = new Account[] {
            new Account("1234@5678", new Random().nextInt(1000)),
            new Account("cat_haz_cash", new Random().nextInt(1000)),
            new Account("💸", new Random().nextInt(1000)),
            new Account("123", new Random().nextInt(1000)),
            new Account("abc123", new Random().nextInt(1000))
        };

        for (Account account : accounts) {
            accountMap.put(account.getId(), account);
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return new AccountIterator(accounts);
    }

    public Account getAccount(String number) {
        return accountMap.get(number);
    }
}
