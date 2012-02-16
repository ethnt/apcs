import java.util.*;

/**
 * A Java representation of a Bank.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */
public class Bank {

    /*
     * Instance variables.
     */
    
    private String name;
    private Account[] accounts;
    
    
    /*
     * Constructors.
     */
     
    public Bank() {
        name = "Farmington Bank";
        
        Account account = new Account();
        
        Account[] contents = new Account[10];
        
        for(int i = 0; i < 10; i++) {
            contents[i] = account;
        }
        
        accounts = contents;
    }
    
    public Bank(String bankName, Account[] bankAccounts) {
        name = bankName;
        accounts = bankAccounts;
    }
    
    public Bank(int numAccounts, double startingAmount) {
        Account[] contents = new Account[numAccounts];
        
        for(int i = 0; i < numAccounts; i++) {
            Account account = new Account(startingAmount);
            contents[i] = account;
        }
        
        accounts = contents;
    }
    
    /*
     * Methods.
     */
    
    public double totalFunds() {
        double totalFunds = 0;
        
        for(Account a : accounts) {
            totalFunds = totalFunds + a.getBalance();
        }
        
        return totalFunds;
    }
    
    public void chargeFees(double fees) {
        for(Account a : accounts) {
            a.withdraw(fees);
        }
        
        System.out.println("Removed " + fees + " dollars from each account.");
    }
    
    public void addInterest(double interest) {
        for(Account a : accounts) {
            a.deposit(a.getBalance() * (1 + interest));
        }
        
        System.out.println("Added " + interest + "% interest.");
    }
    
    public Account[] returnAccounts() {
        return accounts;
    }
    
    public void printCompanyReport() {
        System.out.println("======= REPORT FOR: " + name + " ========");
        
        for(Account a : accounts) {
            System.out.println("");
            System.out.println("Account: " + a.getOwner());
            System.out.println("  balance: " + a.getBalance());
            System.out.println("  pin: " + a.getPIN());
        }
        
        System.out.println("Total funds: " + this.totalFunds());
    }

}
