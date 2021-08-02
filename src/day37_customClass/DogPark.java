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

        Dog dog3 = new Dog();
        dog3.setInfo("Gony", "Shepard", "Black", "female" , "small", 5);

        Dog dog4 = new Dog();
        dog4.setInfo("Bim", "Hunter", "grey", "male", "large", 4);

        Dog dog5 = new Dog();
        dog5.setInfo("jack","Marron", "white", "male","large",  2);

        Dog dog6 = new Dog();
        dog6.setInfo("Laika", "Husky", "grey-blue", "female", "midddle", 3);

        Dog dog7 = new Dog();
        dog7.setInfo("Luna", "Taxa", "grey", "male", "small", 1 );

        Dog dog8 = new Dog();
        dog8.setInfo("Breeze", "Retriver", "white", "male", "middle", 2);

        Dog dog9 = new Dog();
        dog9.setInfo("Friend", "Golden Retriever","brown", "female", "large", 3);

        Dog dog10 = new Dog();
        dog10.setInfo("Burry", "Sheppard", "black", "male", "middle", 2);

        Dog dog11 = new Dog();
        dog11.setInfo("Lime", "dog", "black", "female", "large", 4 );

        dog1.bark();
        dog2.bark();
        dog1.eat("bones");
        dog2.eat("fish");

        dog1.play();
        System.out.println("************************************");

        dog1.getInfo();
        System.out.println("-----------------------------");
        dog2.getInfo();

        Dog[] dogs = {dog1,dog2,dog3, dog4, dog5, dog6, dog7, dog8, dog9, dog10, dog11};
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.addAll(Arrays.asList(dog1,dog2,dog3, dog4, dog5, dog6, dog7, dog8, dog9, dog10, dog11));
        System.out.println(dogList);
        System.out.println(Arrays.toString(dogs));

        for (int i = 0; i < dogList.size(); i++) {
            if (dogList.get(i).breed != "husky") {
                System.out.println(dogs[i]);
                dogList.remove(i);
            }
        }
        System.out.println(dogList);
    }
}
