package day58_Maps;

public class TestEnum {

    public static void main(String[] args) {

        //String browser = "Cydeo";

        Browser browser = Browser.edge;

        switch (browser){

            case chrome:
                System.out.println("Chrome is selected");
                break;

            case firefox:
                System.out.println("Firefox is selected");
                break;

            case opera:
                System.out.println("Opera is selected");
                break;

            case safari:
                System.out.println("Safary is selected");
                break;

            default:
                System.out.println("Chrome driver is selected");

        }
        System.out.println("----------------------------------------");


        String level = "Java";
        Level leveL = Level.Akbar;  //cant assign anithing besides enum

        System.out.println("-----------------------------------------");

        Months months = Months.April;

        System.out.println("months = " + months);


    }
}
