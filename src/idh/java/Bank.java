package idh.java;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Bank {
	//      Account ID ---> Account         key,  Value
    HashMap <String,Account>  accounts= new HashMap<String,Account>();
	
	public Bank() {
		// create accounts with varying balances
		//Random random = new Random();
		//for (int i = 0; i < 10; i++) {
			
		//	accounts.put(""+i,new Account(i,random.nextInt(1000)) ); // aus  dem int wird ein string 
			//accounts[i] = new Account(i, random.nextInt(1000));
		//}
		accounts.put("meinAccount", new Account("meinAccount",100));
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
