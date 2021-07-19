package day21_Loops;

public class WhileLoopPractice {
    public static void main(String[] args) {
        String sent = "Java is fun, Java is cool";
        int countJava = 0 ;

        while (sent.contains("Java")){
            countJava++;
            sent = sent.replaceFirst("Java" , "");
        }

        System.out.println("countJava = " + countJava);








    }
}
