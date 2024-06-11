package idh.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ATM {
    int cash = 100;
    Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print("Enter your account number: ");
                String accountNumber = br.readLine();
                System.out.print("Enter the amount to withdraw: ");
                int amount = Integer.parseInt(br.readLine());
                cashout(accountNumber, amount);
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public void cashout(String accountNumber, int amount) {
        if (amount > cash) {
            System.out.println("Sorry, not enough cash left.");
            return;
        }

        Account account = bank.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Sorry, this account doesn't exist.");
            return;
        }

        if (amount > account.getBalance()) {
            System.out.println("Sorry, you're out of money.");
            return;
        }

        account.withdraw(amount);
        cash += amount;
        System.out.println("Ok, here is your money, enjoy!");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        ATM atm = new ATM(bank);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Enter 1 to create an account, 2 to access ATM, or 3 to exit:");
                int choice = Integer.parseInt(br.readLine());

                if (choice == 1) {
                    System.out.print("Enter account ID: ");
                    String id = br.readLine();
                    System.out.print("Enter initial balance: ");
                    int balance = Integer.parseInt(br.readLine());
                    bank.createAccount(id, balance);
                } else if (choice == 2) {
                    atm.run();
                } else if (choice == 3) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
