/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

/**
 *
 * @author user
 */
public class Teacher extends TeacherData {
    public static TeacherData fillTeacher() {
        String name = Input.requireText("enter name");
        String surname = Input.requireText("enter surname");
        int age = Input.requireNumber("enter age");
        String department = Input.requireText("enter department");
        TeacherData tc = new TeacherData(name, surname, age, department);

        return tc;
    }
    public Teacher (String name, String surname, int age, String department) {
        super(name, surname, age, department);
    }
        public static void printAllRegisteredTeachers() {
        if (Config.teachers == null) {
            return;
        }
        for (int i = 0; i<Config.teachers.length; i++) {
            TeacherData st = Config.teachers[i];
            System.out.println((i+1)+"."+st.getfullInfo());
        }
    }

    public static void registeredTeachers() {
        int count = Input.requireNumber("How many teachers do you want to register?");
        Config.teachers = new TeacherData[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");

            Config.teachers[i] = Teacher.fillTeacher();
        }
        System.out.println("Registration completed succesfully");
        Teacher.printAllRegisteredTeachers();
    }
}
