package day29_ReturnMethods;

public class ReturnMethods {

    public static void main(String[] args) {
        String str = "Jaaj";
         String reverseString = reverse(str);
         boolean isPalindrome =  isPalindrome(str);
        System.out.println("isPalindrome "+ isPalindrome);

    }
    public static String reverse (String str){ // "ABC"
        String result = "" ;//"CBA"
        for (int i = str.length()-1; i>= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;

    }

    public static boolean isPalindrome(String str){
        String reversedStr = reverse(str);
    //    if(reversedStr.equals(str)){
    //        System.out.println(str + " is palindrome");
     //   }else{
     //       System.out.println(str + " is not palindrome");}

        return (reversedStr.equalsIgnoreCase(str))? true: false;


    }
}
