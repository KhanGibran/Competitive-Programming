package problems.leetcode.interview;

public class SingleNumber
{
    public int singleNumber(int[] nums) {
        int result=0;
        for(int x:nums)
        {
            result+=result^x;
        }
        return result;
    }
}
