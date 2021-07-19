package day26_MultyDementinalArrays;

public class commonElements {
    public static void main(String[] args) {

       int[] arr1={1,2,3,4,5};
        int[] arr2= {4,5,6,7,8,9,10,11};

        for (int element:arr2) {


            for (int each : arr1) {// each = 1,2,3,4,5
                if (each == element) {
                    System.out.println(each);
                }
            }

        }

        System.out.println("======================  forLOOP  ==========");


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                if(arr2[i]== arr1[j]){
                    System.out.println(arr2[i]);}


            }

        }



    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5

          solution 1:
              DO NOT use for each loop

          solution 2:
              MUST use for each loops
 */