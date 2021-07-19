package day19_Loops;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {
        String word = "ababababababababglkdfjgldjflad;hfgdfljlfl";
        String result = "";
        for (int i = 0; i <word.length() ; i++) {
           if(!result.contains(""+word.charAt(i))){
               result+= word.charAt(i);}
        }
        System.out.println("result = " + result);





    }
}
