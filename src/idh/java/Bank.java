package idh.java;


import java.until.HashMap;
import java.util.Iterator;
import java.until.Map;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Mp <String, Account> accounts = new HashMap <> ();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		accounts.put("1234@5678", new Account("1234@5678", random.nextInt(1000)));
		accounts.put("cat_haz_cash", new Account("cat_haz_cash", random.nextInt(1000)));
		accounts.put("💸", new Account("💸", random.nextInt(1000)));
		accounts.put("account1", new Account("account1", random.nextInt(1000)));
		accounts.put("account2", new Account("account2", random.nextInt(1000)));
		}
	
	@Override
	public Iterator<Account> iterator() {
		return accounts.values().iterator();
	}
	
	public Account getAccount( String number) {
		return accounts.get(number);
		
	}

}
