
/**
 * Write a description of class BankTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BankTest {
    public static void main(String[] args) {
        // First constructor.
        Bank b1 = new Bank();
        b1.totalFunds();
        b1.giveCharity(10000.0);
        b1.addInterest(10.0);
        b1.giveRaise(100000.0);
        Employee b1NewTeller = new Employee();
        b1.replaceTeller(b1NewTeller);
        b1.companyReport();
        b1.fireAll();
        
        // Second constructor.
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Bank b2 = new Bank("Bank of 'Merica", a1, a2, a3, e1, e2, e3);
        b2.totalFunds();
        b2.giveCharity(10000.0);
        b2.addInterest(10.0);
        b2.giveRaise(100000.0);
        Employee b2NewTeller = new Employee();
        b2.replaceTeller(b2NewTeller);
        b2.companyReport();
        b2.fireAll();
    }
}
