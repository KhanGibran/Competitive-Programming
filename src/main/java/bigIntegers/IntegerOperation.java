package bigIntegers;

import java.math.BigInteger;

public class IntegerOperation
{
    public static void main(String[] args) {
        /**
         * Creating big Integer
         */
        BigInteger a = new BigInteger("22");
        BigInteger b = BigInteger.valueOf(3145685465L);
        BigInteger c = BigInteger.TEN;

        /**
         * Multiplying two bigIntegers
         */
        BigInteger result = a.multiply(new BigInteger("55")).add(new BigInteger("13")).divide(BigInteger.valueOf(12));
        System.out.println(result);

        BigInteger mod = c.mod(new BigInteger("k")); //c%k
        BigInteger modInverse = c.modInverse(new BigInteger("k"));

        result.isProbablePrime(50);
        System.out.println(mod);
    }
}
