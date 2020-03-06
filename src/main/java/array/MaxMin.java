package array;

/**
 * Divide and Conquer Technique
 */
public class MaxMin
{
    static class AnswerPair
    {
        int min;
        int max;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        AnswerPair answerPair = findMaxMin(arr,0,arr.length-1);
        System.out.println("Maximum Element is "+answerPair.max+" and Minimum Element is "+answerPair.min);
    }

    private static AnswerPair findMaxMin(int[] arr, int left,int right) {
        AnswerPair minMax = new AnswerPair();
        AnswerPair minMaxLeft = new AnswerPair();
        AnswerPair minMaxRight = new AnswerPair();

        // Base Condition
        // MinMax if there are only one element in an Array.
        if(left==right){
            minMax.min = arr[left];
            minMax.max = arr[left];
            return minMax;
        }

        // Base Condition
        // MinMax if there are only two elements in an Array
        if(left == right-1){
            if(arr[left]<arr[right]){
                minMax.min=arr[left];
                minMax.max=arr[right];
            }
            else{
                minMax.min = arr[right];
                minMax.max = arr[left];
            }
            return minMax;
        }

        // MinMax in case of more than 2 elements
        int middle = (left+right)/2;
        minMaxLeft = findMaxMin(arr,left,middle);
        minMaxRight = findMaxMin(arr,middle+1,right);

        if(minMaxLeft.max > minMaxRight.max)
            minMax.max = minMaxLeft.max;
        else
            minMax.max = minMaxRight.max;

        if(minMaxLeft.min < minMaxRight.min)
            minMax.min = minMaxLeft.min;
        else
            minMax.min = minMaxRight.min;

        return minMax;
    }
}
