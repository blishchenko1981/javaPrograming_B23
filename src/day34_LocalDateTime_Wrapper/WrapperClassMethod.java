package day34_LocalDateTime_Wrapper;

public class WrapperClassMethod {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);

        int num1 = Integer.valueOf(str);
        Integer num2 = Integer.parseInt(str);

        int num3 = Integer.parseInt(str);

        System.out.println(num1);
        System.out.println(num);
        
        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        boolean r2 = Boolean.valueOf(str2);
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);

        char a = '2';

        boolean isDigit = Character.isDigit(a);
        boolean isLetter = Character.isLetter(a);
        boolean isSpecialCharacter = !Character.isLetterOrDigit(a);


       String s = "a1b2c3";

       int sum = 0 ;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
              sum+=   Integer.parseInt("" + each);

              //  sum +=each;
            }
        }
        System.out.println(sum);

        System.out.println("===============================");

        String s2 = "aaAASDFGF654647685S^%(&(%&^*";
        String letters = "",
                digits = "",
                specialChars = "";

        for (char each : s2.toCharArray()) {
            if(Character.isDigit(each)){
                digits+= each;
            }else if(Character.isLetter(each)){
                letters += each;

            }else{
                specialChars += each;
            }

        }

        System.out.println(letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
