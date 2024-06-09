package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	private Map<Integer, Account> accountMap;

	public Bank() {
		accounts = new Account[] {
	            new Account("1234@5678", 500),
	            new Account("cat_haz_cash", 1500),
	            new Account("💸", 2500),
	            new Account("default1", 300),
	            new Account("default2", 700)
	            
		accountMap = new HashMap<>();
	            for (Account account : accounts) {
	                accountMap.put(account.getNumber(), account);
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
