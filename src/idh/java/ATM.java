package idh.java;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ATM  {
	
	// initial cash in the ATM
	int cash = 100;

	Bank bank;
	
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	/**
	 * Main command loop of the ATM Asks the user to enter a number, and passes this
	 * number to the function cashout(...) which actually does the calculation and
	 * produces money. If the user enters anything else than an integer number, the
	 * loop breaks and the program exists
	 */
	public void run() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.print("Select 1 to withdraw Money or 2 to create a new bankaccount: ");
				int input = Integer.valueOf((br.readLine()));
				if(input==1){
					System.out.print("Enter your account number: ");
					String accountNumber = br.readLine();
					System.out.print("Enter the amount to withdraw: ");
					int amount = Integer.parseInt(br.readLine());
					cashout(accountNumber, amount);
				}
				else if (input==2) {
					System.out.print("Enter your preferred account number : ");	
					String accountNumber = br.readLine();
					System.out.print("Enter the Balance you would like to add: ");
					int amount = Integer.parseInt(br.readLine());
					setAccountinBankMap(accountNumber, amount);
				}
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public void cashout(String accountNumber, int amount) {
		// check for cash in the ATM
		if (amount > cash) {
			System.out.println("Sorry, not enough cash left.");
			return;
		}
		
		// check for existence of the account
		Account account = getAccount(accountNumber);
		if (account == null) {
			System.out.println("Sorry, this account doesn't exist.");
			return;
		}
		
		// check for balance of the account
		if (amount > account.getBalance()) {
			System.out.println("Sorry, you're out of money.");
			return;
		}
		
		// withdraw
		account.withdraw(amount);
		cash += amount;
		System.out.println("Ok, here is your money, enjoy!");

	};
	
	public void setAccountinBankMap(String id,int balance) { 
		if (!this.bank.accountMap.containsKey(id)) {
		Account newAcc= new Account(id,balance);
		this.bank.accountMap.put(newAcc.id,newAcc);
		System.out.println("New Account created!");
		}
		else System.out.println("Sorry, this account number is taken. Try again"); 
	}

	/**
	 * Launches the ATM
	 */
	public static void main(String[] args) {
		Bank bank = new Bank();
		ATM atm = new ATM(bank);
		atm.run();
	};
	
	/**
	 * Retrieves the account given an id.
	 * 
	 * @param id
	 * @return
	 */
	protected Account getAccount(String id) {
		if (this.bank.accountMap.containsKey(id)){
			return this.bank.accountMap.get(id);
		}
		
		return null;
	}

}
