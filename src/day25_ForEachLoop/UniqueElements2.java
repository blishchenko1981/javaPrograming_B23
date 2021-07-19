package day25_ForEachLoop;

public class UniqueElements2 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'a', 'c', 'g','g','r','n'};

        for (char each : chars) {
            int count = 0 ;
            for(char charachrt: chars) {
            if(charachrt == each){
                count++;
            }
            }
            if(count==1){
                System.out.println("each = " + each);
            }
            }
        }
    }

