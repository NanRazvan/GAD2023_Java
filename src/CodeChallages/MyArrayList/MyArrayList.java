package CodeChallages.MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> implements IMyArrayList<T> {

    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(T e) {
        ensureCapacity(size + 1);
        array[size++] = e;
    }

    @Override
    public void remove(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                removeAt(i);
                return;
            }
        }
    }


    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    @Override
    public void set(int index, T e) {
        checkIndex(index);
        array[index] = e;
    }

    @Override
    public int size() {
        return size;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > array.length) {
            int newCapacity = Math.max(array.length * 2, capacity);
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void removeAt(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }


}