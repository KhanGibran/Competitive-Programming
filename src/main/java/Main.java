import utils.FastInputReader;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        FastInputReader inputReader = new FastInputReader(System.in);
        System.out.println("Enter the String");
        String str1 =inputReader.readString();
        System.out.println(str1);
        System.out.println("Enter the second String");
        String str2 = inputReader.readString();
        System.out.println(str2);
        int k = inputReader.readInt();
        System.out.println(k);
    }
}
