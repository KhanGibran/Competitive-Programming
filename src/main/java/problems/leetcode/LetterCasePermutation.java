package problems.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCasePermutation
{
    public static void main(String[] args) {
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        List<String> result = letterCasePermutation.letterCasePermutation("a1b2");
    }

    private void letterCasePermutationUtil(char str[],int start,String soFar,List<String> result){
//       if(soFar.length()==str.length){
//           result.add(soFar);
//           return;
//       }
//       soFar = soFar+str[start];
//       letterCasePermutationUtil(str,start+1,soFar,result);

//


    }

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        String soFar = "";
        letterCasePermutationUtil(S.toCharArray(),0,soFar,result);
        return result;
    }
}
