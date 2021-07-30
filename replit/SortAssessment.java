public class SortAssessment {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(appearsTwice("go", "I want go to the beach or go to the pool" ));
    }

    /**
     *target - string that you need to check.
     * sentence - string where you need to lookup for target.
     *
     */
    public static boolean appearsTwice(String target, String sentence) {
        //write your codes here:

        boolean appearsTwice = false;
         int count = 0;
          String [] sent = sentence.split(" ");

        for (int i = 0; i < sent.length; i++) {
           if(sent[i].equalsIgnoreCase(target)){
               count += 1;
           }
        }

        if(count == 2) {
            appearsTwice= true;
        }

        return appearsTwice;
    }
}


