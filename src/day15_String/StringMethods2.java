package day15_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence = "Java Programming Language";
        // index :         0123456789012345678901234
        String name = sentence.substring(0,16);
        String name2 = sentence.substring(5,21+1);

        System.out.println(name);
        System.out.println(name2);

        System.out.println("0000000000000000000000000000000");

        String sentence2 = "Java is a best programming language";
        // index :          01234567890123456789012345
        String name4 = sentence2.substring(10);
        String name5 = sentence2.substring(10,26);

        System.out.println(name4);
        System.out.println(name5);




    }


}
