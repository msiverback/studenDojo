/******************************************************************************
 * Just some simple main function to get everybody started.
 */
import java.util.*;
public class Main
{
    
    public static String convertToRoman(Integer decimalNumber)
    {
        if (decimalNumber == 4)
            return "IV";
        if (decimalNumber == 3)
            return "III";
        if (decimalNumber == 2)
            return "II";
        else
            return "I";
    }
    
    
	public static void main(String[] args) {
	    HashMap<Integer, String> testData = new HashMap<Integer, String>();
		TestHelper testhelper = new TestHelper();
        testData.put(1, "I");
	    testData.put(2, "II");
	    testData.put(3, "III");
	    testData.put(4, "IV");
        for(HashMap.Entry<Integer, String> e : testData.entrySet())
        {
            testhelper.checkTest(e.getKey(), 
                                 convertToRoman(e.getKey()), 
                                 e.getValue());
        }
		testhelper.endSuite();
	}
}
