public class FindMaxNumInArray {
    public static void main(String[] args) {

        int [] array0 = new int[7];
        int[] array = {23,32,44,55,3,2,5,76,56,34,2,3,71,1,4,65};

        String [] arrayStr = {"go", "bar", "drink", "somehow", "forsure"};

        int longest = 0;

        for (String s : arrayStr) {
            if(s.length() > longest){
                longest = s.length();
            }
        }


        System.out.println("longest = " + longest);

        int max = array[0];

        for (int i =0; i<array.length-1; i++) {
            if(max < array[i+1]){
                max = array[i+1];
            }
        }
        System.out.println(max);

    }
}
