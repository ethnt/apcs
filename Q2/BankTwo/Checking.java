
/**
 * Write a description of class Checking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checking extends Account {
    private int nextCheck;

    /**
     * Constructor for objects of class Checking
     */
    public Checking() {
        super(0.0);
        nextCheck = 100;
    }
    
    public Checking(double balance, int checkNumber) {
        super(balance);
        nextCheck = checkNumber;
    }
    
    public void deposit(double amount) {
        if (getBalance() > 50.0) {
            withdraw(5.0);
        }
        
        super.deposit(amount);
    }
    
    public void withdraw(double amount) {
        if (getBalance() > 50.0) {
            super.withdraw(5.0);
        }
        
        super.withdraw(amount);
    }
    
    /**
     * Make a fancy check. Withdraws from Account.
     * 
     * @param   amount   Amount of money the check is.
     * @return           A visual check. 
     */
    public void printCheck(double amount) {
        if (getBalance() > 50.0) {
            withdraw(5.0);
        }
        
        withdraw(amount);
        
        System.out.println("");
        System.out.println("=================");
        System.out.println("= no. " + nextCheck + "         =");
        System.out.println("=               =");
        System.out.println("= $" + amount + "        =");
        System.out.println("=================");
        
        nextCheck++;
    }
}
