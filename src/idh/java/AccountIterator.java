package idh.java;


import java.util.HashMap;
import java.util.Iterator;


class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	HashMap<String, Account> accountMap= new HashMap <String, Account>();
	
	public AccountIterator(HashMap<String, Account> accountMap) {
		this.accountMap = accountMap;
	}
	
	@Override
	public boolean hasNext() {
		return currentPosition < accountMap.size();
	}

	@Override
	public Account next() {
		String id= String.valueOf(currentPosition++);
		return accountMap.get(id);
	}
	
}