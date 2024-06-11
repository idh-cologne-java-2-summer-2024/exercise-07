package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
    private Account[] accounts = new Account[5];
    private Map<String, Account> accountMap = new HashMap<>();

    public Bank() {
        // create accounts with varying balances
        Random random = new Random();
        // example custom account numbers
        String[] accountIds = {"1234@5678", "cat_haz_cash", "💸", "acc123", "xyz789"};
        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account(accountIds[i], random.nextInt(1000));
            accounts[i] = account;
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


