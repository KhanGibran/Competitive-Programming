package utils;

import java.io.InputStream;
import java.util.function.Predicate;

public class InputReader {

    private InputStream stream;
    private byte buffer[] = new byte[1024];

    private int currentCharacter;
    private int totalCharacters;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    Predicate<Integer> isIgnoreChar = x-> x=='\n' || x=='\r' || x=='\t' || x==-1;

    private void readInputConsole(int currentCharacter,int totalCharacters){

        this.currentCharacter=currentCharacter;
        this.totalCharacters=totalCharacters;

        try{
            this.totalCharacters = stream.read(buffer);
        }
        catch(Exception e){
            throw new RuntimeException();
        }
     }

    private byte read(){
        if(currentCharacter<totalCharacters)
            return buffer[currentCharacter++];

        return -1;
    }

    public String readString() {

        readInputConsole(0,0);

        final StringBuilder stringBuilder = new StringBuilder();

        int c = read();

        if(isIgnoreChar.test(c)){
            return stringBuilder.toString();
        }

        while(Character.isSpaceChar(c) || isIgnoreChar.test(c)){
            c=read();
        }

        do{
            stringBuilder.appendCodePoint(c);
            c=read();
        }while(!isIgnoreChar.test(c));

        return stringBuilder.toString();
    }
}
