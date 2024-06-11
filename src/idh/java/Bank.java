package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;

public class Bank implements Iterable<Account> {
	//Account[] accounts = new Account[5];
	static HashMap<String, Account> accountMap = new HashMap<String, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		/*for (int i = 0; i < accountMap.size(); i++) {
			//accounts[i] = new Account(i, random.nextInt(1000));
			accountMap.put(i, new Account(i, random.nextInt(1000)));
			
		}*/
		addAccount("1234@5678", random.nextInt(1000));
		addAccount("cat_haz_cash", random.nextInt(1000));
		addAccount("💸", random.nextInt(1000));
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accountMap.values());
	}
	
	public Account addAccount(String accountNumber,int balance) {
		accountMap.put(accountNumber, new Account(accountNumber, balance));
		return null; 
	}
	public static Account getAccount(String accountNumber) {	
		return accountMap.get(accountNumber);
	}

}
