package day44_Recap.personTask;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Vitalii", 'M',
                LocalDate.of(1981, 8,03),  "russia", "Russian");

        System.out.println(person1);

    }
}
