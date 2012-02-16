
/**
 * Write a description of class Savings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Savings extends Account {
    private double interest;

    public Savings() {
        super();
        interest = 0.03;
    }
    
    public Savings(double balance, double savingsInterest) {
        super(balance);
        interest = savingsInterest;
    }
    
    public void withdraw(double amount) {
        super.withdraw(amount);
        super.withdraw(1.0);
    }
    
    public void collectInterest() {
        deposit(getBalance() * interest);
    }
}
