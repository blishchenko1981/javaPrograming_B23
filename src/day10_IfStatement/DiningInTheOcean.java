package day10_IfStatement;

public interface DiningInTheOcean {
    /*
    Tasks:
    You are diving in the ocean. Your oxygen tank has a certain level
    (number) and you must print a message based on the level:
                Above 90 - Your tank is full
                Above 80 - Still okay
                Above 70 - Don't go too far
                Above 60 - Start to head back
                Above 50 - Be careful now you at at 50%
     */
    public static void main(String[] args) {
        int oxigen = 94;
        String condition = "";

        if ( oxigen>0 && oxigen< 100 ){
            if(oxigen>=90){
                condition= "Your tank is full";
            }else if(oxigen>= 80){
                condition="Still OK";
            }else if (oxigen>= 70){
                condition = "Do Not Go To Far!";
            }else if(oxigen>= 60){
                condition = " START TO GO BACK!";
            }else if (oxigen>= 50){
                condition = " !!!!! BE CAREFUL!!!!!! YOU OUT OF OXIGEN ";
            }else{ condition = " !!!!!!!!!!!!DO YOU WANNA DIE??!!!!!!";}

        }else {condition= "Chesk YOUR Equipment, smth wrong!!!";}

        System.out.println("condition = " + condition);





    }




}
