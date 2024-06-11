package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	
	HashMap<String, Account> accountsMap = new HashMap<String, Account>(); 

	public Bank() {
		// create accounts with varying balances
	
		for (int i = 0; i < 10; i++) {
			accountsMap.put("1234@5678", new Account("1234@5678", 100));
			accountsMap.put("cat_haz_cash", new Account("cat_haz_cash", 100));
			accountsMap.put("💸", new Account("💸", 100));
		}
		
		
	}
	
	public Account getAccount(String number) { //damit Automat Texteingaben erlaubt
		return accountsMap.get(number); //um gespeichertes Account-Objekt zurückzubekommen
	}

	@Override
	public Iterator<Account> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
