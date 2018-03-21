/******************************************************************************
 * Just some simple main function to get everybody started.
 */

public class Main
{
	public static void main(String[] args) {
		TestHelper testhelper = new TestHelper();
		testhelper.checkTest(1, convertInt2Roman(1), "I");
		testhelper.endSuite();
	}
}
