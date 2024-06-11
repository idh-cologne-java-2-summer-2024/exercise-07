package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
    private Map<String, Account> accountMap = new HashMap<>();


    public Bank() {
    	String[] accountNumbers = {"1234@5678", "cat_haz_cash", "💸", "user123", "guest456"};
        Random random = new Random();
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(accountNumbers[i], random.nextInt(1000));
            accountMap.put(accounts[i].getId(), accounts[i]);
        }
    }
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(String number) {
	    return accountMap.get(number);
	}

}
