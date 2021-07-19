package day11_Switch;

public class TernaryPractice {
    public static void main(String[] args) {
       /* 1. Given two values: yearly salary and credit score
       determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
        Otherwise print: "Loan Denied"
        NOTE: MUST APPLY TERNARY */
        int salary = 32_000;
        int creditScore = 650;
        String ifLoanAppronved = ( salary> 60_000 && creditScore> 650)?
                "Loan Approved": "Loan Denied";
        System.out.println("ifLoanAppronved = " + ifLoanAppronved);

        System.out.println(" ___________________ ");
        /*Given a sport you play at the community center you will
        have to pay some entrance fee.

                Soccer or Tennis fee is: 100
        Otherwise fee is: 50
        NOTE: MUST APPLY TERNARY*/

        int fee = 100;
        String sport = "Soccer";
        System.out.println((sport=="Soccer"|| sport== "Tennis")? fee: fee/2);


        System.out.println(")))))))))))))))))))))))))))))))))))))))))");

        /*
        3. write a program that checks for the bigger of 3 Time.numbers.
		you get 3 int variables with different values: n1 , n2 and n3
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"

			NOTE: MUST APPLY TERNARY
         */
        int a = 4;
        int b = 89;
        int c = 3;
        String bigger = "";

        bigger= (a> b&&a>c)? "a is bigger" : (b>a&& b>c)? "b is bigger": "c is bigger";
        System.out.println(bigger);

        System.out.println(" 777777777777777777777777777777777777777777777777");



        int number = 12;
        String name = "";

        if (number >= 1 && number<= 12){
            name = (number== 1)? "Jan" : (number== 2)? "Feb": ( number ==3)? "Mar":
                    (number==4)? "Apr" :(number== 5)? " May":(number==6)? "Jun":
                            (number== 7)? "Jul":(number==8)? " Aug": (number==9)?
                                    "Sep":(number==10)? "Oct": (number==11)? " Nov":
                                    "Dec";

        } else { name = "invalid";}
        System.out.println("name = " + name);




    }

}
