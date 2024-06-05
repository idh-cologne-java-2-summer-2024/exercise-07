package idh.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Random;
import java.util.HashMap; 



public class Bank implements Iterable<Account> {
	Account[] accounts = new Account[5];
	
	
	
	HashMap <String, Account> bankAccounts = new HashMap <String, Account>();

	public Bank() {
		
		String accountnamen = new String[5];
		// create accounts with varying balanceMap
		Random random = new Random();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(accountnamen, random.nextInt(1000));
			//bankAccounts.put(random.nextInt(1000), Account a);
			
		}
		
	}
	
	@Override
	public Iterator<Account> iterator() {
		return new AccountIterator(accounts);
	}
	


	public static void main (String[] args) {
		
		
		
	}
	

	
	
	
	public class HashMap <Integer, Account>{
		
		
		List[]buckets;
		
		
		public HashMap() {
		buckets = new List [5];
		}
		
		public Account getAccount (Integer accountnummer) {
			int hc = accountnummer.hashCode();
			int bucketIndex = hc % buckets.length;
			
			List<Node>list = buckets[bucketIndex];
			for (Node node : list) {
			 if (node.accountnummer.equals(accountnummer))	{
			return node.account; 	 
				 
			 }
				
				
			}
			
			return null;
		}
		
		class Node {
		Integer accountnummer; 
		Account account; 
			
		}
		
	
		
		
		
		
		public void put(Integer accountnummer, Account accountbla) {
		int hc = accountnummer.hashCode();
		int bucketIndex = hc % buckets.length; 	
		
	
		
		Node node = new Node();
		node.accountnummer = accountnummer; 
		node.account = getAccount(null) ; 
		}
		
		
	}
	
	

	
}


