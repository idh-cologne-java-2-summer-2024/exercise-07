package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
//	Account[] accounts;
	HashMap <Integer,Account>accounts = new LinkedHashMap<Integer,Account>();
	
	public AccountIterator(HashMap<Integer, Account> accounts) {
		this.accounts = accounts;
	}
	
	@Override
	public boolean hasNext() {
		return currentPosition < accounts.size();
	}

	@Override
	public Account next() {
//		TODO: Implement
//		Map.Entry<Integer, Account> next;
//		return next.getValue();
		
//		return accounts[currentPosition++];
		return null;
	}
	
}