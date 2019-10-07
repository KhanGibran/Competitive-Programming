package problems.leetcode;

class Solution4 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        int k=3;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        int length = nums.length;

        while(k--!=0){
            int temp = nums[length-1];
            for(int lastIndex=length-1;lastIndex>=1;lastIndex--){
                nums[lastIndex]=nums[lastIndex-1];
            }
            nums[0]=temp;
        }
    }
}