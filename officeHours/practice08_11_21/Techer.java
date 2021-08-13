package practice08_11_21;

public class Techer {
    public String name;
    public int age;

    public Techer(String name) {
        this.name = name;
        System.out.println(" Name of teacher");
    }

    public Techer(String name, int age) {

        this.name = name;
        this.age = age;
        System.out.println("age and name");
    }

    public Techer(int age) {
        this.age = age;
        System.out.println("Just age of teacher");
    }



}
