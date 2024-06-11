package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank  {
	
	HashMap<String,Account> accounts = new HashMap<String,Account>();
	
	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
	//	for (int i = 0; i < 10; i++) {
			
		//accounts.put(""+i, new Account(i,random.nextInt(1000)));}
		accounts.put("cat_haz_cash", new Account("cat_haz_cash",100));
		accounts.put("1234@5678", new Account("1234@5678",100));
		accounts.put("💸" , new Account("💸" ,100));
	}
	
	//@Override
	//public Iterator<Account> iterator() {
	//	return new AccountIterator(accounts);
	//}
	
	public Account getAccount(String number) {
		// TODO: Implement
		return accounts.get(number);
	}

}
