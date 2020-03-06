package problems.leetcode.practice;

public class MoveZeros
{
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(new int[]{0,1,0,3,12});
    }

    public void moveZeroes(int[] nums) {
        int swapIndex=0;

        for(int index=0; index<nums.length; index++){

            if(nums[index]==0)
                continue;
            else
            {
                int temp = nums[swapIndex];
                nums[swapIndex] = nums[index];
                nums[index] = temp;
                swapIndex++;
            }
        }
    }
}
