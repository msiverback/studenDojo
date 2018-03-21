/******************************************************************************
 * Just some simple main function to get everybody started.
 */

public class Main
{
	public static void main(String[] args) {
		TestHelper testhelper = new TestHelper();
		/* First test example.
                 * please note that the example below is
                 * a little bit "chatty" and also might
                 * need refactoring quite early
                 */
		Integer input = 1;
		String result = convertInt2Roman(1);
		String expectedResult = "I";
		testhelper.checkTest(input, result, expectedResult);
		
		// This last command just prints a small test suite summary 
		testhelper.endSuite();
	}
}
