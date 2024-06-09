package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	//[] accounts = new Account[5];
	HashMap<String,Account> accountsMap = new HashMap <String, Account>();

	public Bank() {
		// create accounts with varying balances
		String emojicon = ":D";
		for (int i = 0; i < 5; i++) {
			Account currentAccount = new Account(emojicon, 500);
			addAccount(currentAccount);
			emojicon = emojicon + "A";
		}
		Account emoji = new Account("💸", 500);
		addAccount(emoji);
		Account gesundheit = new Account("1234@5678" ,750);
		addAccount(gesundheit);
		Account catHaze = new Account("cat_haz_cash",1000);
		addAccount(catHaze);
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
	
	public Account getAccount(String accountNumber) {
		
		return accountsMap.get(accountNumber);
	}

}
