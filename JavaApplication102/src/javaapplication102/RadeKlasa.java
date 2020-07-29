package javaapplication102;

import java.util.Iterator;

public class RadeKlasa implements Iterable<Object> {
    Object x = "Hello";
    Object y = "World";
    
    int trenutni = 0;

    @Override
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            @Override
            public boolean hasNext() {
                return trenutni<2;
            }

            @Override
            public Object next() {
                return trenutni++==0?x:y;
            }
        };
    }
}
