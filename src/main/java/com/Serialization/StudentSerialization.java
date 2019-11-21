package com.Serialization;

import com.student.Student;

import java.io.*;

public class StudentSerialization {

    public static void serializationOfStudent(Student student) throws IOException {
        ObjectOutputStream writer = null;
        String filePath = "E:\\Projects\\hillelJava\\src\\main\\resources\\Serialization\\" + "student_" + student.getSurname() + ".bin";
        try {
            writer = new ObjectOutputStream(new FileOutputStream(filePath));
            writer.writeObject(student);

        } catch (IOException e) {
            throw new IOException("Try serialize " + student.getSurname());
        } finally {
            closeQuietly(writer);
        }
    }

    public static Student deserializationOfStudent(String path) throws IOException {
        ObjectInputStream reader = null;
        Student student = null;
        try {
            reader = new ObjectInputStream(new FileInputStream(path));
            student = (Student) reader.readObject();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Try desiarilization student by path: " + path);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignore) {
                    /*ignore*/
                }
            }
        }

        return student;
    }

    public static void closeQuietly(ObjectOutputStream writer) {
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

    public static void main(String[] args) throws IOException {
        Student dou = new Student(1, "Jake", "Dou");
        dou.setMark("geograthy", 5);
        dou.setMark("geograthy", 4);
        dou.setMark("math", 4);
        dou.setMark("math", 5);
        dou.setMark("economics", 5);

        serializationOfStudent(dou);
        Student returnedStudent = deserializationOfStudent("E:\\Projects\\hillelJava\\src\\main\\resources\\Serialization\\student_Dou.bin");

        System.out.println(returnedStudent);
    }
}
