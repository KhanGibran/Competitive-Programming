package problems.leetcode;

import java.util.List;
import java.util.Stack;

public class ReverseNumber
{
    public static int reverse(int x) {
        boolean negativeSignflag=false;
        if(x<0){
            negativeSignflag = true;
            x=-x;
        }

        int reverseNumber=0;
        int previousReverseNumber=0;
        int currentDigit=0;

        while(x!=0){
            currentDigit=x%10;
            reverseNumber=reverseNumber*10+currentDigit;

            if((reverseNumber-currentDigit)/10 != previousReverseNumber)
                return 0;

            previousReverseNumber=reverseNumber;
            x=x/10;
        }
        return negativeSignflag==true?-reverseNumber:reverseNumber;
    }

    public static void main (String[] args)
    {
        int num = 123;
        System.out.println("Reverse of no. is " + reverse(num));

        num = 1000000045;
        System.out.println("Reverse of no. is " + reverse(num));
    }}
