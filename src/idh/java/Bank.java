package idh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Map<String, Account> accounts = new HashMap<>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		accounts.put("1234@5678", new Account("1234@5678", random.nextInt(1000)));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", random.nextInt(1000)));
		accounts.put("💸", new Account("💸", random.nextInt(1000)));
	}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	public Account getAccount(String number) {
		return accounts.get(number);
	}
}