package utils;

public class StringUtils
{
    /**
     * String Matching
     * Naive Approach
     */

    public static int indexOf(String text,String pattern){

        int textLength = text.length();
        int patternLength = pattern.length();

        for(int textIndex=0;textIndex <= textLength-patternLength;textIndex++){

            for(int patternIndex=0;patternIndex<patternLength;patternIndex++){

                if( text.charAt(textIndex+patternIndex) != pattern.charAt(patternIndex) )
                    break;

                if(patternIndex==patternLength-1)
                    return textIndex;
            }
        }
        return -1;
    }
}
