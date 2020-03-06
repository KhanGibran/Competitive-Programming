package array;

/**
 * Divide and Conquer Technique
 */
public class MinAndSecondMin
{
    static class Answer{
        int minimum;
        int secondMinimum;
    }

    public static void main(String[] args) {
        int arr [] = new int[]{5,4,8,7,5};
        Answer answer = findMinimumAndSecondMinimum(arr,0,arr.length-1);
        System.out.println("First Minimum Element is "+answer.minimum+" and Second Minimum Element is "+answer.secondMinimum);
    }

    private static Answer findMinimumAndSecondMinimum(int[] arr, int left, int right) {
        Answer answer = new Answer();
        Answer answerLeft = new Answer();
        Answer answerRight = new Answer();

        //Base Condition
        if(left==right){
            answer.minimum=arr[left];
            answer.secondMinimum=arr[left];
            return answer;
        }

        //Base Condition
        // MinMax if there are only two elements in an Array
        if(left == right-1){
            if(arr[left]<=arr[right]){
                answer.minimum = arr[left];
                answer.secondMinimum = arr[right];
            }
            else{
                answer.minimum = arr[right];
                answer.secondMinimum = arr[left];
            }
            return answer;
        }

        // MinMax in case of more than 2 elements
        int middle = (left+right)/2;
        answerLeft = findMinimumAndSecondMinimum(arr,left,middle);
        answerRight = findMinimumAndSecondMinimum(arr,middle+1,right);

        if(answerLeft.minimum < answerRight.minimum)
            answer.minimum = answerLeft.minimum;
        else
            answer.minimum = answerRight.minimum;

        if(answerLeft.secondMinimum < answerRight.minimum)
            answer.secondMinimum = answerLeft.secondMinimum;
        else
            answer.secondMinimum = answerRight.minimum;

        return answer;
    }
}
