package practice_07_07_21;

public class SameChars {
    public static void main(String[] args) {

        String [] names = { "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        String longest = "";
        int count = 0;

        for (int i = 0; i < names.length; i++) {
            String first = names[i].substring(0,1);
            String last = names[i].substring(names[i].length() - 1);
            if(first.equalsIgnoreCase(last) && names[i].length()>longest.length()){
                longest = names[i];
                count++;
            }
        }








    }
}
/*
Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

				Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

				Output : 4
 */
