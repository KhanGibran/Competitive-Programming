package problems.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation
{
    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        List<String> result = letterCasePermutation.letterCasePermutation("12345");
        System.out.println(result);
    }

    private void letterCasePermutationUtil(String str,int start,String soFar,List<String> result){

       if(soFar.length()==str.length()){
           result.add(soFar);
           return;
       }
       char ch = str.charAt(start);
       soFar = soFar+ch;
       letterCasePermutationUtil(str,start+1,soFar,result);

       if(ch>=65 && ch<=90){
           soFar=soFar.substring(0,soFar.length()-1);
           soFar = soFar+ Character.toLowerCase(ch);
           letterCasePermutationUtil(str,start+1,soFar,result);
       }

       if(ch>=97 && ch<=122){
           soFar=soFar.substring(0,soFar.length()-1);
           soFar = soFar+ Character.toUpperCase(ch);
           letterCasePermutationUtil(str,start+1,soFar,result);
       }
    }

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        String soFar = "";
        letterCasePermutationUtil(S,0,soFar,result);
        return result;
    }
}
