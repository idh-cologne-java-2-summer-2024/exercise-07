package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<Integer, Account> m;

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		m = new HashMap<Integer, Account>();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			m.put(accounts[i].getId(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		m.get(number);
		return null;
	}

}
