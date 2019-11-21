package com.collection;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class MyCollectionTest {
    MyCollection list;

    @Before
    public void setup() {
        list = new MyCollection();
    }

    @Test
    public void size() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
    }

    @Test
    public void isEmpty() {
        assertEquals(true, list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void contains() {
        list.add(1);
        assertEquals(true, list.contains(1));
    }

    @Test
    public void containsAll() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("a");

        MyCollection list2 = new MyCollection<>();
        list2.add(2);
        list2.add(3);
        assertEquals(true, list.containsAll(list2));

        MyCollection list3 = new MyCollection<>();
        list3.add("g");
        list3.add("j");
        assertEquals(false, list.containsAll(list3));

    }

    @Test
    public void add() {
        assertEquals(true, list.add("test"));
        assertEquals(true, list.add(1));
    }

    @Test
    public void addAll() {
        MyCollection list2 = new MyCollection();
        list.add("a");
        list.add(2);
        list.add('t');
        assertEquals(true, list.addAll(list2));
    }

    @Test
    public void remove() {
        list.add(1);
        assertEquals(1, list.size());
        list.remove(1);
        assertEquals(0, list.size());

    }

    @Test
    public void removeAll() {
        list.add(3);
        list.add(4);
        list.add(8);

        MyCollection list2 = new MyCollection();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        assertEquals(3, list.size());

        list.removeAll(list2);

        assertEquals(1, list.size());
        assertEquals(8, list.getElement(0));


    }

    @Test
    public void getElement() {
        list.add(2);
        list.add("k");
        list.add("a");
        list.add(100);

        assertEquals(2, list.getElement(0));
        assertEquals("k", list.getElement(1));
        assertEquals("a", list.getElement(2));
        assertEquals(100, list.getElement(3));
    }

    @Test
    public void clear() {
        assertEquals(0, list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void retainAll() {
        list.add(1);
        list.add("a");
        list.add(4);
        list.add('w');

        MyCollection list2 = new MyCollection();
        list2.add("a");
        list2.add("d");
        list2.add(4);

        list.retainAll(list2);

        assertEquals("a", list.getElement(0));
        assertEquals(4, list.getElement(1));

    }

}