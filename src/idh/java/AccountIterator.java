package idh.java;


import java.util.Collection;
import java.util.Iterator;

class AccountIterator implements Iterator<Account> {
	int currentPosition = 0;
	Account[] accounts;
	
	public AccountIterator(Account[] accounts) {
		this.accounts = accounts;
	}
	
	public AccountIterator(Collection<Account> values) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean hasNext() {
		return currentPosition < accounts.length;
	}

	@Override
	public Account next() {
		return accounts[currentPosition++];
	}
	
}