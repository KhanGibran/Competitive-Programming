package problems.hackerrank;

public class Solution2
{
    public static void main(String[] args) {
        int n=9;
        String str = null;
        System.out.println(countValleys("UDDDUDUU",8));
    }

    private static int countValleys(String str, int n) {
        int numberOfValleys = 0;
        int currentLevel = 0;
        for (char x:str.toCharArray()) {
            if(x == 'U')
                currentLevel++;
            if(x == 'D')
                currentLevel--;

            if(currentLevel==0 && x=='U')
                numberOfValleys++;
        }
        return numberOfValleys;
    }
}
