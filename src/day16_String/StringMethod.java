package day16_String;

public class StringMethod {
    public static void main(String[] args) {

        String email = "Cybretek@yahoo.com  . yahoo is to complicated";
        email = email.replaceFirst("yahoo", "gmail");// replace only first matched word;
        email = email.replace("yahoo", "gmail");// replace all matched words;

        System.out.println(email);


        String s = "Cat Dog Cat Dog Cat";
        s = s.replace("Cat", "Dog");
        System.out.println(s);

        System.out.println("========== IndexOf +++++++++++++++++");

        String sentence = "Java is a cool language";
        //index:           012345678901234567890
        int indexOfFirstA = sentence.indexOf("a");
        int indexOfSecondA = sentence.indexOf("a ");
        int indexOfThirdA = sentence.indexOf("a c");
        int indexOfForthA = sentence.indexOf("anguage");
        int indexOfLastA = sentence.lastIndexOf("a");


        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfForthA);
        System.out.println(indexOfLastA);

        System.out.println(";;;;;;;;;;;;;;; IsEmpty ===================");

        String s2 = "";
        boolean r1 = s2.isEmpty();
        s2 = s2.trim();
        System.out.println("r1 = " + r1);

        System.out.println("==========  Equals METHOD    ---------------------");

        String str1 = "Cat";
        String str2 = new String("Cat");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println("----------   equalsIgnoreCase  ------------");

        String word = "Java";
        String word2 = "java";

        boolean i = word.equalsIgnoreCase(word2);
        System.out.println(i);



    }
}
