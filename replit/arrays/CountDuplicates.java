package arrays;

import java.util.Scanner;

public class CountDuplicates {
    public static int getDup(String[] r) {
        int result = 0;
        String dups = "";
        for (int k = 0; k < r.length-1; k++) {

            for (int j = k + 1; j < r.length; j++) {
                if (r[k].equals(r[j])) {
                    if (!dups.contains(r[k])) {

                        dups += r[k]+" ";
                    }
                }
            }
        }       String[] array = dups.split(" ");  //[a,s,d]


                    for (String eachDups : array) {//[a,s,d]

                        for (String s : r) {  // [a,s,a,s,d]
                            if (eachDups.equals(s)) {
                                result = result + 1;
                            }
                        }
                    }
                    return result;
                }

                public static void main (String[]args){
                    Scanner in = new Scanner(System.in);
                    String[] strs = new String[in.nextInt()];
                    for (int i = 0; i < strs.length; i++) {
                        strs[i] = in.next();
                    }

                    System.out.println(getDup(strs));

                }


            }
