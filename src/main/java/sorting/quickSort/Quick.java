package sorting.quickSort;

public class Quick
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

    private static int partition(int arr[],int left,int right){
        int pivot = arr[right];
        int i = left-1;

        for(int j=left;j<=right-1;j++){
            if(arr[j]<=pivot)
                swap(arr,++i,j);
        }
        swap(arr,++i,right);
        return i;
    }

    private static void quickSort(int arr[],int left,int right){
        if(left<right){
            int partition = partition(arr,left,right);
            quickSort(arr,left,partition-1);
            quickSort(arr,partition+1,right);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6, 7};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}
