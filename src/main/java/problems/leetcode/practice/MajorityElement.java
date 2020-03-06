package problems.leetcode.practice;

import java.util.Arrays;

public class MajorityElement
{
    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        System.out.println(me.majorityElement(new int[]{3,2,3}));
        System.out.println(me.majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(me.majorityElement(new int[]{2,2}));
    }

    public int majorityElement(int[] nums) {
        int maj=-1;
        int n = nums.length;
        Arrays.parallelSort(nums);

        for(int i=0;i<=(n-1)/2;i++)
        {
            if(nums[i]==nums[i+n/2])
               maj = nums[i];
        }
        return maj;
    }
}
