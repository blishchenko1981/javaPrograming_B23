package day52_Abstractions.animalTask;

public class cat extends Animal  {
    @Override
    public void sleep() {
        System.out.println("cats sleep");

    }

    @Override
    public void eat() {
        System.out.println("cats eat");

    }

    @Override
    public void drink() {
        System.out.println("Cats drink");

    }
}
