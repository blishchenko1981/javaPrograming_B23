package day47_Recap.PhoneTask;

public final class Samsung extends  Phone {

    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }


    public void call (long phoneNumber){
        System.out.println( "Samsung galaxy is calling" + phoneNumber);
    }

    public void text (long phone1 , long phone2) {
        text(phone1);
        text(phone2);
    }
    public void text (long phone1 , long phone2, long phone3) {
        text(phone1, phone2);
        text(phone3);
    }

    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing");

    }



}
