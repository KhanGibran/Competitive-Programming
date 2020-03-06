package dp.rachit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinChangeProblem
{
    private static final int N = 1000;
    private static int arr[] = new int[N];
    private static int dp[][] = new int[N][N];
    private static boolean visited[][] = new boolean[N][N];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
//        System.out.println(recursiveWays(0,sum,n));
        System.out.println(topDownApproach(0,sum,n));
    }

    private static int topDownApproach(int pos,int sum,int n){
        if(pos==n){
            if(sum==0)
                return 1;
            else
                return 0;
        }

        if(visited[pos][sum])
            return dp[pos][sum];

        int answer = 0;
        int times = 0;

        while(times*arr[pos] <= sum){
            answer+= topDownApproach(pos+1,sum-times*arr[pos],n);
            dp[pos][sum] = answer;
            times++;
        }
        return answer;
    }

    private static int recursiveWays(int pos, int sum,int n) {
       if(pos==n) {
            if(sum==0)
                return 1;
            else
                return 0;
       }

       int answer = 0;
       int times = 0;

        while(times*arr[pos] <= sum){
            answer+= recursiveWays(pos+1,sum-times*arr[pos],n);
            times++;
        }
        return answer;
    }
}
