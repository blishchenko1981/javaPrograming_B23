package day20_Loop;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence = "Python Python Python Python";
        String word = "Python";
        int count = 0;
        for (int i = 0; i <= sentence.length() - word.length(); i++) {
            String each = sentence.substring(i, i + word.length());
            // 0, 6
            // 1. 7
            System.out.println("each = " + each);

            if (each.equals("Python")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
//2. write a program that can return the frequency of the a word Java from the sentence
//
//        Ex:
//            sentence = "Java Java";
//
//            output:
//                2