package day52_Abstractions.animalTask;

public class Fish extends Animal implements Swimable, Wild {
    @Override
    public void sleep() {
        System.out.println("fish sleep");
    }

    @Override
    public void eat() {
        System.out.println("fish eat");
    }

    @Override
    public void drink() {
        System.out.println("fish drink");
    }

    @Override
    public void swim() {
        System.out.println("fish swim");
    }

    @Override
    public void hunt() {
        System.out.println("fish hunt");
    }
}
