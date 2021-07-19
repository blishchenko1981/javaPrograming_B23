package day10_IfStatement;

public class FinRA {
    public static void main(String[] args) {
        int num =3 ;
        String result = "";
        if(num%3 ==0 && num%5 ==0 ){
            result = "Finra";
        }else if (num%3==0) {
            result= "Fin";
        }else if (num%5 == 0){
            result= "RA";
        } else {
            result = ""+ num;   }
        System.out.println("result = " + result);

        /*

    3. Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

          output:
                FIN

                number = 10

            output:
                RA

                number = 15

            output:
                FINRA
(edited)

1
NEW

         */
    }
}
