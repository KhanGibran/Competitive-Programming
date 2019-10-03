package utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelperMethodUtils
{
    @Test
    public void testnumberOfDigits(){
        assertEquals(3,HelperMethodsUtils.numberOfDigits(525),0.0001);
        assertEquals(4,HelperMethodsUtils.numberOfDigits(5858),0.0001);
    }

    @Test
    public void testGcd(){
        assertEquals(5,HelperMethodsUtils.gcd(5,25));
    }
}
