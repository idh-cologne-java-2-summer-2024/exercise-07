package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	HashMap<Integer, Account> accMap;

	public Bank() {

		HashMap<Integer, Account> accMap = new HashMap<>();
		
		Random random = new Random();
		
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, random.nextInt(1000));	
		}
		
		for (int c = 0; c < accounts.length; c++) {
			accMap.put(random.nextInt(1000), accounts[c]);
		}
		this.accMap = accMap;
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	
	public Account getAccount(int number) {
		if(accMap.containsKey(number)) {
		return accMap.get(number);
		} else {
			System.out.println("account does not exist");
			return null;
		}
	}

}
