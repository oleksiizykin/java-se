package com.student;

import java.util.Random;

public class IntContainer {

    protected int[] array;

    Random rand = new Random();

    public IntContainer() {
        array = new int[0];
    }

    public int getSize() {
        return array.length;
    }


    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void add(int a) {
        int[] extendedArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            extendedArray[i] = array[i];
        }
        extendedArray[extendedArray.length - 1] = a;
        this.array = extendedArray;
    }

    public void addArray(int[] list) {
        int mergeLength = array.length + list.length;
        int[] mergedArrayList = new int[mergeLength];
        for (int i = 0; i < array.length; i++) {
            mergedArrayList[i] = array[i];
        }
        for (int i = 0; i < list.length; i++) {
            mergedArrayList[array.length + i] = list[i];
        }
        this.array = mergedArrayList;
    }

    public int getUnit(int unit) {
        try {
            return array[unit];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Unit convertPosition is more, than the length of array ");
            return 0;
        }
    }

    public void contains(int unit) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == unit) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Contained in array: " + count + " time(s)");
        } else {
            System.out.println("Isn't contained in array");
        }
    }

    public void indexOf(int index) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                count++;
            }
        }
        if (count > 0) {
            int[] indexList = new int[count];
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == index) {
                    for (int j = k; j < indexList.length; j++) {
                        indexList[j] = i;
                        k++;
                        break;
                    }
                }
            }
            System.out.print("Index: ");
            for (int l = 0; l < indexList.length; l++) {
                System.out.print(indexList[l] + " ");
            }
            System.out.println();
        } else {
            System.out.println("This number isn't in the array");
        }
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public void equalsArray(int[] list) {
        if (array.length != list.length) {
            System.out.println("Array 1 don't equal Array 2");
        } else {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == list[i]) {
                    count++;
                }
            }
            if (count == list.length) {
                System.out.println("Arrays are equal");
            } else {
                System.out.println("Arrays aren't equal");
            }
        }

    }

    public void trim(int index) {
        int[] trimList = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                trimList[i - count] = array[i];
            } else {
                if (i == index) {
                    count++;
                }
            }
        }
        array = trimList;
    }

    public void qSort() {
        sortArray(0, array.length - 1);
    }

    private void sortArray(int l, int r) {
        int i = l;
        int j = r;
        int x = array[l + rand.nextInt(r - l + 1)];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l < j) {
            sortArray(l, j);
        }
        if (i < r) {
            sortArray(i, r);
        }
    }

    public static void main(String[] args) {
        IntContainer one = new IntContainer();
        one.add(1);
        one.add(31);
        one.add(2);
        one.add(5);
        one.add(4);
        int[] array = {-505, 506, 505, 508, 509};
        one.addArray(array);
        one.print();
        System.out.println(one.getSize());
        System.out.println(one.getUnit(5));
        System.out.println(one.getUnit(11));
//        one.contains(505);
//        one.contains(13);
//        one.indexOf(505);
//        one.indexOf(13);
//        one.clear();
        one.print();
        int[] array1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 5};
        one.equalsArray(array1);
        one.trim(3);
        one.print();
        one.qSort();
        one.print();
    }


}