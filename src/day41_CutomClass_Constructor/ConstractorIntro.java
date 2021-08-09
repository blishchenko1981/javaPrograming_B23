package day41_CutomClass_Constructor;

public class ConstractorIntro {
    public ConstractorIntro(){

        System.out.println("Default Constructor");
    }

    public ConstractorIntro(int a){
        System.out.println("Constructor with int arg");
    }

    public static void main(String[] args) {
        new ConstractorIntro(3);
    }






}
