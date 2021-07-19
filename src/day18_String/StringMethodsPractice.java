package day18_String;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str = "abcd";
        int indexOfK = str.indexOf("k");

        System.out.println("indexOfK = " + indexOfK);

        if(indexOfK>= 0 ){
            System.out.println("the string has character K");
        }else {
            System.out.println("the string does not have k");
        }
        System.out.println("===============================");


        String sentence = "I like to learn C#, C# is cool";

        if(sentence.indexOf("Java")>= 0){
            System.out.println("sentence has Java");
        }else{
            System.out.println("No java");
        }
        System.out.println("         =========================     ");

        String sent2 = "I love Java. Java is cool.";

        boolean isUnique = sent2.indexOf("Java") == sent2.lastIndexOf("Java");

        System.out.println("isUnique = " + isUnique);

        System.out.println("===============================");

        String schoolName = "Cybertek School";
        String name = schoolName.substring(0 , schoolName.indexOf(" "));
        System.out.println("name = " + name);

        System.out.println("----------------------------------------");

        String sent3 = "I live in California, I go to Cybertek school";

        String name2 = sent3.substring(sent3.indexOf("Cy"), sent3.lastIndexOf(" "));
                                           // to find UNIC "C"
        System.out.println("name2 = " + name2);

        System.out.println("=======================  replace   ============================");

        String str2 = "dog cat dog cat";
        str2 = str2.replace("cat", "dog");// dog dog dog dog

        System.out.println(str2);
        str2 = str2.replaceFirst("dog", "cat");
        System.out.println(str2);

        System.out.println("========================      equals         ============================");
        System.out.println("yes".equals("Yes"));// false
        System.out.println("yes".equalsIgnoreCase("Yes"));// true
    }
}
