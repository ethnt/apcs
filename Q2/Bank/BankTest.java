

/**
 * The test class BankTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BankTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class BankTest
     */
    public BankTest() {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp() {

    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown() {
    }
    
    public void testAddFiveHundredToBankOne() {
        Bank one = new Bank();
        
        Account[] oneAccounts = one.returnAccounts();
        Account account = oneAccounts[5];
        account.deposit(500.0);
        
        assertEquals(1500.0, account.getBalance());
    }
    
    public void testAddFiveHundredToBankTwo() {
        Account account = new Account();
        Account[] accounts = { account, account, account, account, account };
        Bank two = new Bank("Bank of Mexico", accounts);
        
        Account[] twoAccounts = two.returnAccounts();
        Account testAccount = twoAccounts[2];
        testAccount.deposit(500.0);
        
        assertEquals(1500.0, testAccount.getBalance());
    }
    
    public void testAddFiveHundredToBankThree() {
        Bank three = new Bank(10, 500.0);
        
        Account[] threeAccounts = three.returnAccounts();
        Account account = threeAccounts[2];
        account.deposit(500.0);
        
        assertEquals(1000.0, account.getBalance());
    }
    
    public void testTotalFunds() {
        Account account = new Account();
        Account[] accounts = { account, account, account, account, account };
        
        Bank one = new Bank();
        Bank two = new Bank("Bank of Mexico", accounts);
        Bank three = new Bank(10, 500.0);
        
        assertEquals(10000.0, one.totalFunds());
        assertEquals(5000.0, two.totalFunds());
        assertEquals(5000.0, three.totalFunds());
    }
}
