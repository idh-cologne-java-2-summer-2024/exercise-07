package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;


public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	//private HashMap<Integer, Account> accountHashMap = new HashMap<>();
	private HashMap<String, Account> accountHashMap = new HashMap<>();
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
        String[] ids = {"1234@5678", "cat_haz_cash", "💸", "unique_id1", "unique_id2"};
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(ids[i], random.nextInt(1000));
            accountHashMap.put(accounts[i].getId(), accounts[i]);
        }
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	
	
	public Account getAccount(String number) {
		return accountHashMap.get(number);
		//return null;
	}

}
