import newInterface.Of;

import java.util.Iterator;

public class ArrayProject implements Iterable<Object> {
    private final Object[] array;
    private int cursor;

    public ArrayProject(Object[] arrayCopy) {
        this.array = arrayCopy;
        cursor = 0;
    }

    @Override
    public Iterator<Object> iterator() {
        return new IterableArray();
    }


    private class IterableArray implements Of {
        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Object next() {
            Object i = null;
            if(hasNext()) {
                i = (Object) array[cursor];
                cursor++;
            }
            return i;
        }
    }
}
