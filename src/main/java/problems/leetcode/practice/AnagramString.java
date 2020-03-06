package problems.leetcode.practice;


public class AnagramString
{
    public static void main(String[] args) {
        AnagramString solution9 = new AnagramString();
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
