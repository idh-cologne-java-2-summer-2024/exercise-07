package idh.java;

import java.util.HashMap;
import java.util.Random;

public class Bank {
	HashMap<String, Account> accounts = new HashMap<>();

	public Bank() {
		// Generate 10 accounts with random balances for testing purposes
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			String accountString = "IchbineinRandomString" + i;
			Account exampleAcc = new Account(i, random.nextInt(1000));
			accounts.put(accountString, exampleAcc);
		}
			Account exampleAcc = new Account(11, random.nextInt(1000));
			accounts.put("1234@5678", exampleAcc);
			accounts.put("cat_haz_cash", exampleAcc);
			accounts.put("💸", exampleAcc);
	}
	
	public Account getAccount(String number) {
	return accounts.get(number);
	}
}