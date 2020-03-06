package problems.leetcode.practice;

public class HammingDistance
{
    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        System.out.println(hammingDistance.getHammingDistance(1,4));
    }
    private int numberOfSetBits(int x){
        int flag=1;
        int count = 0;
        while(x!=0){
            if((x & 1)!=0){
                count++;
            }
            x=x>>1;
        }
        return count;
    }
    public int getHammingDistance(int x,int y){
        return numberOfSetBits(x^y);
    }
}
