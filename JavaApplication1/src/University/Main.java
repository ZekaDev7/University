/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        int menu = 0;
        int type = 0;
        while (true) {
            menu = Input.requireNumber("Type any number..."
                    + "\n 1: Register"
                    + "\n 2: Delete"
                    + "\n 3: Show"
            );

            if (menu == 1) {
                type = Input.requireNumber("Register person's type"
                        + "\n 1: Student"
                        + "\n 2: Teacher"
                        + "\n 3: Superviser");
                if (type == 1) {
                    Student.registeredStudents();
                } else if (type == 2) {
                    Teacher.registeredTeachers();
                } else if (type == 3) {
                    Superviser.registeredSupervisers();
                }

            } else if (menu == 2) {
                type = Input.requireNumber("Delete for person's type"
                        + "\n 1: Student"
                        + "\n 2: Teacher"
                        + "\n 3: Superviser");
                if (type == 1) {
                    Student.deleteStudents();
                }
//                } else if (type == 2) {
//                    Teacher.deleteTeachers;
//                } else if (type == 3) {
//                    Superviser.deleteSupervisers();
//                }
            } else if (menu == 3) {
                type = Input.requireNumber("See information for person's type"
                        + "\n 1: Student"
                        + "\n 2: Teacher"
                        + "\n 3: Superviser");
                if (type == 1) {
                    Student.printAllRegisteredStudents();
                } else if (type == 2) {
                    Teacher.printAllRegisteredTeachers();
                } else if (type == 3) {
                    Superviser.printAllRegisteredSupervisers();
                }
            }
        }
    }
}
