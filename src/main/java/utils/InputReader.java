package utils;

import java.io.IOException;
import java.io.InputStream;

public class InputReader {

    private InputStream stream;
    private byte buffer[] = new byte[1024];

    private int currentCharacter;
    private int totalCharacters;

    public InputReader(InputStream stream) {
        this.stream = stream;
    }

    void readInputConsole(int currentCharacter,int totalCharacters){

        this.currentCharacter=currentCharacter;
        this.totalCharacters=totalCharacters;

        try{
            this.totalCharacters = stream.read(buffer);
        }
        catch(Exception e){
            throw new RuntimeException();
        }
     }

    private boolean isIgnoreChar(int c){
        return c == '\n' || c == '\r' || c == '\t' || c == -1;
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

        if(isIgnoreChar(c)){
            return stringBuilder.toString();
        }

        while(Character.isSpaceChar(c) || isIgnoreChar(c)){
            c=read();
        }

        do{
            stringBuilder.appendCodePoint(c);
            c=read();
        }while(!isIgnoreChar(c));

        return stringBuilder.toString();
    }
}
