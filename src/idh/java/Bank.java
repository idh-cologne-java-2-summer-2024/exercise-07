package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank {
	
	HashMap<String, Account> accounts= new HashMap<String, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			
			accounts.put(""+i, new Account(i, random.nextInt(1000)));
			
		}
		
		accounts.get("halloooo");
	}
	
	
	
	public Account getAccount(String number) {
		
		return accounts.get(number);
	}

}
