package day47_Recap.PhoneTask;

public class Iphone extends Phone{


    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }


    @Override
    public void call(long phoneNumber) {
        System.out.println("Iphone is calling to " + phoneNumber );
    }
    public void call(long phone1, long phone2){

        call(phone1);
        call(phone2);
    }
    public void call(long phone1, long phone2, long phone3){

        call(phone1, phone2);
        call(phone3);

    }


    public void text(long phoneNumber) {
        System.out.println("Iphone is texting to " + phoneNumber);

    }

    public void faceTime (long phoneNumber){

        System.out.println("Iphone is calling on face time to " + phoneNumber);
    }


}
