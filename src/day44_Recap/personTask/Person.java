package day44_Recap.personTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private char gender;
    private final int age;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;


    public static final boolean isHuman;
    public static final String planet;

    static{
        isHuman = true;
        planet = "Earth";
    }



    public Person(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {
       setName(name);
       setGender(gender);
        age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.dateOfBirth = dateOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.language = language;
    }

    public String getName(){
        return  name ;
    }

    public char getGender() {

        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if(!(gender == 'M'|| gender=='F') ||!(gender == 'm'|| gender=='f') ){
            return;
        }
        this.gender = gender;
    }

    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + df.format(dateOfBirth) +
                ", countryOfBirth='" + countryOfBirth + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    public void eat (String food){
        System.out.println( name + " is eating " + food);
    }
    public void drink (String drink){
        System.out.println(name + " is drinking" + drink);

    }
    public void sleep (){
        System.out.println(name + " is sleeping!!!");
    }


}