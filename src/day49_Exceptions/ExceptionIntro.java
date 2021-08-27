package day49_Exceptions;

public class ExceptionIntro {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

      //  System.out.println(arr[100]);
        System.out.println("helloooo !!!!!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Robinson");





    }
}
