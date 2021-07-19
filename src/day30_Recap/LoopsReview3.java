package day30_Recap;

public class LoopsReview3 {
    public static void main(String[] args) {

        String sentence = "I love Java , Java is a fun";
        String word = "Java";

        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);

        System.out.println("============================");
        for (int i = 1; i <= 5; i++) {


            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("===================================");
        String str = "aabcccd";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0 ;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch){
                    frequency++;
                }
            }
            if(frequency ==1 ){
                System.out.println(ch);
            }
        }



    }
}