package day29_ReturnMethods;

public class SystemExitVsReturn {

    public static void main(String[] args) {
        passOrFailed(167);
    }

    public static void passOrFailed (int score){

        if(score <0 || score> 100) {

            System.out.println("Invalid");
            return;
    }

        if(score >= 60) {
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
