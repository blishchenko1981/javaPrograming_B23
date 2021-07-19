package practice_09_06_21;

public class Switch {
    public static void main(String[] args) {
        //!!!!!!!!!!!!! cant use boolean float double long with Switch!!!!!!!!!!!!!!!!!!!!!!


        /*
        1-Create  a program that accepts animal as String

                            DOG     - domestic animal
                            CAT     - domestic animal
                            TIGER     - wild  animal

                            For other animal - unknown animal

                            INPUT : DOG         EXPECTED OUTPUT : DOG is domestic animal
         */

        String animal = "CAT";

        switch (animal){

            case "DOG":
                System.out.println("Domestic animal");
                break;
            case "Tiger":
                System.out.println("Wild animal");
                break;
            default:
                System.out.println("Unnown");
                break;
        }


    }




}
