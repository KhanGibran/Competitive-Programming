package problems.leetcode.interview;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionAndIntersectionOfUnsortedArrays
{
    public static void main(String[] args) {
        int nums1[] = new int[]{1,2};
        int nums2[] = new int[]{1,1};
        print(findIntersection(nums1,nums2));
    }

    private static void print(int[] intersection) {
        for(int x:intersection){
            System.out.println(x);
        }
    }

    private static int[] findIntersection(int[] nums1, int[] nums2) {
      Map<Integer,Integer> map = new HashMap<>();

      List<Integer> result = new ArrayList<>();

      for(int x:nums1){
          if(map.containsKey(x))
              map.put(x,map.get(x)+1);
          else
              map.put(x,1);
      }

      for(int y:nums2){
          if(map.containsKey(y) && map.get(y)>0){
            result.add(y);
            map.put(y,map.get(y)-1);
          }
      }
      return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
