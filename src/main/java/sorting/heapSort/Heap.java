package sorting.heapSort;

public class Heap
{
    private static void print(int arr[]){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

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

    private static void buildMinHeap(int arr[],int arrLength){
        int firstNonLeafIndex = (arrLength-1)/2;

        for(int index = firstNonLeafIndex;index>=0;index--){
            minHeapify(arr,index,arrLength);
        }
    }

    private static void buildMaxHeap(int arr[],int arrLength){
        int firstNonLeafNodeIndex = (arrLength-1)/2;

        for(int index=firstNonLeafNodeIndex;index>=0;index--){
            maxHeapify(arr,index,arrLength);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8};
        buildMaxHeap(arr,arr.length);
        print(arr);
        buildMinHeap(arr,arr.length);
//        maxHeapify(arr,0,arr.length);
//        minHeapify(arr,0,arr.length);
        print(arr);
    }
}
