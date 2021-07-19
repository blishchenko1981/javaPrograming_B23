package day28_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {
        IsEligibleToBuyAlcohol(32);
    }
    public static void IsEligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not eligible");
        }
    }


}
