package problems.leetcode;

import java.util.Arrays;

class Solution3 {
    public static void main(String[] args) {
        System.out.println(countPrimes(2));
    }
    public static int countPrimes(int n) { //n=10
        int numberOfPrimes=0;

        boolean primeArray[] = new boolean[n+1];
        Arrays.fill(primeArray,true);

        for(int prime=2;prime<=n;prime++){

            if(primeArray[prime]==true){
                for(int primeMultiple = prime*2;primeMultiple<=n; primeMultiple+=prime){
                    if(primeArray[primeMultiple]!=false)
                        primeArray[primeMultiple]=false;
                }
            }
        }
        for(int i=2;i<primeArray.length;i++) {
            if(primeArray[i]==true && i!=n)
                numberOfPrimes++;
        }
        return numberOfPrimes;
    }
}