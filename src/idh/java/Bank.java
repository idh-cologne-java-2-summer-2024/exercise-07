package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Map;

public class Bank implements Iterable<Account> {
    Account[] accounts = new Account[5];
    private Map<String, Account> accountMap = new HashMap<>();

	public Bank() {
        // create accounts with varying balances
        accounts[0] = new Account("1234@5678", 500);
        accounts[1] = new Account("cat_haz_cash", 750);
        accounts[2] = new Account("💸", 1000);
        accounts[3] = new Account("account4", 250);
        accounts[4] = new Account("account5", 900);

        for (Account account : accounts) {
            accountMap.put(account.getId(), account);
        }
    }
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		//TODO: implement
        return accountMap.get(number);
    }
}
