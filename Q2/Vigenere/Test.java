

/**
 * The test class Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test extends junit.framework.TestCase {
    /**
     * Default constructor for test class Test
     */
    public Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {

	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }
    
    public void testEncryptionOne() {
        Vigenere vigenere = new Vigenere("foobar");
        String result = vigenere.encrypt("Foo to the bar to the foo.");
        assertEquals("fmmtmterofqtmtercmmf", result);
    }
    
    public void testEncryptionTwo() {
        Vigenere vigenere = new Vigenere("thecrowfliesatnight");
        String result = vigenere.encrypt("The wolf howls at the moon.");
        assertEquals("moiyfzbmzepkamgpkthhu", result);
    }
    
    public void testDecryption() {
        Vigenere vigenere = new Vigenere("foobar");
        String result = vigenere.decrypt("fmmtmterofqtmtercmmf");
        assertEquals("footothebartothefoo", result);
    }
    
}
