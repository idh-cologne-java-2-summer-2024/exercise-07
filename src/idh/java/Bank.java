package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	HashMap<String, Account> accounts = new HashMap<String,Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			accounts.put(""+i, new Account(i, random.nextInt(1000)));
		}
		
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		return null;
	}

}
