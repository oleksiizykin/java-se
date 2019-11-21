package com.collection;

import java.util.Arrays;

public class MyCollection<E> {
    private E[] array;
    private int size;

    public MyCollection() {
        this.array = (E[]) new Object[0];
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public boolean contains(E object) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                count++;
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean containsAll(MyCollection collection) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < collection.size(); j++) {
                if (collection.getElement(j).equals(array[i])) {
                    count++;
                }
            }
        }
        if (count >= collection.size()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean add(E object) {
        E[] extendedArray = (E[]) new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            extendedArray[i] = array[i];
        }
        extendedArray[extendedArray.length - 1] = object;
        array = extendedArray;
        return true;
    }

    public boolean addAll(MyCollection collection) {
        int mergedLength = array.length + collection.size();
        E[] mergedArrayList = (E[]) new Object[mergedLength];
        for (int i = 0; i < array.length; i++) {
            mergedArrayList[i] = array[i];
        }
        for (int i = 0; i < collection.size(); i++) {
            mergedArrayList[array.length + i] = (E) collection.getElement(i);
        }
        array = mergedArrayList;
        return true;
    }

    public void remove(E object) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (object.equals(array[i])) {
                count++;
            }
        }
        E[] newArray = (E[]) new Object[array.length - count];
        for (int i = 0; i < array.length; i++) {
            int index = 0;
            if (!object.equals(array[i])) {
                newArray[i - index] = array[i];
                index++;
            }
        }
        array = newArray;
    }

    public void removeAll(MyCollection collection) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < collection.size(); j++) {
                if (collection.getElement(j).equals(array[i])) {
                    array[i] = null;
                    count++;
                }
            }
        }
        E[] newArray = (E[]) new Object[array.length - count];
        if (count > 0) {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    index++;
                } else {
                    newArray[i - index] = array[i];
                }
            }
        }
        array = newArray;
    }

    public E getElement(int index) {
        return array[index];
    }

    public void clear() {
        array = (E[]) new Object[0];
    }

    public void retainAll(MyCollection collection) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < collection.size(); j++) {
                if (collection.getElement(j).equals(array[i])) {
                    count++;
                }
            }
        }
        E[] newArray = (E[]) new Object[count];
        if (count > 0) {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                index++;
                for (int j = 0; j < collection.size(); j++) {
                    if (collection.getElement(j).equals(array[i])) {
                        newArray[i - index + 1] = array[i];
                        index--;
                    }
                }
            }
        }
        array = newArray;
    }
}