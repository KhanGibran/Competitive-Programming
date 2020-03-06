package problems.leetcode.practice;

public class AddTwoNumbers
{
    // & operator shows me the position that needs carry
    // ^ operator adds two binary numbers (Helps us in simulating addition)
    public int getSum(int a, int b) {

        while(b!=0){ //check till carry is not equal to zero
            int carry = a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }

}
