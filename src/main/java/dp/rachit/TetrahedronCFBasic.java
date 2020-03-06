package dp.rachit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Top Down Approach
 */
public class TetrahedronCFBasic
{
    private static final int N = 10000002;
    private static final long MOD = 1000000007;

    static long dp[][][] = new long[5][4][4];
    static boolean visited[][][] = new boolean[5][4][4];


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int step = Integer.parseInt(bufferedReader.readLine());
        int steps = 4;
        int source = 3;
        int destination = 3;
        System.out.println(solveTetrahedron(steps,source,destination));
    }

    /**
     * Top Down Approach
     * @param steps
     * @param source
     * @param destination
     * @return
     */
    private static long solveTetrahedron(int steps, int source, int destination) {

        if(steps==0 ){
            if(source==destination)
                return 1;
            else
                return 0;
        }

        if(visited[steps][source][destination])
            return dp[steps][source][destination];

        visited[steps][source][destination] = true;
        long ans = 0;

        for(int i=0;i<=3;i++){
            if(i==source)
                continue;
            ans+= solveTetrahedron(steps-1,i,destination);
            if(ans>=MOD)
                ans=ans-MOD;
            dp[steps][source][destination] = ans;
        }
        return ans;
    }


}
