package OddEvenPrime.OddEvenPrime;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class OEPTest {
    
    @Test
    public void testOdd() {
        OEP oep = new OEP();
        AssertJUnit.assertEquals("ODD", oep.play(3));
    }
    
    @Test
    public void testEven() {
        OEP oep = new OEP();
        AssertJUnit.assertEquals("EVEN", oep.play(4));
    }
    
    @Test
    public void testPrime() {
        OEP oep = new OEP();
        AssertJUnit.assertEquals("PRIME", oep.play(11));
    }
}
