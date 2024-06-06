package idh.java;


import java.util.Iterator;
import java.util.Random;
import java.util.HashMap;
public class Bank implements Iterable<Account> {
	HashMap<String, Account> accountMap= new HashMap <String, Account>(); 
	
	public Bank() {
		// create accounts with varying balances
		Account account; 
		Random random = new Random();
		for (int i = 0; i < 16; i++) {
			String id=String.valueOf(i);
			account=new Account(id, random.nextInt(1000));
			accountMap.put(account.id, account);
		}
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accountMap);
	}
	
	public Account getAccount(String id) {
		// TODO: Implement
		return accountMap.get(id);
	}
	


}
