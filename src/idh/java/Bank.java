package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank {
	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	public Bank() {
		// Generate 10 accounts with random balances for testing purposes
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Account exampleAcc = new Account(i, random.nextInt(1000));
			accounts.put(i, exampleAcc);
		}
	}
	
	public Account getAccount(int number) {
		// TODO: Implement
		Account wantedAccount = accounts.get(number);
		return wantedAccount;
	}
}