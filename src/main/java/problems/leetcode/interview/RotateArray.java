package problems.leetcode.interview;

public class RotateArray
{
    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        while(k--!=0){
            int lastElement = nums[length-1];
            for(int index = length-1;index>=1;index--){
                nums[index] = nums[index-1];
            }
            nums[0] = lastElement;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        rotate(arr,3);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int x:arr){
            System.out.println(x);
        }
    }
}
