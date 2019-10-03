import utils.InputReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the String");
        InputReader inputReader = new InputReader(System.in);
        String str =inputReader.readString();
        System.out.println(str);
    }
}
