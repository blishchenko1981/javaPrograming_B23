package day10_IfStatement;

public class ConvertNumbersToWord {
    public static void main(String[] args) {

        int a = 3;
        String name = "";
        if (a>=0 && a<= 9){
                if (a==0){
                    name = "zero";
                }else if(a==1){
                name = "one";
                }else if(a==2){
                    name = "two";
                }else if(a==3){
                    name = "three";
                }else if(a==4){
                    name = "four";
                }else if(a==5){
                    name = "five";
                }else if(a==6){
                    name = "six";
                }else if(a==7){
                    name = "seven";
                }else if(a==8){
                    name = "eight";
                }else if(a==9){
                    name = "nine";}



            }else{ name = " invalid";}

        System.out.println("name = " + name);




    }
}
