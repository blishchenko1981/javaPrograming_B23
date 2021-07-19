package day03;

public class VariablePractice1 {
    //double vs float
    public static void main(String[] args) {


        String typeOfTire = "Michelline";
        String typeOfCar = "Honda";

        boolean good = typeOfTire=="Michelline";
        boolean soGood = typeOfCar =="Honda";
        boolean veryGood = good== soGood==true;


        System.out.println("soGood = " + soGood);
        System.out.println("good = " + good);
        System.out.println("veryGood = " + veryGood);
        
    }







}
