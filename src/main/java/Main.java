import utils.InputReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the String");
        InputReader inputReader = new InputReader(System.in);
        String str1 =inputReader.readString();
        System.out.println(str1);
        String str2 = inputReader.readString();
        System.out.println(str2);
    }
}
