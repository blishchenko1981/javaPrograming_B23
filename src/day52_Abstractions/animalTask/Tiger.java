package day52_Abstractions.animalTask;

public class Tiger extends Animal implements Swimable,Wild{
    @Override
    public void sleep() {
        System.out.println("Tigers sleep");
    }

    @Override
    public void eat() {
        System.out.println("Tigers eat");

    }

    @Override
    public void drink() {
        System.out.println("Tigers drink");

    }

    @Override
    public void swim() {
        System.out.println("Tigers swim");

    }

    @Override
    public void hunt() {
        System.out.println("Tigers hunt");

    }
}
