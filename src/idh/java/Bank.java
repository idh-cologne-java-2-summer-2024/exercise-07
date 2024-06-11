package idh.java;


import java.util.HashMap;
import java.util.Iterator;

public class Bank{
	HashMap<String, Account> accountMap = new HashMap <String, Account>();

	public Bank() {
		// create accounts with varying balances
		accountMap.put("1234@5678", new Account("1234@5678", 100));
		accountMap.put("cat_haz_cash", new Account("cat_haz_cash", 100));
		accountMap.put("💸", new Account("💸", 100));
		}
	
	/*public Iterator<Account> iterator(){
		return new AccountIterator(accountMap);
	}
	*/
	public Account getAccount(String number) {
		return accountMap.get(number);
	}

}
