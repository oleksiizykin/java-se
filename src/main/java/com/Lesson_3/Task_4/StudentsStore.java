package com.Lesson_3.Task_4;


/**
 * Created by AZykin on 06.02.2017.
 */
public class StudentsStore {
    public static void main(String[] args) {

        String[][] group1 = new String[0][0];
        group1 = addNewStudent(group1, "one", "5", "excellent");
        group1 = addNewStudent(group1, "two", "4", "good");
        group1 = addNewStudent(group1, "three", "3", "good");
        group1 = addNewStudent(group1, "four", "4", "excellent");


        String[][] group2 = new String[0][0];
        group2 = addNewStudent(group2, "one", "4", "good");
        group2 = addNewStudent(group2, "two", "5", "excellent");
        group2 = addNewStudent(group2, "five", "4", "good");
        group2 = addNewStudent(group2, "seven", "4", "good");
        group2 = addNewStudent(group2, "nine", "5", "excellent");

        String[][] group3 = new String[0][0];

        removeStudent(group1, "two");
        group1 = trimArray(group1);
        printList(group1);
        containsInGroup(group1, "two");
        containsInGroup(group1, "four");
//        clearArray(group1);
        printList(group1);
        group3 = mergeGroups(group1, group2);
        printList(group3);
        sortGroup(group1);
        printList(group1);
        containsAll(group1, group2);
        equals(group1, group2);


    }

    public static String[][] addNewStudent(String[][] array, String student, String mark, String attendance) {

        String[][] result = new String[array.length + 1][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[i][j] = array[i][j];
            }
        }
        result[array.length][0] = student;
        result[array.length][1] = mark;
        result[array.length][2] = attendance;

        return result;
    }

    public static void printList(String[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void removeStudent(String[][] array, String student) {
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == student) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = null;
                }
            }
        }
    }

    public static void containsInGroup(String[][] array, String student) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == student) {
                s = student + " is exist in this group";
            }
        }
        if (s == "") {
            System.out.println(student + " is absent in this group");
        } else {
            System.out.println(s + "\n");
        }
    }

    public static void clearArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = null;
            }
        }
    }

    public static String[][] trimArray(String[][] array) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == null) {
                count++;
            }
        }
        String[][] result = new String[array.length - count][3];
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] != null) {
                for (int j = 0; j < array[i].length; j++) {
                    result[i - count1][j] = array[i][j];
                }
            } else {
                if (array[i][0] == null) {
                    count1++;
                }
            }
        }
        return result;
    }

    public static String[][] mergeGroups(String[][] group1, String[][] group2) {

        int newGroupLength = group1.length + group2.length;
        int count = 0;

        String[][] newGroup = new String[newGroupLength][3];

        for (int i = 0; i < group1.length; i++) {
            for (int j = 0; j < group1[i].length; j++) {
                newGroup[i][j] = group1[i][j];
            }
            count++;
        }
        int k = 0;
        for (int i = count; i < newGroup.length; i++) {
            for (int j = 0; j < group2[k].length; j++) {
                newGroup[i][j] = group2[k][j];
            }
            k++;
        }
        return newGroup;
    }

    public static void sortGroup(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i][0].compareTo(array[j][0]) > 0) {
                    String student = array[j][0];
                    String mark = array[j][1];
                    String attendance = array[j][2];
                    array[j][0] = array[i][0];
                    array[j][1] = array[i][1];
                    array[j][2] = array[i][2];
                    array[i][0] = student;
                    array[i][1] = mark;
                    array[i][2] = attendance;
                }
            }
        }
    }

    public static void containsAll(String[][] group1, String[][] group2) {
        if(group1.length == group2.length) {
            int length = 0;
            for (int i = 0; i < group1.length; i++) {
                for (int j = 0; j < group2.length; j++) {
                    if (group1[i][0] == group2[j][0]) {
                        length++;
                    }
                }
            }
            if (length == 0) {
                System.out.println("Nobody from group1 are exists in group2: ");
            } else {
                String[] list = new String[length];
                for (int i = 0; i < group1.length; i++) {
                    for (int j = 0; j < group2.length; j++) {
                        if (group1[i][0] == group2[j][0]) {
                            list[i] = group2[j][0];
                        }
                    }
                }
                System.out.println("Next students from group1 are exists in group2: ");
                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i] + "\n");
                }
            }
        } else {
            System.out.println("Nobody from group1 are exists in group2: ");
        }
    }

    public static void equals(String[][] group1, String group2[][]) {
        int count = 0;
        if (group1.length == group2.length) {
            for (int i = 0; i < group1.length; i++) {
                for (int j = 0; j < group1.length; j++) {
                    if (group1[i][0] == group2[j][0]) {
                        count++;
                    }
                }
            }
        } else {
            System.out.println("Groups are not equals");
        }
        if (count == group1.length) {
            System.out.println("Groups are equals");
        }

    }
}