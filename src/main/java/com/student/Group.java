package com.student;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Group {
    private String groupDescription;
    private ArrayList<Student> students;

    public Group(){
    }

    public Group(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    @XmlElement
    public String getGroupDescription() {
        return groupDescription;
    }

    @XmlElement
    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                index = students.get(i).getId() - 1;
            }
        }
        return students.get(index);
    }

    public void addStudent(Student student) {
        if (students == null) {
            students = new ArrayList<Student>();
        }
        students.add(student);
    }

    public void printGroup() {
        System.out.println("Group " + groupDescription + ": ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getSurname());
        }
        System.out.println();
    }

    public void removeById(int id) {
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                index = students.get(i).getId() - 1;
            }
        }
        students.remove(index);
    }
}
