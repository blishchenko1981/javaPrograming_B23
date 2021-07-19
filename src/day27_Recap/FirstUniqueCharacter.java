package day27_Recap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aaaksfdlskfjagfdglfslfr";

        for(char each : str.toCharArray() ){
            if(str.indexOf(each) == str.lastIndexOf(each)){
            System.out.print(each);}
        }




    }
}
