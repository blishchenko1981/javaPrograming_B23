package day37_customClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "Ghera";
        dog1.gender = "female";
        dog1.breed ="Kangal";
        dog1.size = "large";
        dog1.color = "brown";
        dog1.age = 5;



        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.age + " years old");


        Dog dog2 = new Dog();
        dog2.setInfo("Bobik", "Shepard", "Brown", "Male", "large",3);

        dog1.bark();
        dog2.bark();
        dog1.eat("bones");
        dog2.eat("fish");

        dog1.play();
        System.out.println("************************************");

        dog1.getInfo();
        System.out.println("-----------------------------");
        dog2.getInfo();

        Dog[] dogs = {dog1,dog2};
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.addAll(Arrays.asList(dog1,dog2));
        System.out.println(dogList);






    }
}
