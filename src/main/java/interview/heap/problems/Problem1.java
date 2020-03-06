package interview.heap.problems;

import interview.heap.util.HeapUtil;

/**
 * Find Maximum Element in Min Heap
 */
public class Problem1
{
    public static void main(String[] args) {
        int minHeap[] = new int[]{1,2,3,4,5,6};
        int maxHeap[] = new int[]{100,90,80,70,60,50};
//        System.out.println(findMaxInMinHeap(minHeap,minHeap.length));
//        System.out.println(findMinInMaxHeap(maxHeap,maxHeap.length));
//        deleteElementFromMinHeap(minHeap,minHeap.length,2);
        deleteElementFromMaxHeap(maxHeap,maxHeap.length,90);
    }

    /**
     *
     * @param minHeap
     * @param length
     * @return
     */
    private static int findMaxInMinHeap(int[] minHeap, int length) {
        int firstLeafIndex = length/2;
        int max = Integer.MIN_VALUE;

        for(int index = firstLeafIndex;index<=length-1;index++){
            if(minHeap[index]>max)
                max=minHeap[index];
        }
        return max;
    }

    /**
     *
     * @param maxHeap
     * @param length
     * @return
     */
    private static int findMinInMaxHeap(int[] maxHeap,int length){
        int firstLeafIndex = length/2;
        int min = Integer.MAX_VALUE;

        for(int index = firstLeafIndex;index<=length-1;index++){
            if(maxHeap[index]<min)
                min=maxHeap[index];
        }
        return min;
    }

    /**
     *
     * @param minHeap
     * @param length
     * @param element
     */
    private static void deleteElementFromMinHeap(int minHeap[],int length,int element){
        int i;
        for(i=0;i<length;i++)
            if(minHeap[i]==element)
                break;

        minHeap[i]=minHeap[length-1];
        HeapUtil.minHeapify(minHeap,i,length-1);
        HeapUtil.printHeap(minHeap,length-1);
    }

    /**
     *
     * @param maxHeap
     * @param length
     * @param element
     */
    private static void deleteElementFromMaxHeap(int[] maxHeap, int length, int element) {
        int i;
        for(i=0;i<length;i++)
            if(maxHeap[i]==element)
                break;

        maxHeap[i]=maxHeap[length-1];
        HeapUtil.maxHeapify(maxHeap,i,length-1);
        HeapUtil.printHeap(maxHeap,length-1);
    }
}
