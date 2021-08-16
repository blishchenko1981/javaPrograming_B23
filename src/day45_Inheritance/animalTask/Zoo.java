package day45_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog("Gera", "shapperd", 'f', "big", 3, "Grey");
        dog.bark();
        dog.eat("bone");
        dog.drink("water");
        dog.sleep();


        Cat cat = new Cat("Barsic", "cat", 'm', "small", 5, "grey");

        cat.meow();
        cat.eat("fish");
        cat.drink("milk");


        Tiger tiger = new Tiger("Sherhan" , "siberian",'M', "huge", 6, "orange-black");
        tiger.roar();
        tiger.sleep();
        tiger.eat("people");




    }
}