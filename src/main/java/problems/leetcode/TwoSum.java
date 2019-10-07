package problems.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TwoSum {
    public static void main(String[] args) {

        int nums[] = new int[]{2, -5, 11, 15};
        int target = -3;
        int arr [] = twoSum(nums,target);
        System.out.println();
    }
    public static int[] twoSum(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                result.add(map.get(target-nums[i]));
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

}