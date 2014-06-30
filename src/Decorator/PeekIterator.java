package Decorator;

import java.util.Iterator;

/**
 * Created by Jonathan on 6/14/2014.
 */
public class PeekIterator implements Iterator {
    int index;
    Iterator iterator;
    Object next = iterator.next();

    public PeekIterator(Iterator iterator){
        this.iterator = iterator;
        Object next = iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    public Object Peek(){
        return next;
    }

    @Override
    public Object next() {
        Object current = next;

        if (hasNext()){
            next = iterator.next();
        }

        return current;
    }

    @Override
    public void remove() {
        iterator.remove();
    }
}
