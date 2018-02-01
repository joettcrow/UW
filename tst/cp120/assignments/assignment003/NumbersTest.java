package cp120.assignments.assignment003;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void testIsPrime(){
        assertTrue(Numbers.isPrime(7));
        assertFalse(Numbers.isPrime(8));
    }

    @Test
    public void testLcmZero(){
        int param1 = 0;
        int param2 = 5;
        int leastMultiple = 0;
        int lcm = Numbers.lcm(param1, param2);
        assertEquals(lcm, leastMultiple);
    }

    @Test
    public void testLcmMultiply(){
        int param1 = 7;
        int param2 = 29;
        int leastMultiple = 203;
        int lcm = Numbers.lcm(param1, param2);
        assertEquals(lcm, leastMultiple);
    }

    @Test
    public void testLcmOnes(){
        int param1 = 1;
        int param2 = 1;
        int leastMultiple = 1;
        int lcm = Numbers.lcm(param1, param2);
        assertEquals(lcm, leastMultiple);
    }

    @Test
    public void testLcmSubset(){
        int param1 = 9;
        int param2 = 18;
        int leastMultiple = 18;
        int lcm = Numbers.lcm(param1, param2);
        assertEquals(lcm, leastMultiple);
    }


}