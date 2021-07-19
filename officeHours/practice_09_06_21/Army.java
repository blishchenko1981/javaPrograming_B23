package practice_09_06_21;

public class Army {
    /*
                            [Qualification For Army]

                            Given information: citizenship(boolean), resident (boolean), and has high school diploma (boolean),

                            and age(int). Determine if the person is qualified to join the army.

                            - The person must be a Citizen of the USA or a resident
                            -> If not print: You must be a U.S. citizen or a resident

                            - Their age must be between 18 and 35
                            -> If not print: Your age must be between 18 to 35 years old

                            - They must have a high school diploma
                            -> If not print: You must have a high school diploma

If all the criteria is met print: You are qualified for the US Army

                         */
    public static void main(String[] args) {



    boolean isCitizen = true;
    boolean isResident = true;
    boolean hasDiploma  = true;
    int age = 19;

    if (isCitizen || isResident) {

        if (age>=18 && age<= 35){

            if(hasDiploma)
            { System.out.println("You can go to army son!!!"); }
        }
        else{ System.out.println("Your age not match for army"); }
    }


}
}
