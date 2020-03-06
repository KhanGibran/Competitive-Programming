package problems.leetcode.practice;

public class NumberOfOneBits
{
    public static void main(String[] args) {
        System.out.println(new NumberOfOneBits().hammingWeight(-3));
    }
    public int hammingWeight(int n)
    {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
