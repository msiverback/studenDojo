/******************************************************************************
 * Just some simple main function to get everybody started.
 */
import java.util.*;
public class Main
{
    
    public static String convertToRoman(Integer decimalNumber)
    {
        HashMap<Integer,String> converter = 
            new HashMap<Integer,String>(){{
                put(1, "I");
                put(4, "IV");
                put(5, "V");
                put(9, "IX");
            }};
        ArrayList<Integer> keys = new ArrayList(converter.keySet());
        Collections.sort(keys);
        Collections.reverse(keys);
        String romanString = "";
        for(Integer k : keys)
        {
            while (decimalNumber >= k)
            {
                romanString += converter.get(k);
                decimalNumber -= k;
            }
        }
        return romanString;
    }
    
    
	public static void main(String[] args) {
	    HashMap<Integer, String> testData = new HashMap<Integer, String>();
		TestHelper testhelper = new TestHelper();
        testData.put(1, "I");
	    testData.put(2, "II");
	    testData.put(3, "III");
	    testData.put(4, "IV");
	    testData.put(5, "V");
	    testData.put(8, "VIII");
	    testData.put(9, "IX");
        for(HashMap.Entry<Integer, String> e : testData.entrySet())
        {
            testhelper.checkTest(e.getKey(), 
                                 convertToRoman(e.getKey()), 
                                 e.getValue());
        }
		testhelper.endSuite();
	}
}
