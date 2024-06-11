public class Bank {
    private Map<Integer, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(int accountNumber, Account account) {
        accounts.put(accountNumber, account);
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }
}

