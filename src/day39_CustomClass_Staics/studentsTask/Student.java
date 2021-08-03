package day39_CustomClass_Staics.studentsTask;

import java.time.LocalDate;

public class Student {
    public String name;
    public char gender;
    public LocalDate dOB;
    public int age;
    public int studentID;
    public char grade;

    public void setInfo(String name, char gender, LocalDate dOB, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.dOB = dOB;
        this.studentID = studentID;
        this.grade = grade;
        age = LocalDate.now().getYear() - dOB.getYear();
    }





    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dOB=" + dOB +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
