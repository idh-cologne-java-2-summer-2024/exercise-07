package idh.java;


import java.util.HashMap;
import java.util.Random;

public class Bank{
	HashMap<Integer, Account> accountMap = new HashMap <Integer, Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		for (int i = 0; i < accountMap.size(); i++) {
			accountMap.put(i, new Account(i, random.nextInt(1000)));
		}
	}
	
	public Account getAccount(int number) {
		accountMap.get(number);
		return null;
	}

}
