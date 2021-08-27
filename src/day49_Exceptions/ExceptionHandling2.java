package day49_Exceptions;

import java.io.FileInputStream;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("");
        } catch (java.io.FileNotFoundException e ) {
                    e.printStackTrace();// gives full report of  the exception
 }

        System.out.println("Test code continue");

        System.out.println("------------------------------------------------");

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e ){
            e.printStackTrace();
        }

        System.out.println("test completed");


    }




}
