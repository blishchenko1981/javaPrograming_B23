import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Next10Days {
    public static void main(String[] args) {

        String [] days = new String[10];
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd - EEEE");

        for (int i = 0; i <days.length; i++) {
            days[i] = LocalDate.now().plusDays(i).format(df);
        }


        System.out.println(Arrays.toString(days));
        ArrayList<String > listOfDates = new ArrayList<>(Arrays.asList(days));

        Collections.sort(listOfDates);
        Collections.reverse(listOfDates);
        Collections.swap(listOfDates, 0 , 1);
        Collections.replaceAll(listOfDates, "August/16 - Monday", "JUNE IS A GREAT MONTH");
        System.out.println(listOfDates);

        String removeByIndex = listOfDates.remove(0);
        System.out.println(removeByIndex);
        System.out.println(listOfDates);
        boolean removeByObject = listOfDates.remove("August/14 - Saturday");
        System.out.println(removeByObject);
        listOfDates.remove(1);
        listOfDates.remove(1);
        listOfDates.remove(1);
        System.out.println(listOfDates);
        //String r = listOfDates.remove(0);
       // System.out.println(r);


        ArrayList<Integer> b = new ArrayList<>();
        Integer a = 1;
        System.out.println("c- "+b.remove(a));
        //int c = 1;
        //System.out.println("a" +b.remove(c));



    }
}
