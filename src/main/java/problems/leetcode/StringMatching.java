package problems.leetcode;

import utils.StringUtils;

public class StringMatching
{
    public static void main(String[] args) {
        System.out.println(strStr("aaaabbabababba","abba"));
    }

    private static int strStr(String text, String pattern) {
        if(pattern.length()==0)
            return 0;
        int result = StringUtils.indexOf(text,pattern);
        return result;
    }
}
