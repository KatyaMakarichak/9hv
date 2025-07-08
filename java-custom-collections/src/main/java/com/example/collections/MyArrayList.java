package com.example.collections;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(T value) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = value;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(data, index + 1, data, index, size - index - 1);
            size--;
        }
    }
}
