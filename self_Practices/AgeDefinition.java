public class AgeDefinition {
    public static void main(String[] args) {
        /*
         write a program that can define the age groups of a person
                 age groups are:
                        infant ( < 3 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
         */
        int age = 54;

        if(age<= 3 ) {
            System.out.println("Infant");
        }else
        if(age<= 5 ) {
            System.out.println("Toddler");
        }else
        if(age<=9 ) {
            System.out.println("Kid");
        }else
        if(age<= 12 ) {
            System.out.println("Pre-teen");
        }else
        if(age<=17 ) {
            System.out.println("Teenager");
        }else
        if(age<=20 ) {
            System.out.println("Young adult");
        }else
        if(age<=39 ) {
            System.out.println("Adult");
        }else
        if(age<=49 ) {
            System.out.println("Young Middle age adult");
        }else
        if(age<=54 ) {
            System.out.println("Middle age adult");
        }else
        if(age<=64 ) {
            System.out.println("Very young senior citizen");
        }else
        if(age<=74 ) {
            System.out.println("young senior citizen");
        }else
        if(age<=84 ) {
            System.out.println("Senior citizen");
        }else {
            System.out.println("Old senior citizen");
        };

        System.out.println("*******************************");





/*
2. Write a java program that can convert Time.numbers between 0 ~ 9 to words

            ex:
                number = 1

            output:
                One
 */
   int number = 8 ;
   if( number == 1) {
       System.out.println("One");
   }else
   if( number == 2) {
       System.out.println("Two");
   }else
   if( number == 3) {
       System.out.println("Three");
   }else
   if( number == 4) {
       System.out.println("Four");
   }else
   if( number == 5) {
       System.out.println("Five");
   }else
   if( number == 6) {
       System.out.println("Six");
   }else
   if( number == 7) {
       System.out.println("Seven");
   }else
   if( number == 8) {
       System.out.println("Eight");
   }else
   if( number == 9) {
       System.out.println("Nine");
   }else
   if( number == 0) {
       System.out.println("zero");
   }






    }
        }