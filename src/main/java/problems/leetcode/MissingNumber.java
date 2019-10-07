package problems.leetcode;

public class MissingNumber
{
    public int singleNumber(int[] nums) {
        int result=0;
        for(int x:nums)
            result=result^x;
        return result;
    }
}
