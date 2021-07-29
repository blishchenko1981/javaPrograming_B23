package day37_customClass;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public int age;
    public String gender;
    public String color;


    public void eat(String food){System.out.println(name + " is eating " + food);}
    public void drink (String drink){System.out.println(name +" is drinking " + drink);}
    public void bark(){System.out.println(name + " is barking");}
    public void play() {System.out.println(name + " is playing");}



    public void setInfo(String dogName, String dogBreed, String dogColor, String dogGender,String dogSize, int dogAge){

        name = dogName;
        breed = dogBreed;
        color = dogColor;
        gender = dogGender;
        age= dogAge;
        size = dogSize;

    }


    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
        System.out.println("size = " + size);
        System.out.println("age = " + age);
    }
}
