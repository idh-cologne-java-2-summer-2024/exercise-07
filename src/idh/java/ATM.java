import java.util.Scanner;

public class ATM {
    private Bank bank;
    private Scanner scanner;

    public ATM(Bank bank) {
        this.bank = bank;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();

            Account account = bank.getAccount(accountNumber);
            if (account != null) {
                System.out.println("Account found: " + account);
                // Weitere Interaktionen mit dem Konto
            } else {
                System.out.println("Account not found.");
            }
        }
    }
}
