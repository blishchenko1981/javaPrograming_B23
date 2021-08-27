package day49_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {




        System.out.println("test started");
        System.out.println("step 1 ");

        Thread.sleep(3000);

        System.out.println("step 2 ");

        Thread.sleep(3000);

        System.out.println("step 3 ");


    }


    public static void sleep(double seconds) throws InterruptedException{
        long milliSecond = (long)seconds*1000;
        Thread.sleep(milliSecond);
    }
}
