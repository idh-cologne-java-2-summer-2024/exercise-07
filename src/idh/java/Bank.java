package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

//public class Bank implements Iterable<Account> {
	public class Bank {
	//HashMap replace Array
	HashMap <String,Account>accounts = new HashMap<String,Account>();

	public Bank() {
		// create accounts with varying balances
		Random random = new Random();
		int i = 0;
		String aId = 0+"";
		while (i < 10) {
			accounts.put( ""+i, new Account(aId, random.nextInt(1000)));
			i++;
		}
	}
	
//	@Override
//	public Iterator<Account> iterator() {
//		return new AccountIterator(accounts);
//	}
	/**
	 * Returns an Account object of an account
	 * @param number
	 * @return The Account belonging to the account number
	 */
	public Account getAccount(String number) {
		return accounts.get(number);
	}

}
