package com.linkedList;

public class App {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.print();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        list.remove(list.get(2));
//        System.out.println(list.getIndex(12));
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println();
        System.out.println(list.contains(8));

//        System.out.println(list.isEmpty());

//        list.clear();
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
    }
}

