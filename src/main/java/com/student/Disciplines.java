package com.student;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

@XmlRootElement
public class Disciplines implements Serializable {
    @XmlElement(name = "subject")
    private ArrayList<Discipline> listOfDisciplines;


    public ArrayList<Discipline> getListOfDisciplines() {
        return listOfDisciplines;
    }

    public Disciplines() {
        this.listOfDisciplines = new ArrayList<Discipline>();
    }

    public int getSize() {
        return listOfDisciplines.size();
    }

    public Discipline getSubjectUnit(int unit) {
        return listOfDisciplines.get(unit);
    }

    public Discipline getSubject(String subjectName) {
        int index = 0;
        for (int i = 0; i < listOfDisciplines.size(); i++) {
            if (subjectName.equals(listOfDisciplines.get(i).getDescription())) {
                index = i;
            }
        }
        return listOfDisciplines.get(index);
    }

    public void addDiscipline(String description) {
        if (listOfDisciplines.size() == 0) {
            listOfDisciplines.add(new Discipline(description));
        } else {
            int size = listOfDisciplines.size();
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (description.equals(listOfDisciplines.get(i).getDescription())) {
                    count++;
                }
            }
            if (count == 0) {
                listOfDisciplines.add(new Discipline(description));
            }
        }
    }

    public void printListOfDisciplines() {
        for (int i = 0; i < listOfDisciplines.size(); i++) {
            System.out.println(listOfDisciplines.get(i).getDescription());
        }
    }

    public void printMark(String subject) {
        for (int i = 0; i < listOfDisciplines.size(); i++) {
            if (subject.equals(listOfDisciplines.get(i).getDescription())) {
                System.out.print(listOfDisciplines.get(i).getDescription() + ": ");
                for (int j = 0; j < listOfDisciplines.get(i).getSize(); j++) {
                    System.out.print(listOfDisciplines.get(i).getUnit(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < listOfDisciplines.size(); i++) {
            System.out.print(listOfDisciplines.get(i).getDescription() + ": ");
            for (int j = 0; j < listOfDisciplines.get(i).getSize(); j++) {
                System.out.print(listOfDisciplines.get(i).getUnit(j) + " ");
            }
            System.out.println();
        }
    }
}
