package problems.leetcode;


public class Solution9
{
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isAnagram("anagram","nagaram"));
    }
    public boolean isAnagram(String s, String t) {

        int hashMap[] = new int[255];

        if(s.length() != t.length())
            return false;

        for(char ch:s.toCharArray()){
            hashMap[ch]++;
        }

        for(char ch:t.toCharArray()){
            hashMap[ch]--;
        }

        for(int x:hashMap){
            if(x!=0)
                return false;
        }
        return true;
    }
}
