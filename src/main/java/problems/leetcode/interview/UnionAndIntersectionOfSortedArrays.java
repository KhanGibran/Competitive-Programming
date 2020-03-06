package problems.leetcode.interview;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;
import java.util.stream.Collectors;

public class UnionAndIntersectionOfSortedArrays {

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 2, 2, 3};
        int arr2[] = new int[]{2, 3, 4, 5};
//        printArray(findUnionHandleDuplicates(arr1,arr2));
        printArray(findIntersection(arr1,arr2));
    }

    private static int[] findIntersection(int[] arr1, int[] arr2) {
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        list1.add(Integer.MAX_VALUE);
        list2.add(Integer.MAX_VALUE);

        int i=0;
        int j=0;
        List<Integer> result = new ArrayList<>();

        while(i<list1.size()-1 || j<list2.size()-1){
            if(list1.get(i) < list2.get(j))
                i++;
            else if(list1.get(i) > list2.get(j))
                j++;
            else{
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void printArray(int[] ans) {
        for(int x:ans){
            System.out.println(x);
        }
    }

    private static int[] findUnionHandleDuplicates(int[] arr1, int[] arr2){

        // Converting primitive integer array to List of Integer
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        list1.add(Integer.MAX_VALUE);
        list2.add(Integer.MAX_VALUE);

        int i=0;
        int j=0;

        Set<Integer> set = new HashSet<>();

        while(i<list1.size()-1 || j<list2.size()-1){

            if(list1.get(i) < list2.get(j)){
                set.add(list1.get(i));
                i++;
            }
            else if(list1.get(i) > list2.get(j)){
                set.add(list2.get(j));
                j++;
            }
            else{
                set.add(list1.get(i));
                i++;
                j++;
            }
        }
        // Converting list of Integer into primitive array
        int res[] = set.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    private static int[] findUnionWithoutHandleDuplicates(int[] arr1, int[] arr2){
        // Converting primitive integer array to List of Integer
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        list1.add(Integer.MAX_VALUE);
        list2.add(Integer.MAX_VALUE);

        int i=0;
        int j=0;

        List<Integer> result = new ArrayList<>();

        while(i<list1.size()-1 || j<list2.size()-1){

            if(list1.get(i) < list2.get(j)){
                result.add(list1.get(i));
                i++;
            }
            else if(list1.get(i) > list2.get(j)){
                result.add(list2.get(j));
                j++;
            }
            else{
                result.add(list1.get(i));
                i++;
                j++;
            }
        }
        // Converting list of Integer into primitive array
        int res[] = result.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}
