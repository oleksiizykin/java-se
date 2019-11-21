package com.student;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement
@XmlType(propOrder = {"id", "name", "surname", "subjectName"})
public class Student implements Serializable {
    private int id;
    private String name;
    private String surname;
    private Disciplines subjectName;

    public Student() {
    }

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @XmlElement
    public int getId() {
        return id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    @XmlElement
    public String getSurname() {
        return surname;
    }

    @XmlElement(name = "disciplines")
    public Disciplines getSubjectName() {
        return subjectName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void printStudent() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
    }

    public void setMark(String subject, int mark) {
        if (subjectName == null) {
            subjectName = new Disciplines();
        }
        subjectName.addDiscipline(subject);
        subjectName.getSubject(subject).add(mark);
    }

    public void printMarks(String subject) {
        try {
            subjectName.printMark(subject);
        } catch (NullPointerException e) {
            System.out.print("no subjects, marks" + "\n");
            System.out.println();
        }
    }

    public void printSubjectsList() {
        try {
            subjectName.printListOfDisciplines();
        } catch (NullPointerException e) {
            System.out.print("no subjects, marks" + "\n");
            System.out.println();
        }
    }

    public void printAll() {
        try {
            System.out.print(getId() + " " + getName() + " " + getSurname());
            System.out.println();
            subjectName.printAll();
            System.out.println();
        } catch (NullPointerException e) {
            System.out.print("no subjects, marks" + "\n");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
