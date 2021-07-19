package day05_ArifmeticOperators;

public class BirthDay {
    //3. Create a class named BirthDay and create the following variable
    //			 name, birthDay(int), birthMonth(String), birthYear(int)
    //
    //			 use concatenation to display the birthday of the person
    //
    //			 	if  name = "John"
    //			 		birthDay = 25
    //			 	    birthMonth = "April"
    //			 	    birthYear = 1995;
    //
    //			 	output:
    //			 		John was born on April/25/1995.
    public static void main(String[] args) {
        String name = "Ivan Petrovich";
        int birthDay = 34;
        String birthMonth = "Septhyambur";
        int birthYear = 1319;

        int age = 2021-birthYear;

        System.out.println(name+ " was born on "+
                birthMonth+"/"+ birthDay + "/"+ birthYear+".");
        System.out.println(name+ " is " + age+ " years old.");
        System.out.println(name + " probably vampire");






    }

}
