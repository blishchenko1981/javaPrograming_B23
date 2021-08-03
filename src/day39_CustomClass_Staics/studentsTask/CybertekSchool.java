package day39_CustomClass_Staics.studentsTask;

import java.time.LocalDate;
import java.util.ArrayList;

public class CybertekSchool {
    public static void main(String[] args) {
        Student[] group1 = {
                new Student(), new Student(), new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(), new Student(), new Student(),
                new Student()};
        group1[0].setInfo("Tamara", 'F', LocalDate.of(1988, 6, 17), 10, 'A');
        group1[1].setInfo("Ibrahim", 'M', LocalDate.of(1991, 6, 20), 11, 'A');
        group1[2].setInfo("Ismail", 'M', LocalDate.of(1993, 8, 16), 12, 'A');
        group1[3].setInfo("Selda", 'F', LocalDate.of(1988, 10, 5), 20, 'A');
        group1[4].setInfo("Shtefan", 'M', LocalDate.of(1993, 2, 2), 13, 'A');
        group1[5].setInfo("Tamerlan", 'M', LocalDate.of(1986, 2, 2), 14, 'A');
        group1[6].setInfo("Mehmet", 'M', LocalDate.of(1989, 3, 3), 15, 'A');
        group1[7].setInfo("Adnan", 'M', LocalDate.of(1989, 4, 4), 16, 'A');
        group1[8].setInfo("Elza", 'F', LocalDate.of(1995, 6, 8), 17, 'A');
        group1[9].setInfo("Mehnmut", 'M', LocalDate.of(1990, 1, 1), 18, 'A');
        group1[10].setInfo("Rishat", 'M', LocalDate.of(1980, 7, 7), 19, 'A');

        Student[] group2 = {
                new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(), new Student(), new Student()};
        group2[0].setInfo("Feruza Jonzokova", 'F', LocalDate.of(1993, 06, 17), 1790, 'B');
        group2[1].setInfo("Yahya Hussein", 'M', LocalDate.of(1990, 04, 20), 1134, 'B');
        group2[2].setInfo("Gulistan Abdurahman", 'F', LocalDate.of(1989, 2, 27), 2045, 'A');
        group2[3].setInfo("Nazli Guvenc", 'F', LocalDate.of(1988, 7, 17), 2255, 'A');
        group2[4].setInfo("Ahmad Samir", 'M', LocalDate.of(1987, 10, 10), 1945, 'A');
        group2[5].setInfo("Ahmet Yilmaz", 'M', LocalDate.of(1988, 4, 10), 9056, 'A');
        group2[6].setInfo("Aykut Koc", 'M', LocalDate.of(1988, 6, 15), 1346, 'B');
        group2[7].setInfo("Saron Bahta", 'F', LocalDate.of(1992, 8, 8), 8876, 'B');
        group2[8].setInfo("Jonathan Holly", 'M', LocalDate.of(1990, 9, 2), 2360, 'B');
        group2[9].setInfo("Ateequllah Saraabi", 'M', LocalDate.of(1991, 11, 12), 1247, 'A');
        group2[10].setInfo("Alshaun Rodgers", 'M', LocalDate.of(1987, 12, 5), 1128, 'A');

        Student[] group3 = {
                new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(), new Student(),
                new Student(), new Student(), new Student(), new Student()};
        group3[0].setInfo("Oz Stark", 'M', LocalDate.of(1978, 6, 12), 1, 'A');
        group3[1].setInfo("Bakhtyar", 'M', LocalDate.of(1990, 4, 25), 2, 'A');
        group3[2].setInfo("Yuliang Wang", 'M', LocalDate.of(1989, 3, 13), 3, 'A');
        group3[3].setInfo("Oleg", 'M', LocalDate.of(1989, 3, 1), 4, 'A');
        group3[4].setInfo("Davut Dogan", 'M', LocalDate.of(1991, 5, 11), 5, 'C');
        group3[5].setInfo("Dontrell Andrews", 'M', LocalDate.of(1981, 6, 1), 6, 'C');
        group3[6].setInfo("Farhad Zeynalov", 'M', LocalDate.of(1988, 2, 28), 7, 'C');
        group3[7].setInfo("Nasratullah Sarabi", 'M', LocalDate.of(1990, 8, 21), 8, 'C');
        group3[8].setInfo("Santiago", 'M', LocalDate.of(1991, 11, 11), 9, 'D');
        group3[9].setInfo("Muhammet Sengez", 'M', LocalDate.of(1984, 1, 1), 10, 'D');
        group3[10].setInfo("Vusal Rahimli", 'M', LocalDate.of(1992, 12, 11), 11, 'D');

        Student[][] groups = {group1, group2, group3};

        ArrayList<Student> firstMarketGroup = new ArrayList<>();
        ArrayList<Student> secondMarketGroup = new ArrayList<>();
        ArrayList<Student> thirdMarketGroup = new ArrayList<>();

        for (Student[] eachGoup : groups) {
            for (Student eachStudent : eachGoup) {
                if (eachStudent.grade == 'A') {
                    firstMarketGroup.add(eachStudent);
                } else if (eachStudent.grade == 'B') {
                    secondMarketGroup.add(eachStudent);
                } else {
                    thirdMarketGroup.add(eachStudent);
                }
            }
        }

        System.out.println("market group1: " + firstMarketGroup);
        System.out.println("market group2: " + secondMarketGroup.size());
        System.out.println("market group3: " + thirdMarketGroup.size());


        LocalDate min = firstMarketGroup.get(0).dOB;
        String name = "";
        for (Student student : firstMarketGroup) {
            if (student.dOB.isAfter(min)) {
                min = student.dOB;
                name = student.name;
            }
        }
        System.out.println(min);
        System.out.println("name = " + name);

        System.out.println("=======================================");

        // display the name of the students who were born between 1985-Jan-20 to 1995-Aug- 15

        for (Student[] group : groups) {
            for (Student student : group) {
                if (student.dOB.isAfter(LocalDate.of(1989, 1, 20)) && student.dOB.isBefore(LocalDate.of(1992, 8, 15))) {
                    System.out.println(student.name + " : " + student.dOB);
                }


            }
        }
    }
}