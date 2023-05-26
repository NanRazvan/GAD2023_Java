package CodeChallages.GenericIterator;

import java.util.Iterator;
import java.util.List;

public class ArrayIterator<T> implements IArrayIterator<T> {

    private List<T> list;
    private Iterator<T> iterator;

    public ArrayIterator(List<T> list) {
        this.list = list;
        this.iterator = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public T next() {
        return iterator.next();
    }
}
