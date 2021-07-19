package day08_ifStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        String name = "Vitalii";
        int score =569;
        boolean passed = score>= 60;



        if (passed) { // or if(score>=60) ;

            System.out.println(name + " you pass the exam");// need to put it in the bydy of if-statement
        }

        if ( score < 60 ){ // or if(!pass)
            System.out.println( name + "you fail");
        }
       }
     }


