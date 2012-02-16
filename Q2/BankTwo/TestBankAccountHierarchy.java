
public class TestBankAccountHierarchy
{
    public static void main(String args[])
    {
      System.out.println("Create BankAccount object starting with $1000");  
      Account b1 = new Account(1000.00);
      System.out.println("Create CheckingAccount object starting with $0 and check numbers starting at 100");  
      Checking c1 = new Checking();
      System.out.println("Create SavingsAccount object starting with $700 and an interest rate of 10%");       Savings s1 = new Savings(700.00, 0.10);
      System.out.print("BankAccount b1 ");
      b1.printSlip();
      System.out.print("CheckingAccount c1 ");
      c1.printSlip();
      System.out.print("SavingsAccount s1 ");
      s1.printSlip();
      System.out.println("Deposit $100 into each account."); 
      b1.deposit(100);
      c1.deposit(100);
      s1.deposit(100);
      System.out.print("BankAccount b1 ");
      b1.printSlip();
      System.out.print("CheckingAccount c1 ");
      c1.printSlip();
      System.out.print("SavingsAccount s1 ");
      s1.printSlip();
      System.out.println("Withdraw $100 from the BankAccount b1."); 
      b1.withdraw(100);
      c1.printCheck(20);
      c1.printCheck(40);      
      c1.printCheck(10);
      s1.collectInterest();
      System.out.print("BankAccount b1 ");
      b1.printSlip();
      System.out.print("CheckingAccount c1 ");
      c1.printSlip();
      System.out.print("SavingsAccount s1 ");
      s1.printSlip();
      System.out.println("Withdraw $100 from the Savings account s1.");
      s1.withdraw(100);
      System.out.print("BankAccount b1 ");
      b1.printSlip();
      System.out.print("CheckingAccount c1 ");
      c1.printSlip();
      System.out.print("SavingsAccount s1 ");
      s1.printSlip();
      b1.transfer(c1, 300.0);
      b1.printSlip();
      c1.printSlip();
      s1.printSlip();
      c1.transfer(s1, 300.0);
      b1.printSlip();
      c1.printSlip();
      s1.printSlip();
    }
}