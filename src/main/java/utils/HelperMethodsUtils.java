package utils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.OptionalLong;

public class HelperMethodsUtils
{
    public static double numberOfDigits(int number){
        return Math.floor(Math.log10(number))+1;
    }

    public static long gcd(long a,long b){
        BigInteger b1= BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.longValue();
    }

    public static OptionalLong averageOfArray(long[] arr){
        return Arrays.stream(arr).parallel().max();
    }
}
