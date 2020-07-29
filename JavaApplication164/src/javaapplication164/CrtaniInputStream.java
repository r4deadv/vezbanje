package javaapplication164;

import java.io.*;
import java.util.Random;

public class CrtaniInputStream extends InputStream{
    private int[] brojevi = {5,7,9,12};
    int marker = 0;
    @Override
    public int read() throws IOException {
        if(marker>=brojevi.length)
            return -1;
        return brojevi[marker++];
    }
    
}
