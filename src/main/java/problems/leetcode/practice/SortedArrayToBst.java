package problems.leetcode.practice;

public class SortedArrayToBst
{
    public static void main(String[] args) {
        TreeNode treeNode = sortedArrayToBST(new int[]{1, 2, 3, 4, 5, 6, 7},0,6);
        System.out.println("Hello");
    }

    public static TreeNode sortedArrayToBST(int[] nums,int start,int end) {
        TreeNode node=null;
        int middle = start + (end-start)/2;

        if(start<=end){
            node = new TreeNode(nums[middle]);
            node.left = sortedArrayToBST(nums,start,middle-1);
            node.right = sortedArrayToBST(nums,middle+1,end);
        }
        return node;
    }
}
