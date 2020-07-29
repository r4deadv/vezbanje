package simplestreamwriter;

import java.io.IOException;
import java.io.OutputStream;

public class SimpleStreamWriter {
    public static void main(String[] args) throws IOException {
        MyStream ms = new MyStream();
        ms.write(1970496882);
    }
    
}
