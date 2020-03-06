package dp.rachit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

    private static final int N = 1003;
    private static int row;
    private static int column;

    private static int arr[][] = new int[N][N];
    private static int dp[][] = new int[N][N];
    private static boolean visited[][] = new boolean[N][N];

    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        row = Integer.parseInt(bufferedReader.readLine());
        column = Integer.parseInt(bufferedReader.readLine());
        arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        for(int i=0;i<row;i++){
//            for(int j=0;j<column;j++){
//                arr[i][j] = Integer.parseInt(bufferedReader.readLine());
//            }
//        }
        displayMatrix(arr);
        System.out.println(goRecursive(0,0));
        System.out.println(goTopDown(0,0));
    }

    private static int goRecursive(int i, int j){

        if(i==row-1 && j==column-1)
            return arr[i][j];

        int ans = 0;

        if(i<row-1 && j<column-1)
            ans = arr[i][j]+Integer.max(goRecursive(i,j+1),goRecursive(i+1,j));

        if(i==row-1)
            ans = arr[i][j] + goRecursive(i,j+1);
        else
            ans = arr[i][j] + goRecursive(i+1,j);

        return ans;
    }

    private static int goTopDown(int i, int j){

        if(i==row-1 && j==column-1)
            return arr[i][j];

        if(visited[i][j])
            return dp[i][j];

        visited[i][j] = true;
        int ans = 0;

        if(i<row-1 && j<column-1){
            ans = arr[i][j]+Integer.max(goTopDown(i,j+1),goTopDown(i+1,j));
            dp[i][j] = ans;
        }

        if(i==row-1){
            ans = arr[i][j] + goTopDown(i,j+1);
            dp[i][j] = ans;
        }
        else{
            ans = arr[i][j] + goTopDown(i+1,j);
            dp[i][j] = ans;
        }
        return ans;
    }

    private static void displayMatrix(int[][] arr){
        System.out.println("Printing....");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


}
