package com.IO;

import com.student.Group;
import com.student.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class StudentIO {

    public static void studentToXML(Student student, String filePath) throws IOException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(student, new FileOutputStream(filePath + "student_" + student.getSurname() + ".xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new IOException("Try write student " + student.getSurname() + " to xml");
        }
    }

    public static Student studentFromXML(String filePath) throws JAXBException {
        Student student = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            student = (Student) unmarshaller.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            throw new JAXBException("Try unmarshall student " + filePath);
        }
        return student;
    }

    public static void journalToXML(Group group, String filePath) throws IOException {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Group.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(group, new FileOutputStream(filePath + "group_" + group.getGroupDescription() + ".xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new IOException("Try write student " + group.getGroupDescription() + " to xml");
        }
    }

    public static void studentToTXT(Student student, String filePath) throws IOException {

        BufferedWriter writer = null;

        String fileName = filePath + "student_" + student.getSurname() + ".txt";

        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

            writer.write("ID: " + student.getId());
            writer.newLine();
            writer.write("Name: " + student.getName());
            writer.newLine();
            writer.write("Surname: " + student.getSurname());
            writer.newLine();
            writer.write("Marks: ");
            writer.newLine();
            for (int j = 0; j < student.getSubjectName().getListOfDisciplines().size(); j++) {
                writer.write(student.getSubjectName().getListOfDisciplines().get(j).getDescription() + ": ");
                for (int k = 0; k < student.getSubjectName().getListOfDisciplines().get(j).getSize(); k++) {
                    writer.write(student.getSubjectName().getListOfDisciplines().get(j).getUnit(k) + " ");
                }
                writer.newLine();
            }

        } catch (IOException e) {
            throw new IOException("Try write to file: " + "student_" + student.getSurname());
        } finally {
            closeQuietly(writer);
        }
    }

    public static void journalToTXT(Group group, String filePath) throws IOException {
        BufferedWriter writer = null;
        String fileName = filePath + "group_" + group.getGroupDescription() + ".txt";

        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

            writer.write("Group name: " + group.getGroupDescription());
            writer.newLine();
            for (int i = 0; i < group.getStudents().size(); i++) {
                writer.write("====================================");
                writer.newLine();
                writer.write("Student ID : " + group.getStudents().get(i).getId());
                writer.newLine();
                writer.write("Student Name : " + group.getStudents().get(i).getName());
                writer.newLine();
                writer.write("Student Surname : " + group.getStudents().get(i).getSurname());
                writer.newLine();
                writer.write("Marks: ");
                writer.newLine();
                for (int j = 0; j < group.getStudents().get(i).getSubjectName().getListOfDisciplines().size(); j++) {
                    writer.write(group.getStudents().get(i).getSubjectName().getListOfDisciplines().get(j).getDescription() + ": ");
                    for (int k = 0; k < group.getStudents().get(i).getSubjectName().getListOfDisciplines().get(j).getSize(); k++) {
                        writer.write(group.getStudents().get(i).getSubjectName().getListOfDisciplines().get(j).getUnit(k) + " ");
                    }
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            throw new IOException("Try write to file: " + "group_" + group.getGroupDescription());
        } finally {
            closeQuietly(writer);
        }
    }

    public static void closeQuietly(BufferedWriter writer) {
        if (writer != null) {
            try {
                writer.flush();
            } catch (IOException ignore) {
                    /*ignore*/
            }
            try {
                writer.close();
            } catch (IOException ignore) {
                    /*ignore*/
            }
        }
    }

    public static void main(String[] args) throws IOException, JAXBException {
        Student ivanov = new Student(1, "Ivan", "Ivanov");
        Student petrov = new Student(2, "Petr", "Petrov");
        ivanov.setMark("geograthy", 5);
        ivanov.setMark("geograthy", 4);
        ivanov.setMark("math", 4);
        ivanov.setMark("math", 5);
        petrov.setMark("economics", 5);

        Group et501 = new Group("ET501");
        et501.addStudent(ivanov);
        et501.addStudent(petrov);

        studentToXML(ivanov, "E:\\Projects\\hillelJava\\src\\main\\resources\\");
        studentToXML(petrov, "E:\\Projects\\hillelJava\\src\\main\\resources\\");
        studentToTXT(ivanov, "E:\\Projects\\hillelJava\\src\\main\\resources\\");
        journalToXML(et501, "E:\\Projects\\hillelJava\\src\\main\\resources\\");
        journalToTXT(et501, "E:\\Projects\\hillelJava\\src\\main\\resources\\");
        Student unmarshStudent = studentFromXML("E:\\Projects\\hillelJava\\src\\main\\resources\\student_Ivanov.xml");
        System.out.println(unmarshStudent.getSurname());
    }
}

