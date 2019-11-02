package problems.leetcode;

public class BinaryNumberWithAlternatingBits
{
    public static void main(String[] args)
    {
        BinaryNumberWithAlternatingBits binaryNumberWithAlternatingBits = new BinaryNumberWithAlternatingBits();
        System.out.println(binaryNumberWithAlternatingBits.hasAlternatingBits(10));
    }

    private boolean isOdd(int n){
        return n%2==0?false:true;
    }

    private boolean checkFlag(boolean currentEvenFlag,boolean previousEvenFlag)
    {
        if(currentEvenFlag!=previousEvenFlag)
            return true;
        else
            return false;
    }

    public boolean hasAlternatingBits(int n)
    {
        int done=0;
        boolean previousEvenFlag=false;
        boolean currentEvenFlag=false;

        while(n!=0)
        {
            if(isOdd(n))
            {
                currentEvenFlag=false;
            }
            else if(!isOdd(n))
            {
                currentEvenFlag=true;
            }
            if(done==1)
            if(!checkFlag(currentEvenFlag,previousEvenFlag))
            {
                return false;
            }
            previousEvenFlag=currentEvenFlag;
            n=n>>1;
            done=1;
        }
        return true;
    }
}
