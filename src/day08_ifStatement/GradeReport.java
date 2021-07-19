package day08_ifStatement;

public class GradeReport {
    public static void main(String[] args) {
        String name = "Artem";
        int score = 100;

        boolean gradeA = score>= 90 && score<= 100; //check if score gets toA...
        boolean gradeB = score>= 80 && score< 90;
        boolean gradeC = score>= 70 && score< 80;
        boolean gradeD = score>= 60 && score< 70;
        boolean gradeF = score>= 0 && score< 60;

        if (gradeA){ //or we can do it without boolean like if( 100>= score>=90);
            // it will give the same result as with boolean
            System.out.println("Exelent "+ name + " you made an \"A\"");
        }
        if (gradeB){ //or without boolean: if (!gradeA && score >=80) ;

            System.out.println("Good job " + name + " you made a \"B\"");
        }

        if (gradeC) { // or without boolean: if(!gradeA && !gradeB && score >= 70);

            System.out.println("You can do better " + name +
                    " you made a \"C\"");
        }

        if (gradeD) {

            System.out.println(name + " you made a \" D\" " +
                    "you are loser");
        }

       if (gradeF) {

           System.out.println("You FAILED and you are idiot "+ name );
       }
        }
    }

