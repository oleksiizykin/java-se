package com.linkedList;

import java.util.Iterator;

public class MyIterator implements Iterator {
    private Node element;

    public MyIterator(Node element) {
        this.element = element;
    }

    @Override
    public boolean hasNext() {
        return element.next != null;
    }

    public boolean hasPrevious(){
        return element.previous != null;
    }

    @Override
    public Object next() {
        Object object = element;
        element = element.next;
        return object;
    }
}
