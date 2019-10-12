package problems.leetcode;

public class NumberComplement
{
    public static void main(String[] args) {
        NumberComplement numberComplement = new NumberComplement();
        System.out.println(numberComplement.findComplement(5));
    }
    public int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num);  //Takes log(n) time
        char charArr[] = binaryString.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char ch:charArr){
            if(ch=='0')
                result.append("1");
            else
                result.append("0");
        }
        return Integer.parseInt(result.toString(),2);
    }
}
