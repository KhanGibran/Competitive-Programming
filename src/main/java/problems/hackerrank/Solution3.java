package problems.hackerrank;

public class Solution3
{
    public static void main(String[] args) {
        int n=6;
        int arr[] = new int[]{0, 0, 0, 0, 1, 0};
        System.out.println(jumps(arr,n));
    }

    private static int jumps(int[] arr, int n) {
        int jumps = 0;

        int pos=0;
        while (pos<n){
            if( pos+2< n && arr[pos+2]!=1){
                pos=pos+2;
                jumps++;
            }
            else if(pos+1<n && arr[pos+1]!=1){
                pos=pos+1;
                jumps++;
            }
            else
                pos++;
        }
        return jumps;
    }
}
