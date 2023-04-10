/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

/**
 *
 * @author user
 */
public class Superviser extends SuperviserData{
    public static SuperviserData fillSuperviser() {
        String name = Input.requireText("enter name");
        String surname = Input.requireText("enter surname");
        int age = Input.requireNumber("enter age");
        String position = Input.requireText("enter position");
        SuperviserData sv = new SuperviserData(name, surname, age, position);

        return sv;
    }
    public Superviser (String name, String surname, int age, String position) {
        super(name, surname, age, position);
    }
        public static void printAllRegisteredSupervisers() {
        if (Config.supervisers == null) {
            return;
        }
        for (int i = 0; i<Config.supervisers.length; i++) {
            SuperviserData st = Config.supervisers[i];
            System.out.println((i+1)+"."+st.getfullInfo());
        }
    }

    public static void registeredSupervisers() {
        int count = Input.requireNumber("How many supervisers do you want to register?");
        Config.supervisers = new SuperviserData[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");

            Config.supervisers[i] = Superviser.fillSuperviser();
        }
        System.out.println("Registration completed succesfully");
        Superviser.printAllRegisteredSupervisers();
    }
}
