package day20_Loop;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java Java";
        //String word = "Java";
     //   String str1 = sentence.substring(0, 4);
//        String str3 = sentence.substring(2, 6);
       // String str4 = sentence.substring(3, 7);

        int count = 0;
        for (int i = 0; i <= sentence.length()-4; i++) {
          String each=   sentence.substring(i, i+4);// represent each 4 characters in sentence
            if(each.equals("Java")){
                count++;
            }
            System.out.println(each);
        }







    }
}
