package day11_Switch;

public class Calculator {
    public static void main(String[] args) {
/*
4. Given two double variables n1, n2 and a char variable named operator.
 use switch statement to calculate the result of n1 & n2 based on the given operator
        Valid operators are: -, +, *, /
(edited)

2
You do not have permission to send messages in this channel.

 */
        double n1= 100;
        double n2 = 2.5;
        double result = 0;


        char mathOperator= '+'; // +,- ,* ,/;

        switch (mathOperator){
            case '-':
               result= n1-n2;
                break;
            case '+':
                 result=n1+n2;
                break;
            case '*':
                result=n1*n2;
                    break;
            case '/':
                result=n1/n2;
                break;
            default:
                System.out.println("invalid operator");
                break;




        }
        System.out.println(result);






    }


}
