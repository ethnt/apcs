/**
 * A Java representation of a bank account.
 * 
 * @author Ethan Turkeltaub
 * @version 0.1.0
 */
public class Account {

    /*
     * Instance variables.
     */
    
    private String owner;
    private double balance;
    private int pin;
    private int id;
    private static int nextID = 0;
    
    /*
     * Constructors.
     */
     
    public Account() {
        owner = "Joe Shmoe";
        balance = 1000.0;
        pin = 1234;
        
        nextID++;
        id = nextID;
    }
    
    public Account(String inOwner, double inBalance, int inPIN) {
        owner = inOwner;
        balance = inBalance;
        pin = inPIN;
    }
    
    /*
     * Methods
     */
    
    public void getInfo() {
        System.out.println(owner + "'s account has a balance of " + balance + " dollars and a PIN of " + pin);
    }
    
    public String getOwner() {
        return owner;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getPIN() {
        return pin;
    }
    
    public void deposit(double amount) {
        balance = balance + amount;
        
        System.out.println("Balance is now " + balance + " dollars.");
    }
    
    public void withdraw(double amount) {
        balance = balance - amount;
        
        System.out.println("Balance is now " + balance + " dollars.");
    }
    
    public void changePIN(int newPIN) {
        pin = newPIN;
        
        System.out.println("New PIN is " + pin + " .");
    }
    
    public boolean isEqual(Account other) {
        return this.getBalance() - other.getBalance() < 0.0000001;
    }
}
