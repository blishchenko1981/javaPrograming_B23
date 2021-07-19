package strings;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        exists =  (word.indexOf("j") ==0 && word.indexOf("a")==1)||
                (word.indexOf("j") ==1 && word.indexOf("a")==2 );

        System.out.println(exists);

        scan.close();








        /*
        Given a string word, print true if "java" appears starting
        at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx"
        but not "xxjavaxx". The string may be any length, including 0.

Example:

input: javapython

output: true
input: javapython

output: true
input: cjavac++

output: true
input: cjavac++

output: true
input: c#javaruby

output: false
         */
    }
}
