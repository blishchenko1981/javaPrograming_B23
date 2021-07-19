package day19_Loops;

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 0 ; i <= 100; i++){  // i = 12345....1000;
            System.out.print(i+",");
        }

        System.out.println();  //to make sure next print statement starts from new line
        System.out.println("Hellooooooooooooooooooooooooooooooo");

        for (int i = 1; i<= 100;i++ ){// i= 1,2,3,4,5,6...100;
            if(i%2 != 0) {
                System.out.print(i+ " ");
            }
        }

        System.out.println();
        System.out.println("---------------------------");

        for(int i = 1; i <= 100 ; i+= 2){
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("===================================");

        String odd = "";
        String even = "";
        for (int i = 1; i <101 ; i++) {
            if(i%2!=0 ){
                odd += i+ " ";
            }else {
                even+= i +" ";
            }
        }

        System.out.println(odd);



    }
}
