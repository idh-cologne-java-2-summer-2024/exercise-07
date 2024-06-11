package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private Map<String, Account> accountMap = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		String[] ids = {"1234@5678", "cat_haz_cash", "💸", "account4", "account5"};
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(ids[i], random.nextInt(1000));
			accountMap.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
		// TODO: Implement
		return accountMap.get(number);
	}

}
