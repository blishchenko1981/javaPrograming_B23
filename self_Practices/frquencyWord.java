import java.util.Arrays;

public class frquencyWord {
    public static void main(String[] args) {

        String sentence = "I wanto to go to the \"Drinks to go\" tobar ";
        int count = 0;


        for (int i = 0; i < sentence.length()-4; i++) {
            if(sentence.substring(i,i+4).equals(" to ")){
                count += 1;
            }
        }

//        while (sentence.contains("to")) {
//            sentence = sentence.replaceFirst("to", "");
//            count += 1;
//        }


        System.out.println(count);
        System.out.println(sentence);





        String str1 = "heart";
        String str2 = "treha";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2));


        }



    }

