package day30_Recap;

public class BranchingStatement {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {

            if(i==3){
               // break;  // exits the loop only
               // return; // exits the method
                 continue;// exits the current iteration;
            }
            System.out.println(i);
        }

        System.out.println("Heelllloooooooooooo");



    }
}
