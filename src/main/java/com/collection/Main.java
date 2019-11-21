package com.collection;

public class Main {
    public static void main(String[] args) {

        MyCollection collection = new MyCollection();
        MyCollection collection1 = new MyCollection();
        Object one = new Object();
        Object two = new Object();
        Object three = new Object();
        Object four = new Object();
        collection.add(one);
        collection.add(one);
        collection.add(two);
        collection1.add(two);
        collection1.add(three);
        collection.add(four);
        collection1.add(four);
//        collection1.add(one);
//        System.out.println(collection.size());
//        System.out.println(collection.isEmpty());
//        System.out.println(collection.contains(one));
//        collection.remove(two);
//        collection.remove(one);
//        System.out.println(collection.size());
//        System.out.println(collection.contains(one));
//        collection.addAll(collection1);
//        collection.clear();
//        collection.removeAll(collection1);
//        System.out.println(collection.containsAll(collection1));
        collection.retainAll(collection1);

        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.getElement(i));
        }
        System.out.println();
//        for (int i = 0; i < collection1.size(); i++) {
//            System.out.println(collection.getElement(i));
//        }
        System.out.println();
        System.out.println(collection.getElement(0).equals(collection1.getElement(0)));
        System.out.println(collection.getElement(1).equals(collection1.getElement(2)));
    }
}
