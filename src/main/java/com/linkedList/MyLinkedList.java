package com.linkedList;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList implements List {
    private Node head;
    private Node tail;
    int size = 0;

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (tail == null && head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        int i = getIndex(o);
        return i > -1;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(head);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (tail == null && head == null) {
            Node element = new Node(head, o, tail);
            head = element;
            tail = element;
            size++;
        } else {
            Node element = new Node(tail, o, null);
            tail.next = element;
            element.previous = tail;
            tail = element;
            size++;
        }
        return true;
    }

    public void print() {
        Node element = head;
        while (element != null) {
            System.out.print(element.data + " ");
            element = element.next;
        }
        System.out.println();
    }

    @Override
    public boolean remove(Object o) {
        int i = getIndex(o);
        Node element = (Node) get(i);
        element.previous = element.next;
        element.next = element.next.next;
        size--;
        return true;
    }

    public int getIndex(Object o) {
        Node element = head;
        int index = 0;
        while (element != null) {
            if (element == null) {
                return -1;
            } else {
                if (element.data.equals(o)) {
                    return index;
                }
                index++;
                element = element.next;
            }
        }
        return -1;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public Object get(int index) {
        String str = "Out of length";
        Node element = head;
        try {
            outOfSize(index);
            int count = 0;
            while (count < index) {
                element = element.next;
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        if (index >= size) {
            return str;
        } else {
            return element;
        }
    }

    private void outOfSize(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
