package problems.leetcode;

import utils.StringUtils;

public class StringPermutation
{
    public static void main(String[] args) {
        StringPermutation stringPermutation = new StringPermutation();
        String soFar="";
        String str = "abc";

        boolean visited[] = new boolean[str.length()];
        stringPermutation.printPermutation(str,soFar,visited);
    }

    private void printPermutation(String str,String soFar,boolean visited[])
    {
        if(soFar.length()==3)
        {
            System.out.println(soFar);
            return;
        }
        for(int i=0;i<3;i++)
        {
            if(visited[i]!=true)
            {
                soFar=soFar+str.charAt(i);
                visited[i]=true;
                printPermutation(str,soFar,visited);
                soFar=soFar.substring(0,soFar.length()-1);
                visited[i]=false;
            }
        }
    }
}
