package StringPractice;

public class StringIntro {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Java";
        String s4 = "JAVA";

        System.out.println("== operator");

        System.out.println(s1 ==s2);
        System.out.println(s1==s3);
        System.out.println(s1 ==s4);

        System.out.println(" equals() method ");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));//false
        System.out.println(s1.equalsIgnoreCase(s4));//true


        String a1 = new String ("Java");
        String a2 = new String ("Java");
        String a3 = new String ("Java");

        System.out.println("== operator");

        System.out.println( a1 ==a2);    //false
        System.out.println(a1.equals(a2));//true
        System.out.println(a1.equals(s1));// true











    }
}
