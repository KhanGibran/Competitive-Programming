package problems.leetcode.practice;

public class FindTheDifference
{
    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        System.out.println(findTheDifference.findTheDifference("abcd","abcde"));
    }
    public char findTheDifference(String s, String t) {
        int result=0;

        for(int i=0;i<s.length();i++)
            result^=s.charAt(i);

        for(int j=0;j<t.length();j++)
            result^=t.charAt(j);

        return (char)result;
    }
}
