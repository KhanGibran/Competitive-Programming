package dp.rachit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Top Down Approach
 */
public class TetrahedronCFMemory
{
    private static final int N = 10000002;
    private static final long MOD = 1000000007;

    static long dp[][] = new long[5][4];
    static boolean visited[][] = new boolean[5][4];

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int step = Integer.parseInt(bufferedReader.readLine());
        int steps = 4;
        int source = 3;
        int destination = 3;
        System.out.println(solveTetrahedronTopDown(steps,source,destination));
        System.out.println(solveTetrahedronBottomUp(steps,source,destination));
    }

    /**
     * Top Down Approach
     * @param steps
     * @param source
     * @param destination
     * @return
     */
    private static long solveTetrahedronTopDown(int steps, int source, int destination) {
        if(steps==0 ){
            if(source==destination)
                return 1;
            else
                return 0;
        }

        if(visited[steps][source])
            return dp[steps][source];

        visited[steps][source] = true;
        long ans = 0;

        for(int i=0;i<=3;i++){
            if(i==source)
                continue;
            ans+= solveTetrahedronTopDown(steps-1,i,destination);
            if(ans>=MOD)
                ans=ans-MOD;
            dp[steps][source] = ans;
        }
        return ans;
    }

    private static long solveTetrahedronBottomUp(int steps,int source, int destination){

        for(int sourceIterator = 0; sourceIterator<=source; sourceIterator++){
            if(sourceIterator!=destination)
                dp[0][sourceIterator] = 0;
            else
                dp[0][sourceIterator] = 1;
        }

        for(int stepIterator = 1; stepIterator<=steps; stepIterator++){
            for(int sourceIterator = 0; sourceIterator<=source; sourceIterator++){
                if(stepIterator!=sourceIterator)
                    dp[stepIterator][sourceIterator] += dp[stepIterator-1][sourceIterator];
            }
        }
        return dp[4][3];
    }
}
