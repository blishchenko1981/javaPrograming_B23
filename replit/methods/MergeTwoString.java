package methods;

import java.util.Scanner;

public class MergeTwoString {
   /* public static String mergeStrings(String one, String two) {

        String[] word1 = one.split("");
        String[] word2 = one.split("");
        String[] mergeString =new String[word1.length + word2.length] ;

        int shortestLength = word1.length;
        if(word2.length< shortestLength){
            shortestLength = word2.length;
        }
        for (int i = 0, n = 0; i <shortestLength ;n++, i++) {
            mergeString[n++] = word1[i];
            mergeString[n] = word2[i];
        }
        String returnString = "";
        for (int i = 0; i <shortestLength ; i++) {
            returnString  += mergeString[i];
        }



        return returnString;
        }
        */
        public static String mergeStrings(String one, String two){
        String merge = "";



        while(one.length()>0 && two.length()> 0){
            int i = 0;
                merge += one.substring(i, i+1);
                merge += two.substring(i, i+1);
                one = one.replaceFirst(one.substring(i, i+1), "");
                two = two.replaceFirst(two.substring(i, i+1), "");
                i++;}

        if(one.length()>two.length()){
            merge += one;
        }else if (two.length()> one.length()) {
            merge += two;
            }



            return merge;
        }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }


}
