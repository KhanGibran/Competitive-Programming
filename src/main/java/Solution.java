import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static long coef(BigInteger n,BigInteger k ){
        long res = 1;
        long num = n.longValue();
        long kum = k.longValue();

        if(kum>num-kum)
            kum=num-kum;

        for(long i=0;i<kum;i++){
            res = res*(num-i);
            res = (res/(i+1))%100000007;
        }
        return res;
    }

    public static long findNumberOfBST(long num){

        BigInteger numBigInteger = BigInteger.valueOf(num);
        BigInteger two = BigInteger.valueOf(2);

        long res = coef(two.multiply(numBigInteger),numBigInteger);
        return (res/(numBigInteger.longValue()+1));
    }

    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(100);

        for (Integer num:lists) {
            System.out.println(Solution.findNumberOfBST(num));
        }
    }
}
