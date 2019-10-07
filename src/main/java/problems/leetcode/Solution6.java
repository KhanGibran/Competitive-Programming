package problems.leetcode;

public class Solution6
{
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
    public static boolean isPalindrome(String string) {
        if(string.isEmpty())
            return true;
        StringBuilder stringBuilder = new StringBuilder();

        for(char ch:string.toCharArray())
        {
            if((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
                stringBuilder.append(ch);
            }
        }

        String originalString  = stringBuilder.toString();
        String reverseString = stringBuilder.reverse().toString();

        if(originalString.equalsIgnoreCase(reverseString))
            return true;
        else
            return false;
    }
}
