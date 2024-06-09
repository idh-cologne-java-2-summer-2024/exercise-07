package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private Map<Integer, Account> accountMap;

	public Bank() {
		accountMap = new HashMap<>();
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));
			accountMap.put(accounts[i].getNumber(), accounts[i]);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		return accountMap.get(number);
	}

}
