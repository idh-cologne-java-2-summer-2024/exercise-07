package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	//[] accounts = new Account[5];
	HashMap<Integer,Account> accountsMap = new HashMap <Integer, Account>();

	public Bank() {
		// create accounts with varying balances
		for (int i = 0; i < 5; i++) {
			Account currentAccount = new Account(i, 500);
			addAccount(currentAccount);
		}
	}
	/**
	 * Function to add an account to the hash-map*/
	protected HashMap addAccount(Account account) {
		accountsMap.put(account.id, account);
		
		return accountsMap;
	}
	
	@Override
	public Iterator<Account> iterator() {
		
		return null;
	}
	
	public Account getAccount(int number) {
		
		return accountsMap.get(number);
	}

}
