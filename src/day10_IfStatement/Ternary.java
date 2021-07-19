package day10_IfStatement;

public class Ternary {
    public static void main(String[] args) {
        int n =  100 ;

        String result = "";

        if ( n % 2 ==0){
            result= "Even";
        }else{
            result= "odd";
        }
        System.out.println("result = " + result);

        System.out.println("==============================");

        String result1 = (n%2==0)? "Even" : "Odd";
        System.out.println("result1 = " + result1);
    }
}
