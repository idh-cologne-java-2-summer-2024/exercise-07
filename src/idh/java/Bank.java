package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bank implements Iterable<Account> {
    private Map<String, Account> accountMap;
    private Account[] accounts;

    public Bank() {
        accountMap = new HashMap<>();

        // Beispielkonten mit Zeichen in den Kontonummern
        accounts = new Account[] {
            new Account("Hasan123", 500),
            new Account("Hans234", 1500),
            new Account("Hanso345", 2000),
        };

        // Füllen der HashMap mit Konten
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
