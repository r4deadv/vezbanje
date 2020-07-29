package javaapplication164;

import java.io.IOException;
import java.io.OutputStream;

public class CrtaniOutputStream extends OutputStream{

    @Override
    public void write(int bajt) throws IOException {
        System.out.println("Bravo, upisao si bajt " + bajt);
    }
    
}
