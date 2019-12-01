package sorting.insertionSort;

public class Insertion {

    private static void print(int arr[]){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int []arr = new int[]{9,6,5,0,8,2,7,1,3};
        insertionSort(arr,arr.length);
        print(arr);
    }

    private static void insertionSort(int[] arr, int length) {
        for(int i=1;i<=length-1;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }
}
