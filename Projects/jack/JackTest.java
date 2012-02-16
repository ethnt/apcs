

/**
 * The test class JackTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JackTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class JackTest
     */
    public JackTest()
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

	public void testGETRequest()
	{
		Jack jack1 = new Jack();
		assertNotNull(jack1.get("http://api.dribbble.com/players/simplebits"));
	}
}



