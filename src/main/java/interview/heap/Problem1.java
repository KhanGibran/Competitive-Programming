package interview.heap;

/**
 * Find Maximum Element in Min Heap
 */
public class Problem1
{
    public static void main(String[] args) {
        int minHeap[] = new int[]{1,2,3,4,5,6};
        int maxHeap[] = new int[]{100,90,80,70,60,50};
        System.out.println(findMaxInMinHeap(minHeap,minHeap.length));
        System.out.println(findMinInMaxHeap(maxHeap,maxHeap.length));
    }

    private static int findMaxInMinHeap(int[] minHeap, int length) {
        int firstLeafIndex = length/2;
        int max = Integer.MIN_VALUE;

        for(int index = firstLeafIndex;index<=length-1;index++){
            if(minHeap[index]>max)
                max=minHeap[index];
        }
        return max;
    }

    private static int findMinInMaxHeap(int[] maxHeap,int length){
        int firstLeafIndex = length/2;
        int min = Integer.MAX_VALUE;

        for(int index = firstLeafIndex;index<=length-1;index++){
            if(maxHeap[index]<min)
                min=maxHeap[index];
        }
        return min;
    }

}
