package com.student;


public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student(1, "ivan", "ivanov");
        Student petrov = new Student(2, "petr", "petrov");
//        ivanov.printStudent();
        ivanov.setMark("geograthy", 5);
        ivanov.setMark("geograthy", 4);
        ivanov.setMark("math", 4);
        ivanov.setMark("math", 5);
        ivanov.setMark("economics", 5);
//        ivanov.printSubjectsList();
//        ivanov.printMarks("geograthy");
        ivanov.printAll();
        petrov.printAll();

        Group et501 = new Group("ET501");
        et501.addStudent(ivanov);
        et501.addStudent(petrov);
        et501.printGroup();

        et501.getStudentById(1).printAll();
        et501.removeById(1);

        et501.printGroup();
    }
}
