/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package University;

/**
 *
 * @author user
 */
public class StudentData {
    private String name;
    private String surname;
    private int age;
    private String faculty;
    
    public StudentData(String name, String surname, int age, String faculty){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getfullInfo(){
        return this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getFaculty();
    }
}
