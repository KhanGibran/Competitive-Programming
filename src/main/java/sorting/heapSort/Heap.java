package sorting.heapSort;

public class Heap
{
    /**
     *
     * @param arr
     */
    private static void print(int arr[]){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    /**
     *
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
     * Complexity => O(n)
     * @param arr
     * @param arrLength
     */
    private static void buildMinHeap(int arr[],int arrLength){
        int firstNonLeafIndex = (arrLength)/2-1;

        for(int index = firstNonLeafIndex;index>=0;index--){
            minHeapify(arr,index,arrLength);
        }
    }

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
    private static void decreaseNodeInMinHeap(int arr[],int nodeIndex,int key,int arrLength){
        if(arr[nodeIndex]<key){
            System.out.println("Error");
            return;
        }

        arr[nodeIndex]=key;

        while(nodeIndex > 0 && arr[(nodeIndex-1)/2] > arr[nodeIndex]){
            swap(arr,(nodeIndex-1)/2,nodeIndex);
            nodeIndex = (nodeIndex-1)/2;
        }
    }

    /**
     *
     * @param arr
     * @param nodeIndex
     * @param key
     * @param arrLength
     */
    private static void increaseNodeInMinHeap(int arr[],int nodeIndex,int key,int arrLength){
        if(arr[nodeIndex]>key){
            System.out.println("Error");
            return;
        }
        arr[nodeIndex]=key;
        minHeapify(arr,nodeIndex,arrLength);
    }

    /**
     *
     * @param arr
     * @param key
     * @param arrLength
     */
    private static void insertInMinHeap(int arr[],int key,int arrLength){
        arr[arrLength-1] = Integer.MAX_VALUE;
        decreaseNodeInMinHeap(arr,arrLength-1,key,arrLength);
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

    /**
     * Complexity => O(n)
     * @param arr
     * @param arrLength
     */
    private static void buildMaxHeap(int arr[],int arrLength){
        int firstNonLeafIndex = (arrLength)/2-1;

        for(int index=firstNonLeafIndex;index>=0;index--){
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
        if(arrLength < 1)
            return -1;
        int maxElement = arr[0];
        arr[0] = arr[arrLength-1];
        maxHeapify(arr,0,arrLength-1);
        return maxElement;
    }
    //TODO Min from MaxHeap

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
            return;
        }

        arr[nodeIndex] = key;
        maxHeapify(arr,nodeIndex,arrLength);
    }

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
            return;
        }

        arr[nodeIndex] = key;

        while(nodeIndex > 0 && arr[(nodeIndex-1)/2]<arr[nodeIndex]){
            swap(arr,(nodeIndex-1)/2,nodeIndex);
            nodeIndex = (nodeIndex-1)/2;
        }
    }

    /**
     *
     * @param arr
     * @param key
     * @param arrLength
     */
    private static void insertInMaxHeap(int arr[],int key,int arrLength){
        arr[arrLength-1] = Integer.MIN_VALUE;
        increaseNodeInMaxHeap(arr,arrLength-1,key,arrLength);
    }

    /**
     * 1) First, we have to Build Max Heap of the Input.
     * 2) We will take the help of MaxHeapify to sort the data. It will iterate over the elements and fix maximum element from the End.
     * 3) It will sort the data in Increasing Order.
     * @param arr
     * @param arrLength
     */
    private static void heapSortInIncreasingOrder(int arr[],int arrLength){
        buildMaxHeap(arr,arrLength);
//        print(arr);

        for(int index=arrLength-1;index>=1;index--){
            swap(arr,0,index);
            arrLength--;
            maxHeapify(arr,0,arrLength);
        }
    }

    /**
     * 1) First, we have to build Min Heap of the input.
     * 2) We will take the help of MinHeapify to sort the data. It will iterate over the elements and fix minimum element from the End.
     * 3) It will sort the data in Decreasing Order.
     * @param arr
     * @param arrLength
     */
    private static void heapSortInDecreasingOrder(int arr[],int arrLength){
        buildMinHeap(arr,arrLength);
//        print(arr);

        for(int index=arrLength-1;index>-1;index--){
            swap(arr,0,index);
            arrLength--;
            minHeapify(arr,0,arrLength);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6, 7};
//        increaseNodeInMaxHeap(arr,3,20,arr.length);
//        decreaseNodeInMaxHeap(arr,1,7,arr.length);
//        increaseNodeInMinHeap(arr,1,15,arr.length);
//        decreaseNodeInMinHeap(arr,3,2,arr.length);
//        insertInMaxHeap(arr,300,arr.length);
        //insertInMinHeap(arr,5,arr.length);
        print(arr);
        heapSortInIncreasingOrder(arr,arr.length);
        print(arr);
        heapSortInDecreasingOrder(arr,arr.length);
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
