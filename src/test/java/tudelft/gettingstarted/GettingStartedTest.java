package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    // can also do
    @Test
    public void addFiveTo21()
    {
        Assertions.assertEquals(26, new GettingStarted().addFive(21));
    }

    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }

    // A lot of redundancy

    // Temptation (DO NOT DO THIS)
    // Wrote 5 test cases in one test method body
    // Bad practice
    // Each of these test cases is a test
    // If one were to fail, then whole test case fails
    // Name of test does not give any help on which test case fails
    @Test
    public void badTests()
    {
        GettingStarted g = new GettingStarted();
        Assertions.assertEquals(5, g.addFive(0));
        Assertions.assertEquals(6, g.addFive(1));
        Assertions.assertEquals(7, g.addFive(2));
        Assertions.assertEquals(8, g.addFive(3));
        Assertions.assertEquals(9, g.addFive(4));
        Assertions.assertEquals(10, g.addFive(5));
    }
}
