package BankingSystem;

public interface BankClassInterface {
    public void addAccount(String accountID, String password) throws IllegalArgumentException;

    public void showAccount(String accountID, String password) throws IllegalArgumentException;

    public void deleteAccount(String accountID, String password) throws IllegalArgumentException;

    public void withdraw(String accountID, String password, double amount) throws IllegalArgumentException;

    public void deposit(String accountID, String password, double amount) throws IllegalArgumentException;

    public String encrypt(String password, int shift);
}
