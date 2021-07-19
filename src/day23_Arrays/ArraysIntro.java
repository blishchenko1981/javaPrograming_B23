package day23_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // DataType[] variableName = {data1,data2, data3 }

        String[] group8 = {"Vitalii", "Ksenia", "Sabir", "Atila", "Abbas"};
        //         index:    0           1         2        3        4

        // retrieve data from array:
        System.out.println(group8[0]);
        System.out.println(group8[1]);
        System.out.println(group8[2]);
        System.out.println(group8[3]);

        System.out.println("_-------------------------------------------");

        for (int i = 0; i <= 4 ; i++) {
            System.out.println(group8[i]);
        }





    }
}
