/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

/**
 *
 * @author user
 */
public class Student extends StudentData {

    public static StudentData fillStudent() {
        String name = Input.requireText("enter name");
        String surname = Input.requireText("enter surname");
        int age = Input.requireNumber("enter age");
        String faculty = Input.requireText("enter faculty");
        StudentData st = new StudentData(name, surname, age, faculty);

        return st;
    }

    public static StudentData unloadStudent() {
        StudentData st = null;
        return st;
    }

    public Student(String name, String surename, int age, String faculty) {
        super(name, surename, age, faculty);
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            StudentData st = Config.students[i];
            System.out.println((i + 1) + "." + st.getfullInfo());
        }
    }

    public static void registeredStudents() {
        int count = Input.requireNumber("How many students do you want to register?");
        Config.students = new StudentData[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");

            Config.students[i] = Student.fillStudent();
        }
        System.out.println("Registration completed succesfully");
        Student.printAllRegisteredStudents();
    }

    public static void deleteStudents() {
        int count = Input.requireNumber("How many students do you want to delete?");

        for (int i = 1; i < count - 1; i++) {
            System.out.println("Deleted successfully");

            Config.students[i] = Student.unloadStudent();
        }
    }
}
