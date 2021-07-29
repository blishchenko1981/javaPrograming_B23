package Practice_07_28_21.WrapperClass;

public class WrapperTask {
    public static void main(String[] args) {
           /*
    Task 1:
                        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
                        Write a method that returns : Welcome To Core Java
     */
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                newStr += " ";
            }
            if (Character.isAlphabetic(str.charAt(i)))
            newStr += str.charAt(i);
        }


        System.out.println(newStr);
    }
}
