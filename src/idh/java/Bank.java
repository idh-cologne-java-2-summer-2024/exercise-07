package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank {
	
	HashMap<String, Account> accounts= new HashMap<String, Account>();

	
	
	public Bank() {
		accounts.put("Hallo", new Account("Hallo", 200));
	}
	
	
	
	public Account getAccount(String number) {
		
		return accounts.get(number);
	}

}
