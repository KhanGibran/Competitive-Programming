package problems.leetcode.practice;

public class PrimeNumberofSetBits
{
    private static int prime[] = new int[20];
    static{
        prime[2]=1;
        prime[3]=1;
        prime[5]=1;
        prime[7]=1;
        prime[11]=1;
        prime[13]=1;
        prime[17]=1;
        prime[19]=1;
    }

    public static void main(String[] args) {
        PrimeNumberofSetBits primeNumberofSetBits = new PrimeNumberofSetBits();
        System.out.println(primeNumberofSetBits.countPrimeSetBits(6,10));
    }
    private int countSetBits(int num){
        int setBits = 0;
        while(num!=0){
            if(num%2!=0)
                setBits++;
            num = num>>1;
        }
        return setBits;
    }
    public int countPrimeSetBits(int L, int R) {
        int result=0;

        for(int i=L;i<=R;i++){
            if(prime[countSetBits(i)]==1)
                result++;
        }
        return result;
    }
}
