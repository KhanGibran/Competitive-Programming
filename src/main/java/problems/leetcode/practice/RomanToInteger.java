package problems.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger
{
    private final  static Map<Character,Integer> dictionary = new HashMap<Character, Integer>();
    static{
        dictionary.put('I',1);
        dictionary.put('V',5);
        dictionary.put('X',10);
        dictionary.put('L',50);
        dictionary.put('C',100);
        dictionary.put('D',500);
        dictionary.put('M',1000);
    }
    public int convert(String roman){
        int result = 0;

        char[] romanArray = roman.toCharArray();
        int length = romanArray.length;

        for(int i=0;i<length;){

            if(i<length-1 && dictionary.get(romanArray[i]) < dictionary.get(romanArray[i+1])){
                result = result+(dictionary.get(romanArray[i+1])- dictionary.get(romanArray[i]));
                i=i+2;
            }
            else{
                result = result+dictionary.get(romanArray[i]);
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.convert("MCMXCIV"));
        System.out.println(romanToInteger.convert("LVIII"));
        System.out.println(romanToInteger.convert("IX"));
        System.out.println(romanToInteger.convert("IV"));
        System.out.println(romanToInteger.convert("III"));
    }
}
