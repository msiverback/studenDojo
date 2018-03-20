/******************************************************************************
 * Just some simple main function to get everybody started.
 */

public class Main
{
	public static void main(String[] args) {
		TestHelper testhelper = new TestHelper();
		testhelper.checkTest(1, "II", "I");
		testhelper.checkTest(1, "I", "I");
		testhelper.checkTest(3, "II", "III");
		testhelper.endSuite();
	}
}
