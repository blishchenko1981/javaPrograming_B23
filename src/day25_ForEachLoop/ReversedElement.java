package day25_ForEachLoop;

public class ReversedElement {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#"};

        for (String element : array) {
            String reverse = "";
            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);// gets the characters from the string element;
            }

            System.out.println("reversElements = " + reverse);

        }




    }
}
