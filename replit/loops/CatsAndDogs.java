package loops;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
      //dog
        //cat 1 dog 0

        for (int i = 0; i <= word.length()-1 ; i++) {
            if (word.contains("cat")) {
                countOfCats+= 1 ;
               word =  word.replaceFirst("cat", "");
            }
            if (word.contains("dog")){
                countOfDogs +=1;
                word = word.replaceFirst("dog", "");

            }
        }
        System.out.println(countOfCats== countOfDogs);







    }
}
