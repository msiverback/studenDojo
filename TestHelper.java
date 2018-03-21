/*********************************************************************************************************
 * Just some simple helper class that can be easily copied into an online java coding site.
 * For now it just keeps track of the number of tests run and the number of successful outcomes.
 */
import java.util.*;
public class TestHelper
{
    
    private int numberOfTestsRun;
    private int numberOfSuccessfulTests;
    
    public TestHelper()
    {
        numberOfTestsRun = 0;
        numberOfSuccessfulTests = 0;
        System.out.println(" ###################################################");
    }
    
    public void checkTest(int input, String result, String expectedResult)
    {
        numberOfTestsRun += 1;
        if (result.compareTo(expectedResult) == 0)
        {
            System.out.println(" ## YES! test " + numberOfTestsRun + " was successful.");
            numberOfSuccessfulTests += 1;
        }
        else{
            System.out.println(" ## NOO! test " + numberOfTestsRun + " was NOT successful, " +
			       result + " != " + expectedResult);
        }
    }
    
    public void endSuite()
    {
        System.out.println(" ###################################################");
        System.out.println(" " + numberOfSuccessfulTests + " out of " + numberOfTestsRun +
			   " were successful.");
    }
    
}
