package problems.hackerrank;

public class Solution4
{
    public static void main(String[] args) {
        long n = 882787;
        String str = "aab";
        System.out.println(repeatedString(str,n));
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n)
    {
        char[] chrIn = s.toCharArray();
        int i = 0; long max = 0;
        long quo = n / chrIn.length; long rem = n % chrIn.length;
        while (i < chrIn.length)
        {
            if (chrIn[i] == 'a')
            {
                max++;
            }
            i++;
        }
        i = 0; max = max * quo;
        while (i < rem)
        {
            if (chrIn[i] == 'a')
            {
                max++;
            }
            i++;
        }
        return max;
    }
}
