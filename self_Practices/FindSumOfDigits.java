public class FindSumOfDigits {
    public static void main(String[] args) {

        String  a = "a2h3h4g5j";
        int result = 0;

        char[] arrayOfChars = a.toCharArray();

        for (char each : arrayOfChars) {

            if(Character.isDigit(each)){
                result += Integer.valueOf("" + each);

            }

        }
        System.out.println(result);




    }
}
