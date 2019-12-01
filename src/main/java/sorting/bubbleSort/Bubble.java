package sorting.bubbleSort;

public class Bubble
{
    private static void print(int arr[]){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void swap(int arr[],int a, int b) {
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        bubbleSort(arr,arr.length);
        print(arr);
    }

    private static void bubbleSort(int[] arr, int length) {
        for(int outerIndex = 0; outerIndex < length; outerIndex++){
            boolean swapped = false;

            for(int innerIndex = 0; innerIndex < length-1-outerIndex; innerIndex++){

                if(arr[innerIndex]>arr[innerIndex+1]){
                    swap(arr,innerIndex,innerIndex+1);
                    swapped=true;
                }
            }

            if(!swapped)
                break;;
        }
    }
}
