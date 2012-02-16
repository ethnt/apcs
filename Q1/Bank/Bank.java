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
    private Account account1;
    private Account account2;
    private Account account3;
    private Employee ceo;
    private Employee vp;
    private Employee teller;
    
    private double totalFunds;
    
    
    /*
     * Constructors.
     */
     
    public Bank() {
        name = "Farmington Bank";
        
        account1 = new Account();
        account2 = new Account("John Doe", 100000.0, 4242);
        account3 = new Account("Jane Doe", 100.0, 4454);
        
        ceo = new Employee("Yo", "Dawg", 100, "CEO", 400000.0);
        vp = new Employee("Snoop", "Dawg", 156, "VP", 2433.0);
        teller = new Employee("Kanye", "West", 2, "Teller", 2.0);
    }
    
    public Bank(String bankName, Account oneAcc, Account twoAcc, Account threeAcc, Employee ceoEmp, Employee vpEmp, Employee tellerEmp) {
        name = bankName;
        account1 = oneAcc;
        account2 = twoAcc;
        account3 = threeAcc;
        ceo = ceoEmp;
        vp = vpEmp;
        teller = tellerEmp;
    }
    
    /*
     * Methods.
     */
    
    public double totalFunds() {
        totalFunds = account1.getBalance() + account2.getBalance() + account3.getBalance();
        
        return totalFunds;
    }
    
    public void giveCharity(double amount) {
        account1.deposit(amount);
        account2.deposit(amount);
        account3.deposit(amount);
        
        System.out.println("Well aren't you generous.");
    }
    
    public void chargeFees(double fees) {
        account1.withdraw(fees);
        account2.withdraw(fees);
        account3.withdraw(fees);
        
        System.out.println("Removed " + fees + " dollars from each account.");
    }
    
    public void addInterest(double interest) {
        account1.deposit(account1.getBalance() * (1 + interest));
        account2.deposit(account2.getBalance() * (1 + interest));
        account3.deposit(account3.getBalance() * (1 + interest));
        
        System.out.println("Added " + interest + "% interest.");
    }
    
    public void giveRaise(double amount) {
        ceo.giveRaise(amount);
        vp.giveRaise(amount);
        teller.giveRaise(amount);
        
        System.out.println("A raise of " + amount + " dollars have been added to each employee.");
    }
    
    public void replaceTeller(Employee newTeller) {
        teller = newTeller;
        
        System.out.println("The old teller has been replaced with " + teller.getFirst());
    }
    
    public void fireAll() {
        ceo.fire();
        vp.fire();
        teller.fire();
    }
    
    public void companyReport() {
        System.out.println("Report for " + name + ".");
        System.out.println("=========================");
        System.out.println("CEO: " + ceo.getFirst() + " " + ceo.getLast() + ". " + ceo.getAge() + " years old, salary of " + ceo.getSalary() +  " dollars, ID of " + ceo.getID());
        System.out.println("VP: " + vp.getFirst() + " " + vp.getLast() + ". " + vp.getAge() + " years old, salary of " + vp.getSalary() +  " dollars, ID of " + vp.getID());
        System.out.println("Teller: " + teller.getFirst() + " " + teller.getLast() + ". " + teller.getAge() + " years old, salary of " + teller.getSalary() +  " dollars, ID of " + teller.getID());
        System.out.println("----------------------");
        System.out.println("Account: " + account1.getOwner() + " with " + account1.getBalance() + " dollars.");
        System.out.println("Account: " + account2.getOwner() + " with " + account2.getBalance() + " dollars.");
        System.out.println("Account: " + account3.getOwner() + " with " + account3.getBalance() + " dollars.");
    }
}
