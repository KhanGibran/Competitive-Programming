package interview.heap.util;

public final class HeapUtil
{
    /**
     *
     * @param arr
     * @param length
     */
    public static void printHeap(int arr[],int length){
        for(int i=0;i<length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
    }

    /**
     * @param arr
     * @param a
     * @param b
     */
    private static void swap(int arr[],int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    /**
     * @param arr
     * @param rootIndex
     * @param arrayLength
     */
    public static void minHeapify(int arr[],int rootIndex,int arrayLength){

        int leftChildIndex = 2*rootIndex+1;
        int rightChildIndex = 2*rootIndex+2;
        int minimumIndex=rootIndex;

        if(leftChildIndex < arrayLength && arr[leftChildIndex] < arr[rootIndex])
            minimumIndex = leftChildIndex;

        if(rightChildIndex < arrayLength && arr[rightChildIndex] < arr[minimumIndex])
            minimumIndex = rightChildIndex;

        if(minimumIndex!=rootIndex)
        {
            swap(arr,minimumIndex,rootIndex);
            minHeapify(arr,minimumIndex,arrayLength);
        }
    }

    /**
     * Complexity => O(logn)
     * @param arr
     * @param rootIndex
     * @param arrayLength
     */
    public static void maxHeapify(int arr[],int rootIndex,int arrayLength){
        int leftChildIndex = 2*rootIndex+1;
        int rightChildIndex = 2*rootIndex+2;
        int largestIndex=rootIndex;

        if(leftChildIndex < arrayLength && arr[leftChildIndex] > arr[rootIndex])
            largestIndex = leftChildIndex;

        if(rightChildIndex < arrayLength && arr[rightChildIndex] > arr[largestIndex])
            largestIndex = rightChildIndex;

        if(largestIndex!=rootIndex)
        {
            swap(arr,largestIndex,rootIndex);
            maxHeapify(arr,largestIndex,arrayLength);
        }
    }
}
