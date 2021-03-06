package problems.leetcode.practice;

public class ExcelSheetColumn
{
    public static void main(String[] args) {
        System.out.println((titleToNumber("ZY")));
    }

    public static int titleToNumber(String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            result *= 26;
            result += s.charAt(i) - 'A' + 1;
        }
        return result;
    }
}
