package day27_Recap;

public class FindFirstUniqueElement {
    public static void main(String[] args) {

        // print out first unique element from Array;

       int[] num = {1,2,1,4,4,6,6,5,5,4,9};
       int firstUniqueElement = 0;

        for (int j = 0; j < num.length; j++) {// outer loop for repeating


       int frequency = 0;
        for (int i = 0; i < num.length; i++) { // inner loop for find frequency
            if(num[i] == num[j]) {
                frequency++;
            }
            }

        if(frequency ==1 ){

            firstUniqueElement = num[j];
            break;
        }

        }

        System.out.println(firstUniqueElement);

    }
}
