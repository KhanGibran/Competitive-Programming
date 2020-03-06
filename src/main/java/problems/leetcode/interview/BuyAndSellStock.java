package problems.leetcode.interview;

public class BuyAndSellStock{

    public static int maxProfit(int[] prices) {
//        int max = 0;
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<prices.length;i++){
//            if(prices[i]<min){
//                min = prices[i];
//            }
//            else{
//                max = Math.max(max,prices[i]-min);
//            }
//        }
//        return max;
        //Kadane's algorithm
        if(prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int max = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
