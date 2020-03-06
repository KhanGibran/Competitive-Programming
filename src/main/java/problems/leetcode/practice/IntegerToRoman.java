package problems.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman
{
    private final  static Map<Integer,String> dictionary = new HashMap<Integer,String>();
    static {
        dictionary.put(1,"I");
        dictionary.put(4,"IV");
        dictionary.put(5,"V");
        dictionary.put(9,"IX");
        dictionary.put(10,"X");
        dictionary.put(40,"XL");
        dictionary.put(50,"L");
        dictionary.put(90,"XC");
        dictionary.put(100,"C");
        dictionary.put(400,"CD");
        dictionary.put(500,"D");
        dictionary.put(900,"CM");
        dictionary.put(1000,"M");
    }

    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();;
        System.out.println(integerToRoman.convert(1994));

    }
    private StringBuilder formResult(String roman,int quotient,StringBuilder result){
        while(quotient--!=0){
            result.append(roman);
        }
        return result;
    }
    private String convert(int number) {
        StringBuilder result = new StringBuilder();

        while(number!=0){

            int quotient = 0;
            int remainder = 0;

            if(number >= 1000)
            {
                quotient = number/1000;
                remainder = number%1000;
                formResult(dictionary.get(1000),quotient,result);
                number = remainder;
            }
            else if(number >= 900)
            {
                result.append(dictionary.get(900));
                remainder = number%900;
                number = remainder;
            }
            else if(number >= 500)
            {
                quotient = number/500;
                remainder = number%500;
                formResult(dictionary.get(500),quotient,result);
                number = remainder;
            }
            else if(number >= 400)
            {
                result.append(dictionary.get(400));
                remainder = number%400;
                number = remainder;
            }
            else if(number >= 100)
            {
                quotient = number/100;
                remainder = number%100;
                formResult(dictionary.get(100),quotient,result);
                number = remainder;
            }
            else if(number >= 90)
            {
                result.append(dictionary.get(90));
                remainder = number%90;
                number = remainder;
            }
            else if(number >= 50)
            {
                quotient = number/50;
                remainder = number%50;
                formResult(dictionary.get(50),quotient,result);
                number = remainder;
            }
            else if(number >= 40)
            {
                result.append(dictionary.get(40));
                remainder = number%40;
                number = remainder;
            }
            else if(number >= 10)
            {
                quotient = number/10;
                remainder = number%10;
                formResult(dictionary.get(10),quotient,result);
                number = remainder;
            }
            else if(number >= 9)
            {
                result.append(dictionary.get(9));
                remainder = number%9;
                number = remainder;
            }
            else if(number >= 5)
            {
                quotient = number/5;
                remainder = number%5;
                formResult(dictionary.get(5),quotient,result);
                number = remainder;
            }
            else if(number >= 4)
            {
                result.append(dictionary.get(4));
                remainder = number%4;
                number = remainder;
            }
            else if(number >= 1){
                quotient = number/1;
                remainder = number%1;
                formResult(dictionary.get(1),quotient,result);
                number = remainder;
            }
        }
        return result.toString();
    }
}
