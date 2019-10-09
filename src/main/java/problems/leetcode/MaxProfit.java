package problems.leetcode;

public class MaxProfit
{

    public static int maxProfit(int[] prices) {
        int length = prices.length;
        int maxProfit = 0;

        if(length==0)
            return maxProfit;

        int minSeenSoFar = prices[0];


        for(int i=1;i<length;i++)
        {
            if(prices[i]<minSeenSoFar){
                minSeenSoFar=prices[i];
            }
            maxProfit = Integer.max(maxProfit,prices[i]-minSeenSoFar);
        }
        return maxProfit;
    }
}
