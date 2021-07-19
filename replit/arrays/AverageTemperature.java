package arrays;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };


        double average = 0;
        for (int i = 0; i < temps.length; i++) {
            average += temps[i];
        }
        average/= temps.length;
        System.out.println(average);








    }
}
