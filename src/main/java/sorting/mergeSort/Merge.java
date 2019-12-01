package sorting.mergeSort;

public class Merge
{
    private static void print(int arr[]){
        for (int x:arr) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    private static void merge(int[] arr,int left,int middle,int right){
        int n1 = middle-left+1;
        int n2 = right-middle;
        int i=0;
        int j=0;

        int leftArr[] = new int[n1+1];
        int rightArr[] = new int[n2+1];

        for(i=0;i<n1;i++)
            leftArr[i]=arr[left+i];

        leftArr[i] = Integer.MAX_VALUE;

        for(j=0;j<n2;j++)
            rightArr[j]=arr[middle+1+j];

        rightArr[j] = Integer.MAX_VALUE;

        i=0;
        j=0;

        for(int k=left;k<=right;k++){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
        }
    }

    private static void mergeSort(int arr[],int left,int right){
        if(left<right) {
            int middle = (left+right)/2;
            mergeSort(arr,left,middle);
            mergeSort(arr,middle+1,right);
            merge(arr,left,middle,right);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{12, 11, 13, 5, 6, 7,9,10};
        mergeSort(arr,0,arr.length-1);
        print(arr);
    }
}
