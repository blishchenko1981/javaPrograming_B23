package day19_Loops;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        String str = "aabbtkrjbne;e;cnvjjgx";
        String result = "";
        for (int i = 0; i <= str.length()-1 ; i++) {
        char ch = str.charAt(i);// a,a,b,b,x
            boolean isUnique = str.indexOf(ch)== str.lastIndexOf(ch);
            if (isUnique){
                result += ch;
            }


        }


        System.out.println("result = " + result);



    }
}
