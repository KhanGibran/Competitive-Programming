package sorting.heapSort;

public class Heap
{
    private static void print(int arr[]){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    /**
     * Complexity => O(logn)
     * @param arr
     * @param rootIndex
     * @param arrayLength
     */
    public static  void minHeapify(int arr[],int rootIndex,int arrayLength){
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

    private static void swap(int arr[],int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    /**
     * Complexity => O(n)
     * @param arr
     * @param arrLength
     */
    private static void buildMinHeap(int arr[],int arrLength){
        int firstNonLeafIndex = (arrLength-1)/2;

        for(int index = firstNonLeafIndex;index>=0;index--){
            minHeapify(arr,index,arrLength);
        }
    }

    /**
     * Complexity => O(n)
     * @param arr
     * @param arrLength
     */
    private static void buildMaxHeap(int arr[],int arrLength){
        int firstNonLeafNodeIndex = (arrLength-1)/2;

        for(int index=firstNonLeafNodeIndex;index>=0;index--){
            maxHeapify(arr,index,arrLength);
        }
    }

    /**
     * Complexity => O(logn)
     * @param arr
     * @param arrLength
     * @return
     */
    private static int deleteMaxFromMaxHeap(int arr[],int arrLength){
        if(arrLength<1)
            return -1;
        int maxElement = arr[0];
        arr[0] = arr[arrLength-1];
        maxHeapify(arr,0,arrLength-1);
        return maxElement;
    }
    //TODO Min from MaxHeap

    /**
     * Complexity => O(logn)
     * @param arr
     * @param arrLength
     * @return
     */
    private static int deleteMinFromMinHeap(int arr[],int arrLength)
    {
        if(arrLength<1)
            return -1;
        int minElement = arr[0];
        arr[0]=arr[arrLength-1];
        minHeapify(arr,0,arrLength-1);
        return minElement;
    }
    //TODO Max from MinHeap

    /**
     *
     * @param arr
     * @param nodeIndex
     * @param key
     * @param arrLength
     */
    private static void decreaseNodeInMaxHeap(int arr[],int nodeIndex,int key,int arrLength){

        if(arr[nodeIndex]<key){
            System.out.println("Error");
        }

        arr[nodeIndex] = key;
        maxHeapify(arr,nodeIndex,arrLength);
    }
    //TODO Decrease Node in MinHeap

    /**
     *
     * @param arr
     * @param nodeIndex
     * @param key
     * @param arrLength
     */
    private static void increaseNodeInMaxHeap(int arr[],int nodeIndex,int key,int arrLength){
        if(arr[nodeIndex]>key){
            System.out.println("The value of node is already greater than key");
        }

        arr[nodeIndex] = key;

        while(nodeIndex>0 && arr[(nodeIndex-1)/2]<arr[nodeIndex]){
            swap(arr,(nodeIndex-1)/2,nodeIndex);
            nodeIndex = (nodeIndex-1)/2;
        }
    }
    //TODO Increase Node in MinHeap

    public static void main(String[] args) {
        int arr[] = new int[]{14,13,12,10,8};
//        increaseNodeInMaxHeap(arr,3,20,arr.length);
        decreaseNodeInMaxHeap(arr,1,7,arr.length);
        print(arr);
//        int maxFromMaxHeap = deleteMaxFromMaxHeap(arr,5);
//        buildMaxHeap(arr,arr.length);
        //print(arr);
        //buildMinHeap(arr,arr.length);
//        maxHeapify(arr,0,arr.length);
//        minHeapify(arr,0,arr.length);
        //print(arr);
    }
}
