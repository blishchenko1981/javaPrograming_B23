package day50;

public class MorningWorkOut {

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Push-up" + i);
try{
            Thread.sleep(2500);
}catch (InterruptedException e){
    e.printStackTrace();
}
        }

        System.out.println("---------------------------------");

        for (int i = 1; i <= 30; i++) {
            System.out.println("Pull-up" + i);
           pause(2.5);
        }





    }
    public static void pause(double seconds){
       try{
        Thread.sleep((long)seconds*1000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }



}
