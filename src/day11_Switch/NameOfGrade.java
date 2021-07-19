package day11_Switch;

public class NameOfGrade {
    public static void main(String[] args) {
        /*
        3. a char variable named grade is given. use switch statement to
         print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid
         */
        char grade ='D';
        String achivement = "";

        switch (grade){
            case 'A':
                achivement= "excellent";
                break;
            case'B':
                achivement = "great job";
                break;
            case'C':
                achivement = "good";
                break;
            case 'D':
                achivement= "passed";
                break;
            case 'F':
                achivement= "failed";
                break;
            default:
                achivement= "Incorrect simbol";
                break;





        }


        System.out.println(achivement);







    }
}
