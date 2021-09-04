package day52_Abstractions.animalTask;

public class Duck extends Animal implements Swimable, Flyable, Wild {

    @Override
    public void sleep() {
        System.out.println("duck is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void drink() {
        System.out.println("duck drink");
    }

    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }

    @Override
    public void fly() {

    }
}
